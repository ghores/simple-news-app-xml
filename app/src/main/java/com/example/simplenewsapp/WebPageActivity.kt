package com.example.simplenewsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class WebPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_page)
        val webView = findViewById<WebView>(R.id.webView)
        webView.loadUrl(intent.getStringExtra("url")!!)
    }
}