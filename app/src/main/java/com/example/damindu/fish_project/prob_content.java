package com.example.damindu.fish_project;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.webkit.WebView;
import android.widget.TextView;

public class prob_content extends AppCompatActivity {

    TextView textView;
    TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prob_content);
        textView = (TextView) findViewById(R.id.prohibited_cont);
        name = (TextView) findViewById(R.id.pro_name);
        String nameText = getString(R.string.pro_1_name);

        String content = getString(R.string.pro_1);
        // set Text in TextView using fromHtml() method with version check
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            textView.setText(Html.fromHtml(content, Html.FROM_HTML_MODE_LEGACY));
            name.setText(Html.fromHtml(nameText, Html.FROM_HTML_MODE_LEGACY));
        } else {
            textView.setText(Html.fromHtml(content));
            name.setText(Html.fromHtml(nameText));
        }
    }

}
