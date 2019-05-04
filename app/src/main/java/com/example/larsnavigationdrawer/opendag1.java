package com.example.larsnavigationdrawer;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.Telephony;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.share.Sharer;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.widget.ShareDialog;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class opendag1 extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    EditText et_name, et_content;
    Button b_save;

    TextView tv_text;
    TextView Wc_text;
    TextView W_text;
    TextView Whr_text;
    TextView WhrC_text;
    TextView P_text;
    TextView PC_text;
    CallbackManager callbackManager;
    ShareDialog shareDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);





        //Init FB
        callbackManager = CallbackManager.Factory.create();
        shareDialog = new ShareDialog(this);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1000);
        }

        et_name = (EditText) findViewById(R.id.et_name);
        et_content = (EditText) findViewById(R.id.et_content);
        b_save = (Button) findViewById(R.id.b_save);

        b_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String filename = et_name.getText().toString();
                String content = et_content.getText().toString();

                if(!filename.equals("")&& !content.equals("")) {
                    saveTextAsFile(filename, content);
                }
            }
        });



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tv_text = (TextView) findViewById(R.id.tv_text);
        String text = "";
        try{
            InputStream is = getAssets().open("filetest.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            text = new String(buffer);
        } catch (IOException ex){
            ex.printStackTrace();
        }
        tv_text.setText(text);

        Wc_text = (TextView) findViewById(R.id.WhereCommunicatie);
        String WhenCommunicatie = "";
        try{
            InputStream is = getAssets().open("WhenCommunicatie.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            WhenCommunicatie = new String(buffer);
        } catch (IOException ex){
            ex.printStackTrace();
        }
        Wc_text.setText(WhenCommunicatie);

        W_text = (TextView) findViewById(R.id.When);
        String When = "";
        try{
            InputStream is = getAssets().open("When.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            When = new String(buffer);
        } catch (IOException ex){
            ex.printStackTrace();
        }
        W_text.setText(When);

        Whr_text = (TextView) findViewById(R.id.Where);
        String Where = "";
        try{
            InputStream is = getAssets().open("Where.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            Where = new String(buffer);
        } catch (IOException ex){
            ex.printStackTrace();
        }
        Whr_text.setText(Where);

        WhrC_text = (TextView) findViewById(R.id.WhereCommunicatie);
        String WhereCommunicatie = "";
        try{
            InputStream is = getAssets().open("WhereCommunicatie.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            WhereCommunicatie = new String(buffer);
        } catch (IOException ex){
            ex.printStackTrace();
        }
        WhrC_text.setText(WhereCommunicatie);

        P_text = (TextView) findViewById(R.id.Program);
        String Program = "";
        try{
            InputStream is = getAssets().open("Program.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            Program = new String(buffer);
        } catch (IOException ex){
            ex.printStackTrace();
        }
        P_text.setText(Program);

        PC_text = (TextView) findViewById(R.id.ProgramCommunicatie);
        String ProgramCommunicatie = "";
        try{
            InputStream is = getAssets().open("ProgramCommunicatie.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            ProgramCommunicatie = new String(buffer);
        } catch (IOException ex){
            ex.printStackTrace();
        }
        PC_text.setText(ProgramCommunicatie);



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



    }
    private void saveTextAsFile(String filename, String content){
        String fileName = filename + ".txt";

        File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath(), fileName);

        try{
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(content.getBytes());
            fos.close();
            Toast.makeText(this, "Saved!", Toast.LENGTH_SHORT).show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            Toast.makeText(this, "File not Found", Toast.LENGTH_SHORT).show();
        } catch (IOException e){
            e.printStackTrace();
            Toast.makeText(this, "Error saving!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode){
            case 1000:
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(this, "Permission granted!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Permission not granted!", Toast.LENGTH_SHORT).show();
                    finish();
                }
        }
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
        getMenuInflater().inflate(R.menu.opendag1, menu);
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
