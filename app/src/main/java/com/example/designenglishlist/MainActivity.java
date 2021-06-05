package com.example.designenglishlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    List<Frutas> lstfrutas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstfrutas = new ArrayList<>();
        lstfrutas.add(new Frutas("Apple","a.pl","Do you know there are more than 7,500 known cultivated varieties of apples?","Você sabia que existem mais de 7.500 variedades de cultivos de maçã conhecidos?"," ")) ;


       //Frutas frutas = new Frutas("Apple","a.pl","Do you know there are more than 7,500 known cultivated varieties of apples?","Você sabia que existem mais de 7.500 variedades de cultivos de maçã conhecidos?");

       RecyclerView mRecyclerView = findViewById(R.id.id_recyclerView);
       RecyclerView.Adapter mAdapter = new RecyclerView.Adapter(getApplicationContext(), lstfrutas);

       mRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));
       mRecyclerView.setAdapter(mAdapter);
    }
}