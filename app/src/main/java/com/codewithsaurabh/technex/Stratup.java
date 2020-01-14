package com.codewithsaurabh.technex;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import org.jsoup.Jsoup;
import org.w3c.dom.Document;

import java.io.IOException;

public class Stratup extends AppCompatActivity {
    private WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stratup);
        webview = findViewById(R.id.startup);
        webview.setWebViewClient(new WebViewClient(){
            public void onPageFinished(WebView view,String url){
                ImageView img=findViewById(R.id.startupHeader);
                img.setVisibility(View.VISIBLE);
            }
        });
        webview.loadUrl("https://technex.co.in/startupFair");
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
    public void start(View view){
        webview.loadUrl("https://technex.co.in/startupFair");
    }
}