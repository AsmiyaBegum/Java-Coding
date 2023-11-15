package bit_manipulation;

public class CheckPowerOf2 {

    public static void checkANumIsPowerOf2(){
        int num = 0;
        boolean isPowerOf2 = num!=0 && (num & num-1) == 0;
        if(isPowerOf2){
            System.out.println(num + " is power of 2");
        }else{
            System.out.println(num + " is not power of 2");
        }
    }
}
