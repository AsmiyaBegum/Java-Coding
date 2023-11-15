package stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseArray {

    public static void reverseArray(){
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        String[] strings = new String[length];
        for (int i = 0; i<length; i++){
            strings[i] = scanner.next();
        }
        Stack<String> st = new Stack<>();
        for (int i=0;i<length;i++){
            st.push(strings[i]);
        }

        for (int i=0; i<length; i++){
            strings[i] = st.pop();
        }


        for (int i=0; i<length; i++){
            System.out.print(strings[i] + " ");
        }


    }
}
