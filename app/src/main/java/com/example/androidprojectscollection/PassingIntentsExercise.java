package com.example.androidprojectscollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class PassingIntentsExercise extends AppCompatActivity {

    Button submit;
    EditText eFName;
    EditText eLName;
    EditText eBDate;
    EditText eNum;
    EditText eMail;
    RadioButton rMale;
    RadioButton rFem;
    RadioButton rOth;
    EditText ePresent, ePermanent, eCourse, eYearLevel, eEmergency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise);


        submit = (Button) findViewById(R.id.btnSubmit);
        eFName = (EditText) findViewById(R.id.etxtFName);
        eLName = (EditText) findViewById(R.id.etxtLName);
        eBDate = (EditText) findViewById(R.id.etxtBdate);
        eNum = (EditText) findViewById(R.id.etxtPhoneNumber);
        eMail = (EditText) findViewById(R.id.etxtEmailAdd);
        eMail = (EditText) findViewById(R.id.etxtEmailAdd);
        rMale = (RadioButton) findViewById(R.id.radMale);
        rFem = (RadioButton) findViewById(R.id.radFemale);
        rOth = (RadioButton) findViewById(R.id.radOthers);
        ePresent = (EditText) findViewById(R.id.etxtPresentAdd);
        ePermanent = (EditText) findViewById(R.id.etxtPermanentAdd);
        eCourse = (EditText) findViewById(R.id.etxtCourse);
        eYearLevel = (EditText) findViewById(R.id.etxtYearLevel);
        eEmergency = (EditText) findViewById(R.id.etxtEmergency);



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fname = eFName.getText().toString();
                String lname = eLName.getText().toString();

                String gender;
                if(rMale.isChecked())
                    gender = "Male";
                else if (rFem.isChecked())
                    gender = "Female";
                else if (rOth.isChecked())
                    gender = "Others";
                else
                    gender = "Unknown";


                String bDate = eBDate.getText().toString();
                String pNumber = eNum.getText().toString();
                String emailAdd = eMail.getText().toString();

                String PresAdd = ePresent.getText().toString();
                String PermanentAdd = ePermanent.getText().toString();
                String Course = eCourse.getText().toString();
                String Year = eYearLevel.getText().toString();
                String Emergency = eEmergency.getText().toString();

                Intent intent = new Intent(PassingIntentsExercise.this, PassingIntentsExercise2.class);
                intent.putExtra("fname_key",fname); intent.putExtra("lname_key",lname);
                intent.putExtra("gender_key", gender); intent.putExtra("bdate_key", bDate);
                intent.putExtra("pnum_key",pNumber); intent.putExtra("eadd_key", emailAdd);

                intent.putExtra("presadd_key",PresAdd); intent.putExtra("permanent_key", PermanentAdd);
                intent.putExtra("course_key",Course); intent.putExtra("year_key", Year);
                intent.putExtra("emergency_key",Emergency);

                startActivity(intent);

            }
        });
    }


}