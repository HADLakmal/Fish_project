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
        setContentView(R.layout.activity_restricted_button);

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

            default:
                break;
        }
    }
}
