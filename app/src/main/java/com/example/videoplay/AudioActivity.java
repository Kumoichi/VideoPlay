package com.example.videoplay;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;



public class AudioActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    MediaPlayer state1 = mediaPlayer;
    MediaPlayer state2 = mediaPlayer;
    MediaPlayer state3 = mediaPlayer;
    MediaPlayer state4 = mediaPlayer;
    MediaPlayer state5 = mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);

    }


    public void playSound(View view) {
        switch (view.getId()) {
            case R.id.audio_button_1:
                if (state1 == null) {
                    state1 = mediaPlayer.create(getApplicationContext(), R.raw.game_over);
                }
                state1.start();
                break;

            case R.id.audio_button_2:
                if (state2 == null) {
                    state2 = mediaPlayer.create(getApplicationContext(), R.raw.level_complete);
                }
                state2.start();
                break;

            case R.id.audio_button_3:
                if (state3 == null) {
                    state3 = mediaPlayer.create(getApplicationContext(), R.raw.player_died);
                }
                state3.start();
                break;

            case R.id.audio_button_4:
                if (state4 == null) {
                    state4 = mediaPlayer.create(getApplicationContext(), R.raw.strings);
                }
                state4.start();
                break;

            case R.id.audio_button_5:
                if (state5 == null) {
                    state5 = mediaPlayer.create(getApplicationContext(), R.raw.toccata);
                }
                state5.start();
                break;
        }

    }


    public void pauseSound(View view) {
        switch (view.getId()) {
            case R.id.pause_button_1:
                if (state1 != null) {
                    state1.pause();
                }
                break;

            case R.id.pause_button_2:
                if (state2 != null) {
                    state2.pause();
                }
                break;

            case R.id.pause_button_3:
                if (state3 != null) {
                    state3.pause();
                }
                break;

            case R.id.pause_button_4:
                if (state4 != null) {
                    state4.pause();
                }
                break;

            case R.id.pause_button_5:
                if (state5 != null) {
                    state5.pause();
                }
                break;
        }
    }


    public void stopSound(View view) {
        switch (view.getId()) {
            case R.id.stop_button_1:
                if (state1 != null) {
                    state1.release();
                    state1 = null;
                }
                break;

            case R.id.stop_button_2:
                if (state2 != null) {
                    state2.release();
                    state2 = null;
                }
                break;

            case R.id.stop_button_3:
                if (state3 != null) {
                    state3.release();
                    state3 = null;
                }
                break;

            case R.id.stop_button_4:
                if (state4 != null) {
                    state4.release();
                    state4 = null;
                }
                break;

            case R.id.stop_button_5:
                if (state5 != null) {
                    state5.release();
                    state5 = null;
                    break;
                }
        }
    }
}


