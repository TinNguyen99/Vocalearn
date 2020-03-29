package com.example.voctn.toeiclearn;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.voctn.DataBaseSQLite;
import com.example.voctn.ItemWord;
import com.example.voctn.R;
import com.example.voctn.Receiver;

import java.util.ArrayList;

import static android.content.Context.ALARM_SERVICE;

public class Fragment_Notification extends Fragment {

    DataBaseSQLite dataBaseSQLite;
    ArrayList<ItemWord> dataList = new ArrayList<>();
    AlarmManager alarmManager;

    PendingIntent pendingIntent2;
    Receiver receiver;
    boolean st = true;
    ArrayList<ItemWord> arrayList = new ArrayList<>();
    Adapterlearn adapter;

    Button btnTB;
    Intent intent;

    @Override
    public void onStart() {
        super.onStart();
        receiver = new Receiver();
    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_notification, container, false);


        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.word_learn);
        recyclerView.setHasFixedSize(false);
        RecyclerView.ItemDecoration itemDecoration = new
                DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(itemDecoration);
        recyclerView.setItemViewCacheSize(5);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);

        dataBaseSQLite = new DataBaseSQLite(getActivity(), "VOC.sqlite", null, 2);

        dataBaseSQLite.QueryData("CREATE TABLE IF NOT EXISTS Word2(ID INTEGER PRIMARY KEY AUTOINCREMENT, Eng VARCHAR(30), Vie VARCHAR(30), st VARCHAR(20))");


        Cursor readdata = dataBaseSQLite.GetData("SELECT * FROM Word2");
        while (readdata.moveToNext()) {
            String engw = String.valueOf(readdata.getString(1));
            String viw = String.valueOf(readdata.getString(2));
            String stt = String.valueOf(readdata.getString(3));

            dataList.add(new ItemWord(engw, viw, stt));
        }

        alarmManager = (AlarmManager) getActivity().getSystemService(ALARM_SERVICE);

        btnTB = (Button) view.findViewById(R.id.btnThongbao);
        btnTB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(), Receiver.class);
                pendingIntent2 = PendingIntent.getBroadcast(
                        getActivity(),0, intent, 0
                );
                alarmManager.setInexactRepeating(AlarmManager.ELAPSED_REALTIME_WAKEUP, SystemClock.elapsedRealtime(), 3000, pendingIntent2);

            }
        });

        adapter = new Adapterlearn(dataList, getActivity().getApplication());
        recyclerView.setAdapter(adapter);

        adapter.setOnItemClickListener(new Adapterlearn.OnItemClickListener() {

            @Override
            public void onItemClick(int position) {
                String vt = String.valueOf(position + 1);

                if(st){
                    dataList.get(position).setState("is notified");
                    String t = "is notified";

                    dataBaseSQLite.QueryData("UPDATE Word2 SET st = '"+t+"' WHERE ID = '"+vt+"'");
                    Toast.makeText(getActivity(), String.valueOf(position) + "ok", Toast.LENGTH_SHORT).show();
                    adapter.notifyItemChanged(position);
                    st = false;
                } else {
                    dataList.get(position).setState("...");
                    Toast.makeText(getActivity(), String.valueOf(position) + "not", Toast.LENGTH_SHORT).show();

                    dataBaseSQLite.QueryData("UPDATE Word2 SET st = '...' WHERE ID = '"+vt+"'");
                    adapter.notifyItemChanged(position);
                    st = true;
                }
            }
        });
        return view;
    }
}
