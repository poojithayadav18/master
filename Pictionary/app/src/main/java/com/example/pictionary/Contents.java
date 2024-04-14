package com.example.pictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Contents extends AppCompatActivity {
    ImageButton act,ani,food,movie,thing,brand,tv,human,place;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contents);
        act=findViewById(R.id.actionb);
        ani=findViewById(R.id.animalb);
        brand=findViewById(R.id.brandb);
        food=findViewById(R.id.foodb);
        human=findViewById(R.id.humanb);
        movie=findViewById(R.id.movieb);
        place=findViewById(R.id.placeb);
        thing=findViewById(R.id.thingb);
        tv=findViewById(R.id.tvb);
        act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Contents.this,Actions.class);
                startActivity(i1);
            }
        });
        ani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(Contents.this,Animals.class);
                startActivity(i2);
            }
        });
        brand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(Contents.this,Brands.class);
                startActivity(i3);
            }
        });
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4=new Intent(Contents.this,Foods.class);
                startActivity(i4);
            }
        });
        human.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5=new Intent(Contents.this,Humans.class);
                startActivity(i5);
            }
        });
        movie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6=new Intent(Contents.this,Movies.class);
                startActivity(i6);
            }
        });
        place.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i7=new Intent(Contents.this,Places.class);
                startActivity(i7);
            }
        });
        thing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i8 =new Intent(Contents.this,Things.class);
                startActivity(i8);
            }
        });
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i9=new Intent(Contents.this,Tvshows.class);
                startActivity(i9);
            }
        });
    }
}