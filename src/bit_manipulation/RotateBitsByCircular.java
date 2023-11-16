package bit_manipulation;

public class RotateBitsByCircular {


    private static int INT_BITS = 32;
    public static void leftRotateBitsByNumber(){
        int n = 16, k = 2;
        int leftShift = n<<k;
        int rightShift = n>> (INT_BITS-k);
        int rotatedBitResult = leftShift | rightShift;
        System.out.println("Left Rotated by number : " + rotatedBitResult);
    }

    public static void rightRotateBitsByNumber(){
        int n = 16, k = 2;
        int rightShift = n>>k;
        int leftShift = n<<(INT_BITS-k);
        int rotatedBitResult =  rightShift | leftShift;
        System.out.println("Right Roated by number : " + rotatedBitResult);
    }
}
