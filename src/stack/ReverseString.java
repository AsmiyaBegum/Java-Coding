package stack;

import java.util.*;

public class ReverseString {

    public static void reverseString(){
        Scanner scanner =  new Scanner(System.in);
        char[] input = scanner.next().toCharArray();
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < input.length; i++){
            st.push(input[i]);
        }
        for(int i=0; i<input.length; i++){
            input[i] = st.pop();
        }
        System.out.println(input);
    }
}
