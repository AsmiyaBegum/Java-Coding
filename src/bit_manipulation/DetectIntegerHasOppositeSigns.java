package bit_manipulation;

public class DetectIntegerHasOppositeSigns {

    public static void detectTwoIntegerHasOppSigns(){
        int num1 = 10, num2 = -10;
        if((num1^num2) < 0){
            System.out.println("Two integer has opposite sigs");
        }else{
            System.out.println("Two integer not have opposite sigs");

        }
    }
}
