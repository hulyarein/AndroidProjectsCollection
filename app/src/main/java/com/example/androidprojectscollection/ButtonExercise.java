package com.example.androidprojectscollection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class ButtonExercise extends AppCompatActivity {
    Button btn, btn1, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_exercise);

        btn = (Button) findViewById(R.id.btnReturnExercise);
        btn.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(ButtonExercise.this, MainActivity.class);
                startActivity(intent3);
            }
        });

        btn1 = (Button) findViewById(R.id.btnToast);

        btn1.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Hello WOrldddddd!!" , Toast.LENGTH_LONG ).show();
            }
        });


        btn2 = (Button) findViewById(R.id.btnDisappear);
        btn2.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2.setVisibility(View.INVISIBLE);
            }
        });



       Button button = (Button) findViewById(R.id.btnButtonColor);
        button.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    button.setBackgroundColor(Color.RED);
                    return true;
                } else if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    button.setBackgroundColor(Color.BLUE);
                }
                return false;
            }

        });

        ConstraintLayout cl;
        cl = findViewById(R.id.btnReturn);
        Button btnBG = (Button) findViewById(R.id.btnBGColor);
        btnBG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cl.setBackgroundResource(R.color.cool);
            }
        });

    }

}