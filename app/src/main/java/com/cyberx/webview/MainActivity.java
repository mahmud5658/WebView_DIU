package com.cyberx.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webViewId);

        webView.loadUrl("https://daffodilvarsity.edu.bd/");

        WebSettings webSettings = webView.getSettings();

        webView.setWebViewClient(new WebViewClient());

        webSettings.setJavaScriptEnabled(true);
    }

    public void onBackPressed(){
        if(webView.canGoBack()){
            webView.goBack();
        }
    }
}