package bit_manipulation;

public class SetClearToggle {

    public static void setBits(){
        int a = 4,pos = 1;

        // Set bit formula

        a |= (1<<pos);

        System.out.println(a);

    }

    public static void clearBits(){
        int a = 7, pos = 1;

        // Clear bit formula

        a &= ~(1<<pos);

        System.out.println(a);
    }

    public static void toggleBits(){
        int a = 4, pos = 1;

        // Toggle bit formula

        a ^= (1<<pos);

        System.out.println(a);

    }
}
