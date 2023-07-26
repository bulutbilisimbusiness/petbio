package com.bulutbilisimbusiness.petbio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BioActivity extends AppCompatActivity {
    private ImageView petImageView;
    private TextView petName;
    private TextView petBio;
    private Bundle extras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        petImageView=(ImageView) findViewById(R.id.petImageViewID);
        petName=(TextView) findViewById(R.id.nameID);
        petBio=(TextView) findViewById(R.id.bioTextID);

        extras=getIntent().getExtras();
        if(extras !=null){
            String name=extras.getString("name");
            String bio = extras.getString("bio");

            setUp(name,bio);
        }
    }
    public void setUp(String name,String bio){
        if (name.equals("Duman")){
            petImageView.setImageDrawable(getResources().getDrawable(R.drawable.dog_icon));
            petName.setText(name);
            petBio.setText(bio);

        }else if(name.equals("Garfield")){
            petImageView.setImageDrawable(getResources().getDrawable(R.drawable.cat_icon));
            petName.setText(name);
            petBio.setText(bio);
        }
    }
}