package com.example.myappgsifinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class FiveAdvicesProtectedDataVideoActivity extends AppCompatActivity {

    VideoView fiveAdvicesVideo;
    String videoPath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_advices_protected_data_video);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        fiveAdvicesVideo = findViewById(R.id.fiveAdvicesVideos);
        videoPath = "android.resource://" + getPackageName() + "/" + R.raw.fiveadvices;
        Uri uri = Uri.parse(videoPath);
        fiveAdvicesVideo.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        fiveAdvicesVideo.setMediaController(mediaController);
        mediaController.setAnchorView(fiveAdvicesVideo);
        fiveAdvicesVideo.requestFocus();
        fiveAdvicesVideo.start();

        fiveAdvicesVideo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                finish();
            }
        });
    }
}