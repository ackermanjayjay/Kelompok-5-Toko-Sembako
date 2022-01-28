package com.example.coba_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Halaman_admin extends AppCompatActivity {
    TextView hasil_nama;
    Button dataPelanggan,kelompok;
    String dapat_nama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_admin);
        getSupportActionBar().setTitle("Halaman Admin");

//        Button content
        dataPelanggan=findViewById(R.id.btn_pelanggan);
        kelompok=findViewById(R.id.btn_admin);

        hasil_nama=findViewById(R.id.hasil_nama);
        dapat_nama=getIntent().getExtras().getString("Nama");
        hasil_nama.setText("Selamat Datang: "+dapat_nama);

        dataPelanggan.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent dataPelanggan = new Intent(Halaman_admin.this, Data_pelanggan.class);
                startActivity(dataPelanggan);
            }
        });

    }
}