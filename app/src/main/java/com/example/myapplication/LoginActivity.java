package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText editTextUsername, editTextPassword;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                if (username.equals("admin") && password.equals("1234")) {
                    // เมื่อข้อมูลถูกต้องให้ไปหน้า EmployeeInfoActivity
                    Intent intent = new Intent(LoginActivity.this, EmployeeInfoActivity.class);
                    startActivity(intent);
                } else {
                    // แจ้งเตือนเมื่อข้อมูลไม่ถูกต้อง
                    Toast.makeText(LoginActivity.this, "Username หรือ Password ไม่ถูกต้อง", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
