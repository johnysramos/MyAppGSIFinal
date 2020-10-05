package com.example.myappgsifinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }

    public void StartQuiz(View view) {
        Intent screen = new Intent(this, QuizQuestionsActivity.class);
        startActivity(screen);
    }
}