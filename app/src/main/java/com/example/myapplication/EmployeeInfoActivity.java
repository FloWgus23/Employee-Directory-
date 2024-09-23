package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class EmployeeInfoActivity extends AppCompatActivity {

    private Button buttonEmployeeInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_info);

        buttonEmployeeInfo = findViewById(R.id.buttonEmployeeInfo);

        buttonEmployeeInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmployeeInfoActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

