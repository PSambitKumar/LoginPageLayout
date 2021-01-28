package com.sambit.cityguide;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private View image_logo, image_cityguide, image_background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Calling the method util to change the status bar color in corresponding to this aactivity
        Util.blackIconStatusBar(MainActivity.this, R.color.light_backgroud);

        image_logo = findViewById(R.id.image_logo);
        image_cityguide = findViewById(R.id.image_cityguide);
        image_background = findViewById(R.id.image_background);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,
                        Pair.create(image_logo, "logo"),
                        Pair.create(image_cityguide, "cityguide"),
                        Pair.create(image_background, "bottombackground"));
               startActivity(intent , options.toBundle());

            }
        },3000);
    }
}