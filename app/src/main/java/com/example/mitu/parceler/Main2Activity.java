package com.example.mitu.parceler;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.parceler.Parcels;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        User user = (User) Parcels.unwrap(getIntent().getParcelableExtra("user"));

        Log.d("Parceler",user.firstName+" "+user.lastName+" ");


    }
}
