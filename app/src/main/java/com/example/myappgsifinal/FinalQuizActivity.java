package com.example.myappgsifinal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.myappgsifinal.QuizQuestionsActivity;

import java.util.ArrayList;

import myclasses.Question;


public class FinalQuizActivity extends AppCompatActivity {

    TextView resultQuiz, comment;
    LinearLayout resultLayout;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_quiz);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        resultQuiz = findViewById(R.id.resultQuiz);
        comment = findViewById(R.id.comment);
        resultLayout = findViewById(R.id.resultLayout);

        int intResult = resultQuiz(QuizQuestionsActivity.finalQuestionList);
        String result = Integer.toString(intResult) + "/10";
        resultQuiz.setText(result);

        if (intResult < 6) {
            comment.setText(R.string.badNote);
            resultLayout.setBackgroundColor(getResources().getColor(R.color.Red));
        }
        else if ((intResult >= 6) && (intResult < 10)) {
            comment.setText(R.string.regularNote);
            resultLayout.setBackgroundColor(getResources().getColor(R.color.Yellow));
        }
        else {
            comment.setText(R.string.perfectNote);
            resultLayout.setBackgroundColor(getResources().getColor(R.color.Green));
        }

    }

    public void openInitialScreen (View view) {
        Intent screen = new Intent(this, MainActivity.class);
        startActivity(screen);
    }

    public int resultQuiz (ArrayList<Question> questionList) {
        int rightQuestions = 0;
        for (Question questions : questionList) {
            if (questions.verify()) {
                rightQuestions ++;
            }
        }
        return rightQuestions;
    }
}