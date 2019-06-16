package com.example.larsnavigationdrawer;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class cmdtraildaysmoreinfo extends AppCompatActivity {

    TextView cmdtraildaysmoreinfo_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmdtraildaysmoreinfo);
        cmdtraildaysmoreinfo_text = (TextView) findViewById(R.id.comtraildaysmoreinfo);
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
        cmdtraildaysmoreinfo_text.setText(Trailday);
    }
    }

