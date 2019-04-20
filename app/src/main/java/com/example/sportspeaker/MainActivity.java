package com.example.sportspeaker;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//
    @BindView(R.id.image_Boxing)
    ImageButton imageBoxing;
    @BindView(R.id.image_aikido)
    ImageButton imageAikido;
    @BindView(R.id.image_karate)
    ImageButton imageKarate;
    @BindView(R.id.image_kickboxing)
    ImageButton imageKickboxing;
    @BindView(R.id.image_taekwondo)
    ImageButton imageTaekwondo;
    @BindView(R.id.image_judo)
    ImageButton imageJudo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        imageBoxing.setOnClickListener(MainActivity.this);
        imageKickboxing.setOnClickListener(MainActivity.this);
        imageJudo.setOnClickListener(MainActivity.this);
        imageAikido.setOnClickListener(MainActivity.this);
        imageTaekwondo.setOnClickListener(MainActivity.this);
        imageKarate.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View imagebutton) {
        switch (imagebutton.getId())
        {
            case R.id.image_Boxing:
                placesport(imageBoxing.getTag().toString());
                break;
            case R.id.image_karate:
                placesport(imageKarate.getTag().toString());
                break;
            case R.id.image_aikido:
                placesport(imageAikido.getTag().toString());
                break;
            case R.id.image_judo:
                placesport(imageJudo.getTag().toString());
                break;
            case R.id.image_kickboxing:
                placesport(imageKickboxing.getTag().toString());
                break;
            case R.id.image_taekwondo:
                placesport(imageTaekwondo.getTag().toString());
                break;
        }
    }
    private void placesport(String sportgame)
    {
        MediaPlayer mediaPlayer=MediaPlayer.create(this,getResources().getIdentifier
                (sportgame,"raw",getPackageName()));
        mediaPlayer.start();
    }
}
