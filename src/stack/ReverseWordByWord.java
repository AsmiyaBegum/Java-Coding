package stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseWordByWord {

    public static void reverseWordByWord(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Stack<Character> st = new Stack<>();

        String ans = "";
        for(int i = 0; i<input.length();i++){
            if(i==input.length()-1){
                st.push(input.charAt(i));
                while(!st.empty()){
                    ans+=st.pop();
                }
            }
            if(input.charAt(i) == ' ' ){
                while(!st.empty()){
                  ans+=st.pop();
                }
                ans+= input.charAt(i);
            }else{
                st.push(input.charAt(i));
            }
        }

        System.out.println(ans);
    }
}
