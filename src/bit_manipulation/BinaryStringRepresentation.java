package bit_manipulation;

import java.math.BigInteger;

public class BinaryStringRepresentation {

    public static void binaryStringRepresentation1(){
        int a = 10;
        System.out.println(Integer.toBinaryString(a));
    }

    public static void binaryStringRepresentation2(){
        int a = 10;
        System.out.println(new BigInteger(Integer.toString(a,2)).toString());
    }


}
