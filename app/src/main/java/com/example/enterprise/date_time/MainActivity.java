package com.example.enterprise.date_time;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    String currentDateTimeString;
    TextView quantityTextView;
    TextView textviewdate;
    TextView getdatetime;
    TextView textView2;
    TextView txtNewBetTimer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        TextView textviewdate = (TextView) findViewById(R.id.textView_date);
        TextView getdatetime = (TextView)  findViewById(R.id.getdatetime);
        TextView textView2 = (TextView)  findViewById(R.id.textView2);
        TextView txtNewBetTimer = (TextView)  findViewById(R.id.txtNewBetTimer);

        String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
        String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());


        quantityTextView.setText("" + currentDateTimeString);
        textviewdate.setText("" + date);
        Toast.makeText(getApplicationContext(), currentDateTimeString, Toast.LENGTH_LONG).show();
        getdatetime.setText(getDateTime());
        textView2.setText(getDateTime1());






    }



    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date(); return dateFormat.format(date);
    }


    private String getDateTime1() {
        SimpleDateFormat timeStampFormat = new SimpleDateFormat("yyyy MM dd HH mm ss SS");
        Date myDate = new Date();
        String filename = timeStampFormat.format(myDate);
        return filename;
    }



}
