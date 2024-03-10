package com.example.androidprojectscollection;

import java.util.ArrayList;
import java.util.Stack;

public class Calculator {
    Stack <String> stack;
    ArrayList <String> postfix = new ArrayList<>();

    public Calculator(ArrayList<String> str) {
        stack = new Stack<>();


        for (int i = 0; i < str.size(); i++){
            if (str.get(i).equals("*") || str.get(i).equals("/") || str.get(i).equals("-") || str.get(i).equals("+")) {
                while (!stack.isEmpty() && isPrecedence(stack.peek(),str.get(i))){
                    postfix.add(stack.pop());
                }
                stack.push(str.get(i));
            } else {
                postfix.add(str.get(i));
            }
        }

        while (!stack.isEmpty()) {
            postfix.add(stack.pop());
        }
    }

    public String calEvaluate (){
        Double result = 0.0;
        Double num1;
        Double num2;
        for (int i = 0; i < postfix.size(); i++){

            switch (postfix.get(i)){
                case "+":
                    num2 = Double.parseDouble(stack.pop());
                    num1 = Double.parseDouble(stack.pop());
                    stack.push(String.valueOf(num1 + num2));
                    break;
                case "-":
                    num2 = Double.parseDouble(stack.pop());
                    num1 = Double.parseDouble(stack.pop());
                    stack.push(String.valueOf(num1 - num2));
                    break;
                case "*":
                    num2 = Double.parseDouble(stack.pop());
                    num1 = Double.parseDouble(stack.pop());
                    stack.push(String.valueOf(num1 * num2));
                    break;
                case "/":
                    num2 = Double.parseDouble(stack.pop());
                    num1 = Double.parseDouble(stack.pop());
                    stack.push(String.valueOf(num1 / num2));
                    break;
                default:
                    stack.push(postfix.get(i));
            }
        }
        return stack.pop();
    }

    public boolean isPrecedence (String eval1, String eval2){
        if (eval1.equals(eval2) || eval1.equals("/") && eval2.equals("*")  || eval1.equals("*") && eval2.equals("/") ||
                eval1.equals("+") && eval2.equals("-")  || eval1.equals("-") && eval2.equals("+") ||
        eval1.equals("/") && eval2.equals("+") || eval1.equals("/") && eval2.equals("*") ||
                eval1.equals("*") && eval2.equals("+") || eval1.equals("*") && eval2.equals("-")){
            return true;
        }
        return false;
    }

}
