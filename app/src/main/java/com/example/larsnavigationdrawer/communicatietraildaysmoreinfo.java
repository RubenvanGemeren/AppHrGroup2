package com.example.larsnavigationdrawer;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class communicatietraildaysmoreinfo extends AppCompatActivity {

    TextView comtraildaysmoreinfo_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communicatietraildaysmoreinfo);
        comtraildaysmoreinfo_text = (TextView) findViewById(R.id.comtraildaysmoreinfo);
        String Trailday = "";
        try{
            InputStream is = getAssets().open("TraildaysTemp.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            Trailday = new String(buffer);
        } catch (IOException ex){
            ex.printStackTrace();
        }
        comtraildaysmoreinfo_text.setText(Trailday);
    }
    public void Browser1(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hogeschoolrotterdam.nl/opleidingen/bachelor/communicatie/voltijd/"));
        startActivity(browserIntent);
    }
    }

