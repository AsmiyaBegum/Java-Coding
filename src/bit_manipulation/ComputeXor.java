package bit_manipulation;

public class ComputeXor {

    public static void computeXor(){
        int n = 10;
        int xor ;
        if(n%4 == 0){
            xor =  0;
        }else if(n%4 == 1){
            xor = 1;
        }else if(n%4 == 2){
            xor = n+1;
        }else{
            xor = 0;
        }
        System.out.println(xor);
    }
}
