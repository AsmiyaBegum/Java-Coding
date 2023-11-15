package bit_manipulation;

public class CountSetBit {

    public static void countSetBitInInteger(){
        int num = 37;
        int count = 0;
         while(num > 0){
             count += num & 1 ;
             num = num>>1;
         }

         System.out.println(count);
    }
}
