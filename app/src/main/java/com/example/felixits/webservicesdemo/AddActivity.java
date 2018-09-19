package com.example.felixits.webservicesdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.felixits.webservicesdemo.Model.BaseResponse;
import com.example.felixits.webservicesdemo.Model.Employee;
import com.example.felixits.webservicesdemo.Services.Api_Client;
import com.example.felixits.webservicesdemo.Services.Api_Interface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AddActivity extends AppCompatActivity {
    EditText edtname,edtaddress,edtphone;
    Button btninsert;
    ProgressBar progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        edtname = findViewById(R.id.edtname);
        edtaddress = findViewById(R.id.edtaddress);
        edtphone = findViewById(R.id.edtphone);
        btninsert = findViewById(R.id.btninsert);
        progress = findViewById(R.id.progress);
    }

    public void insertToServer(View view) {
    String name = edtname.getText().toString().trim();
    String address = edtaddress.getText().toString().trim();
    String phone = edtphone.getText().toString().trim();


        if (TextUtils.isDigitsOnly(name)||TextUtils.isEmpty(address)||TextUtils.isEmpty(phone)){
            Toast.makeText(getApplicationContext(),"plz enter the data for save",Toast.LENGTH_SHORT).show();
        }
        Employee employee = new Employee(name,address,phone);
        Api_Interface api_interface = Api_Client.getClient().create(Api_Interface.class);

        Call<BaseResponse> call = api_interface.addEmployee(employee);
        progress.setVisibility(View.VISIBLE);
        call.enqueue(new Callback<BaseResponse>() {
            @Override
            public void onResponse(Call<BaseResponse> call, Response<BaseResponse> response) {
            BaseResponse baseResponse = response.body();
            Toast.makeText(getApplicationContext(),baseResponse.getMessage(),Toast.LENGTH_SHORT).show();
            progress.setVisibility(View.GONE);

            }

            @Override
            public void onFailure(Call<BaseResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(),t.getMessage(),Toast.LENGTH_SHORT).show();
                progress.setVisibility(View.GONE);

            }
        });
    }
}
