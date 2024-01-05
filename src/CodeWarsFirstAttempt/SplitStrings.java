package CodeWarsFirstAttempt;

import java.util.Arrays;

public class SplitStrings {
    public static String[] solution(String s) {
        //Write your code here
        String[] result = new String[Double.valueOf(Math.ceil((double)s.length()/2)).intValue()];

        for(int i=0; i<s.length(); i+=2) {
            char firstChar = s.charAt(i);
            char secondChar = i+1==s.length() ? '_' : s.charAt((i+1));
            result[i/2] = firstChar + "" + secondChar;
        }



        String[] splitted = s.split("(?<=\\G.{2})");
        //System.out.println(Arrays.toString(s.split("(?<=\\G.{2})")));


        int lastIndexOfSplittedArray = splitted.length - 1;
        boolean lastElementHasOneChar = splitted[lastIndexOfSplittedArray].length() == 1;
        if(lastElementHasOneChar) {
            splitted[lastIndexOfSplittedArray] = splitted[lastIndexOfSplittedArray] + "_";
        }
        System.out.println(Arrays.toString(splitted));

//        String result = "";
//        for (int i = 0; i < s.length(); i++) {
//            if (s.length() % 2 == 0) {
//                result = s.substring(i);
//            }
//            System.out.println(result);
//        }

//        for (int i = 0; i < s.length(); i++) {
//        if (splitted.length % 2 != 0) {
//        }
//        }

//
//        Vector<String> vector = new Vector<String>();
//        for (int i = 0; i < s.length(); i+=2) {
//            vector.add(s.substring(i, (i+2 > s.length()) ? s.length() : i+2));
//
//        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("LovePizza")));
        System.out.println(Arrays.toString(solution("HelloWorld")));

    }
}
