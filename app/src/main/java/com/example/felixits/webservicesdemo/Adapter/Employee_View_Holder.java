package com.example.felixits.webservicesdemo.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.felixits.webservicesdemo.R;


public class Employee_View_Holder extends RecyclerView.ViewHolder {
    TextView txtname,txtaddress,txtphone;
    Button btndelete;

    public Employee_View_Holder(@NonNull View itemView) {
        super(itemView);
        txtname =itemView.findViewById(R.id.txtname);
        txtaddress = itemView.findViewById(R.id.txtaddress);
        txtphone = itemView.findViewById(R.id.txtphone);

        btndelete = itemView.findViewById(R.id.btndelete);

    }
}
