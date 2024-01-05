package CodeWarsSecondAttempt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseOrRotate {
    public static String revRot(String strng, int sz) {
        // your code

//        if (sz <= 0 || strng == null || sz > strng.length()){
//            return "11";
//        }
//
//        String[] split = strng.split("");
//
//        List<String> leftPart = Arrays.asList(Arrays.copyOfRange(split, 0, sz));
//        List<String> rightPart = Arrays.asList(Arrays.copyOfRange(split, sz, split.length));
//
//        int leftSum = leftPart.stream().mapToInt(Integer::parseInt).sum();
//        int rightSum = rightPart.stream().mapToInt(Integer::parseInt).sum();
//
//        if (leftSum % 2 == 0) {
//            Collections.reverse(leftPart);
//        } else {
//            Collections.rotate(leftPart, leftPart.size() -1);
//        }
//
//        if(rightSum % 2 == 0){
//            Collections.reverse(rightPart);
//        } else {
//            Collections.rotate(rightPart, rightPart.size() -1);
//        }
//
//
//
//        return String.join("", leftPart) + String.join("", rightPart);
        if (sz <= 0 || strng == null || sz > strng.length()){
            return "";
        }

        return Arrays.stream(strng.split("(?<=\\G.{" + sz + "})"))
                .filter(s -> s.length() == sz)
                .map(str -> {
                    List<String> split = Arrays.asList(str.split(""));

                    if (split.stream().mapToInt(Integer::parseInt).sum() % 2 == 0){
                        Collections.reverse(split);
                    } else {
                        Collections.rotate(split, split.size() - 1);
                    }

                    return String.join("", split);
                }).collect(Collectors.joining(""));
    }

    public static void main(String[] args) {
        //System.out.println(revRot("1234", 0));
        //System.out.println(revRot("", 0));
//        System.out.println(revRot("1234", 5));
        System.out.println(revRot("66443875", 4));
        System.out.println(revRot("733049910872815764", 5));
        //System.out.println(revRot("123456987654", 6));
//        The input is a string of integers and a size integer.
//        Split the string into substrings of the specified size, discarding the
//        remaining characters fewer than the size.

//        If the size is 0 or less, or is greater than the length of the string,
//        return "".Implement an algorithm transforming each substring as follows:

//        if you get a chunk of size 3 with the digits 123 as input, the sum of the cubes of its digits is
//        1 + 8 + 27 = 36 that's divisible by 2 and you should reverse it.
//        If the sum of the substring's digits is a multifple of 2, reverse that substring ("123" > "321").
//        Otherwise, rotate the substring to the left by one position ("135" > "351")
//        Combine the resulting substrings and return the result.

    }
}
