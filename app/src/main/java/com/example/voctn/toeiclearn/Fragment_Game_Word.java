package com.example.voctn.toeiclearn;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.voctn.DataBaseSQLite;
import com.example.voctn.ItemWord;
import com.example.voctn.R;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeMap;

public class Fragment_Game_Word extends Fragment {

    TextView txt1, txt2, txt3, txt4, txtsc2;
    TextView txtcauHoi;

    String score = "0";
    String dapAn = "null";
    String luaChon = "null";

    int ngonNgu = 0;

    //  # vi tri tu (0 -> 600)
    int viTriTu = 0;

    // # vi tri dap an (0 -> 3)
    int viTriDapAn = 0;

    Random random = new Random();

    DataBaseSQLite dataBaseSQLite;
    ArrayList<ItemWord> dataList;


    @Override
    public void onStart() {
        super.onStart();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_game_word, container, false);


        txt1 = (TextView) view.findViewById(R.id.txt12);
        txt2 = (TextView) view.findViewById(R.id.txt22);
        txt3 = (TextView) view.findViewById(R.id.txt32);
        txt4 = (TextView) view.findViewById(R.id.txt42);
        txtcauHoi = (TextView) view.findViewById(R.id.txtcauhoi2);

        startProgram2();

        return view;
    }



    public void startProgram2(){
        dataBaseSQLite = new DataBaseSQLite(getActivity(), "VOC.sqlite", null, 2);

        dataBaseSQLite.QueryData("CREATE TABLE IF NOT EXISTS Word2(ID INTEGER PRIMARY KEY AUTOINCREMENT, Eng VARCHAR(30), Vie VARCHAR(30), st VARCHAR(20))");

        dataList = new ArrayList<>();


        Cursor readdata = dataBaseSQLite.GetData("SELECT * FROM Word2");
        while (readdata.moveToNext()) {
            String engw = String.valueOf(readdata.getString(1));
            String viw = String.valueOf(readdata.getString(2));
            String st = String.valueOf(readdata.getString(3));

            dataList.add(new ItemWord(engw, viw, st));
        }
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                if (dataList.size() == 0){
                    txtcauHoi.setText("Vui lòng thêm tối thiểu " + (4-dataList.size()) + " từ để sử dụng chức năng!");
                } else {
                    for (int dem = 0; dem < dataList.size(); ++dem){
                        ngonNgu = random.nextInt(1);
                        viTriTu = random.nextInt(dataList.size());
                        --dem;
                        if(ngonNgu == 0){
                            txtcauHoi.setText(dataList.get(viTriTu).getVieWord());
                            dapAn = dataList.get(viTriTu).getEngWord();
                            viTriDapAn = random.nextInt(3);

                            setupDapAn(ngonNgu, viTriDapAn, dapAn);

                            do{
                                txt1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        luaChon = (String) txt1.getText();
                                    }
                                });

                                txt2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        luaChon = (String) txt2.getText();
                                    }
                                });

                                txt3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        luaChon = (String) txt3.getText();
                                    }
                                });

                                txt4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        luaChon = (String) txt4.getText();
                                    }
                                });
                            }while (luaChon != dapAn);


                        } else {
                            txtcauHoi.setText(dataList.get(viTriTu).getEngWord());
                            dapAn = dataList.get(viTriTu).getEngWord();
                            viTriDapAn = random.nextInt(3);

                            setupDapAn(ngonNgu, viTriDapAn, dapAn);

                            do{
                                txt1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        luaChon = (String) txt1.getText();
                                    }
                                });

                                txt2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        luaChon = (String) txt2.getText();
                                    }
                                });

                                txt3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        luaChon = (String) txt3.getText();
                                    }
                                });

                                txt4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        luaChon = (String) txt4.getText();
                                    }
                                });
                            }while (luaChon != dapAn);
                        }
                    }
                }
            }
        };

        new Thread(runnable).start();
    }


    private void setupDapAn(int nn, int vitri, String DA){
        int temp;
        if(nn == 0){
            switch (vitri){
                case 0:
                    txt1.setText(DA);
                    temp = random.nextInt(dataList.size());
                    txt2.setText(dataList.get(temp).getEngWord());

                    temp = random.nextInt(dataList.size());
                    txt3.setText(dataList.get(temp).getEngWord());

                    temp = random.nextInt(dataList.size());
                    txt4.setText(dataList.get(temp).getEngWord());

                case 1:
                    txt2.setText(DA);
                    temp = random.nextInt(dataList.size());
                    txt1.setText(dataList.get(temp).getEngWord());

                    temp = random.nextInt(dataList.size());
                    txt3.setText(dataList.get(temp).getEngWord());

                    temp = random.nextInt(dataList.size());
                    txt4.setText(dataList.get(temp).getEngWord());


                case 2:
                    txt3.setText(DA);
                    temp = random.nextInt(dataList.size());
                    txt2.setText(dataList.get(temp).getEngWord());

                    temp = random.nextInt(dataList.size());
                    txt1.setText(dataList.get(temp).getEngWord());

                    temp = random.nextInt(dataList.size());
                    txt4.setText(dataList.get(temp).getEngWord());


                case 3:
                    txt4.setText(DA);
                    temp = random.nextInt(dataList.size());
                    txt2.setText(dataList.get(temp).getEngWord());

                    temp = random.nextInt(dataList.size());
                    txt3.setText(dataList.get(temp).getEngWord());

                    temp = random.nextInt(dataList.size());
                    txt1.setText(dataList.get(temp).getEngWord());

            }
        } else {
            switch (vitri){
                case 0:
                    txt1.setText(DA);
                    temp = random.nextInt(dataList.size());
                    txt2.setText(dataList.get(temp).getVieWord());

                    temp = random.nextInt(dataList.size());
                    txt3.setText(dataList.get(temp).getVieWord());

                    temp = random.nextInt(dataList.size());
                    txt4.setText(dataList.get(temp).getVieWord());

                case 1:
                    txt2.setText(DA);
                    temp = random.nextInt(dataList.size());
                    txt1.setText(dataList.get(temp).getVieWord());

                    temp = random.nextInt(dataList.size());
                    txt3.setText(dataList.get(temp).getVieWord());

                    temp = random.nextInt(dataList.size());
                    txt4.setText(dataList.get(temp).getVieWord());


                case 2:
                    txt3.setText(DA);
                    temp = random.nextInt(dataList.size());
                    txt2.setText(dataList.get(temp).getVieWord());

                    temp = random.nextInt(dataList.size());
                    txt1.setText(dataList.get(temp).getVieWord());

                    temp = random.nextInt(dataList.size());
                    txt4.setText(dataList.get(temp).getVieWord());


                case 3:
                    txt4.setText(DA);
                    temp = random.nextInt(dataList.size());
                    txt2.setText(dataList.get(temp).getVieWord());

                    temp = random.nextInt(dataList.size());
                    txt3.setText(dataList.get(temp).getVieWord());

                    temp = random.nextInt(dataList.size());
                    txt1.setText(dataList.get(temp).getVieWord());

            }
        }

    }
}
