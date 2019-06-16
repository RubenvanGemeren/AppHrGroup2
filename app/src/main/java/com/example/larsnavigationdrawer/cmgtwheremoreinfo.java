package com.example.larsnavigationdrawer;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class cmgtwheremoreinfo extends AppCompatActivity {

    TextView cmgtwhmoreinfo_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmgtwheremoreinfo);
        cmgtwhmoreinfo_text = (TextView) findViewById(R.id.tempwheremoreinfo);
        String Where = "";
        try{
            InputStream is = getAssets().open("Wheremoreinfo.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            Where = new String(buffer);
        } catch (IOException ex){
            ex.printStackTrace();
        }
        cmgtwhmoreinfo_text.setText(Where);
    }
    public void Browser1(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hogeschoolrotterdam.nl/opleidingen/bachelor/creative-media-and-game-technologies/voltijd/"));
        startActivity(browserIntent);
    }
    }

