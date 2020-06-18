package com.example.demo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.pierfrancescosoffritti.youtubeplayer.player.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.youtubeplayer.player.YouTubePlayer;
import com.pierfrancescosoffritti.youtubeplayer.player.YouTubePlayerInitListener;
import com.pierfrancescosoffritti.youtubeplayer.player.YouTubePlayerView;

public class MainActivity extends AppCompatActivity {

    YouTubePlayerView youTubePlayerView;
   public static YouTubePlayer initializedYouTubePlayer1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        youTubePlayerView = findViewById(R.id.youtube_player_view);

        youTubePlayerView.initialize(new YouTubePlayerInitListener() {
            @Override
            public void onInitSuccess(final YouTubePlayer initializedYouTubePlayer) {
                initializedYouTubePlayer.addListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady() {
                        String videoId = "6JYIGclVQdw";
                        initializedYouTubePlayer1 = initializedYouTubePlayer;
                        initializedYouTubePlayer.loadVideo(videoId, 0);

                    }
                });
            }
        }, true);
    }

    public void goBack(View view) {
        if (initializedYouTubePlayer1 != null) {
            initializedYouTubePlayer1.pause();
        }
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        if (initializedYouTubePlayer1 != null) {
            initializedYouTubePlayer1.pause();
        }
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }
}