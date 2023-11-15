import bit_manipulation.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
//        fibonacci();
//        countDigitsInNumber();
//        countFrequencyInNumbers();
//        xpowern();
//        xpowern1();
//        toggleCase();
//        lowerCaseVowelsAndConsonantCount();
//        uniqueCharacters();
//        stringImmutableInJava();
//        reverseArray();
//        firstAndLastOccurenceOfElement();
//        printRowAndColumnOfMatrix();
//        reverseString();
//        reverseWordByWord();
//        smallestAndBiggestPalindrome();
//        swapWithoutTempVariable();
//        separateIndividualCharacterFromString();
//        checkStringAreAnagram();
//        BalancedParenthesis.main();
//        ReverseString.reverseString();
//        PostfixToPrefix.postfixToPrefix();
//        ReverseArray.reverseArray();
//        RemoveCharacters.removeCharacter();
//        ReverseStackUsingQueue.reverseStackUsingQueue();
//        DeleteMidElement.deleteMidElementFromStack();
//        ReverseWordByWord.reverseWordByWord();
//         QueueUsingStacks.queueUsingStack();
//        BitwiseOperator.BitwiseOperation();
//        ShiftOperation.leftShiftOperation();
//        ShiftOperation.rightShiftOperation();
//        SetClearToggle.setBits();
//        SetClearToggle.clearBits();
//        SetClearToggle.toggleBits();
//        CheckBits.checkBitAtNthPosIsSetOrNot();
//        MultiplyByNumber2.multiplyByNum2();
//        DivideNumberBy2.divideNumberBy2();
//        ComputeXor.computeXor();
//        CheckPowerOf2.checkANumIsPowerOf2();
//        CountSetBit.countSetBitInInteger();
        RightMostSetBitPosition.rightMostSetBitPos();
    }



    private static void fibonacci(){
        Scanner scn = new Scanner(System.in);
        Integer n = scn.nextInt();

        Integer s1 = 0;
        Integer s2 = 1;

        System.out.print(s1);
        System.out.print(s2);

        for(int i = 0; i<n-2;i++){
            Integer sum = s1 + s2;
            System.out.print(sum);
            s1 = s2;
            s2 = sum;
        }
    }

    private static void countDigitsInNumber(){
        Scanner scn = new Scanner(System.in);
        Integer n = scn.nextInt();

        Integer sum = 0;

        while(n != 0){
            sum += n%10;
            n = n/10;
        }

        System.out.print(sum);
    }

    private static void countFrequencyInNumbers(){
        Scanner scn = new Scanner(System.in);
        String number = scn.next();
        String digit = scn.next().trim();

        Integer frequency = 0;
        Integer startIndex = 0;

        while(number.indexOf(digit,startIndex) != -1){
            frequency++;
            startIndex = number.indexOf(digit,startIndex) + digit.length();
        }

        System.out.print(frequency);

    }


    private static void xpowern(){
        Scanner scn = new Scanner(System.in);
        Integer x = scn.nextInt();
        Integer n = scn.nextInt();

        System.out.println(xpowern(x,n));
    }

    private static Integer xpowern(Integer x, Integer n){

        if(n == 0){
            return 1;
        }
        Integer value = x * xpowern(x,n-1);

        return value;
    }

    private static void xpowern1(){
        Scanner scn = new Scanner(System.in);
        Integer x = scn.nextInt();
        Integer n = scn.nextInt();

        if(n%2 == 0){
            System.out.println(xpowern(x,n/2) * xpowern(x,n/2));
        }else{
            System.out.println(xpowern(x,n/2) * xpowern(x,n/2) * x);
        }
    }


    private static void toggleCase(){
        Scanner scn = new Scanner(System.in);
        char[] inputArray = scn.next().toCharArray();

        for(int i = 0; i <= inputArray.length-1; i++){
           char ch = inputArray[i];
           if(ch >= 'A' && ch <= 'Z'){
               inputArray[i] = (char) (ch + 32);
           }else if (ch >= 'a' && ch <='z'){
               inputArray[i]  = (char) (ch -32);
           }
        }

        System.out.println(inputArray);
    }

    private static void lowerCaseVowelsAndConsonantCount(){
        Scanner scn = new Scanner(System.in);
        String inputStr = scn.nextLine();

        int vowelCount = 0;
        int consonantCount = 0;

        Character[] vowelArray = {'a','e','i','o','u'};

        for (Integer i = 0; i<inputStr.length(); i++){
            char character = inputStr.charAt(i);
            boolean isVowel = Arrays.stream(vowelArray).anyMatch(Predicate.isEqual(character));
            if(isVowel){
                vowelCount ++;
            }else if(character>='a' && character<='z' && !isVowel){
                consonantCount++;
            }
        }

        System.out.println("Vowel count" + vowelCount);
        System.out.println("Consonant count" + consonantCount);

    }

    private static void uniqueCharacters(){

        Scanner scn = new Scanner(System.in);
        String inputString = scn.nextLine();

        StringBuilder output = new StringBuilder();

        for(Integer i=0 ; i<inputString.length(); i++){
            char ch = inputString.charAt(i);
            if(output.indexOf(String.valueOf(ch))==-1){
                output.append(ch);
            }
        }


        System.out.println(new String(output));
    }

    private static void stringImmutableInJava(){
        String str = "Asmiya";
        str += "Praveen";

        System.out.println(str);
    }

    private static void reverseArray(){
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();

        Integer[] inputArray = new Integer[n];

        for(Integer i = 0; i < n; i++){
             Integer x  = scanner.nextInt();
            inputArray[i] = x;
        }

        for (Integer i = 0; i< n/2 ; i++){
            swap(inputArray,i,n-i-1);
        }

        System.out.println(Arrays.stream(inputArray).toList());
    }

    private static void swap(Integer[] arr, Integer i , Integer j){
        Integer temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void firstAndLastOccurenceOfElement() {
        Scanner scn = new Scanner(System.in);
        Integer n = scn.nextInt();

        Integer elementToFind = scn.nextInt();

        Integer[] inputArray = new Integer[n];

        for(Integer i = 0; i<n; i++){
            inputArray[i] = scn.nextInt();
        }

        Integer firstOccurence = -1;
        Integer lastOccurence = -1;

        for (Integer i = 0; i < n/2; i++){

            if(firstOccurence == -1 && inputArray[i] == elementToFind){
                firstOccurence =i;
            }
            if(lastOccurence == -1 && inputArray[n-i-1] == elementToFind){
                lastOccurence = n-i-1;
            }
        }

        if(firstOccurence == -1 && lastOccurence != -1){
            firstOccurence = lastOccurence;
        }else if(firstOccurence != -1 && lastOccurence == -1){
            lastOccurence = firstOccurence;
        }

        if(firstOccurence == -1 && lastOccurence == -1){
            System.out.println("The element doesn't exist in the array");
        }else{
            System.out.println("First occurence" + firstOccurence);
            System.out.println("Last occurence" + lastOccurence);
        }

    }

    private static void printRowAndColumnOfMatrix(){
        Scanner scanner = new Scanner(System.in);
        Integer rows = scanner.nextInt();
        Integer cols = scanner.nextInt();
        Integer[][] array = new Integer[rows][cols];

        for(Integer i= 0; i < rows; i++){
            for(Integer j = 0; j< cols; j++){
                array[i][j] = scanner.nextInt();
            }
        }

        // Printing Row

        for (Integer i=0; i<rows; i++){
            StringBuilder row = new StringBuilder();

            System.out.print("Row "+ i + ":");

            for (Integer j=0; j<cols; j++){

                System.out.print(array[i][j]);

            }

            System.out.println();
        }
    }


    static void  reverseString(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        System.out.println(reverse(input));
    }

    static String reverse(String input){
        StringBuilder output = new StringBuilder();
        for (int i=input.length()-1; i>=0;i--){
            output.append(input.charAt(i));
        }
        return output.toString();
    }

    static void reverseWordByWord(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        String[] inputArray = input.split(" ");

        //5 -> 2
        //6 -> 3

        for (int i = 0; i<=(inputArray.length-1)/2; i++){
            String temp = inputArray[i];
            inputArray[i] =  reverse(inputArray[inputArray.length-i-1]);
            inputArray[inputArray.length-i-1] =reverse(temp);
        }

        String output = String.join(" ", inputArray);
        System.out.println(output);
    }

    static void smallestAndBiggestPalindrome(){
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        String[] inputArray = inputStr.split(" ");
        String smallestPalidrome = "";
        String largestPalidrome = "";

        for (int i= 0; i<=inputArray.length-1;i++){
            String word = inputArray[i];
            if(isPalindrome(word)){
                if(smallestPalidrome.isBlank() && largestPalidrome.isBlank()){
                    smallestPalidrome = word;
                    largestPalidrome = word;
                }else if(word.length() < smallestPalidrome.length()){
                    smallestPalidrome = word;
                }else if (word.length() > largestPalidrome.length()){
                    largestPalidrome = word;
                }
            }else {
                continue;
            }
        }

        System.out.println("Smallest Palindrome"+smallestPalidrome);
        System.out.println("Largest Palindrome"+largestPalidrome);
    }

    static boolean isPalindrome(String str){
        return str.equalsIgnoreCase(reverse(str));
    }

    static void swapWithoutTempVariable(){
        Scanner scn = new Scanner(System.in);
        String input1 = scn.nextLine();
        String input2 = scn.nextLine();
        input1 = input1 + input2 ; // input1 will have both input1 and input2

        input2 = input1.substring(0,input1.length() - input2.length()); //get input1 and store input1 in input2
        input1 = input1.substring(input2.length()); // get input1 length (input2.length since input1 stored in it now), get the input 2 and store in input1

        System.out.println(input1+" " +input2);

    }

    static void  separateIndividualCharacterFromString(){
        Scanner scn = new Scanner(System.in);
        String inputStr = scn.nextLine();
        for (int i=0; i<=inputStr.length()-1; i++){
            System.out.println(inputStr.charAt(i));
        }
    }

    static void checkStringAreAnagram(){
        Scanner scn = new Scanner(System.in);
        char[] input = scn.next().toCharArray();
        char[] input2 = scn.next().toCharArray();
        Boolean isAnagram = true;

        if(input2.length != input.length){
            System.out.println("It is not Anagram");
        }else{
            HashMap<Character,Integer> inputHashMap = new HashMap<Character,Integer>();

            for(int i=0; i < input.length; i++){
                Integer charValue = inputHashMap.get(input[i]);
                Integer charValue1 = inputHashMap.get(input2[i]);

                if(charValue == null){
                    inputHashMap.put(input[i],1);
                }else{
                    inputHashMap.put(input[i],charValue+1);
                }

                if(charValue1 == null){
                    inputHashMap.put(input[i],-1);
                }else{
                    inputHashMap.put(input[i],charValue1-1);
                }
            }

            isAnagram = inputHashMap.values().stream().equals(0);
            System.out.println(inputHashMap);
            if(isAnagram) System.out.println("It is Anagram");
            else System.out.println("It is not Anagram");
        }
//
//        HashMap<Character,Integer> inputHashMap =  new HashMap<>();
//        HashMap<Character,Integer> input2HashMap = new HashMap<>();
//
//       updateElementInHashMap(input,inputHashMap);
//       updateElementInHashMap(input2,input2HashMap);
//
//       Boolean isAnagram = true;
//
//       for(int i=0; i<input.length;i++){
//           Integer input2CharCount = input2HashMap.get(input[i]);
//           if(input2CharCount == null  || !input2CharCount.equals(inputHashMap.get(input[i]))){
//               isAnagram = false;
//               break;
//           }
//       }
//
//       if(isAnagram) System.out.println("It is Anagram");
//       else System.out.println("It is not Anagram");

    }

    static void updateElementInHashMap(char[] input, HashMap<Character,Integer> inputHashMap){
        for(int i = 0; i< input.length;i++){
            if(inputHashMap.containsKey(input[i])){
                inputHashMap.put(input[i],inputHashMap.get(input[i]+1));
            }else{
                inputHashMap.put(input[i],1);
            }
        }
    }


}