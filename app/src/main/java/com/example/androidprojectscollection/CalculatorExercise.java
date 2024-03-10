package com.example.androidprojectscollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CalculatorExercise extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    Button btnDiv, btnAdd, btnMul, btnMinus;
    Button btnDot, btnEquals, btnClear;

    TextView txtEquation, txtAnswer;

    private ArrayList <String> equation = new ArrayList<String>();

    public String evaluate () {
        Double res = Double.parseDouble(equation.get(0));;
        for (int i = 1; i < equation.size()-1; i++){
            if (equation.get(i).equals("+") || equation.get(i).equals("-") || equation.get(i).equals("/") || equation.get(i).equals("*")) {
                double num1 = Double.parseDouble(equation.get(i+1));

                switch (equation.get(i)) {
                    case "+":
                        res += num1;
                        break;
                    case "-":
                        res -= num1;
                        break;
                    case "*":
                        res *= num1;
                        break;
                    case "/":
                        res /= num1;
                        break;
                }
            }
        }
        return res.toString();
    }
    String temp = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);


        txtEquation = (TextView) findViewById(R.id.txtEquation);
        txtAnswer = (TextView) findViewById(R.id.txtAnswer);

        btnClear = (Button) findViewById(R.id.btnClear);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = "";
                equation.clear();
                txtEquation.setText(temp);
                txtAnswer.setText(temp);
            }
        });

        btn1 = (Button) findViewById(R.id.btnOne);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp += btn1.getText().toString();

                txtEquation.setText(String.join(" ", equation));
                txtAnswer.setText(temp);


            }
        });

        btn2 = (Button) findViewById(R.id.btnTwo);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp += btn2.getText().toString();

                txtEquation.setText(String.join(" ", equation));
                txtAnswer.setText(temp);
            }
        });

        btn3 = (Button) findViewById(R.id.btnThree);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp += btn3.getText().toString();

                txtEquation.setText(String.join(" ", equation));
                txtAnswer.setText(temp);

            }
        });

        btn4 = (Button) findViewById(R.id.btnFour);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp += btn4.getText().toString();

                txtEquation.setText(String.join(" ", equation));
                txtAnswer.setText(temp);

            }
        });

        btn5 = (Button) findViewById(R.id.btnFive);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp += btn5.getText().toString();

                txtEquation.setText(String.join(" ", equation));
                txtAnswer.setText(temp);

            }
        });

        btn6 = (Button) findViewById(R.id.btnSix);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp += btn6.getText().toString();

                txtEquation.setText(String.join(" ", equation));
                txtAnswer.setText(temp);

            }
        });

        btn7 = (Button) findViewById(R.id.btnSeven);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp += btn7.getText().toString();

                txtEquation.setText(String.join(" ", equation));
                txtAnswer.setText(temp);

            }
        });

        btn8 = (Button) findViewById(R.id.btnEight);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp += btn8.getText().toString();

                txtEquation.setText(String.join(" ", equation));
                txtAnswer.setText(temp);
            }
        });

        btn9 = (Button) findViewById(R.id.btnNine);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp += btn9.getText().toString();

                txtEquation.setText(String.join(" ", equation));
                txtAnswer.setText(temp);

            }
        });

        btn0 = (Button) findViewById(R.id.btnZero);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp += btn0.getText().toString();

                txtEquation.setText(String.join(" ", equation));
                txtAnswer.setText(temp);

            }
        });

        btnDiv = (Button) findViewById(R.id.btnDivide);
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!temp.equals("")){
                    equation.add(temp);
                }
                temp = "";
                if (equation.get(equation.size()-1).equals("+") || equation.get(equation.size()-1).equals("-") || equation.get(equation.size()-1).equals("*") || equation.get(equation.size()-1).equals("/")) {
                    equation.set(equation.size()-1, "/");
                } else {
                    equation.add("/");
                }

                txtEquation.setText(String.join(" ", equation));
                txtAnswer.setText(evaluate());

            }
        });

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!temp.equals("")){
                    equation.add(temp);
                }
                temp = "";
                if (equation.get(equation.size()-1).equals("+") || equation.get(equation.size()-1).equals("-") || equation.get(equation.size()-1).equals("*") || equation.get(equation.size()-1).equals("/")) {
                    equation.set(equation.size()-1, "+");
                } else {
                    equation.add("+");
                }

                txtEquation.setText(String.join(" ", equation));
                txtAnswer.setText(evaluate());

            }
        });

        btnMinus = (Button) findViewById(R.id.btnSub);
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!temp.equals("")){
                    equation.add(temp);
                }
                temp = "";
                if (equation.get(equation.size()-1).equals("+") || equation.get(equation.size()-1).equals("-") || equation.get(equation.size()-1).equals("*") || equation.get(equation.size()-1).equals("/")) {
                    equation.set(equation.size()-1, "-");
                } else {
                    equation.add("-");
                }

                txtEquation.setText(String.join(" ", equation));
                txtAnswer.setText(evaluate());
            }
        });

        btnMul = (Button) findViewById(R.id.btnMul);
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!temp.equals("")){
                    equation.add(temp);
                }
                temp = "";
                if (equation.get(equation.size()-1).equals("+") || equation.get(equation.size()-1).equals("-") || equation.get(equation.size()-1).equals("*") || equation.get(equation.size()-1).equals("/")) {
                    equation.set(equation.size()-1, "*");
                } else {
                    equation.add("*");
                }

                txtEquation.setText(String.join(" ", equation));
                txtAnswer.setText(evaluate());
            }
        });

        btnDot= (Button) findViewById(R.id.btnDot);
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtEquation.getText().toString().equals("0")) {
                    txtEquation.setText(btnDot.getText().toString());
                } else {
                    txtEquation.append(btnDot.getText().toString());
                }

                txtAnswer.setText(btnDot.getText().toString());

            }
        });


        btnEquals= (Button) findViewById(R.id.btnEqual);
        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                equation.add(temp);
                temp = "";
                Calculator cal = new Calculator(equation);
                temp = cal.calEvaluate();

                txtEquation.setText(temp);
                txtAnswer.setText(temp);


            }
        });

    }


}

