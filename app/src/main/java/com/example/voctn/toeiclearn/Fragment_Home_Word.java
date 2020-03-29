package com.example.voctn.toeiclearn;

import android.app.Dialog;
import android.database.Cursor;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.voctn.DataBaseSQLite;
import com.example.voctn.ItemWord;
import com.example.voctn.R;
import com.example.voctn.Word;
import com.example.voctn.toeic600.Adapter600;

import java.util.ArrayList;

public class Fragment_Home_Word extends Fragment {

    DataBaseSQLite dataBaseSQLite;
    Button btnadd;
    TextView txtTitle;

    RecyclerView recyclerView;
    ArrayList<ItemWord> Sqlitelist = new ArrayList<>();

    String eng;
    String vie;

    Adapter600 adapter600;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_word, container, false);


        dataBaseSQLite = new DataBaseSQLite(getActivity(), "VOC.sqlite", null, 2);

        dataBaseSQLite.QueryData("CREATE TABLE IF NOT EXISTS Word2(ID INTEGER PRIMARY KEY AUTOINCREMENT, Eng VARCHAR(30), Vie VARCHAR(30), st VARCHAR(20))");

        txtTitle = (TextView) view.findViewById(R.id.txtTitle);

        btnadd = (Button) view.findViewById(R.id.btnadd);




        recyclerView = (RecyclerView) view.findViewById(R.id.word_learn);

        recyclerView.setHasFixedSize(false);

        //thêm đường ngăn cách item
        RecyclerView.ItemDecoration itemDecoration = new
                DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(itemDecoration);
        recyclerView.setItemViewCacheSize(5);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);




        Cursor readdata = dataBaseSQLite.GetData("SELECT * FROM Word2");
        while (readdata.moveToNext()){
            String engw = String.valueOf(readdata.getString(1));
            String viw = String.valueOf(readdata.getString(2));;
            String st = String.valueOf(readdata.getString(3));;

            Sqlitelist.add(new ItemWord(engw, viw, st));
        }

        if(Sqlitelist.size() == 0){
            txtTitle.setText("Hiện chưa có từ trong thư viện. \nVui lòng thêm từ");
        } else {
            txtTitle.setText("Words you should learn!");
            adapter600 = new Adapter600(Sqlitelist, getActivity().getApplication());
            recyclerView.setAdapter(adapter600);
        }
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogInit();
            }
        });
        return view;
    }


    private void DialogInit(){
        final Dialog dialog = new Dialog(getActivity());
        dialog.setContentView(R.layout.dialog_add_word);
        final EditText edteng = (EditText) dialog.findViewById(R.id.edtEngWord);
        final EditText edtvie = (EditText) dialog.findViewById(R.id.edtVieWord);
        Button btnok = (Button) dialog.findViewById(R.id.btnok);
        Button btncancel = (Button) dialog.findViewById(R.id.btncancel);

        dialog.show();

        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eng = String.valueOf(edteng.getText());
                vie = String.valueOf(edtvie.getText());
                String st = "...";

                dataBaseSQLite.QueryData("INSERT INTO Word2 VALUES(null,'"+eng+"','"+vie+"','"+st+"')");
                adapter600.notifyDataSetChanged();
                dialog.dismiss();

            }
        });

        btncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

    }
}
