package com.example.animation001.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;
import com.example.animation001.R;

public class MainActivity extends AppCompatActivity {
Button button_bonuce,button_sequential,button_togather,facebook,youtube,twitter;
ImageView imageView;
    private LottieAnimationView lottieAnimationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }
    void initView(){
        button_bonuce = findViewById(R.id.button_bonuce);
        imageView = findViewById(R.id.image_view);
                lottieAnimationView = findViewById(R.id.lottie_animatsiya);

//                lottieAnimationView.setAnimation("facebook.json");
//                lottieAnimationView.playAnimation();

        button_bonuce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation_bonuce = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
                imageView.startAnimation(animation_bonuce);




            }
        });

        button_sequential = findViewById(R.id.button_sequential);
        button_sequential.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.sequential);
                imageView.startAnimation(animation);
            }
        });

        button_togather = findViewById(R.id.button_togather);
        button_togather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.togather);
                imageView.startAnimation(animation);
            }
        });

        twitter = findViewById(R.id.button_twitter);
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lottieAnimationView.setAnimation("twitter.json");
                lottieAnimationView.playAnimation();
            }
        });
        youtube = findViewById(R.id.button_you_tube);
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lottieAnimationView.setAnimation("youtube.json");
                lottieAnimationView.playAnimation();
            }
        });

        facebook = findViewById(R.id.button_facebook);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lottieAnimationView.setAnimation("facebook.json");
                lottieAnimationView.playAnimation();
            }
        });

//        switch (position) {
//            case 0:
//                //case ichidagi narsalar animatsiyani chaqirish uchun kerak.
//                lottieAnimationView.setAnimation("telegram.json");
//                lottieAnimationView.playAnimation();
//                break;
//            case 1:
//                lottieAnimationView.setAnimation("speed.json");
//                lottieAnimationView.playAnimation();
//                break;
//            case 2:
//                lottieAnimationView.setAnimation("present.json");
//                lottieAnimationView.playAnimation();
//                break;
//            case 3:
//                lottieAnimationView.setAnimation("infinity.json");
//                lottieAnimationView.playAnimation();
//                break;
//            case 4:
//                lottieAnimationView.setAnimation("secure.json");
//                lottieAnimationView.playAnimation();
//                break;
//            case 5:
//                lottieAnimationView.setAnimation("cloud.json");
//                lottieAnimationView.playAnimation();
//                break;
//            default:
//                lottieAnimationView.setAnimation("telegram.json");
//                lottieAnimationView.playAnimation();
//        }




    }
}