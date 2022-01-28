package com.example.coba_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Halaman_beli extends AppCompatActivity {
    ImageButton Home
            ,barang
            ,kelompok
            ,beliTelur
            ,beliMinyak;
  Button kurangMinyak
            ,kurangTelor
            ,hapusMinyak
            ,hapusTelur
            ,Button;
    int akumulasiTelor=0
            ,akumulasiMinyak=0;

    int hargaTelur=25000
            ,hargaMinyak=18000
            ,totalMinyak=0
            ,totalTelur=0;

    String myEgg="Telur"
            ,myOil="Minyak";

    boolean kurangOil
            ,kurangTelur
            ,tambahMinyak
            ,tambahTelur;

    TextView minyak_ku
            ,telor_ku;

    Intent hasilTambah
            ,hasilKurang;

    EditText telur
            ,minyak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_beli);
        getSupportActionBar().setTitle("Halaman Beli");



//  tombol beli
        Button=findViewById(R.id.btn_beli);

//        Untuk membeli barangnya
        telor_ku=(TextView)findViewById(R.id.telor_ku);
        minyak_ku=(TextView)findViewById(R.id.minyak_ku);

//        Tombol Hapus unit beli
        hapusMinyak=findViewById(R.id.btn_hapusMinyak);
        hapusTelur=findViewById(R.id.btn_hapusTelor);

//    Tombol beli
        beliTelur=findViewById(R.id.btn_beli_telor);
        beliMinyak=findViewById(R.id.btn_beli_minyak);

//        Tombol kurang unit
        kurangMinyak=findViewById(R.id.btn_kurangMinyak);
        kurangTelor=findViewById(R.id.btn_kurangTelor);

//        Hasil pembelian
        telur=findViewById(R.id.txt_telor);
        minyak=findViewById(R.id.txt_minyak);

//        Untuk judul atas
        getSupportActionBar().setTitle("Halaman barang");

//        Test tombol beli
        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Buy();
            }
        });



//        Untuk Tombol Hapus unit barang beli
        hapusTelur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HapusTelur();
            }
        });

        hapusMinyak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HapusMinyak();
            }
        });


//        Untuk tombol pengurangan unit barang
        kurangTelor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TombolKurangTelor();
            }
        });
        kurangMinyak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TombolKurangMinyak();
            }
        });

//        Untuk Tombol beli barang minyak dan telur
        beliTelur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                TransaksiBeliTelur();
            }
        });
        beliMinyak.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                TransaksiBeliMinyak();

            }
        });
    }


    //    Untuk tombol hapus unit aka reset
    public void HapusTelur()
    {

        telur.setText("");
        telur.setText(null);
    }
    public  void HapusMinyak()
    {
        minyak.setText("");
        minyak.setText(null);
    }


    //    Untuk Tombol unit barang Decrement
    public void TombolKurangTelor()
    {
        if(telur==null)
        {
            telur.setText("");
        }
        akumulasiTelor--;
        telur.setText(""+akumulasiTelor);
        akumulasiTelor=Integer.parseInt(telur.getText()+"");
        kurangTelur = true;


    }
    public void TombolKurangMinyak()
    {
        if(minyak==null)
        {
            minyak.setText("");
        }
        else {
            akumulasiMinyak--;
            minyak.setText("" + akumulasiMinyak);
            akumulasiMinyak=Integer.parseInt(minyak.getText()+"");
            kurangOil=true;
        }
    }

    //    Untuk Tombol unit barang Increment
    public void TransaksiBeliTelur()
    {
        if(telur==null)
        {
            telur.setText("");
            telur.clearFocus();

        }
        else {
            akumulasiTelor++;
            telur.setText("" + akumulasiTelor);
            akumulasiTelor=Integer.parseInt(telur.getText()+"");
            tambahTelur=true;
        }
    }
    public void TransaksiBeliMinyak()
    {

        if(minyak==null)
        {
            minyak.setText("");
            minyak.clearFocus();
        }
        else {
            akumulasiMinyak++;
            minyak.setText("" + akumulasiMinyak);
            akumulasiMinyak=Integer.parseInt(minyak.getText()+"");
            tambahMinyak=true;
        }

    }
    //    Tombol beli
    public void Buy()
    {
        if(tambahMinyak==true && tambahTelur==true)
        {
            hasilTambah= new Intent(Halaman_beli.this,Halaman_transaksi.class);
            totalMinyak=akumulasiMinyak*hargaMinyak;
            totalTelur=akumulasiTelor*hargaTelur;

            hasilTambah.putExtra("HasilTelur",totalTelur);
            hasilTambah.putExtra("barangTelur",myEgg);
            tambahMinyak=false;
            hasilTambah.putExtra("HasilMinyak",totalMinyak);
            hasilTambah.putExtra("barangMinyak",myOil);
            tambahTelur=false;
            startActivity(hasilTambah);
        }

        else if(tambahMinyak==true || tambahTelur==true)
        {
            hasilTambah= new Intent(Halaman_beli.this,Halaman_transaksi.class);
            totalMinyak=akumulasiMinyak*hargaMinyak;
            totalTelur=akumulasiTelor*hargaTelur;

            hasilTambah.putExtra("HasilTelur",totalTelur);
            hasilTambah.putExtra("barangTelur",myEgg);
            tambahMinyak=false;
            hasilTambah.putExtra("HasilMinyak",totalMinyak);
            hasilTambah.putExtra("barangMinyak",myOil);
            tambahTelur=false;
            startActivity(hasilTambah);
        }


//
        else if(kurangTelur==true && kurangOil==true)
        {
            hasilKurang = new Intent(Halaman_beli.this,Halaman_transaksi.class);
            totalMinyak=akumulasiMinyak*hargaMinyak;
            totalTelur=akumulasiTelor*hargaTelur;
            hasilKurang.putExtra("HasilTelur",totalTelur);
            hasilKurang.putExtra("barangTelur",myEgg);

            tambahMinyak=false;
            hasilKurang.putExtra("HasilMinyak",totalMinyak);
            hasilKurang.putExtra("barangMinyak",myOil);
            tambahTelur=false;
            startActivity(hasilKurang);

        }
        else if(kurangTelur==true || kurangOil==true)
        {
            hasilKurang = new Intent(Halaman_beli.this,Halaman_transaksi.class);
            totalMinyak=akumulasiMinyak*hargaMinyak;
            totalTelur=akumulasiTelor*hargaTelur;

            hasilKurang.putExtra("HasilTelur",totalTelur);
            hasilKurang.putExtra("barangTelur",myEgg);
            tambahMinyak=false;
            hasilKurang.putExtra("HasilMinyak",totalMinyak);
            hasilKurang.putExtra("barangMinyak",myOil);

            tambahTelur=false;
            startActivity(hasilKurang);

        }
    }


}

