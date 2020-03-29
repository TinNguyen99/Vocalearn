package com.example.voctn.toeic600.w;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.voctn.ItemWord;
import com.example.voctn.R;
import com.example.voctn.Word;
import com.example.voctn.toeic600.Adapter600;

import java.util.ArrayList;

public class W2 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.w1, container, false);

        Word word = new Word();

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_600);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL,true);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<ItemWord> arrayList = new ArrayList<>();

        for(int i = 13; i < 24; ++i){
            arrayList.add(new ItemWord(word.EngWord[i], word.VieWord[i],""));
        }


        Adapter600 adapter600 = new Adapter600(arrayList, getActivity().getApplication());
        recyclerView.setAdapter(adapter600);

        return view;
    }
}
