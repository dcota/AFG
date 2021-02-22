package com.application.SafeShop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView myReciclerView;
    MyAdapter myAdapter;
    ArrayList<Model> models = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myReciclerView = findViewById(R.id.recyclerView);
        myReciclerView.setLayoutManager(new LinearLayoutManager(this));
        myAdapter = new MyAdapter(this, getMyList());
        myReciclerView.setAdapter(myAdapter);
    }

    private ArrayList<Model> getMyList(){

        //aqui tem de fazer o request e criar arraylists

        Model m = new Model();
        int lot = 25;
        int cont = 5;
        m.setLine1("Lotação máxima: " + lot);
        m.setLine2("Pessoas na loja: "+ cont);
        m.setImg(R.drawable.zara_logo);
        if(cont>=lot)
            m.setImg1(R.drawable.red);
        else if (cont>=lot*0.25)
            m.setImg1(R.drawable.yellow);
        else
            m.setImg1(R.drawable.green);
        this.models.add(m);

        m = new Model();
        lot = 50;
        cont = 25;
        m.setLine1("Lotação máxima: " + lot);
        m.setLine2("Pessoas na loja: "+ cont);
        m.setImg(R.drawable.logo_worten);
        if(cont>=lot)
            m.setImg1(R.drawable.red);
        else if (cont>=lot*0.25)
            m.setImg1(R.drawable.yellow);
        else
            m.setImg1(R.drawable.green);
        this.models.add(m);

        m = new Model();
        lot = 22;
        cont = 22;
        m.setLine1("Lotação máxima: " + lot);
        m.setLine2("Pessoas na loja: "+ cont);
        m.setImg(R.drawable.pb);
        if(cont>=lot)
            m.setImg1(R.drawable.red);
        else if (cont>=lot*0.25)
            m.setImg1(R.drawable.yellow);
        else
            m.setImg1(R.drawable.green);
        this.models.add(m);


        return models;
    }
}