package com.example.myappgsifinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HangmanMainActivity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hangman_main);
        Button playBtn = findViewById(R.id.playBtn);
        playBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //handle clicks
        if (view.getId() == R.id.playBtn) {
            Intent playIntent = new Intent(this, GameActivity.class);
            this.startActivity(playIntent);
        }
    }
}
