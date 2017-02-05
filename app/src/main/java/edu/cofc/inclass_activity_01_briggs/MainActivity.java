package edu.cofc.inclass_activity_01_briggs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.icu.util.Calendar;
import android.widget.TextView;
import android.widget.TimePicker;


public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final DatePicker date = (DatePicker) findViewById(R.id.DatePicker01);
        Calendar cal = Calendar.getInstance();
        date.init(2017, 7, 17,
                new DatePicker.OnDateChangedListener(){
                public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    final TimePicker time = (TimePicker) findViewById(R.id.timePicker01);
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(year, monthOfYear, dayOfMonth, time.getHour() , time.getMinute());
                    TextView text = (TextView) findViewById(R.id.text);
                    text.setText(calendar.getTime().toString());

                }
        });
    }



}
