package com.example.voctn.toeic600;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.voctn.R;
import com.example.voctn.Word;

import java.util.Random;

public class Fragment_Game extends Fragment {

    TextView txt1, txt2, txt3, txt4, txtsc;
    TextView txtcauHoi;

    int score = 0;
    String dapAn = "null";
    String luaChon = "null";

    /* * * * * * * * * * * *
    *  # 0: english
    *  # 1: vietnamese
    * * * * * * * * * * * */
    int ngonNgu = 0;

     //  # vi tri tu (0 -> 600)
    int viTriTu = 0;

    // # vi tri dap an (0 -> 3)
    int viTriDapAn = 0;

    Word word = new Word();

    Random random = new Random();



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_game,container, false);

        txt1 = (TextView) view.findViewById(R.id.txt1);
        txt2 = (TextView) view.findViewById(R.id.txt2);
        txt3 = (TextView) view.findViewById(R.id.txt3);
        txt4 = (TextView) view.findViewById(R.id.txt4);
        txtcauHoi = (TextView) view.findViewById(R.id.txtcauhoi);

        //txtsc.setText("OK: " + 2);


        startProgram();


        return  view;

    }



    public void startProgram(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                        for (int dem = 0; dem < 586; ++dem){

                            ngonNgu = random.nextInt(2);
                            viTriTu = random.nextInt(word.EngWord.length);

                            if(ngonNgu == 0){

                                txtcauHoi.setText(word.VieWord[viTriTu]);

                                dapAn = word.EngWord[viTriTu];
                                viTriDapAn = random.nextInt(4);

                                setupDapAn(ngonNgu, viTriDapAn, dapAn, dem);

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
                                viTriTu = random.nextInt(word.EngWord.length);

                                txtcauHoi.setText(word.EngWord[viTriTu]);
                                dapAn = word.VieWord[viTriTu];
                                viTriDapAn = random.nextInt(4);

                                setupDapAn(ngonNgu, viTriDapAn, dapAn, dem);

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
        };
        new Thread(runnable).start();

    }



    private void setupDapAn(int nn, int vitri, String DA, int diem){
        int temp;

        if(nn == 0){
            switch (vitri){
                case 0:
                    txt1.setText(DA);

                    temp = random.nextInt(word.EngWord.length);
                    txt2.setText(word.EngWord[temp]);


                    temp = random.nextInt(word.EngWord.length);
                    txt3.setText(word.EngWord[temp]);



                    temp = random.nextInt(word.EngWord.length);
                    txt4.setText(word.EngWord[temp]);


                    break;

                case 1:
                    txt2.setText(DA);
                    temp = random.nextInt(word.EngWord.length);
                    txt1.setText(word.EngWord[temp]);

                    temp = random.nextInt(word.EngWord.length);
                    txt3.setText(word.EngWord[temp]);

                    temp = random.nextInt(word.EngWord.length);
                    txt4.setText(word.EngWord[temp]);


                    break;

                case 2:
                    txt3.setText(DA);
                    temp = random.nextInt(word.EngWord.length);
                    txt2.setText(word.EngWord[temp]);

                    temp = random.nextInt(word.EngWord.length);
                    txt1.setText(word.EngWord[temp]);

                    temp = random.nextInt(word.EngWord.length);
                    txt4.setText(word.EngWord[temp]);


                    break;

                case 3:
                    txt4.setText(DA);
                    temp = random.nextInt(word.EngWord.length);
                    txt2.setText(word.EngWord[temp]);

                    temp = random.nextInt(word.EngWord.length);
                    txt3.setText(word.EngWord[temp]);

                    temp = random.nextInt(word.EngWord.length);
                    txt1.setText(word.EngWord[temp]);

                    break;
            }
        } else {
            switch (vitri){
                case 0:
                    txt1.setText(DA);
                    temp = random.nextInt(word.VieWord.length);
                    txt2.setText(word.VieWord[temp]);

                    temp = random.nextInt(word.VieWord.length);
                    txt3.setText(word.VieWord[temp]);

                    temp = random.nextInt(word.VieWord.length);
                    txt4.setText(word.VieWord[temp]);

                    break;

                case 1:
                    txt2.setText(DA);
                    temp = random.nextInt(word.VieWord.length);
                    txt1.setText(word.VieWord[temp]);

                    temp = random.nextInt(word.VieWord.length);
                    txt3.setText(word.VieWord[temp]);

                    temp = random.nextInt(word.VieWord.length);
                    txt4.setText(word.VieWord[temp]);

                    break;

                case 2:
                    txt3.setText(DA);
                    temp = random.nextInt(word.VieWord.length);
                    txt2.setText(word.VieWord[temp]);

                    temp = random.nextInt(word.VieWord.length);
                    txt1.setText(word.VieWord[temp]);

                    temp = random.nextInt(word.VieWord.length);
                    txt4.setText(word.VieWord[temp]);


                    break;

                case 3:
                    txt4.setText(DA);
                    temp = random.nextInt(word.VieWord.length);
                    txt2.setText(word.VieWord[temp]);

                    temp = random.nextInt(word.VieWord.length);
                    txt3.setText(word.VieWord[temp]);

                    temp = random.nextInt(word.VieWord.length);
                    txt1.setText(word.VieWord[temp]);

                    break;
            }
        }
    }


}
