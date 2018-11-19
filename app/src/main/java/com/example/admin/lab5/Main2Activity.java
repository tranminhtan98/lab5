package com.example.admin.lab5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main2Activity extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        webView = findViewById(R.id.webview);
        Intent intent = getIntent();
        String duonglink = intent.getStringExtra("link");
        webView.loadUrl(duonglink);
        webView.setWebViewClient(new WebViewClient());
    }
}
