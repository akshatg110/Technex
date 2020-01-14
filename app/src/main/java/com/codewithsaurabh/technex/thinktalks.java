package com.codewithsaurabh.technex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

public class thinktalks extends AppCompatActivity {
    private WebView webview;
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thinktalks);
        webview=findViewById(R.id.thinktalks);
        webview.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageFinished(WebView view,String url){
                ImageView img=findViewById(R.id.thinktalksHeader);
                img.setVisibility(View.VISIBLE);
            }
        });
        webview.loadUrl("https://technex.co.in/thinkTalks");
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }
    public void think(View view){
        webview.loadUrl("https://technex.co.in/thinkTalks");
    }

}
