package com.programmer.a10119246_latihan2;
// Nama : Ferdi Bayu Febryan
// Kelas : IF-06
// NIM : 10119246
// Tanggal Pengerjaan : 25 April 2022

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void btnRegister(View view){
            Intent intent = new Intent(this, RegisterActivity.class);
            startActivity(intent);
    }
}