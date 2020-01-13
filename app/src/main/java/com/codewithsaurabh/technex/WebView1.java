package com.codewithsaurabh.technex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

public class WebView1 extends AppCompatActivity {
 private WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view1);
        Intent intent = getIntent();
        int i = intent.getIntExtra("case", 0);
        webview = findViewById(R.id.webView);
        webview.setWebViewClient(new WebViewClient()
        {
            public void onPageFinished(WebView view,String url){
                ImageView img=findViewById(R.id.header);
                img.setVisibility(View.VISIBLE);
            }
        });
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        switch (i) {
            case 1:
                webview.loadUrl("https://technex.co.in/chat-bot");
                break;

            case 2:
                webview.loadUrl("https://technex.co.in/java");
                break;
            case 3:
                webview.loadUrl("https://technex.co.in/digitalmarketing");
                break;
            case 4:
                webview.loadUrl("https://technex.co.in/bridge");
                break;
            case 5:
                webview.loadUrl("https://technex.co.in/googlehome");
                break;
            case 6:
                webview.loadUrl("https://technex.co.in/drone");
                break;
            case 7:
                webview.loadUrl("https://technex.co.in/ardubotics");
                break;
            case 8:
                webview.loadUrl("https://technex.co.in/automobile");
                break;
            case 9:
                webview.loadUrl("https://technex.co.in/hacknex");
                break;
            case 10:
                webview.loadUrl("https://technex.co.in/ai");
                break;
            case 11:
                webview.loadUrl("https://technex.co.in/autocad");
                break;
            case 12:
                webview.loadUrl("https://technex.co.in/iot");
                break;
            case 13:
                webview.loadUrl("https://technex.co.in/data");
                break;
            case 14:
                webview.loadUrl("https://technex.co.in/webdev");
                break;
            case 15:
                webview.loadUrl("https://technex.co.in/raspberry");
                break;
            case 16:
                webview.loadUrl("https://technex.co.in/plc");
                break;
            case 17:
                webview.loadUrl("https://technex.co.in/appdev");
                break;

        }
        }
}
