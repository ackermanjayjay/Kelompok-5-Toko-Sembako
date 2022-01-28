package com.example.coba_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Halaman_konfirm extends AppCompatActivity {
EditText nama,pass;
Button simpan;
private String []namaAdmin={"kelompok5"};
private String []passAdmin={"123"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_konfirm);
        nama=findViewById(R.id.et_nama_admin);
        pass=findViewById(R.id.et_pass_admin);
        simpan=findViewById(R.id.btn_masuk_admin);
        getSupportActionBar().setTitle("Halaman Konfirm");

        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nama.getText().toString().equals(namaAdmin[0])&&pass.getText().toString().equals(passAdmin[0]))
                {
                    bukaAdmin();
                }
                else
                {
                    nama.setError("Nama salah");
                    pass.setError("Password salah");

                }
            }
        });


    }
    public void bukaAdmin()
    {
        Intent openBeli=new Intent(Halaman_konfirm.this, Data_pelanggan.class);
        startActivity(openBeli);
    }
}
