package Codesignal.Basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PalindromeRearranging {

    boolean solution(String inputString) {
        boolean monotone = true;
        for (int i = 0; i < inputString.length(); i++) {
            if(inputString.charAt(0) != inputString.charAt(i)){
                monotone = false;
            }
        }
        if (monotone){
            return monotone;
        }

        Map<Character, Integer> countMap = new HashMap<>();
        for (int i = 0; i < inputString.length(); i++) {
            countMap.put(inputString.charAt(i), countMap.getOrDefault(inputString.charAt(i), 0) + 1);
        }

//        int counter1 = 0;
//        for (int i = 0; i < inputString.length(); i++) {
//            if (countMap.get(inputString.charAt(i)) % 2 != 0) {
//                counter1++;
//            }
//            }
        int counter = 0;
        for (Integer value : countMap.values()) {
            if (value % 2 != 0) {
                counter++;
            }
        }
        System.out.println(counter);
        if((inputString.length() % 2 == 0 && counter == 0)
                || (inputString.length() % 2 != 0) && counter == 1)
        return true;
        else return false;
    }

    public static void main(String[] args) {
        PalindromeRearranging palindromeRearranging = new PalindromeRearranging();
//        System.out.println(palindromeRearranging.solution("abbcabb"));
//        System.out.println(palindromeRearranging.solution("aaa"));
        System.out.println(palindromeRearranging.solution("aaaaacc"));
    }

}
