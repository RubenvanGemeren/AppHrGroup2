package com.example.larsnavigationdrawer;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class HomepageActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private Button buttonopendays;
    private Button buttonopendays2;
    private Button buttonopendays3;
    private Button buttonopendays4;
    private Button buttonopendays5;
    private Button buttonOpendaysv1;
    private Button buttonOpendaysv2;
    private Button buttonOpendaysv3;
    private Button buttonOpendaysv4;
    private Button buttonOpendaysv5;
    private Button contactpage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Typeface Latolight = Typeface.createFromAsset(getAssets(), "Lato-Light.ttf");
        Typeface LatoSemiboldItalic = Typeface.createFromAsset(getAssets(), "Lato-SemiboldItalic.ttf");

        setContentView(R.layout.activity_homepage);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        buttonopendays = (Button) findViewById(R.id.buttonopendays);
        buttonopendays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOpendag1();
            }
        });
        buttonOpendaysv1 = (Button) findViewById(R.id.buttonOpendaysv1);
        buttonOpendaysv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Opendag1();
            }
        });
        buttonopendays2 = (Button) findViewById(R.id.buttonopendays2);
        buttonopendays2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOpendag2();
            }
        });
        buttonOpendaysv2 = (Button) findViewById(R.id.buttonOpendaysv2);
        buttonOpendaysv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Opendag2();
            }
        });
        buttonopendays3 = (Button) findViewById(R.id.buttonopendays3);
        buttonopendays3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOpendag3();
            }
        });
        buttonOpendaysv3 = (Button) findViewById(R.id.buttonOpendaysv3);
        buttonOpendaysv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Opendag3();
            }
        });
        buttonopendays4 = (Button) findViewById(R.id.buttonopendays4);
        buttonopendays4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOpendag4();
            }
        });
        buttonOpendaysv4 = (Button) findViewById(R.id.buttonOpendaysv4);
        buttonOpendaysv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Opendag4();
            }
        });
        buttonopendays5 = (Button) findViewById(R.id.buttonopendays5);
        buttonopendays5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOpendag5();
            }
        });
        buttonOpendaysv5 = (Button) findViewById(R.id.buttonOpendaysv5);
        buttonOpendaysv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Opendag5();
            }
        });
        contactpage = (Button) findViewById(R.id.contactpage);
        contactpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencontactpage();
            }
        });
        buttonopendays.setTypeface(Latolight);
        buttonOpendaysv1.setTypeface(LatoSemiboldItalic);
        buttonopendays2.setTypeface(Latolight);
        buttonOpendaysv2.setTypeface(LatoSemiboldItalic);
        buttonopendays3.setTypeface(Latolight);
        buttonOpendaysv3.setTypeface(LatoSemiboldItalic);
        buttonopendays4.setTypeface(Latolight);
        buttonOpendaysv4.setTypeface(LatoSemiboldItalic);
        buttonopendays5.setTypeface(Latolight);
        buttonOpendaysv5.setTypeface(LatoSemiboldItalic);
        contactpage.setTypeface(LatoSemiboldItalic);
    }

    public void openOpendag1(){
        Intent intent = new Intent(this, opendag1.class);
        startActivity(intent);
    }
    public void Opendag1(){
        Intent intent = new Intent(this, opendag1.class);
        startActivity(intent);
    }
    public void openOpendag2(){
        Intent intent = new Intent(this, opendag2.class);
        startActivity(intent);
    }
    public void Opendag2(){
        Intent intent = new Intent(this, opendag2.class);
        startActivity(intent);
    }
    public void openOpendag3(){
        Intent intent = new Intent(this, opendag3.class);
        startActivity(intent);
    }
    public void Opendag3(){
        Intent intent = new Intent(this, opendag3.class);
        startActivity(intent);
    }
    public void openOpendag4(){
        Intent intent = new Intent(this, opendag4.class);
        startActivity(intent);
    }
    public void Opendag4(){
        Intent intent = new Intent(this, opendag4.class);
        startActivity(intent);
    }
    public void openOpendag5(){
        Intent intent = new Intent(this, opendag5.class);
        startActivity(intent);
    }
    public void Opendag5(){
        Intent intent = new Intent(this, opendag5.class);
        startActivity(intent);
    }
    public void opencontactpage(){
        Intent intent = new Intent(this, contactpage.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.homepage, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.nav_mainmenu) {
            Intent intent = new Intent(this, HomepageActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_Studie1) {
            Intent intent = new Intent(this, opendag1.class);
            startActivity(intent);
        } else if (id == R.id.nav_Studie2) {
            Intent intent = new Intent(this, opendag2.class);
            startActivity(intent);
        } else if (id == R.id.nav_Studie3) {
            Intent intent = new Intent(this, opendag3.class);
            startActivity(intent);
        } else if (id == R.id.nav_Studie4) {
            Intent intent = new Intent(this, opendag4.class);
            startActivity(intent);
        } else if (id == R.id.nav_Studie5) {
            Intent intent = new Intent(this, opendag5.class);
            startActivity(intent);
        } else if (id == R.id.nav_contactpage) {
            Intent intent = new Intent(this, contactpage.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
