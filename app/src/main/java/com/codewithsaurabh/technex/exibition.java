package com.codewithsaurabh.technex;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

public class exibition extends AppCompatActivity {
    private WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibition);
        webview=findViewById(R.id.exibition);
        webview.setWebViewClient(new WebViewClient(){
            public void onPageFinished(WebView view,String url){
                ImageView img=findViewById(R.id.exhibitionHeader);
                img.setVisibility(View.VISIBLE);
            }
        });
        webview.loadUrl("https://technex.co.in/exhibitions");
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
    public void exi(View view){
        webview.loadUrl("https://technex.co.in/exhibitions");
    }
}
