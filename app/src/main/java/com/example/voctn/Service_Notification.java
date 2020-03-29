package com.example.voctn;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.example.voctn.toeiclearn.ToeicLearn;

import java.util.ArrayList;

public class Service_Notification extends Service {

    DataBaseSQLite dataBaseSQLite;
    ArrayList<ItemWord> dataList = new ArrayList<>();

    String eng ;
    String vie ;
    static int dem = 0;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();


    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        dataBaseSQLite = new DataBaseSQLite(getBaseContext(), "VOC.sqlite", null, 2);
        dataBaseSQLite.QueryData("CREATE TABLE IF NOT EXISTS Word2(ID INTEGER PRIMARY KEY AUTOINCREMENT, Eng VARCHAR(30), Vie VARCHAR(30), st VARCHAR(20))");

        Cursor readdata = dataBaseSQLite.GetData("SELECT * FROM Word2");
        while (readdata.moveToNext()) {
            String engw = String.valueOf(readdata.getString(1));
            String viw = String.valueOf(readdata.getString(2));
            String stt = String.valueOf(readdata.getString(3));

            if(stt.equals("is notified"))
                dataList.add(new ItemWord(engw, viw, null));
        }
        if(dataList.size() <= 0){
            eng = "Học Tiếng Anh!";
            vie = "Luyện tập đi nào!";
        } else {
            eng = dataList.get(dem).getEngWord();
            vie = dataList.get(dem).getVieWord();
        }

        if(dem < dataList.size()){
            ++dem;
        } else dem = 0;


        Intent intent2 = new Intent(this, ToeicLearn.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);

        final NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "channel")
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle(eng)
                .setContentText(vie)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setContentIntent(pendingIntent)
                .setAutoCancel(true);

        createNotificationChannel();
        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(Service_Notification.this);

        notificationManager.notify(1, builder.build());
        return START_NOT_STICKY;
    }

    private void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = getString(R.string.channel_name);
            String description = getString(R.string.channel_description);
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel("channel", name, importance);
            channel.setDescription(description);

            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }
}
