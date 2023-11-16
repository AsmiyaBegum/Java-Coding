package bit_manipulation;

public class ShiftOperation {

    public static void leftShiftOperation(){
        int a =  10;
        int k = 2;

       String binaryRep = Integer.toBinaryString(a);
       String binary = String.format("%32s",binaryRep).replace(" ","0");
       System.out.println("Binary Representation " + binary);

       String leftShiftBinaryRep = Integer.toBinaryString(a<<k);
       String leftShiftBinary = String.format("%32s",leftShiftBinaryRep).replace(" ","0");
       String leftShiftBinary16 = String.format("%16s",leftShiftBinaryRep).replace(" ","0");
       System.out.println("Left Shift Binary Result " + leftShiftBinary);
       System.out.println("Left Shift Binary Result (16B) " + leftShiftBinary16);
    }

    public static void rightShiftOperation(){
        int a =  10;
        int k = 2;

        String binaryRep = Integer.toBinaryString(a);
        String binary = String.format("%32s",binaryRep).replace(" ","0");
        System.out.println("Binary Representation " + binary);

        String leftShiftBinaryRep = Integer.toBinaryString(a>>k);
        String leftShiftBinary = String.format("%32s",leftShiftBinaryRep).replace(" ","0");
        String leftShiftBinary16 = String.format("%16s",leftShiftBinaryRep).replace(" ","0");
        System.out.println("Right Shift Binary Result " + leftShiftBinary);
        System.out.println("Right Shift Binary Result (16B) " + leftShiftBinary16);
        System.out.println("Unsigned right shift result : " + (a>>>k));

    }
}
