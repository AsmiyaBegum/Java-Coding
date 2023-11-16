package bit_manipulation;

public class SwapTwoNumbers {

    public static void swapTwoNumWithoutTempVariable(){
        int a = 10; int b = 5;
        a = a + b;
        b = a - b;
        a = a -b;
        System.out.println("A and B are " + a + " , " + b) ;
    }
}
