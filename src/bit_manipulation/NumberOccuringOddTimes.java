package bit_manipulation;


// only one odd item in the list
public class NumberOccuringOddTimes {


    public static void numberOccuringOddTimes(){
        int arr[] = new int[]{2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
        int n = arr.length;
        int i = 0 ;
        int res = 0;
        while (i<n){
            res ^= arr[i];
            i++;
        }
        System.out.println(res);
    }


}
