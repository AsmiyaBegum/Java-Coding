package bit_manipulation;

public class OnlySetBitPosition {

    public static void onlySetBitPosition(){
        int a = 128;
        int pos = 0;
        if(a>0 && (a & a-1) != 0){
            pos = -1;
        }else{
            while(a>0){
                pos++;
                a = a>>1;
            }
        }


        System.out.println("The position of a is : " + pos);
    }
}
