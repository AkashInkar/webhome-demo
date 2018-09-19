package com.example.felixits.webservicesdemo.Services;

import com.example.felixits.webservicesdemo.Model.BaseResponse;
import com.example.felixits.webservicesdemo.Model.Employee;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface Api_Interface {
    @POST("/myapp/api/employees/single")
    public Call<BaseResponse> addEmployee(@Body Employee employee);
}
