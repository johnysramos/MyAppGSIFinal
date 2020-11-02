package com.example.myappgsifinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class HomeSecurityProtectedDataVideoActivity extends AppCompatActivity {

    VideoView homeSecurityVideo;
    String videoPath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_advices_protected_data_video);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        homeSecurityVideo = findViewById(R.id.homeSecurityVideos);
        videoPath = "android.resource://" + getPackageName() + "/" + R.raw.homesecurity;
        Uri uri = Uri.parse(videoPath);
        homeSecurityVideo.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        homeSecurityVideo.setMediaController(mediaController);
        mediaController.setAnchorView(homeSecurityVideo);
        homeSecurityVideo.requestFocus();
        homeSecurityVideo.start();

        homeSecurityVideo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                finish();
            }
        });
    }
}