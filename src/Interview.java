import java.util.Scanner;

// Find whether a string is palindrome or not.
public class Interview {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        String input =  scanner.next();
        if(isPalindrome(input)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }

    }

    static boolean isPalindrome(String str){

        int i = 0, j = str.length()-1;
        boolean palindrome = true;

        while(i<=j){
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
                continue;
            }
            palindrome = false;
            break;
            
        }
        return palindrome;
    }
}
