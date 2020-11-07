package com.example.myappgsifinal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HangmanMainActivity extends Activity implements OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hangman_main);

        Button bStart1 = (Button) findViewById(R.id.bStart1);
        Button bStart2 = (Button) findViewById(R.id.bStart2);
        Button bSair   = (Button) findViewById(R.id.bSair);
        bStart1.setOnClickListener(this);
        bStart2.setOnClickListener(this);
        bSair.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent i = new Intent(HangmanMainActivity.this, GameActivity.class);
        switch (v.getId()) {
            case R.id.bStart1:
                i.putExtra("tipo", "jogador1");
                startActivity(i);
                break;
            case R.id.bStart2:
                i.putExtra("tipo", "jogador2");
                startActivity(i);
                break;
            case R.id.bSair:
                finish();
        }
    }
}
