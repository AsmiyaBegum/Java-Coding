package bit_manipulation;

public class RussianPeasant {

    public static void multiplyTwoNumber(){
        int a = 9, b = 8;
        int ans = 0;
        while(b>0){
            // if it is odd
            if((b&1)!=0){
                ans += a;
            }
            a = a<<1;
            b = b>>1;
        }
        System.out.println(ans);
    }
}
