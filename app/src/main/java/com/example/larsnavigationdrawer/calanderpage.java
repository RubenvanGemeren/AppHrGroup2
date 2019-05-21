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
import java.util.Date;
import java.util.Locale;

public class calanderpage extends AppCompatActivity {

        CompactCalendarView compactCalendar;
        private SimpleDateFormat dateFormatMonth = new SimpleDateFormat ("MMMM- yyyy", Locale.getDefault());

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.content_calanderpage);

            final ActionBar actionbar = getSupportActionBar();
            actionbar.setDisplayHomeAsUpEnabled(false);
            actionbar.setTitle(null);

            compactCalendar = (CompactCalendarView) findViewById(R.id.compactcalendar_view);
            compactCalendar.setUseThreeLetterAbbreviation(true);

            Event ev1 = new Event(Color.RED, 1558310400, "lars is lit");
            compactCalendar.addEvent(ev1);

            compactCalendar.setListener(new CompactCalendarView.CompactCalendarViewListener() {
                @Override
                public void onDayClick(Date dateClicked) {
                    Context context = getApplicationContext();

                    if (dateClicked.toString().compareTo("Mon, 20 May 00:00:00 GMT 2019") == 0) {
                        Toast.makeText(context, "lars is lit", Toast.LENGTH_SHORT).show();
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

