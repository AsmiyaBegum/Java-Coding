package bit_manipulation;

public class ModuloDivision {

    public static void moduloDivisionByPowerOf2(){
        int a = 10, b = 4;
        int res;
        res = a & (b-1);
        System.out.println(res);
    }
}
