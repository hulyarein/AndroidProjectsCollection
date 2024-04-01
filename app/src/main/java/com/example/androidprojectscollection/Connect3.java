package com.example.androidprojectscollection;


import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Connect3 extends AppCompatActivity {
    char state = '1';
    Button b1,b2,b3,b4,b5;
    Button b1one, b1two, b1three, b1four;
    static int one = 5, two = 5, three = 5, four = 5, five = 5;
    TextView turn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect3);

        b1 = (Button) findViewById(R.id.btn1);
        b2 = (Button) findViewById(R.id.btn2);
        b3 = (Button) findViewById(R.id.btn3);
        b4 = (Button) findViewById(R.id.btn4);
        b5 = (Button) findViewById(R.id.btn5);

        b1one = (Button) findViewById(R.id.btn1one);
        b1two = (Button) findViewById(R.id.btn1two);
        b1three= (Button) findViewById(R.id.btn1three);
        b1four = (Button) findViewById(R.id.btn1four);

        turn = (TextView) findViewById(R.id.tVturn);
        turn.setText("Player 1's Turn");


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1four.setBackgroundColor(Color.BLACK);
                switch (one){
                    case '5':
                        if (state == '1'){
                            b1four.setBackgroundColor(Color.BLACK);
                        } else {
                            b1four.setBackgroundColor(Color.RED);
                        }

                }
            }
        });



    }

    public void changeState(){
        if (state == '1') {
            state = '2';
        } else {
            state = '1';
        }
        turn.setText("Player " + state + "'s turn");
    }


}