package com.example.felixits.webservicesdemo.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.example.felixits.webservicesdemo.R;

public class ViewActivity extends AppCompatActivity {
    RecyclerView review;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

    }
}
