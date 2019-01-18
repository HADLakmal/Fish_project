package com.example.damindu.fish_project;


import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.mikhaellopez.circularimageview.CircularImageView;

public class Conf_content extends AppCompatActivity {

    TextView textView;
    TextView textView_1;
    TextView name;
    CircularImageView imageView;
    ImageView femaleImage;
    ImageView global;
    ImageView popup;
    ImageView closed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_con_content);

        //content id tag
        textView = (TextView) findViewById(R.id.restircted_cont);
        textView_1 = (TextView) findViewById(R.id.restricted_cont_1);
        name = (TextView) findViewById(R.id.res_name);
        imageView = (CircularImageView) findViewById(R.id.circularImage);
        femaleImage = (ImageView) findViewById(R.id.image_res);
        global = (ImageView) findViewById(R.id.global);
        closed = (ImageView) findViewById(R.id.imageView_close);
        popup = (ImageView) findViewById(R.id.popup_image);

        //visibility gone
        visibiltyGone();

        //on click handel
        femaleImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.popup).setVisibility(View.VISIBLE);
            }
        });

        closed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.popup).setVisibility(View.GONE);
            }
        });

        //key value extract
        Intent intent = getIntent();
        String key = intent.getStringExtra("key");

        String nameText = "";
        String content = "";
        String content_1 = "";
        switch (key) {

            case "1":
                 nameText = getString(R.string.con_1_name);
                content = getString(R.string.con_1);
                content_1 = getString(R.string.con_1_1);
                imageView.setImageResource(R.mipmap.c_1);
                popup.setImageResource(R.mipmap.c_1);
                global.setImageResource(R.mipmap.global_c1);
                femaleImage.setImageResource(R.mipmap.c_1);
                break;

            case "2":
                imageView.setImageResource(R.mipmap.c_2);
                popup.setImageResource(R.mipmap.c_2);
                femaleImage.setImageResource(R.mipmap.c_2);
                global.setImageResource(R.mipmap.global_c2);
                nameText = getString(R.string.con_2_name);
                content = getString(R.string.con_2);
                content_1 = getString(R.string.con_2_1);
                break;

            case "3":
                imageView.setImageResource(R.mipmap.c_3);
                popup.setImageResource(R.mipmap.c_3);
                femaleImage.setImageResource(R.mipmap.c_3);
                global.setImageResource(R.mipmap.global_c3);
                nameText = getString(R.string.con_3_name);
                content = getString(R.string.con_3);
                content_1 = getString(R.string.con_3_1);
                break;

            case "4":
                imageView.setImageResource(R.mipmap.c_4);
                popup.setImageResource(R.mipmap.c_4);
                global.setImageResource(R.mipmap.global_c4);
                nameText = getString(R.string.con_4_name);
                content = getString(R.string.con_4);
                content_1 = getString(R.string.con_4_1);
                break;

            case "5":
                imageView.setImageResource(R.mipmap.c_5);
                femaleImage.setImageResource(R.mipmap.c_5);
                popup.setImageResource(R.mipmap.c_5);
                global.setImageResource(R.mipmap.global_c5);
                nameText = getString(R.string.con_5_name);
                content = getString(R.string.con_5);
                content_1 = getString(R.string.con_5_1);
                break;

            case "6":
                imageView.setImageResource(R.mipmap.c_6);
                femaleImage.setImageResource(R.mipmap.c_6);
                popup.setImageResource(R.mipmap.c_6);
                femaleImage.setImageResource(R.mipmap.c_6);
                global.setImageResource(R.mipmap.global_c6);
                nameText = getString(R.string.con_6_name);
                content = getString(R.string.con_6);
                content_1 = getString(R.string.con_6_1);
                break;
                

            default:
                break;
        }

        // set Text in TextView using fromHtml() method with version check
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            textView.setText(Html.fromHtml(content, Html.FROM_HTML_MODE_LEGACY));
            textView_1.setText(Html.fromHtml(content_1, Html.FROM_HTML_MODE_LEGACY));
            name.setText(Html.fromHtml(nameText, Html.FROM_HTML_MODE_LEGACY));
        } else {
            textView.setText(Html.fromHtml(content));
            textView_1.setText(Html.fromHtml(content_1));
            name.setText(Html.fromHtml(nameText));
        }
    }

    protected void visibiltyGone(){
        findViewById(R.id.popup).setVisibility(View.GONE);
    }


}
