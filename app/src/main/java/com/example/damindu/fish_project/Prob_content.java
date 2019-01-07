package com.example.damindu.fish_project;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

import com.mikhaellopez.circularimageview.CircularImageView;

public class Prob_content extends AppCompatActivity {

    TextView textView;
    TextView name;
    CircularImageView imageView;
    ImageView femaleImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prob_content);

        //content id tag
        textView = (TextView) findViewById(R.id.prohibited_cont);
        name = (TextView) findViewById(R.id.pro_name);
        imageView = (CircularImageView) findViewById(R.id.circularImageViewFish);
        femaleImage = (ImageView) findViewById(R.id.image_prob);

        //key value extract
        Intent intent = getIntent();
        String key = intent.getStringExtra("key");

        String nameText = "";
        String content = "";
        switch (key) {

            case "1":
                 nameText = getString(R.string.pro_1_name);
                content = getString(R.string.pro_1);
                imageView.setImageResource(R.drawable.pro_1);
                femaleImage.setImageResource(R.drawable.pro_1_1);
                break;

            case "2":
                imageView.setImageResource(R.drawable.pro_2);
                nameText = getString(R.string.pro_2_name);
                content = getString(R.string.pro_2);
                break;

            case "3":
                imageView.setImageResource(R.drawable.pro_3);
                nameText = getString(R.string.pro_3_name);
                content = getString(R.string.pro_3);
                break;

            case "4":
                imageView.setImageResource(R.drawable.pro_4);
                nameText = getString(R.string.pro_4_name);
                content = getString(R.string.pro_4);
                break;

            case "5":
                imageView.setImageResource(R.drawable.pro_5);
                nameText = getString(R.string.pro_5_name);
                content = getString(R.string.pro_5);
                break;

            case "6":
                imageView.setImageResource(R.drawable.pro_6);
                nameText = getString(R.string.pro_6_name);
                content = getString(R.string.pro_6);
                break;

            case "7":
                imageView.setImageResource(R.drawable.pro_7);
                nameText = getString(R.string.pro_7_name);
                content = getString(R.string.pro_7);
                break;

            case "8":
                imageView.setImageResource(R.drawable.pro_8);
                nameText = getString(R.string.pro_8_name);
                content = getString(R.string.pro_8);
                break;

            case "9":
                imageView.setImageResource(R.drawable.pro_9);
                nameText = getString(R.string.pro_9_name);
                content = getString(R.string.pro_9);
                break;
            case "10":
                imageView.setImageResource(R.drawable.pro_10);
                nameText = getString(R.string.pro_10_name);
                content = getString(R.string.pro_10);
                break;

            case "11":
                imageView.setImageResource(R.drawable.pro_11);
                nameText = getString(R.string.pro_11_name);
                content = getString(R.string.pro_11);
                break;

            case "12":
                imageView.setImageResource(R.drawable.pro_12);
                nameText = getString(R.string.pro_12_name);
                content = getString(R.string.pro_12);
                femaleImage.setImageResource(R.drawable.pro_12_1);
                break;
            case "13":
                imageView.setImageResource(R.drawable.pro_13);
                nameText = getString(R.string.pro_13_name);
                content = getString(R.string.pro_13);
                break;

            default:
                break;
        }

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
