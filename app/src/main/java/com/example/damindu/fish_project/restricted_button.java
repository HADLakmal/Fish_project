package com.example.damindu.fish_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class restricted_button extends AppCompatActivity implements View.OnClickListener {

    private final static int REQUEST_CODE_1 = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restricted_button);

//        final LinearLayout restricted = findViewById(R.id.p_1);
//        restricted.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(restricted_button.this, prob_content.class));
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
                Intent intent = new Intent(restricted_button.this, prob_content.class);
                intent.putExtra("key", "1");
                startActivityForResult(intent, REQUEST_CODE_1);

                break;

            case R.id.p_2:
                startActivity(new Intent(restricted_button.this, prob_content.class));
                break;

            case R.id.p_3:
                startActivity(new Intent(restricted_button.this, prob_content.class));
                break;

            default:
                break;
        }
    }
}
