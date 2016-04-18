package com.example.oak.test170416;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.CalendarView;
import android.widget.Toast;

import java.util.Calendar;

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
                        day + "/" + (month + 1) + "/" + year,
                        Toast.LENGTH_SHORT).show();

                setMyAlarm(day, month, year);


            }   // onSelected
        });

    } // Main Method

    private void setMyAlarm(int day, int month, int year) {

        String tag = "18April";

        Calendar calendar = Calendar.getInstance();

        int intMinus = calendar.get(Calendar.MINUTE);
        intMinus = intMinus + 2;

        Calendar mySetCalendar1 = (Calendar) calendar.clone();
        mySetCalendar1.set(Calendar.DAY_OF_MONTH, day);
        mySetCalendar1.set(Calendar.MONTH, month);
        mySetCalendar1.set(Calendar.YEAR, year);
        mySetCalendar1.set(Calendar.MINUTE, intMinus);

        Log.d(tag, "mySetCalendar1 ==> " + mySetCalendar1.toString());


    }   // setMyAlarm

}   // Main Class
