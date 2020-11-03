package com.example.myappgsifinal;

import android.view.View;
import android.view.ViewGroup;

public interface LetterAdapter {
    Object getItem(int arg0);

    long getItemId(int arg0);

    View getView(int position, View convertView, ViewGroup parent);
}
