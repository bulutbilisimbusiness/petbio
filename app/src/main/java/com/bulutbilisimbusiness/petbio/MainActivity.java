package com.bulutbilisimbusiness.petbio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView catView;
    ImageView dogView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        catView = findViewById(R.id.catID);
        dogView = findViewById(R.id.dogID);

        catView.setOnClickListener(this);
        dogView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == catView.getId()) {
           // Toast.makeText(MainActivity.this, "Cat", Toast.LENGTH_LONG).show();
            Intent catIntent= new Intent(MainActivity.this,BioActivity.class);
            catIntent.putExtra("name","Garfield");
            catIntent.putExtra("bio","Great cat. Loves people and meows a lot !");
            startActivity(catIntent);

        } else if (v.getId() == dogView.getId()) {
            //Toast.makeText(MainActivity.this, "Dog", Toast.LENGTH_LONG).show();
            Intent dogIntent= new Intent(MainActivity.this,BioActivity.class);
            dogIntent.putExtra("name","Duman");
            dogIntent.putExtra("bio","Great dog. Loves people and barks and eats a lot !");
            startActivity(dogIntent);
        }
    }
}