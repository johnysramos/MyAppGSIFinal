package com.example.myappgsifinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OpenCreatePasswordScreen(View view) {
         Intent screen = new Intent(this, CreatePassword.class);
         startActivity(screen);

    }

    public void OpenQuizScreen(View view) {
        Intent screen = new Intent(this, Quiz.class);
        startActivity(screen);

    }

    public void OpenFiveAdvicesProtectedDataVideo(View view) {
        Intent screen = new Intent(this, FiveAdvicesProtectedDataVideoActivity.class);
        startActivity(screen);

    }

    public void HomeSecurityProtectedDataVideo(View view) {
        Intent screen = new Intent(this, HomeSecurityProtectedDataVideoActivity.class);
        startActivity(screen);

    }

    public void HangmanMain(View view) {
        Intent screen = new Intent(this, HangmanMainActivity.class);
        startActivity(screen);

    }
}