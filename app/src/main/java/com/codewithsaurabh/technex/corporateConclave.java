package com.codewithsaurabh.technex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

public class corporateConclave extends AppCompatActivity {
    private WebView webview;
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corporate_conclave);
        webview=findViewById(R.id.corporate);
        webview.setWebViewClient(new WebViewClient(){
            public void onPageFinished(WebView view,String url){
                ImageView img=findViewById(R.id.corporateHeader);
                img.setVisibility(View.VISIBLE);
            }
        });
        webview.loadUrl("https://technex.co.in/corporateConclave");
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }
}
