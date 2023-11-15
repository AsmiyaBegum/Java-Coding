package stack;

import java.util.Scanner;
import java.util.Stack;

public class PostfixToPrefix {

    // if operand, push it to stack
    // if operator, pop last two operand from stack and concatenate the operator + operand 2 + operand 1. And push the concatenate
    // strings to stack.
    // Finally print the stack
    public static void postfixToPrefix(){
        Scanner scanner = new Scanner(System.in);
        String postFixExpr = scanner.next();
        Stack<String> st = new Stack<>();
        for(int i=0;i<postFixExpr.length();i++){
            char curr = postFixExpr.charAt(i);
            if(isOperator(curr)){
                String operand1 = st.pop();
                String  operand2 = st.pop();
                String expression = curr + operand2 + operand1;
                st.push(expression);
            }else{
                st.push(String.valueOf(curr));
            }
        }
        String ans = "";
        for(String s : st){
            ans+= s;
        }
        System.out.println(ans);
    }

    static boolean isOperator(char ch){
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' ;
    }
}
