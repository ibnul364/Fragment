package com.example.fragment1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button F1,F2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        F1 = findViewById(R.id.F1);
        F2 = findViewById(R.id.F2);

        F1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                BlankFragment1 object = new BlankFragment1();
                fragmentTransaction.add(R.id.wrapper,object);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });


        F2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {

                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                BlankFragment2 object = new BlankFragment2();
                fragmentTransaction.add(R.id.wrapper,object);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });






    }
}