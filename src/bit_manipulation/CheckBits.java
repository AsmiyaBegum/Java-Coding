package bit_manipulation;

public class CheckBits {

    public static void checkBitAtNthPosIsSetOrNot(){
        int a = 5, pos = 0;

        int bit = a & (1<<pos);
        if(bit!=0){
            System.out.println("Set");
        }else{
            System.out.println("Not Set");
        }
    }
}
