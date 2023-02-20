package com.example.tiktaktoe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9;
    Button reset;
    String s1,s2,s3,s4,s5,s6,s7,s8,s9;


    int count=0;
    int flag=0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        button6=findViewById(R.id.button6);
        button7=findViewById(R.id.button7);
        button8=findViewById(R.id.button8);
        button9=findViewById(R.id.button9);
        reset=findViewById(R.id.Reset);

    }


    public  void click(View view) {
        reset.setOnClickListener(view1 -> newGame());
        Button current_btn = (Button) view;

        final MediaPlayer mp= MediaPlayer.create(this, R.raw.tap);
        mp.start();
        if (current_btn.getText().toString().equals("")) {

            if (flag == 0) {
                current_btn.setText("X");
                flag = 1;
                count++;

            } else {
                current_btn.setText("O");
                flag = 0;
                count++;


            }

            if (count >4) {
                s1 = button1.getText().toString();
                s2 = button2.getText().toString();
                s3 = button3.getText().toString();
                s4 = button4.getText().toString();
                s5 = button5.getText().toString();
                s6 = button6.getText().toString();
                s7 = button7.getText().toString();
                s8 = button8.getText().toString();
                s9 = button9.getText().toString();

                if (s1.equals(s2) && s2.equals(s3) && !s1.equals("")) {
                    Toast.makeText(this, Html.fromHtml("<big><b>Winner is </b>"+s1), Toast.LENGTH_LONG).show();
                    newGame();
                } else if (s4.equals(s5) && s5.equals(s6) && !s4.equals("")) {
                    Toast.makeText(this, Html.fromHtml("<big><b>Winner is </b>"+s4), Toast.LENGTH_LONG).show();
                    newGame();
                } else if (s7.equals(s8) && s8.equals(s9) && !s7.equals("")) {
                    Toast.makeText(this, Html.fromHtml("<big><b>Winner is </b>"+s7), Toast.LENGTH_LONG).show();
                    newGame();
                } else if (s1.equals(s4) && s4.equals(s7) && !s1.equals("")) {
                    Toast.makeText(this, Html.fromHtml("<big><b>Winner is </b>"+s1), Toast.LENGTH_LONG).show();
                    newGame();
                } else if (s2.equals(s5) && s5.equals(s8) && !s2.equals("")) {
                    Toast.makeText(this, Html.fromHtml("<big><b>Winner is </b>"+s2), Toast.LENGTH_LONG).show();
                    newGame();
                } else if (s3.equals(s6) && s6.equals(s9) && !s3.equals("")) {
                    Toast.makeText(this, Html.fromHtml("<big><b>Winner is </b>"+s3), Toast.LENGTH_LONG).show();
                    newGame();
                } else if (s1.equals(s5) && s5.equals(s9) && !s1.equals("")) {
                    Toast.makeText(this, Html.fromHtml("<big><b>Winner is </b>"+s1), Toast.LENGTH_LONG).show();
                    newGame();
                } else if (s3.equals(s5) && s5.equals(s7) && !s3.equals("")) {
                    Toast.makeText(this, Html.fromHtml("<big><b>Winner is </b>"+s3), Toast.LENGTH_LONG).show();
                    newGame();
                }
                else if(count==9) {
                    Toast.makeText(this, Html.fromHtml("<big><b>Match Drawn </b>"), Toast.LENGTH_LONG).show();
                    newGame();
                }


            }
        }
    }


    public  void newGame()
    {
        final MediaPlayer m=MediaPlayer.create(this,R.raw.over);
        m.start();
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        count=0;
        flag=1;

    }

}