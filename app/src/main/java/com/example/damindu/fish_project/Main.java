package com.example.damindu.fish_project;

import android.content.Intent;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.NavigationView;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.viewpagerindicator.CirclePageIndicator;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Main extends AppCompatActivity {

    private static ViewPager mPager;
    private static ViewPager mPager_1;
    private static int currentPage = 0;
    private static int NUM_PAGES = 0;
    private ArrayList<ImageModel> imageModelArrayList;

    //Drawer Layout
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mtoggel;


    private int[] myImageList = new int[]{R.drawable.pro_1, R.drawable.pro_7,
            R.drawable.pro_3, R.drawable.pro_4
            , R.drawable.pro_11, R.drawable.pro_13};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ConstraintLayout prohibited = findViewById(R.id.restircted_cont);
        prohibited.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main.this, Prohibited_button.class));
            }
        });
        final ConstraintLayout restricted = findViewById(R.id.restrictedlayout);
        restricted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main.this, Restricted_button.class));
            }
        });

        //Drawer action handle
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mtoggel = new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);
        mDrawerLayout.addDrawerListener(mtoggel);
        mtoggel.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        final ImageView setting = findViewById(R.id.setting);
//        final LinearLayout menu = findViewById(R.id.menu);
//        setting.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                menu.setVisibility(View.VISIBLE);
//            }
//        });
//
//
//        menu.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                menu.setVisibility(View.GONE);
//            }
//        });

        imageModelArrayList = new ArrayList<>();
        imageModelArrayList = populateList();


        //menu hide
        //menu.setVisibility(View.GONE);

        init();
    }

    private ArrayList<ImageModel> populateList() {

        ArrayList<ImageModel> list = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            ImageModel imageModel = new ImageModel();
            imageModel.setImage_drawable(myImageList[i]);
            list.add(imageModel);
        }

        return list;
    }

    private void init() {

        mPager = (ViewPager) findViewById(R.id.pager);
        mPager_1 = (ViewPager) findViewById(R.id.pager_1);
        mPager.setAdapter(new ImageSliderAdapter(this, imageModelArrayList));
        mPager_1.setAdapter(new ImageSliderAdapter(this, imageModelArrayList));


        CirclePageIndicator indicator = (CirclePageIndicator)
                findViewById(R.id.indicator);

        indicator.setViewPager(mPager);

        final float density = getResources().getDisplayMetrics().density;

//Set circle indicator radius
        indicator.setRadius(5 * density);

        NUM_PAGES = imageModelArrayList.size();

        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == NUM_PAGES) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage++, true);
                mPager_1.setCurrentItem(currentPage++, true);
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 3000, 3000);

        // Pager listener over indicator
        indicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                currentPage = position;

            }

            @Override
            public void onPageScrolled(int pos, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int pos) {

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.navigation_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.d("item",item.getItemId()+"");
        if(mtoggel.onOptionsItemSelected(item)){

        }
       else
        switch (item.getItemId()) {

            case R.id.nav_about: {
                startActivity(new Intent(Main.this, About.class));
                break;
            }
            case R.id.nav_ack: {
                startActivity(new Intent(Main.this, Acknowledge.class));
                break;
            }
            case R.id.nav_con: {
                startActivity(new Intent(Main.this, Conflicted_button.class));
                break;
            }
            case R.id.nav_stat: {
                //do somthing
                break;
            }
            default: {
                return super.onOptionsItemSelected(item);
            }

        }
        return true;
    }


}


