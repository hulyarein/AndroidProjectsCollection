package com.example.androidprojectscollection;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MenuExercise extends AppCompatActivity {
    Button btnChanger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_exercise);

        btnChanger = (Button) findViewById(R.id.btnTransformingButton);
        Drawable image=(Drawable)getResources().getDrawable(R.drawable.a);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.choice_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.mItemChange){
            Toast.makeText(this, "Edit Object Item is clicked",Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.mItemReset){
            btnChanger.setBackgroundColor(Color.RED);
            btnChanger.setVisibility(View.VISIBLE);
            btnChanger.setWidth(400);
            btnChanger.setHeight(30);
            btnChanger.setText("");
            Toast.makeText(this, "Reset Object Item is clicked",Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.mItemExit){
            finish();
        } else if (item.getItemId() == R.id.mbgColor){
            btnChanger.setBackgroundColor(Color.BLACK);
        } else if (item.getItemId() == R.id.mheight){
            btnChanger.setHeight(500);
        } else if (item.getItemId() == R.id.mwidth) {
            btnChanger.setWidth(700);
        } else if (item.getItemId() == R.id.mtextColor){
            btnChanger.setText("Peekabo");
        } else if (item.getItemId() == R.id.mcorner){
            btnChanger.setVisibility(View.GONE);
        }

        return true;
    }


}