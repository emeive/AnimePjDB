package com.buhotling.animepjdb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.buhotling.animepjdb.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

    public static final String ANIME_KEY = "anime";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDetailBinding binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Bundle extras = getIntent().getExtras();
        Anime anime = extras.getParcelable(ANIME_KEY);
        binding.setAnime(anime);

        /*
        Esto ya no se necesita dado que se ha introducio directamenet en activity_detail.xml

        binding.textView.setText(anime.getTitulo());
        binding.textView4.setText(anime.getDescrip());
        binding.textView3.setText(anime.getAño());
        binding.ratingBar.setRating(anime.getRating());
        */


    }
}