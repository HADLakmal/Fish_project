package com.example.damindu.fish_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class Conflicted_button extends AppCompatActivity implements View.OnClickListener {

    private final static int REQUEST_CODE_1 = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conflicted_button);

//        final LinearLayout restricted = findViewById(R.id.p_1);
//        restricted.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(Prohibited_button.this, Restri_content.class));
//            }
//        });


        LinearLayout one = (LinearLayout) findViewById(R.id.c_1);
        one.setOnClickListener(this); // calling onClick() method
        LinearLayout two = (LinearLayout) findViewById(R.id.c_2);
        two.setOnClickListener(this);
        LinearLayout three = (LinearLayout) findViewById(R.id.c_3);
        three.setOnClickListener(this);
        LinearLayout four = (LinearLayout) findViewById(R.id.c_4);
        four.setOnClickListener(this); // calling onClick() method
        LinearLayout five = (LinearLayout) findViewById(R.id.c_5);
        five.setOnClickListener(this);
        LinearLayout six = (LinearLayout) findViewById(R.id.c_6);
        six.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.c_1:
                Intent intent = new Intent(Conflicted_button.this, Conf_content.class);
                intent.putExtra("key", "1");
                startActivityForResult(intent, REQUEST_CODE_1);
                break;

            case R.id.c_2:
                Intent intent_1 = new Intent(Conflicted_button.this, Conf_content.class);
                intent_1.putExtra("key", "2");
                startActivityForResult(intent_1, REQUEST_CODE_1);
                break;

            case R.id.c_3:
                Intent intent_2 = new Intent(Conflicted_button.this, Conf_content.class);
                intent_2.putExtra("key", "3");
                startActivityForResult(intent_2, REQUEST_CODE_1);
                break;

            case R.id.c_4:
                Intent intent_4 = new Intent(Conflicted_button.this, Conf_content.class);
                intent_4.putExtra("key", "4");
                startActivityForResult(intent_4, REQUEST_CODE_1);

                break;

            case R.id.c_5:
                Intent intent_5 = new Intent(Conflicted_button.this, Conf_content.class);
                intent_5.putExtra("key", "5");
                startActivityForResult(intent_5, REQUEST_CODE_1);
                break;

            case R.id.c_6:
                Intent intent_6 = new Intent(Conflicted_button.this, Conf_content.class);
                intent_6.putExtra("key", "6");
                startActivityForResult(intent_6, REQUEST_CODE_1);
                break;

            default:
                break;
        }
    }
}
