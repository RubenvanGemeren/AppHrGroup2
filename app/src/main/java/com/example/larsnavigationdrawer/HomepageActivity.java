package com.example.larsnavigationdrawer;

import android.content.Intent;
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

public class HomepageActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private Button buttonopendays;
    private Button buttonopendays2;
    private Button buttonopendays3;
    private Button buttonopendays4;
    private Button buttonopendays5;
    private Button contactpage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


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
        buttonopendays2 = (Button) findViewById(R.id.buttonopendays2);
        buttonopendays2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOpendag2();
            }
        });
        buttonopendays3 = (Button) findViewById(R.id.buttonopendays3);
        buttonopendays3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOpendag3();
            }
        });
        buttonopendays4 = (Button) findViewById(R.id.buttonopendays4);
        buttonopendays4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOpendag4();
            }
        });
        buttonopendays5 = (Button) findViewById(R.id.buttonopendays5);
        buttonopendays5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOpendag5();
            }
        });
        contactpage = (Button) findViewById(R.id.contactpage);
        contactpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencontactpage();
            }
        });
    }
    public void openOpendag1(){
        Intent intent = new Intent(this, opendag1.class);
        startActivity(intent);
    }
    public void openOpendag2(){
        Intent intent = new Intent(this, opendag2.class);
        startActivity(intent);
    }
    public void openOpendag3(){
        Intent intent = new Intent(this, opendag3.class);
        startActivity(intent);
    }
    public void openOpendag4(){
        Intent intent = new Intent(this, opendag4.class);
        startActivity(intent);
    }
    public void openOpendag5(){
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
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.homepage, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
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
