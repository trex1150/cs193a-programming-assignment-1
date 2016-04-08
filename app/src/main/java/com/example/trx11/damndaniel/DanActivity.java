package com.example.trx11.damndaniel;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class DanActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dan);
    }

    public void damn1(View view) {
        int id = view.getId();
        Button soundButton = (Button) findViewById(id);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.damn1);
        mp.start();
    }

    public void damn2(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.damn2);
        mp.start();
    }

    public void damn3(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.damn3);
        mp.start();
    }

    public void damn4(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.damn4);
        mp.start();
    }

    public void damn5(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.damn5);
        mp.start();
    }

    public void damn6(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.damn6);
        mp.start();
    }

    public void damn7(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.damn7);
        mp.start();
    }

    public void damn8(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.damn8);
        mp.start();
    }

    public void damn9(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.damn9);
        mp.start();
    }

    public void back1(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.baiawtwv1);
        mp.start();
    }

    public void back2(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.baiawtwv2);
        mp.start();
    }

    public void remix(View view) {
        startActivity(new Intent("android.intent.action.DanActivity2"));
    }
}
