package com.codewithsaurabh.technex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class kaleidoscope extends AppCompatActivity {
    private WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaleidoscope);
        webview=findViewById(R.id.kaleidoscope);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("https://technex.co.in/kaleidoscope");
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}
