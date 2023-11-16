package bit_manipulation;

public class XORWithoutXOROperator {

    public static void xorOperation(){
        int a = 3, b = 5;
        int xorResult = (a|b) & (~a|~b);
        System.out.println(xorResult);
    }
}
