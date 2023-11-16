package bit_manipulation;

public class CheckIntegerOverFlow {

    public static void checkIntegerOverFlow(){
        int a = -2147483640, b = -2147483640;
        int result = a+b;
        boolean overflow = false;
        if(a > 0 && b > 0 && result < 0){
            overflow = true;
        }else if( a < 0 && b < 0 && result > 0){
            overflow = true;
        }else{
            overflow = false;
        }
        if(overflow){
            System.out.println("Overflow Error");
        }else{
            System.out.println("No Overflow");
        }
    }
}
