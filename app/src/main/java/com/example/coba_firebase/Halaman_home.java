package com.example.coba_firebase;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Halaman_home extends AppCompatActivity {
ImageButton home,tentang,barang;
TextView hasil_nama;
Button beli,kelompok,liat, listbarang;
//String dapat_nama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_home);

//        Button content
        beli=findViewById(R.id.btn_buy);
        kelompok=findViewById(R.id.btn_kelompok);
        liat=findViewById(R.id.btn_liat);
        listbarang=findViewById(R.id.btn_listbarang);

////        Output login
//    hasil_nama=(TextView)findViewById(R.id.hasil_nama);
//    dapat_nama=getIntent().getExtras().getString("nama");
//    hasil_nama.setText("Selamat Datang: "+dapat_nama);


        getSupportActionBar().setTitle("Halaman Home");



        liat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Buka_admin();
            }
        });
//        Button kontent
        beli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Buka_Halaman_beli();
            }
        });

        kelompok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Buka_halaman_kelompok();
            }
        });

        listbarang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Buka_halaman_barang();
            }
        });

    }

    public void Buka_admin()
    {
        Intent openBeli=new Intent(Halaman_home.this, Halaman_konfirm.class);
        startActivity(openBeli);
    }

//    Button kontent
    public void Buka_Halaman_beli()
    {
        Intent openBeli=new Intent(Halaman_home.this, Halaman_regis.class);
        startActivity(openBeli);
    }
    public  void Buka_halaman_kelompok()
    {
        Intent openHalamanKelompok=new Intent(Halaman_home.this, Halaman_kelompok.class);
        startActivity(openHalamanKelompok);
    }

    public  void Buka_halaman_barang()
    {
        Intent openHalamanbarang=new Intent(Halaman_home.this, Halaman_barang.class);
        startActivity(openHalamanbarang);
    }


}