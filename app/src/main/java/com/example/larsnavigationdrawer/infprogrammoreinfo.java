package com.example.larsnavigationdrawer;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class infprogrammoreinfo extends AppCompatActivity {

    TextView infprmoreinfo_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infprogrammoreinfo);
        infprmoreinfo_text = (TextView) findViewById(R.id.comprogrammoreinfo);
        String program = "";
        try{
            InputStream is = getAssets().open("TempProgram.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            program = new String(buffer);
        } catch (IOException ex){
            ex.printStackTrace();
        }
        infprmoreinfo_text.setText(program);
    }
    public void Browser1(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hogeschoolrotterdam.nl/opleidingen/bachelor/informatica/voltijd/"));
        startActivity(browserIntent);
    }
    }

