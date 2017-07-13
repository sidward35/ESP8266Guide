package com.sid.esp8266guide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        webView = (WebView)findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://gist.github.com/anonymous/0dfd8d2077247e0f8c5c6ee150cba606");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_home) {
            webView.loadUrl("https://gist.github.com/anonymous/0dfd8d2077247e0f8c5c6ee150cba606");
            return true;
        }else if (id == R.id.action_deauth) {
            webView.loadUrl("https://github.com/spacehuhn/esp8266_deauther/blob/master/README.md");
            return true;
        }else if (id == R.id.action_detect) {
            webView.loadUrl("https://github.com/spacehuhn/DeauthDetector/blob/master/README.md");
            return true;
        }else if (id == R.id.action_troll) {
            webView.loadUrl("https://github.com/idolpx/mobile-rr/blob/master/README.md");
            return true;
        }else return super.onOptionsItemSelected(item);
    }
}
