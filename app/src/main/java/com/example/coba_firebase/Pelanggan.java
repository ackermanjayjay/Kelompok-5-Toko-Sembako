package com.example.coba_firebase;

import android.content.Intent;
import java.io.Serializable;

public class Pelanggan implements Serializable
{
    private String nama;
    private String alamat;
    private String barang;
    private String unit;
    private String harga;
    private String key;


    public Pelanggan() {



    }
    public String getBarang() {
        return barang;
    }

    public void setBarang(String barang) {
        this.barang = barang;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
    @Override
    public String toString() {
        return " "+nama+"\n" +
                " "+alamat +"\n"+
                " "+harga+"\n"+
                " "+barang+"\n"+
                " "+unit;
    }

    public Pelanggan(String nm, String almt,String hr,String un,String br){
        nama = nm;
        alamat = almt;
        harga=hr;
        barang=br;
        unit=un;
    }
}
