package bit_manipulation;

public class RightMostSetBitPosition {

    public static void rightMostSetBitPos(){
        int num = 10;

        int pos = 0;


        if((num & 1) == 0){
            // if num is odd, return 1;
            pos = 1;
        }else{
            while(num!=0){
                num = num ^ (num & num-1);
                pos++;
            }
        }
        System.out.println(pos);
    }
}
