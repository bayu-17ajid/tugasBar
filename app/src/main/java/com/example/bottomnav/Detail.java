package com.example.bottomnav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Detail extends AppCompatActivity {

    private TextView tvJudul, tvGenre, tvDescription;
    private ImageView photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvJudul = findViewById(R.id.tvJudul);
        tvGenre = findViewById(R.id.tvGenre);
        tvDescription = findViewById(R.id.tvDescription);
        photo = findViewById(R.id.photo);


//        Hero heroan = getIntent().getParcelableExtra("hero_data");
//
//
//        tvJudul.setText(heroan.getName());
//        tvDescription.setText(heroan.getDetail());
//        tvGenre.setText(heroan.getGenre());
//        photo.setImageResource(heroan.getPhoto());

        String nama = getIntent().getStringExtra("name");
        String detail = getIntent().getStringExtra("detail");
        String genre = getIntent().getStringExtra("genre");
        int foto = getIntent().getIntExtra("photo", 0);

        tvJudul.setText(nama);
        tvGenre.setText(genre);
        tvDescription.setText(detail);
        photo.setImageResource(foto);


        setActionBarTitle(nama);


    }

    public void btnBack(View view) {
        Intent goBack = new Intent(Detail.this,MainActivity.class);
        goBack.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(goBack);
    }

    private void setActionBarTitle(String title){
        getSupportActionBar().setTitle(title);
    }
}