package com.example.felixits.webservicesdemo.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.felixits.webservicesdemo.Model.Employee;
import com.example.felixits.webservicesdemo.R;

import java.util.List;

public class Employee_Adapter extends RecyclerView.Adapter<Employee_View_Holder> {
    List<Employee> employeeList;

    @NonNull
    @Override
    public Employee_View_Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view =LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.employee_data_layout,viewGroup,false);
        Employee_View_Holder employee_view_holder= new Employee_View_Holder(view);

        return employee_view_holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Employee_View_Holder employee_view_holder, int i) {
        Employee employee = employeeList.get(i);
        employee_view_holder.txtname.setText(employee.getName());
        employee_view_holder.txtaddress.setText(employee.getAddress());
        employee_view_holder.txtphone.setText(employee.getPhone());

        employee_view_holder.btndelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return employeeList.size();
    }
}
