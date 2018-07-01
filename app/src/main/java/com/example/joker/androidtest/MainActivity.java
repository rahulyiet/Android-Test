package com.example.joker.androidtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


//TODO 11 implement ClickListner interface and override the methods and show toast of hero name clicked in it.
public class MainActivity extends AppCompatActivity implements ClickListner{

    private RecyclerView recyclerView;
    private MovieAdapter movieAdapter;
    private List<Movie> movieArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView =findViewById(R.id.recyclerView);



        //TODO 2: Create class Hero having a constructor with fields as id,name and detail and create setters and getters respectively.



        //TODO 3: Get reference to recyclerVeiw and set its layout manager to Linear.
        movieAdapter=new MovieAdapter(this, (ArrayList<Movie>) movieArrayList);

        RecyclerView.LayoutManager movieLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(movieLayoutManager);


      recyclerView.setAdapter(movieAdapter);
       prepareMovieData();
        //


    }

    private void prepareMovieData() {
       Movie movie = new Movie("batman","Action");
       movieArrayList.add(movie);

         movie = new Movie("Deadpool","Action");
        movieArrayList.add(movie);

        movie = new Movie("Doctor strange","Comedy");
        movieArrayList.add(movie);

        movie = new Movie("Iron man","Action");
        movieArrayList.add(movie);

        movie = new Movie("Spiderman","Action");
        movieArrayList.add(movie);

        movie = new Movie("Thor","Action");
        movieArrayList.add(movie);



    }

    @Override
    public void onClick(int position) {

        Toast.makeText(getApplicationContext(),position,Toast.LENGTH_SHORT).show();


    }


    //TODO 12 Using shared preference find if user is new user or not. and show toast Welcome or Welcome again accordingly.



}
