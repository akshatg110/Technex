package com.codewithsaurabh.technex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

public class gamingDungeon extends AppCompatActivity {
    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaming_dungeon);
        webview=findViewById(R.id.gaming);
        webview.setWebViewClient(new WebViewClient(){
            public void onPageFinished(WebView view,String url){
                ImageView img=findViewById(R.id.gamingHeader);
                img.setVisibility(View.VISIBLE);
            }
        });
        webview.loadUrl("https://technex.co.in/gaming");
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}
