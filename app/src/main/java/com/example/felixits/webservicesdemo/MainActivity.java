package com.example.felixits.webservicesdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.felixits.webservicesdemo.Activity.ViewActivity;

public class MainActivity extends AppCompatActivity {
    Button btnadd,btnview,btndelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnadd = findViewById(R.id.btnadd);
        btnview = findViewById(R.id.btnview);
        btndelete = findViewById(R.id.btndelete);
    }

    public void addToServer(View view) {
        Intent add = new Intent(MainActivity.this,AddActivity.class);
        startActivity(add);
    }

    public void viewToServer(View view) {
    Intent go = new Intent(this, ViewActivity.class);
    startActivity(go);

    }
}
