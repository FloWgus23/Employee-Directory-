package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageView = findViewById(R.id.detailImage);  // ใช้ id ที่ตรงกับ XML
        TextView nameTextView = findViewById(R.id.detailName);
        TextView emailTextView = findViewById(R.id.detailEmail);
        TextView addressTextView = findViewById(R.id.detailAddress);
        TextView countryTextView = findViewById(R.id.detailCountry);
        TextView phoneTextView = findViewById(R.id.detailPhone);

        // รับข้อมูลจาก Intent
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String email = intent.getStringExtra("email");
        String imageUrl = intent.getStringExtra("imageUrl");
        String address = intent.getStringExtra("address");
        String country = intent.getStringExtra("country");
        String phone = intent.getStringExtra("phone");

        // ตั้งค่า TextView และ ImageView
        nameTextView.setText(name);
        emailTextView.setText(email);
        addressTextView.setText(address);
        countryTextView.setText(country);
        phoneTextView.setText(phone);

        // ใช้ Glide เพื่อโหลดภาพจาก URL
        Glide.with(this).load(imageUrl).into(imageView);
    }
}

