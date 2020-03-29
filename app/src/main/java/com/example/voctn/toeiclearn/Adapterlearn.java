package com.example.voctn.toeiclearn;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.voctn.ItemWord;
import com.example.voctn.R;

import java.util.ArrayList;


public class Adapterlearn extends RecyclerView.Adapter<Adapterlearn.myViewHolder> {

    private ArrayList<ItemWord> itemWordArrayList;

    private OnItemClickListener onItemClickListener;

    public interface OnItemClickListener{
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener){
        onItemClickListener = listener;
    }

    private Context context;

    public Adapterlearn(ArrayList<ItemWord> itemWordArrayList, Context context) {
        this.itemWordArrayList = itemWordArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.item_word2,parent,false);
        return new myViewHolder (itemView, onItemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

        holder.txtEn.setText(String.valueOf(itemWordArrayList.get(position).getEngWord()));
        holder.txtVn.setText(String.valueOf(itemWordArrayList.get(position).getVieWord()));
        holder.txtst.setText(String.valueOf(itemWordArrayList.get(position).getState()));

    }

    @Override
    public int getItemCount() {
        return itemWordArrayList.size();
    }

    public static class myViewHolder extends RecyclerView.ViewHolder {

        TextView txtEn, txtVn, txtst;


        public myViewHolder(@NonNull View itemView, final OnItemClickListener listener) {
            super(itemView);
            txtEn = (TextView) itemView.findViewById(R.id.txtEnw);
            txtVn = (TextView) itemView.findViewById(R.id.txtVnw);
            txtst = (TextView) itemView.findViewById(R.id.txtst);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener != null){
                        int position = getAdapterPosition();
                        if(position != RecyclerView.NO_POSITION){
                            listener.onItemClick(position);
                        }
                    }
                }
            });
        }
    }
}
