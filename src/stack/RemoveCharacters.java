package stack;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveCharacters {

    public static void removeCharacter(){
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        String output = "";
        int[] array = new int[26];
        for (int i=0;i<26;i++){
            array[i] = 0;
        }
        for(int i=0; i<str2.length();i++){
            array[str2.charAt(i) - 'a'] = -1;
        }

        for (int i=0; i<str1.length();i++){
            if(array[str1.charAt(i)-'a'] != -1){
                output+=str1.charAt(i);
            }
        }

        System.out.println(output);
    }
}
