package bit_manipulation;

public class AddTwoBitStrings {

    public static void addTwoBitStrings(){
        String a = "1010",b = "0010";
        int result = Integer.parseInt(a,2) + Integer.parseInt(b,2);
        String outputString = Integer.toBinaryString(result);
        System.out.println(outputString);
    }

    public static void addTwoBitStrings1(){
        String a = "1010", b = "0010";
        int alength = a.length();
        int blength = b.length();
        int i = 0;
        int carry = 0;
        String ans = "";

        while (i < alength || i<blength || carry!=0){
            int x = 0;
            if(i<alength && a.charAt(alength-i-1) == '1'){
                x = 1;
            }

            int y = 0;
            if(i<blength && b.charAt(alength-i-1) == '1'){
                y = 1;
            }

            ans = (x+y+carry)%2 + ans;
            carry = (x+y+carry)/2;
            i++;
        }

        System.out.println(ans);
    }
}
