package com.example.voctn.toeic600;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.voctn.R;
import com.example.voctn.toeic600.w.W1;
import com.example.voctn.toeic600.w.W10;
import com.example.voctn.toeic600.w.W11;
import com.example.voctn.toeic600.w.W12;
import com.example.voctn.toeic600.w.W13;
import com.example.voctn.toeic600.w.W14;
import com.example.voctn.toeic600.w.W15;
import com.example.voctn.toeic600.w.W16;
import com.example.voctn.toeic600.w.W17;
import com.example.voctn.toeic600.w.W18;
import com.example.voctn.toeic600.w.W19;
import com.example.voctn.toeic600.w.W2;
import com.example.voctn.toeic600.w.W20;
import com.example.voctn.toeic600.w.W21;
import com.example.voctn.toeic600.w.W22;
import com.example.voctn.toeic600.w.W23;
import com.example.voctn.toeic600.w.W24;
import com.example.voctn.toeic600.w.W25;
import com.example.voctn.toeic600.w.W26;
import com.example.voctn.toeic600.w.W27;
import com.example.voctn.toeic600.w.W28;
import com.example.voctn.toeic600.w.W29;
import com.example.voctn.toeic600.w.W3;
import com.example.voctn.toeic600.w.W30;
import com.example.voctn.toeic600.w.W31;
import com.example.voctn.toeic600.w.W32;
import com.example.voctn.toeic600.w.W33;
import com.example.voctn.toeic600.w.W34;
import com.example.voctn.toeic600.w.W35;
import com.example.voctn.toeic600.w.W36;
import com.example.voctn.toeic600.w.W37;
import com.example.voctn.toeic600.w.W38;
import com.example.voctn.toeic600.w.W39;
import com.example.voctn.toeic600.w.W4;
import com.example.voctn.toeic600.w.W40;
import com.example.voctn.toeic600.w.W41;
import com.example.voctn.toeic600.w.W42;
import com.example.voctn.toeic600.w.W43;
import com.example.voctn.toeic600.w.W44;
import com.example.voctn.toeic600.w.W45;
import com.example.voctn.toeic600.w.W46;
import com.example.voctn.toeic600.w.W47;
import com.example.voctn.toeic600.w.W48;
import com.example.voctn.toeic600.w.W49;
import com.example.voctn.toeic600.w.W5;
import com.example.voctn.toeic600.w.W6;
import com.example.voctn.toeic600.w.W7;
import com.example.voctn.toeic600.w.W8;
import com.example.voctn.toeic600.w.W9;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Toeic600 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toeic600);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Fragment fragment = null;
        fragment = new Fragment_Home();
        fragmentTransaction.add(R.id.frame1, fragment);
        fragmentTransaction.commit();

        BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottomnavigation1);
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
                case R.id.home:

                    fragment = new Fragment_Game();
                    fragmentTransaction.remove(fragment);

                    fragment = new Fragment_Home();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame1, fragment).commit();
                    return true;

                case R.id.game:
                    fragment = new Fragment_Game();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame1, fragment).commit();
                    return true;

            }
            return false;
        }
    };



    public void SelectSubject(View view) {
        Fragment fragment = null;
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        switch (view.getId()){
            case R.id.btn1:
                fragment = new W1();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn2:
                fragment = new W2();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn3:
                fragment = new W3();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn4:
                fragment = new W4();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn5:
                fragment = new W5();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn6:
                fragment = new W6();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn7:
                fragment = new W7();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn8:
                fragment = new W8();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn9:
                fragment = new W9();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn10:
                fragment = new W10();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn11:
                fragment = new W11();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn12:
                fragment = new W12();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn13:
                fragment = new W13();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn14:
                fragment = new W14();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn15:
                fragment = new W15();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn16:
                fragment = new W16();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn17:
                fragment = new W17();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn18:
                fragment = new W18();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn19:
                fragment = new W19();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn20:
                fragment = new W20();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn21:
                fragment = new W21();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn22:
                fragment = new W22();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn23:
                fragment = new W23();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn24:
                fragment = new W24();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn25:
                fragment = new W25();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn26:
                fragment = new W26();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn27:
                fragment = new W27();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn28:
                fragment = new W28();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn29:
                fragment = new W29();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn30:
                fragment = new W30();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn31:
                fragment = new W31();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn32:
                fragment = new W32();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn33:
                fragment = new W33();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn34:
                fragment = new W34();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn35:
                fragment = new W35();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn36:
                fragment = new W36();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn37:
                fragment = new W37();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn38:
                fragment = new W38();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn39:
                fragment = new W39();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn40:
                fragment = new W40();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn41:
                fragment = new W41();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn42:
                fragment = new W42();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn43:
                fragment = new W43();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn44:
                fragment = new W44();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn45:
                fragment = new W45();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn46:
                fragment = new W46();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn47:
                fragment = new W47();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn48:
                fragment = new W48();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btn49:
                fragment = new W49();
                fragmentTransaction.replace(R.id.frame1, fragment);
                fragmentTransaction.commit();
                break;
        }
    }
}
