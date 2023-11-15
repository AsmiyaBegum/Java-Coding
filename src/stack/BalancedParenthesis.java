package stack;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class BalancedParenthesis {

    // We know that balanced parenthesis always start with open braces and ends with closed braces. If not, print  "Not a balanced Parenthesis"

    // Push into stack when open braces came. pop out stack (compare the matching open braces is at the top of stack) when close braces came.

    // It should be till the length and finally check any element present in the stack. if element is present, it is non balanced parenthesis.


    public static void main(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        boolean balancedParenthesis = false;
        if (input!=null){
            balancedParenthesis = isBalancedParenthesis(input);
        }
        if(balancedParenthesis){
            System.out.println("Balanced Parenthesis");
        }else{
            System.out.println("Not a Balanced Parenthesis");
        }
    }

    private static boolean isBalancedParenthesis(String input){
        Deque<Character> st = new ArrayDeque<Character>();

        for(int i=0; i< input.length(); i++){
            char c = input.charAt(i);

            if(c == '(' ||  c == '{' || c == '['){
                st.push(c);
                continue;
            }

            if (st.isEmpty())
                return false;

            char top;
            switch(c) {
                case ')' :
                    top = st.pop();
                    if(top != '(')
                        return false;
                    break;


                case '}' :
                    top = st.pop();
                    if(top != '{')
                        return false;
                    break;


                case ']' :
                    top = st.pop();
                    if(top != '[')
                        return false;
                    break;

                default:
                    break;
            }
        }

        return st.isEmpty();
    }

}
