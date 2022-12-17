package com.example.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    ProgressBar pb;
    int count=0;
    TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pb = findViewById(R.id.pb);
        text1=findViewById(R.id.text1);

        prog();
    }

    private void prog() {



        final Timer t = new Timer();
        TimerTask tt = new TimerTask() {


            @Override
            public void run() {


                count++;

                pb.setProgress(count);



              if(count==100){
                  t.cancel();
              }

            }

        };



        t.schedule(tt,0, 100);

    }


}