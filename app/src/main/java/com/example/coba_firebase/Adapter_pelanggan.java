package com.example.coba_firebase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter_pelanggan extends RecyclerView.Adapter<Adapter_pelanggan.ViewHolder>
{
    private ArrayList<Pelanggan>daftarPelanggan;
    private Context context;

    public Adapter_pelanggan(ArrayList<Pelanggan>pelanggans,Context ctx)
    {
        daftarPelanggan = pelanggans;
        context =ctx;
    }
    class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView tv_nama
                ,tv_barang
                ,tv_alamat
                ,tv_unit
                ,tv_harga;

        ViewHolder(View itemView) {
            super(itemView);
            tv_nama=(TextView)itemView.findViewById(R.id.tv_namapelanggan);
            tv_barang=(TextView) itemView.findViewById(R.id.tv_namabarang);
            tv_alamat=(TextView) itemView.findViewById(R.id.tv_alamatPelanggan);
            tv_unit=(TextView) itemView.findViewById(R.id.tv_unitBarang);
            tv_harga=(TextView) itemView.findViewById(R.id.tv_hargaBarang);
        }
    }
    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType)
    {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pelanggan,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        final String nama = daftarPelanggan.get(position).getNama();
        final String barang = daftarPelanggan.get(position).getBarang();
        final String alamat=daftarPelanggan.get(position).getAlamat();
        final String unit=daftarPelanggan.get(position).getUnit();
        final String harga=daftarPelanggan.get(position).getHarga();

        holder.tv_nama.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                return true;
            }
        });
        holder.tv_nama.setText(nama);

        holder.tv_barang.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                return true;
            }
        });
        holder.tv_barang.setText(barang);

        holder.tv_alamat.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                return true;
            }
        });
        holder.tv_alamat.setText(alamat);

        holder.tv_unit.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                return true;
            }
        });
        holder.tv_unit.setText(unit);

        holder.tv_harga.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                return true;
            }
        });
        holder.tv_harga.setText(harga);

    }
    @Override
    public int getItemCount() {
        return daftarPelanggan.size();
    }
}
