package com.example.damindu.fish_project;


import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.mikhaellopez.circularimageview.CircularImageView;

public class Restri_content extends AppCompatActivity {

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
        setContentView(R.layout.activity_res_content);

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
                 nameText = getString(R.string.res_1_name);
                content = getString(R.string.res_1);
                content_1 = getString(R.string.res_1_1);
                imageView.setImageResource(R.mipmap.r_1);
                popup.setImageResource(R.mipmap.r_1_dis);
                global.setImageResource(R.mipmap.global_r1);
                femaleImage.setImageResource(R.mipmap.r_1);
                findViewById(R.id.table_1).setVisibility(View.VISIBLE);
                break;

            case "2":
                imageView.setImageResource(R.mipmap.r_2);
                popup.setImageResource(R.mipmap.r_2_dis);
                femaleImage.setImageResource(R.mipmap.r_2);
                global.setImageResource(R.mipmap.global_r2);
                nameText = getString(R.string.res_2_name);
                content = getString(R.string.res_2);
                content_1 = getString(R.string.res_2_1);
                break;

            case "3":
                imageView.setImageResource(R.mipmap.r_3);
                popup.setImageResource(R.mipmap.r_3_dis);
                femaleImage.setImageResource(R.mipmap.r_3);
                global.setImageResource(R.mipmap.global_r3);
                nameText = getString(R.string.res_3_name);
                content = getString(R.string.res_3);
                content_1 = getString(R.string.res_3_1);
                break;

            case "4":
                imageView.setImageResource(R.mipmap.r_4);
                femaleImage.setImageResource(R.mipmap.r_4);
                popup.setImageResource(R.mipmap.r_4_dis);
                global.setImageResource(R.mipmap.global_r4);
                nameText = getString(R.string.res_4_name);
                content = getString(R.string.res_4);
                content_1 = getString(R.string.res_4_1);
                findViewById(R.id.table_4).setVisibility(View.VISIBLE);
                break;

            case "5":
                imageView.setImageResource(R.mipmap.r_5);
                femaleImage.setImageResource(R.mipmap.r_5);
                popup.setImageResource(R.mipmap.r_5_dis);
                global.setImageResource(R.mipmap.global_r5);
                nameText = getString(R.string.res_5_name);
                content = getString(R.string.res_5);
                content_1 = getString(R.string.res_5_1);
                findViewById(R.id.table_5).setVisibility(View.VISIBLE);
                break;

            case "6":
                imageView.setImageResource(R.mipmap.r_6);
                femaleImage.setImageResource(R.mipmap.r_6);
                popup.setImageResource(R.mipmap.r_6_dis);
                femaleImage.setImageResource(R.mipmap.r_6);
                global.setImageResource(R.mipmap.global_r6);
                nameText = getString(R.string.res_6_name);
                content = getString(R.string.res_6);
                content_1 = getString(R.string.res_6_1);
                break;

            case "7":
                imageView.setImageResource(R.mipmap.r_7);
                femaleImage.setImageResource(R.mipmap.r_7);
                popup.setImageResource(R.mipmap.r_7_dis);
                global.setImageResource(R.mipmap.global_r7);
                nameText = getString(R.string.res_7_name);
                content = getString(R.string.res_7);
                content_1 = getString(R.string.res_7_1);
                break;

            case "8":
                global.setImageResource(R.mipmap.global_r8);
                nameText = getString(R.string.res_8_name);
                content = getString(R.string.res_8);
                content_1 = getString(R.string.res_8_1);
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
        findViewById(R.id.table_1).setVisibility(View.GONE);
        findViewById(R.id.table_4).setVisibility(View.GONE);
        findViewById(R.id.table_5).setVisibility(View.GONE);
        findViewById(R.id.popup).setVisibility(View.GONE);
    }


}
