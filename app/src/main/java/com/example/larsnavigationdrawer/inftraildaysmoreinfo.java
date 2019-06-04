package com.example.larsnavigationdrawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class inftraildaysmoreinfo extends AppCompatActivity {

    TextView inftraildaysmoreinfo_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inftraildaysmoreinfo);

        inftraildaysmoreinfo_text = (TextView) findViewById(R.id.comtraildaysmoreinfo);
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
        inftraildaysmoreinfo_text.setText(Trailday);
    }
    }

