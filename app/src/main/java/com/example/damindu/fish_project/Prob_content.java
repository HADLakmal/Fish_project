package com.example.damindu.fish_project;

import android.content.Intent;
import android.media.Image;
import android.os.Build;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.mikhaellopez.circularimageview.CircularImageView;

public class Prob_content extends AppCompatActivity {

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
        setContentView(R.layout.activity_prob_content);

        //content id tag
        textView = (TextView) findViewById(R.id.restircted_cont);
        textView_1 = (TextView) findViewById(R.id.prohibited_cont_1);
        name = (TextView) findViewById(R.id.res_name);
        imageView = (CircularImageView) findViewById(R.id.circularImage);
        femaleImage = (ImageView) findViewById(R.id.image_prob);
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
                 nameText = getString(R.string.pro_1_name);
                content = getString(R.string.pro_1);
                content_1 = getString(R.string.pro_1_1);
                imageView.setImageResource(R.drawable.pro_1);
                popup.setImageResource(R.drawable.pro_1);
                global.setImageResource(R.mipmap.global_1);
                femaleImage.setImageResource(R.drawable.pro_1);
                break;

            case "2":
                imageView.setImageResource(R.drawable.pro_2);
                popup.setImageResource(R.drawable.pro_2);
                femaleImage.setImageResource(R.drawable.pro_2);
                global.setImageResource(R.mipmap.global_2);
                nameText = getString(R.string.pro_2_name);
                content = getString(R.string.pro_2);
                content_1 = getString(R.string.pro_2_1);
                findViewById(R.id.table_2).setVisibility(View.VISIBLE);
                break;

            case "3":
                imageView.setImageResource(R.drawable.pro_3);
                popup.setImageResource(R.drawable.pro_3);
                femaleImage.setImageResource(R.drawable.pro_3);
                global.setImageResource(R.mipmap.global_3);
                nameText = getString(R.string.pro_3_name);
                content = getString(R.string.pro_3);
                content_1 = getString(R.string.pro_3_1);
                findViewById(R.id.table_3).setVisibility(View.VISIBLE);
                break;

            case "4":
                imageView.setImageResource(R.drawable.pro_4);
                popup.setImageResource(R.drawable.pro_4);
                femaleImage.setImageResource(R.drawable.pro_4);
                global.setImageResource(R.mipmap.global_4);
                nameText = getString(R.string.pro_4_name);
                content = getString(R.string.pro_4);
                content_1 = getString(R.string.pro_4_1);
                findViewById(R.id.table_4).setVisibility(View.VISIBLE);
                break;

            case "5":
                imageView.setImageResource(R.drawable.pro_5);
                popup.setImageResource(R.drawable.pro_5);
                femaleImage.setImageResource(R.drawable.pro_5);
                global.setImageResource(R.mipmap.global_5);
                nameText = getString(R.string.pro_5_name);
                content = getString(R.string.pro_5);
                content_1 = getString(R.string.pro_5_1);
                break;

            case "6":
                imageView.setImageResource(R.drawable.pro_6);
                popup.setImageResource(R.drawable.pro_6);
                femaleImage.setImageResource(R.drawable.pro_6);
                global.setImageResource(R.mipmap.global_6);
                nameText = getString(R.string.pro_6_name);
                content = getString(R.string.pro_6);
                content_1 = getString(R.string.pro_6_1);
                findViewById(R.id.table_6).setVisibility(View.VISIBLE);
                break;

            case "7":
                imageView.setImageResource(R.drawable.pro_7);
                popup.setImageResource(R.drawable.pro_7);
                femaleImage.setImageResource(R.drawable.pro_7);
                global.setImageResource(R.mipmap.global_7);
                nameText = getString(R.string.pro_7_name);
                content = getString(R.string.pro_7);
                content_1 = getString(R.string.pro_7_1);
                findViewById(R.id.table_4).setVisibility(View.VISIBLE);
                break;

            case "8":
                imageView.setImageResource(R.drawable.pro_8);
                popup.setImageResource(R.drawable.pro_8);
                femaleImage.setImageResource(R.drawable.pro_8);
                global.setImageResource(R.mipmap.global_8);
                nameText = getString(R.string.pro_8_name);
                content = getString(R.string.pro_8);
                content_1 = getString(R.string.pro_8_1);
                findViewById(R.id.table_8).setVisibility(View.VISIBLE);
                break;

            case "9":
                imageView.setImageResource(R.drawable.pro_9);
                popup.setImageResource(R.drawable.pro_9);
                femaleImage.setImageResource(R.drawable.pro_9);
                global.setImageResource(R.mipmap.global_9);
                nameText = getString(R.string.pro_9_name);
                content = getString(R.string.pro_9);
                content_1 = getString(R.string.pro_9_1);
                break;
            case "10":
                imageView.setImageResource(R.drawable.pro_10);
                popup.setImageResource(R.drawable.pro_10);
                femaleImage.setImageResource(R.drawable.pro_10);
                global.setImageResource(R.mipmap.global_10);
                nameText = getString(R.string.pro_10_name);
                content = getString(R.string.pro_10);
                content_1 = getString(R.string.pro_10_1);
                break;

            case "11":
                imageView.setImageResource(R.drawable.pro_11);
                popup.setImageResource(R.drawable.pro_11);
                femaleImage.setImageResource(R.drawable.pro_11);
                global.setImageResource(R.mipmap.global_11);
                nameText = getString(R.string.pro_11_name);
                content = getString(R.string.pro_11);
                content_1 = getString(R.string.pro_11_1);
                break;

            case "12":
                imageView.setImageResource(R.drawable.pro_12);
                popup.setImageResource(R.drawable.pro_12);
                global.setImageResource(R.mipmap.global_12);
                nameText = getString(R.string.pro_12_name);
                content = getString(R.string.pro_12);
                content_1 = getString(R.string.pro_12_1);
                femaleImage.setImageResource(R.drawable.pro_12);
                break;

            case "13":
                imageView.setImageResource(R.drawable.pro_13);
                popup.setImageResource(R.drawable.pro_13);
                femaleImage.setImageResource(R.drawable.pro_13);
                global.setImageResource(R.mipmap.global_13);
                nameText = getString(R.string.pro_13_name);
                content = getString(R.string.pro_13);
                content_1 = getString(R.string.pro_13_1);
                findViewById(R.id.table_13).setVisibility(View.VISIBLE);
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
            findViewById(R.id.table_2).setVisibility(View.GONE);
            findViewById(R.id.table_3).setVisibility(View.GONE);
            findViewById(R.id.table_4).setVisibility(View.GONE);
            findViewById(R.id.table_6).setVisibility(View.GONE);
            findViewById(R.id.table_7).setVisibility(View.GONE);
            findViewById(R.id.table_8).setVisibility(View.GONE);
            findViewById(R.id.table_13).setVisibility(View.GONE);
            findViewById(R.id.popup).setVisibility(View.GONE);
    }

}
