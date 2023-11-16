package bit_manipulation;

public class CheckTwoNumEqualWithoutArithmeticOperator {

    public static void checkTwoNumsEqual(){
        int a = 10, b = 20;
        if((a^b) == 0){
            System.out.println("Two numbers are equal");
        }else{
            System.out.println("Two numbers are not equal");

        }
    }
}
