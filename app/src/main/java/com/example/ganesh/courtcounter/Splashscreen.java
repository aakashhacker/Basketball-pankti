package com.example.ganesh.courtcounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ganesh on 7/30/2017.
 */

public class Splashscreen extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final TextView tv = (TextView) findViewById(R.id.tvname);
        setContentView(R.layout.splashscreen);


        final Thread th = new Thread(){
            @Override
            public void run() {
                try{

                    sleep(3*1000);
                    Intent i=new Intent(Splashscreen.this,MainActivity.class);
                    startActivity(i);
                    finish();
                }catch (Exception e){}
            }
        };
        th.start();

    }


}
