package com.example.voctn.toeiclearn;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.voctn.DataBaseSQLite;
import com.example.voctn.R;
import com.example.voctn.toeic600.Fragment_Game;
import com.example.voctn.toeic600.Fragment_Home;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ToeicLearn extends AppCompatActivity {

    DataBaseSQLite dataBaseSQLite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toeic_learn);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Fragment fragment = null;
        fragment = new Fragment_Home_Word();
        fragmentTransaction.add(R.id.frame2, fragment);
        fragmentTransaction.commit();

        BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottomnavigation2);
        bottomNavigationView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);



    }

    private BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment fragment = null;
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


            switch (menuItem.getItemId()){
                case R.id.home_word:
                    fragment = new Fragment_Home_Word();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame2, fragment).commit();
                    return true;

                case R.id.game_word:
                    fragment = new Fragment_Game_Word();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame2, fragment).commit();
                    return true;

                case R.id.notification:
                    fragment = new Fragment_Notification();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame2, fragment).commit();
                    return true;
            }
            return false;
        }
    };
}
