package com.example.gujianbo.mygit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "1.0", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "3.0", Toast.LENGTH_SHORT).show();

    }
}
