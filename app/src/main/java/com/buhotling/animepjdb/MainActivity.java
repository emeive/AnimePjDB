package com.buhotling.animepjdb;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.buhotling.animepjdb.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.saveButton.setOnClickListener(v -> {
            //cuando se de click abrimos esto
            String animeName = binding.animeName.getText().toString();
            String year = binding.releaseYear.getText().toString();
            String descrip = binding.thoughtsContent.getText().toString();
            float rating = binding.ratebar.getRating();
            openDetailActivity(animeName, year, descrip, rating);
        });
    }

    private void openDetailActivity(String animeName, String year, String descrip, float rating){

        Anime anime = new Anime(animeName, year, descrip, rating);

        //implementamos el intent: Es como un sobre/paquete que tu envias de un activity a otro. Lo envias y se abre esa ptra actividad. Ese paquete contendrá datos.
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(DetailActivity.ANIME_KEY, anime);
        startActivity(intent);

    }
}
