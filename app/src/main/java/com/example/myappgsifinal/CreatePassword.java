package com.example.myappgsifinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class CreatePassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_password);
    }

    public void validPwd(View view) {
        EditText pwd = (EditText) findViewById(R.id.pwd);
        TextView pwdView = (TextView) findViewById(R.id.pwdView);
        TextView result = (TextView) findViewById(R.id.result);

        boolean hasMoreThan7 = false;
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasNum = false;
        boolean hasSpecialChar = false;

        char c;

        if (pwd.getText().length() > 7) {
            hasMoreThan7 = true;
        }
        for (int i = 0; i < pwd.getText().length(); i++) {
            c = pwd.getText().charAt(i);
            if (Character.isDigit(c)) {
                hasNum = true;
            }
            else if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            }
            else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            }
            else if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
        }

        pwdView.setText(pwd.getText());

        if (hasMoreThan7 && hasLowerCase && hasUpperCase && hasNum && hasSpecialChar) {

            result.setText(String.format(getResources().getString(R.string.valid_pwd)
             + getResources().getString(R.string.hasNum)));
        }
        else result.setText(R.string.invalid_pwd);
    }

}