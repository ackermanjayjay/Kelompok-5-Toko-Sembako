package com.example.coba_firebase;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Halaman_kelompok extends AppCompatActivity {
    ImageButton Home_ku,barang_ku,kelompok_ku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_kelompok);
        getSupportActionBar().setTitle("Halaman Kelompok");

    }
    public  void BukaHalamanBarang()
    {
        Intent buka_Halaman_barang = new Intent(Halaman_kelompok.this,Halaman_beli.class);

        startActivity(buka_Halaman_barang);
    }
    public void BukaHalamanHome()
    {
        Intent buka_Halaman_home = new Intent(Halaman_kelompok.this,Halaman_home.class);

        startActivity(buka_Halaman_home);
    }

}