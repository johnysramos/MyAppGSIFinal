package com.example.myappgsifinal;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
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
        TextView hasLowerCaseTxView = (TextView) findViewById(R.id.hasLowerCaseTxView);
        TextView hasUpperCaseTxView = (TextView) findViewById(R.id.hasUpperCaseTxView);
        TextView hasNumTxView = (TextView) findViewById(R.id.hasNumTxView);
        TextView hasSpecialCharTxView = (TextView) findViewById(R.id.hasSpecialCharTxView);
        TextView hasMoreThan7TxView = (TextView) findViewById(R.id.hasMoreThan7TxView);

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
            result.setText(R.string.valid_pwd);
            hasLowerCaseTxView.setText(R.string.hasLowerCase);
            hasUpperCaseTxView.setText(R.string.hasUpperCase);
            hasNumTxView.setText(R.string.hasNum);
            hasSpecialCharTxView.setText(R.string.hasSpecialChar);
            hasMoreThan7TxView.setText(R.string.hasMoreThan7);

            result.setTextColor(0xFF007F00);
            hasLowerCaseTxView.setTextColor(0xFF007F00);
            hasUpperCaseTxView.setTextColor(0xFF007F00);
            hasNumTxView.setTextColor(0xFF007F00);
            hasSpecialCharTxView.setTextColor(0xFF007F00);
            hasMoreThan7TxView.setTextColor(0xFF007F00);
        }
        else {
            result.setText(R.string.invalid_pwd);
            hasLowerCaseTxView.setText(R.string.hasLowerCase);
            hasUpperCaseTxView.setText(R.string.hasUpperCase);
            hasNumTxView.setText(R.string.hasNum);
            hasSpecialCharTxView.setText(R.string.hasSpecialChar);
            hasMoreThan7TxView.setText(R.string.hasMoreThan7);

            result.setTextColor(0xCCA30000);

            if (hasLowerCase) {
                hasLowerCaseTxView.setTextColor(0xFF007F00);
            }
            else {
                hasLowerCaseTxView.setTextColor(0xCCA30000);
            }

            if (hasUpperCase) {
                hasUpperCaseTxView.setTextColor(0xFF007F00);
            }
            else {
                hasUpperCaseTxView.setTextColor(0xCCA30000);
            }

            if (hasNum) {
                hasNumTxView.setTextColor(0xFF007F00);
            }
            else {
                hasNumTxView.setTextColor(0xCCA30000);
            }

            if (hasSpecialChar) {
                hasSpecialCharTxView.setTextColor(0xFF007F00);
            }
            else {
                hasSpecialCharTxView.setTextColor(0xCCA30000);
            }

            if (hasMoreThan7) {
                hasMoreThan7TxView.setTextColor(0xFF007F00);
            }
            else {
                hasMoreThan7TxView.setTextColor(0xCCA30000);
            }
        }
    }

}