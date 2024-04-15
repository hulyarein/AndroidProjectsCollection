package com.example.androidprojectscollection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PassingIntentsExercise extends AppCompatActivity {

    Button submit = (Button) findViewById(R.id.btnSubmit);
    EditText eFName = (EditText) findViewById(R.id.etxtFName);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fname = eFName.getText().toString();
            }
        });
    }


}