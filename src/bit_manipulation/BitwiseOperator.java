package bit_manipulation;

public class BitwiseOperator {

    public static void BitwiseOperation(){
        int a = 12,b=25;

        // Bitwise or

        System.out.println(a | b);

        //Bitwise and

        System.out.println(a&b);

        //Bitwise xor

        System.out.println(a^b);

        // Bitwise not

        System.out.println(~a);

        // Left shift

        System.out.println(a<<2);

        //Right shift

        System.out.println(a>>2);
    }
}
