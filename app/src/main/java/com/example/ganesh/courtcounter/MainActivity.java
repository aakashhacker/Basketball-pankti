package com.example.ganesh.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score_teamA=0;
    int score_teamB=0;
    private TextView scoretv;
    private Button btn3pointA,btn1pointA,btn2pointA,btnreset;
    private Button btn3pointB,btn1pointB,btn2pointB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1pointA = (Button) findViewById(R.id.point1btnA);
        btn2pointA = (Button) findViewById(R.id.point2btnA);
        btn3pointA = (Button) findViewById(R.id.point3btnA);
        btnreset = (Button) findViewById(R.id.reset);
        btn1pointB = (Button) findViewById(R.id.point1btnB);
        btn2pointB = (Button) findViewById(R.id.point2btnB);
        btn3pointB = (Button) findViewById(R.id.point3btnB);
        btn1pointA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score_teamA=score_teamA+1;
                displayTeamA(score_teamA);
            }
        });
        btn1pointB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score_teamB = score_teamB+1;
                displayTeamB(score_teamB);
            }
        });
        btn2pointA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score_teamA=score_teamA+2;
                displayTeamA(score_teamA);
            }
        });
        btn2pointB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score_teamB = score_teamB+2;
                displayTeamB(score_teamB);
            }
        });
        btn3pointA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               score_teamA=score_teamA+3;
                displayTeamA(score_teamA);
            }
        });
        btn3pointB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score_teamB = score_teamB+3;
                displayTeamB(score_teamB);
            }
        });
        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score_teamA=0;
                score_teamB=0;
                displayTeamA(0);
                displayTeamB(0);
            }
        });
    }
    public void displayTeamA(int score){
        scoretv = (TextView) findViewById(R.id.team_a_score);
        scoretv.setText(String.valueOf(score));
    }
    public void displayTeamB(int score){
        scoretv = (TextView) findViewById(R.id.team_b_score);
        scoretv.setText(String.valueOf(score));
    }
}
