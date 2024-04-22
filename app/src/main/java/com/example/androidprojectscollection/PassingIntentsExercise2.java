package com.example.androidprojectscollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PassingIntentsExercise2 extends AppCompatActivity {

    TextView tFname, tGender, tPnum, tLname, tBdate, tEmail, tPresent, tPermanent, tCourse, tYear, tEmergency;
    Button btnreturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise2);

        tFname = findViewById(R.id.txtPI2Fname);
        tLname = findViewById(R.id.txtPI2Lname);
        tGender = findViewById(R.id.txtPI2Gender);
        tBdate = findViewById(R.id.txtPI2BDate);
        tPnum = findViewById(R.id.txtPI2Number);
        tEmail = findViewById(R.id.txtPI2Email);
        btnreturn = findViewById(R.id.btnPI2Return);

        tPresent = findViewById(R.id.txtPI2Present);
        tPermanent = findViewById(R.id.txtPI2Permanent);
        tCourse = findViewById(R.id.txtCourse);
        tYear = findViewById(R.id.txtYearLevel);
        tEmergency = findViewById(R.id.txtEmergency);

        Intent intent = getIntent();

        String fname = intent.getStringExtra("fname_key");
        String lname = intent.getStringExtra("lname_key");
        String gender = intent.getStringExtra("gender_key");
        String bdate = intent.getStringExtra("bdate_key");
        String pnum = intent.getStringExtra("pnum_key");
        String email = intent.getStringExtra("eadd_key");

        String presentadd = intent.getStringExtra("presadd_key");
        String permanentadd = intent.getStringExtra("permanent_key");
        String course = intent.getStringExtra("course_key");
        String yearlevel = intent.getStringExtra("year_key");
        String emergency = intent.getStringExtra("emergency_key");


        tFname.setText(fname);
        tLname.setText(lname);
        tGender.setText(gender);
        tBdate.setText(bdate);
        tPnum.setText(pnum);
        tEmail.setText(email);

        tPresent.setText(presentadd);
        tPermanent.setText(permanentadd);
        tCourse.setText(course);
        tYear.setText(yearlevel);
        tEmergency.setText(emergency);

        btnreturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PassingIntentsExercise2.this, PassingIntentsExercise.class);
                startActivity(intent);
            }
        });


    }
}