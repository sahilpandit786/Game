package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imageView2,imageView;
    TextView textView,textView2,textView3, textView4;
    Random r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView2 = findViewById(R.id.imageView2);
        imageView = findViewById(R.id.imageView);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);

        r = new Random();
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation rotate= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                imageView.startAnimation(rotate);
                imageView2.startAnimation(rotate);

                int cpu_throw = r.nextInt(6)+1;
                int player_throw = r.nextInt(6)+1;
                setImageCPU(cpu_throw);
                setImagePlayer(player_throw);

                if (cpu_throw>player_throw)
                {
                    textView3.setText("Computer Win");


                }
                else if (player_throw>cpu_throw)
                {
                    textView3.setText("User Win");
                }
                else{
                    textView3.setText("It's a tie");
                }

            }

        });
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation rotate= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                imageView.startAnimation(rotate);
                imageView2.startAnimation(rotate);

                int cpu_throw=r.nextInt(6)+1;
                int player_throw=r.nextInt(6)+1;
                setImageCPU(cpu_throw);
                setImagePlayer(player_throw);

                if (cpu_throw>player_throw)
                {
                    textView3.setText("User Win");


                }
                else if (player_throw>cpu_throw)
                {
                    textView3.setText("Computer Win");
                }
                else{
                    textView3.setText("It's a tie");
                }

            }

        });

    }
    public void setImageCPU(int num){
        switch(num){
            case 1:
                imageView.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageView.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageView.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageView.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageView.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageView.setImageResource(R.drawable.dice6);
                break;
        }
    }
    public void setImagePlayer(int num){
        switch(num){
            case 1:
                imageView2.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageView2.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageView2.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageView2.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageView2.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageView2.setImageResource(R.drawable.dice6);
                break;
        }
    }
}