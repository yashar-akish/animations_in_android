package com.company.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public ImageView BartImageView, HomerImageView;
    //boolean bartIsShown = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BartImageView = findViewById(R.id.bartImageView);
        HomerImageView = findViewById(R.id.homerImageView);

        BartImageView.setAlpha(0.5f);
    }

    public void fade(View view){
        /*if (bartIsShown) {
            BartImageView.animate().alpha(0).setDuration(2000);
            HomerImageView.animate().alpha(1).setDuration(2000);
            bartIsShown = false;
        } else {
            BartImageView.animate().alpha(1).setDuration(2000);
            HomerImageView.animate().alpha(0).setDuration(2000);
            bartIsShown = true;
        }*/

        //BartImageView.animate().translationXBy(-1000).setDuration(2000);

        //BartImageView.animate().translationYBy(1000).setDuration(2000);

        //BartImageView.animate().rotation(360).alpha(0).setDuration(1000);

        //BartImageView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);

        BartImageView.animate().rotation(360).scaleX(0.5f).scaleY(0.5f).alpha(1).translationX(400).setDuration(2000);
        HomerImageView.animate().alpha(1).setDuration(2000);
    }
}