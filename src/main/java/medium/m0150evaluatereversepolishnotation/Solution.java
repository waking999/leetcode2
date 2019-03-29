package medium.m0150evaluatereversepolishnotation;

import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        int tLen=tokens.length;
        Stack<Integer> s=new Stack<>();

        for (String token : tokens) {
            if (!isOperator(token)) {
                s.push(Integer.parseInt(token));
            } else {
                int b = s.pop();
                int a = s.pop();
                s.push(operate(token, a, b));
            }
        }
        return s.pop();
    }


    private boolean isOperator(String op){
        return "+".equals(op)||"-".equals(op)||"*".equals(op)||"/".equals(op);
    }

    private int operate(String op,int a,int b){
        switch(op){
            case "+":{
                return a+b;
            }
            case "-":{
                return a-b;
            }
            case "*":{
                return a*b;
            }
            case "/":{
                return a/b;
            }
        }
        return 0;
    }
}
