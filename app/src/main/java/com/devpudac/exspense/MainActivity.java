package com.devpudac.exspense;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private WebView mywebView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mywebView=(WebView) findViewById(R.id.webview);
        mywebView.setWebViewClient(new WebViewClient());
        mywebView.getSettings().setAllowFileAccess( true );
        mywebView.getSettings().setJavaScriptEnabled( true );
        mywebView.loadUrl("file:///android_asset/index.html");

    }


    @Override
    public void onBackPressed() {
        if (mywebView.canGoBack()) mywebView.goBack();
        else {
            super.onBackPressed();
        }
    }
}