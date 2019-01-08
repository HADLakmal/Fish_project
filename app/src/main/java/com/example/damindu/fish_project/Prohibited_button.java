package com.example.damindu.fish_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Prohibited_button extends AppCompatActivity implements View.OnClickListener {

    private final static int REQUEST_CODE_1 = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prohibited_button);

//        final LinearLayout restricted = findViewById(R.id.p_1);
//        restricted.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(Prohibited_button.this, Prob_content.class));
//            }
//        });

        LinearLayout one = (LinearLayout) findViewById(R.id.p_1);
        one.setOnClickListener(this); // calling onClick() method
        LinearLayout two = (LinearLayout) findViewById(R.id.p_2);
        two.setOnClickListener(this);
        LinearLayout three = (LinearLayout) findViewById(R.id.p_3);
        three.setOnClickListener(this);
        LinearLayout four = (LinearLayout) findViewById(R.id.p_4);
        four.setOnClickListener(this); // calling onClick() method
        LinearLayout five = (LinearLayout) findViewById(R.id.p_5);
        five.setOnClickListener(this);
        LinearLayout six = (LinearLayout) findViewById(R.id.p_6);
        six.setOnClickListener(this);
        LinearLayout seven = (LinearLayout) findViewById(R.id.p_7);
        seven.setOnClickListener(this); // calling onClick() method
        LinearLayout eight = (LinearLayout) findViewById(R.id.p_8);
        eight.setOnClickListener(this);
        LinearLayout nine = (LinearLayout) findViewById(R.id.p_9);
        nine.setOnClickListener(this);
        LinearLayout ten = (LinearLayout) findViewById(R.id.p_10);
        ten.setOnClickListener(this); // calling onClick() method
        LinearLayout eleven = (LinearLayout) findViewById(R.id.p_11);
        eleven.setOnClickListener(this);
        LinearLayout twelve = (LinearLayout) findViewById(R.id.p_12);
        twelve.setOnClickListener(this);
        LinearLayout thirteen = (LinearLayout) findViewById(R.id.p_13);
        thirteen.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.p_1:
                Intent intent = new Intent(Prohibited_button.this, Prob_content.class);
                intent.putExtra("key", "1");
                startActivityForResult(intent, REQUEST_CODE_1);

                break;

            case R.id.p_2:
                Intent intent_1 = new Intent(Prohibited_button.this, Prob_content.class);
                intent_1.putExtra("key", "2");
                startActivityForResult(intent_1, REQUEST_CODE_1);
                break;

            case R.id.p_3:
                Intent intent_2 = new Intent(Prohibited_button.this, Prob_content.class);
                intent_2.putExtra("key", "3");
                startActivityForResult(intent_2, REQUEST_CODE_1);
                break;

            case R.id.p_4:
                Intent intent_4 = new Intent(Prohibited_button.this, Prob_content.class);
                intent_4.putExtra("key", "4");
                startActivityForResult(intent_4, REQUEST_CODE_1);

                break;

            case R.id.p_5:
                Intent intent_5 = new Intent(Prohibited_button.this, Prob_content.class);
                intent_5.putExtra("key", "5");
                startActivityForResult(intent_5, REQUEST_CODE_1);
                break;

            case R.id.p_6:
                Intent intent_6 = new Intent(Prohibited_button.this, Prob_content.class);
                intent_6.putExtra("key", "6");
                startActivityForResult(intent_6, REQUEST_CODE_1);
                break;

            case R.id.p_7:
                Intent intent_7 = new Intent(Prohibited_button.this, Prob_content.class);
                intent_7.putExtra("key", "7");
                startActivityForResult(intent_7, REQUEST_CODE_1);

                break;

            case R.id.p_8:
                Intent intent_8 = new Intent(Prohibited_button.this, Prob_content.class);
                intent_8.putExtra("key", "8");
                startActivityForResult(intent_8, REQUEST_CODE_1);
                break;

            case R.id.p_9:
                Intent intent_9 = new Intent(Prohibited_button.this, Prob_content.class);
                intent_9.putExtra("key", "9");
                startActivityForResult(intent_9, REQUEST_CODE_1);
                break;

            case R.id.p_10:
                Intent intent_10 = new Intent(Prohibited_button.this, Prob_content.class);
                intent_10.putExtra("key", "10");
                startActivityForResult(intent_10, REQUEST_CODE_1);

                break;

            case R.id.p_11:
                Intent intent_11 = new Intent(Prohibited_button.this, Prob_content.class);
                intent_11.putExtra("key", "11");
                startActivityForResult(intent_11, REQUEST_CODE_1);
                break;

            case R.id.p_12:
                Intent intent_12 = new Intent(Prohibited_button.this, Prob_content.class);
                intent_12.putExtra("key", "12");
                startActivityForResult(intent_12, REQUEST_CODE_1);
                break;

            case R.id.p_13:
                Intent intent_13 = new Intent(Prohibited_button.this, Prob_content.class);
                intent_13.putExtra("key", "13");
                startActivityForResult(intent_13, REQUEST_CODE_1);
                break;

            default:
                break;
        }
    }
}
