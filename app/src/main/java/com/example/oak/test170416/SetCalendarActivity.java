package com.example.oak.test170416;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CalendarView;
import android.widget.Toast;

public class SetCalendarActivity extends AppCompatActivity {

    //Explicit
    private CalendarView calendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_calendar);

        //Bind Widget
        calendarView = (CalendarView) findViewById(R.id.calendarView);

        //Get Event from Click Calendar
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView,
                                            int year,
                                            int month,
                                            int day) {

                Toast.makeText(SetCalendarActivity.this,
                        day + "/" + month + "/" + year,
                        Toast.LENGTH_SHORT).show();


            }   // onSelected
        });

    } // Main Method

}   // Main Class
