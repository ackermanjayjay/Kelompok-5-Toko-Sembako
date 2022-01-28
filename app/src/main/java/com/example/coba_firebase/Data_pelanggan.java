package com.example.coba_firebase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Data_pelanggan extends AppCompatActivity {
    private DatabaseReference database;
    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<Pelanggan> dataPelanggan;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_db_read);
        getSupportActionBar().setTitle("Halaman Pembelian user");
        rvView = (RecyclerView) findViewById(R.id.rv_main);
        rvView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutManager);

        database = FirebaseDatabase.getInstance().getReference();


        database.child("pelanggan").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                dataPelanggan = new ArrayList<>();
                for (DataSnapshot noteDataSnapshot : snapshot.getChildren()) {
                    Pelanggan pelanggan = noteDataSnapshot.getValue(Pelanggan.class);
                    pelanggan.setKey(noteDataSnapshot.getKey());

                    dataPelanggan.add(pelanggan);
                }
                adapter = new Adapter_pelanggan(dataPelanggan, Data_pelanggan.this);
                rvView.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                System.out.println(error.getDetails() + " " + error.getMessage());
            }
        });
    }

    public static Intent getActIntent(Activity activity) {
        return new Intent(activity, Halaman_regis.class);
    }
}
