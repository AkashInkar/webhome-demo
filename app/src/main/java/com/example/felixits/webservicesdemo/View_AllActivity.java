package com.example.felixits.webservicesdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ProgressBar;

import com.example.felixits.webservicesdemo.Model.Employee;
import com.example.felixits.webservicesdemo.Services.Api_Interface;

import java.util.List;

public class View_AllActivity extends AppCompatActivity {

    RecyclerView review;
    Employee_Adapter employee_adapter;;
    ProgressBar progress;
    // Declare
    Api_Interface apiInterface;

    //Declare
    List<Employee> employees;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view__all);
        review = findViewById(R.id.review);
    }
}
