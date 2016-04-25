package com.example.mitu.parceler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.parceler.Parcels;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User user = new User("John", "Kabir");
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("user", Parcels.wrap(user));
        startActivity(intent);
    }
}
