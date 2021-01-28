package com.sambit.cityguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class LoginActivity extends AppCompatActivity {

    private LinearLayout layout_buttom;
    private Animation animation_fadein;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Util.blackIconStatusBar(LoginActivity.this, R.color.light_backgroud);

        layout_buttom = findViewById(R.id.layout_buttom);
        animation_fadein = AnimationUtils.loadAnimation(LoginActivity.this, R.anim.fade_in);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                layout_buttom.setVisibility(View.VISIBLE);
                layout_buttom.setAnimation(animation_fadein);
            }
        },1500);
    }
}