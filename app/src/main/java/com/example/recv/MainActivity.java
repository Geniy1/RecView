package com.example.recv;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.activity.EdgeToEdge;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

            MyMovieData[] myMovieData = new MyMovieData[]{
                new MyMovieData("Animal","2019 yil",R.drawable.animal),
                new MyMovieData("Akfamen","2018 yil",R.drawable.aquaman),
                new MyMovieData("Avatar","2005 yil",R.drawable.avatar),
                new MyMovieData("Black Widow","2019 yil",R.drawable.black_widow),
                new MyMovieData("Hunted","2012 yil",R.drawable.hanted),
                new MyMovieData("Sevgi","2003 yil",R.drawable.love),
                new MyMovieData("Erkak","2009 yil",R.drawable.men),
        };

        MyMovieAdapter myMovieAdapter = new MyMovieAdapter(myMovieData,MainActivity.this);
        recyclerView.setAdapter(myMovieAdapter);
    }
}