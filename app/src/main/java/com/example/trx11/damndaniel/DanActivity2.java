package com.example.trx11.damndaniel;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class DanActivity2 extends AppCompatActivity {

    public MediaPlayer mp1 = null;
    public MediaPlayer mp2 = null;
    public MediaPlayer mp3 = null;
    public MediaPlayer mp4 = null;
    public MediaPlayer mp5 = null;
    public MediaPlayer mpdamn1 = null;
    public MediaPlayer mpdamn2 = null;
    public MediaPlayer mpdamn3 = null;
    public MediaPlayer mpdamn4 = null;
    public MediaPlayer mpdamn5 = null;
    public MediaPlayer mpdamn6 = null;
    public MediaPlayer mpdamn7 = null;
    public MediaPlayer mpdamn8 = null;
    public MediaPlayer mpdamn9 = null;
    public MediaPlayer mpback = null;
    public MediaPlayer mpdaniel1 = null;
    public MediaPlayer mpdaniel3 = null;
    public MediaPlayer mpdaniel4 = null;
    public MediaPlayer mpdaniel5 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dan2);
    }


    public void track1(View view) {
        if (mp1 == null) {
            mp1 = MediaPlayer.create(this, R.raw.track1);
            mp1.setVolume(0.2f, 0.2f);
        }
        if (mp1.isPlaying()) {
            mp1.pause();
            mp1.reset();
            mp1 = null;
        } else {
            mp1.start();
            mp1.setLooping(true);
        }
    }

    public void track2(View view) {
        if (mp2 == null) {
            mp2 = MediaPlayer.create(this, R.raw.track2);
            mp2.setVolume(0.2f, 0.2f);
        }
        if (mp2.isPlaying()) {
            mp2.pause();
            mp2.reset();
            mp2 = null;
        } else {
            mp2.start();
            mp2.setLooping(true);
        }
    }

    public void track3(View view) {
        if (mp3 == null) {
            mp3 = MediaPlayer.create(this, R.raw.track3);
            mp3.setVolume(0.2f, 0.2f);
        }
        if (mp3.isPlaying()) {
            mp3.pause();
            mp3.reset();
            mp3 = null;
        } else {
            mp3.start();
            mp3.setLooping(true);
        }
    }

    public void track4(View view) {
        if (mp4 == null) {
            mp4 = MediaPlayer.create(this, R.raw.track4);
            mp4.setVolume(0.2f, 0.2f);
        }
        if (mp4.isPlaying()) {
            mp4.pause();
            mp4.reset();
            mp4 = null;
        } else {
            mp4.start();
            mp4.setLooping(true);
        }
    }

    public void track5(View view) {
        if (mp5 == null) {
            mp5 = MediaPlayer.create(this, R.raw.track5);
            mp5.setVolume(0.2f, 0.2f);
        }
        if (mp5.isPlaying()) {
            mp5.pause();
            mp5.reset();
            mp5 = null;
        } else {
            mp5.start();
            mp5.setLooping(true);
        }
    }

    public void damn1(View view) {
        if (mpdamn1 == null) {
            mpdamn1 = MediaPlayer.create(this, R.raw.damn1);
            mpdamn1.setVolume(3.0f, 3.0f);
        }
        if (mpdamn1.isPlaying()) {
            mpdamn1.pause();
            mpdamn1.reset();
            mpdamn1 = MediaPlayer.create(this, R.raw.damn1);
            mpdamn1.start();
        } else {
            mpdamn1.start();
        }
    }

    public void damn2(View view) {
        if (mpdamn2 == null) {
            mpdamn2 = MediaPlayer.create(this, R.raw.damn2);
            mpdamn2.setVolume(3.0f, 3.0f);
        }
        if (mpdamn2.isPlaying()) {
            mpdamn2.pause();
            mpdamn2.reset();
            mpdamn2 = MediaPlayer.create(this, R.raw.damn2);
            mpdamn2.start();
        } else {
            mpdamn2.start();
        }
    }

    public void damn3(View view) {
        if (mpdamn3 == null) {
            mpdamn3 = MediaPlayer.create(this, R.raw.damn3);
            mpdamn3.setVolume(3.0f, 3.0f);
        }
        if (mpdamn3.isPlaying()) {
            mpdamn3.pause();
            mpdamn3.reset();
            mpdamn3 = MediaPlayer.create(this, R.raw.damn3);
            mpdamn3.start();
        } else {
            mpdamn3.start();
        }
    }

    public void damn4(View view) {
        if (mpdamn4 == null) {
            mpdamn4 = MediaPlayer.create(this, R.raw.damn4);
            mpdamn4.setVolume(3.0f, 3.0f);
        }
        if (mpdamn4.isPlaying()) {
            mpdamn4.pause();
            mpdamn4.reset();
            mpdamn4 = MediaPlayer.create(this, R.raw.damn4);
            mpdamn4.start();
        } else {
            mpdamn4.start();
        }
    }

    public void damn5(View view) {
        if (mpdamn5 == null) {
            mpdamn5 = MediaPlayer.create(this, R.raw.damn5);
            mpdamn5.setVolume(3.0f, 3.0f);
        }
        if (mpdamn5.isPlaying()) {
            mpdamn5.pause();
            mpdamn5.reset();
            mpdamn5 = MediaPlayer.create(this, R.raw.damn5);
            mpdamn5.start();
        } else {
            mpdamn5.start();
        }
    }

    public void damn6(View view) {
        if (mpdamn6 == null) {
            mpdamn6 = MediaPlayer.create(this, R.raw.damn6);
            mpdamn6.setVolume(3.0f, 3.0f);
        }
        if (mpdamn6.isPlaying()) {
            mpdamn6.pause();
            mpdamn6.reset();
            mpdamn6 = MediaPlayer.create(this, R.raw.damn6);
            mpdamn6.start();
        } else {
            mpdamn6.start();
        }
    }

    public void damn7(View view) {
        if (mpdamn7 == null) {
            mpdamn7 = MediaPlayer.create(this, R.raw.damn7);
            mpdamn7.setVolume(3.0f, 3.0f);
        }
        if (mpdamn7.isPlaying()) {
            mpdamn7.pause();
            mpdamn7.reset();
            mpdamn7 = MediaPlayer.create(this, R.raw.damn7);
            mpdamn7.start();
        } else {
            mpdamn7.start();
        }
    }

    public void damn8(View view) {
        if (mpdamn8 == null) {
            mpdamn8 = MediaPlayer.create(this, R.raw.damn8);
            mpdamn8.setVolume(3.0f, 3.0f);
        }
        if (mpdamn8.isPlaying()) {
            mpdamn8.pause();
            mpdamn8.reset();
            mpdamn8 = MediaPlayer.create(this, R.raw.damn8);
            mpdamn8.start();
        } else {
            mpdamn8.start();
        }
    }

    public void damn9(View view) {
        if (mpdamn9 == null) {
            mpdamn9 = MediaPlayer.create(this, R.raw.damn9);
            mpdamn9.setVolume(3.0f, 3.0f);
        }
        if (mpdamn9.isPlaying()) {
            mpdamn9.pause();
            mpdamn9.reset();
            mpdamn9 = MediaPlayer.create(this, R.raw.damn9);
            mpdamn9.start();
        } else {
            mpdamn9.start();
        }
    }

    public void back3(View view) {
        if (mpback == null) {
            mpback = MediaPlayer.create(this, R.raw.baiawtwvr);
            mpback.setVolume(3.0f, 3.0f);
        }
        if (mpback.isPlaying()) {
            mpback.pause();
            mpback.reset();
            mpback = MediaPlayer.create(this, R.raw.baiawtwvr);
            mpback.start();
        } else {
            mpback.start();
        }
    }

    public void daniel1(View view) {
        if (mpdaniel1 == null) {
            mpdaniel1 = MediaPlayer.create(this, R.raw.daniel1);
            mpdaniel1.setVolume(3.0f, 3.0f);
        }
        if (mpdaniel1.isPlaying()) {
            mpdaniel1.pause();
            mpdaniel1.reset();
            mpdaniel1 = MediaPlayer.create(this, R.raw.daniel1);
            mpdaniel1.start();
        } else {
            mpdaniel1.start();
        }
    }

    public void daniel3(View view) {
        if (mpdaniel3 == null) {
            mpdaniel3 = MediaPlayer.create(this, R.raw.daniel3);
            mpdaniel3.setVolume(3.0f, 3.0f);
        }
        if (mpdaniel3.isPlaying()) {
            mpdaniel3.pause();
            mpdaniel3.reset();
            mpdaniel3 = MediaPlayer.create(this, R.raw.daniel3);
            mpdaniel3.start();
        } else {
            mpdaniel3.start();
        }
    }

    public void daniel4(View view) {
        if (mpdaniel4 == null) {
            mpdaniel4 = MediaPlayer.create(this, R.raw.daniel4);
            mpdaniel4.setVolume(3.0f, 3.0f);
        }
        if (mpdaniel4.isPlaying()) {
            mpdaniel4.pause();
            mpdaniel4.reset();
            mpdaniel4 = MediaPlayer.create(this, R.raw.daniel4);
            mpdaniel4.start();
        } else {
            mpdaniel4.start();
        }
    }

    public void daniel5(View view) {
        if (mpdaniel5 == null) {
            mpdaniel5 = MediaPlayer.create(this, R.raw.daniel5);
            mpdaniel5.setVolume(3.0f, 3.0f);
        }
        if (mpdaniel5.isPlaying()) {
            mpdaniel5.pause();
            mpdaniel5.reset();
            mpdaniel5 = MediaPlayer.create(this, R.raw.daniel5);
            mpdaniel5.start();
        } else {
            mpdaniel5.start();
        }
    }

    public void goHome(View view) {
//        if (mp1.isPlaying()) {
//            mp1.stop();
//            mp1.release();
//        }
//        if (mp2.isPlaying()) {
//            mp2.stop();
//        }
//        mp2.release();
//        if (mp3.isPlaying()) {
//            mp3.stop();
//        }
//        mp3.release();
//        if (mp4.isPlaying()) {
//            mp4.stop();
//        }
//        mp4.release();
        finish();
    }
}
