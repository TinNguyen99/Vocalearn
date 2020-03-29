package com.example.voctn.toeic600;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.voctn.ItemWord;
import com.example.voctn.R;

import java.util.ArrayList;

public class Adapter600 extends RecyclerView.Adapter<Adapter600.myViewHolder> {

    private ArrayList<ItemWord> itemWordArrayList;
   // private ArrayList<ItemWord> itemWordArrayList;

    private Context context;

    public Adapter600(ArrayList<ItemWord> itemWordArrayList, Context context) {
        this.itemWordArrayList = itemWordArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.item_word,parent,false);
        return new myViewHolder (itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

        holder.txtEn.setText(String.valueOf(itemWordArrayList.get(position).getEngWord()));
        holder.txtVn.setText(String.valueOf(itemWordArrayList.get(position).getVieWord()));

    }

    @Override
    public int getItemCount() {
        return itemWordArrayList.size();
    }

    public static class myViewHolder extends RecyclerView.ViewHolder {

        TextView txtEn, txtVn;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            txtEn = (TextView) itemView.findViewById(R.id.txtEnw);
            txtVn = (TextView) itemView.findViewById(R.id.txtVnw);

        }
    }
}
