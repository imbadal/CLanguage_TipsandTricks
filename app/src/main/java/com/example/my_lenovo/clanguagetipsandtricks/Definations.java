package com.example.my_lenovo.clanguagetipsandtricks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.webkit.WebView;
import android.widget.TextView;

public class Definations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_definations);
//        WebView webView = new WebView(this);

//        setContentView(webView);
        String str = getString(R.string.html);
        Spanned spn = Html.fromHtml(str);
        TextView textView = findViewById(R.id.definations);
        textView.setText(spn);
//        webView.loadData(str,"text/html",null);
//        webView.loadDataWithBaseURL(null, str,"text/html","utf-8",null);

    }
}
