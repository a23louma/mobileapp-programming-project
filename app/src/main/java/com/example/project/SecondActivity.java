package com.example.project;

import android.os.Bundle;
import android.webkit.WebView;


import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    WebView aboutWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        aboutWebView = findViewById(R.id.about_webview);
        //myWebView.loadUrl("https://his.se");
    }
}