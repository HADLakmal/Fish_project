package com.example.damindu.fish_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class Restricted_button extends AppCompatActivity implements View.OnClickListener {

    private final static int REQUEST_CODE_1 = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restricted_button);

//        final LinearLayout restricted = findViewById(R.id.p_1);
//        restricted.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(Prohibited_button.this, Restri_content.class));
//            }
//        });

        LinearLayout one = (LinearLayout) findViewById(R.id.r_1);
        one.setOnClickListener(this); // calling onClick() method
        LinearLayout two = (LinearLayout) findViewById(R.id.r_2);
        two.setOnClickListener(this);
        LinearLayout three = (LinearLayout) findViewById(R.id.r_3);
        three.setOnClickListener(this);
        LinearLayout four = (LinearLayout) findViewById(R.id.r_4);
        four.setOnClickListener(this); // calling onClick() method
        LinearLayout five = (LinearLayout) findViewById(R.id.r_5);
        five.setOnClickListener(this);
        LinearLayout six = (LinearLayout) findViewById(R.id.r_6);
        six.setOnClickListener(this);
        LinearLayout seven = (LinearLayout) findViewById(R.id.r_7);
        seven.setOnClickListener(this); // calling onClick() method
        LinearLayout eight = (LinearLayout) findViewById(R.id.r_8);
        eight.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.r_1:
                Intent intent = new Intent(Restricted_button.this, Restri_content.class);
                intent.putExtra("key", "1");
                startActivityForResult(intent, REQUEST_CODE_1);

                break;

            case R.id.r_2:
                Intent intent_1 = new Intent(Restricted_button.this, Restri_content.class);
                intent_1.putExtra("key", "2");
                startActivityForResult(intent_1, REQUEST_CODE_1);
                break;

            case R.id.r_3:
                Intent intent_2 = new Intent(Restricted_button.this, Restri_content.class);
                intent_2.putExtra("key", "3");
                startActivityForResult(intent_2, REQUEST_CODE_1);
                break;

            case R.id.r_4:
                Intent intent_4 = new Intent(Restricted_button.this, Restri_content.class);
                intent_4.putExtra("key", "4");
                startActivityForResult(intent_4, REQUEST_CODE_1);

                break;

            case R.id.r_5:
                Intent intent_5 = new Intent(Restricted_button.this, Restri_content.class);
                intent_5.putExtra("key", "5");
                startActivityForResult(intent_5, REQUEST_CODE_1);
                break;

            case R.id.r_6:
                Intent intent_6 = new Intent(Restricted_button.this, Restri_content.class);
                intent_6.putExtra("key", "6");
                startActivityForResult(intent_6, REQUEST_CODE_1);
                break;

            case R.id.r_7:
                Intent intent_7 = new Intent(Restricted_button.this, Restri_content.class);
                intent_7.putExtra("key", "7");
                startActivityForResult(intent_7, REQUEST_CODE_1);

                break;

            case R.id.r_8:
                Intent intent_8 = new Intent(Restricted_button.this, Restri_content.class);
                intent_8.putExtra("key", "8");
                startActivityForResult(intent_8, REQUEST_CODE_1);
                break;


            default:
                break;
        }
    }
}
