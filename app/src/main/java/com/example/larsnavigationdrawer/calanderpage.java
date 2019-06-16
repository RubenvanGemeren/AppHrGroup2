package com.example.larsnavigationdrawer;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.github.sundeepk.compactcalendarview.CompactCalendarView;
import com.github.sundeepk.compactcalendarview.domain.Event;

import java.text.SimpleDateFormat;
import java.util.BitSet;
import java.util.Date;
import java.util.Locale;


public class calanderpage extends AppCompatActivity {

        CompactCalendarView compactCalendar;
        private SimpleDateFormat dateFormatMonth = new SimpleDateFormat ("MMMM- yyyy", Locale.getDefault());
         public long epochtimecom;
         public long epochtimeCMD;
         public long epochtimeCMGT;
         public long epochtimeINF;
         public long epochtimeTINF;
         public Button calanderCombtn;
         public Button calanderCMDbtn;
         public Button calanderCMGTbtn;
         public Button calanderINFbtn;
         public Button calanderTINFbtn;
         public String Opendays = "List of Open days:";
         public int communicatie = 1;
         public int CMD = 1;
         public int CMGT = 1;
         public int INF = 1;
         public int TINF = 1;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.content_calanderpage);

            final ActionBar actionbar = getSupportActionBar();
            actionbar.setDisplayHomeAsUpEnabled(false);
            actionbar.setTitle(null);
            compactCalendar = (CompactCalendarView) findViewById(R.id.compactcalendar_view);
            compactCalendar.setUseThreeLetterAbbreviation(true);

            calanderCombtn = (Button) findViewById(R.id.calanderCombtn);
            calanderCMDbtn = (Button) findViewById(R.id.calanderCMDbtn);
            calanderCMGTbtn = (Button) findViewById(R.id.calanderCMGTbtn);
            calanderINFbtn = (Button) findViewById(R.id.calanderINFbtn);
            calanderTINFbtn = (Button) findViewById(R.id.calanderTINFbtn);

            calanderCombtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context context = getApplicationContext();
                    epochtimecom = 1572696000000L;
                    Toast.makeText(context, "Open day Communicatie added!",Toast.LENGTH_SHORT).show();
                    if (CMD == 1) {
                        Opendays = Opendays + " Communicatie ";
                        CMD = 2;
                    }
                }
            });

            calanderCMDbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context context = getApplicationContext();
                    epochtimeCMD = 1572696000000L;
                    Toast.makeText(context, "Open day Communication and Multimedia Design added!",Toast.LENGTH_SHORT).show();
                    if (CMGT == 1) {
                        Opendays = Opendays + " CMD ";
                        CMGT = 2;
                    }
                }
            });

            calanderCMGTbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context context = getApplicationContext();
                    epochtimeCMGT = 1572696000000L;
                    Toast.makeText(context, "Open day Creative Media and Game Technologies added!",Toast.LENGTH_SHORT).show();
                        if (INF == 1) {
                            Opendays = Opendays + " CMGT ";
                            INF = 2;
                        }
                }
            });

            calanderINFbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context context = getApplicationContext();
                    epochtimeINF = 1572696000000L;
                    Toast.makeText(context, "Open day Informatica added!",Toast.LENGTH_SHORT).show();
                    if (TINF == 1) {
                            Opendays = Opendays + " Informatica ";
                            TINF = 2;
                    }

                }
            });

            calanderTINFbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context context = getApplicationContext();
                    epochtimeTINF = 1572696000000L;
                    Toast.makeText(context, "Open day Technische Informatica added!",Toast.LENGTH_SHORT).show();
                    if (communicatie == 1) {
                            Opendays = Opendays + " Technische Informatica ";
                            communicatie = 2;
                    }

                }
            });






            Event ev1 = new Event(Color.RED, epochtimecom, "Open day!");
            compactCalendar.addEvent(ev1);

            compactCalendar.setListener(new CompactCalendarView.CompactCalendarViewListener() {
                @Override
                public void onDayClick(Date dateClicked) {
                    Context context = getApplicationContext();

                    //Toast.makeText(context, dateClicked.toString(), Toast.LENGTH_SHORT).show();
                    if (dateClicked.toString().compareTo("Sat Nov 02 00:00:00 GMT+01:00 2019") == 0 && Opendays.length() != 0) {
                        Toast.makeText(context, Opendays, Toast.LENGTH_SHORT).show();

                    } else
                        Toast.makeText(context, "niks gepland die dag", Toast.LENGTH_SHORT).show();


                }

                @Override
                public void onMonthScroll(Date firstDayOfNewMonth) {
                    actionbar.setTitle(dateFormatMonth.format(firstDayOfNewMonth));
                }
            });




        }
    }

