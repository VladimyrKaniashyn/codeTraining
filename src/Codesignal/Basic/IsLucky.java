package Codesignal.Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class IsLucky {
    boolean solution(int n) {
//        int inputLength = (int) (Math.log10(n)+1);
        int firstHalf = 0;
        int secondHalf = 0;

        List<Integer> integerList = new LinkedList<Integer>();
        while (n > 0){
            integerList.add(0,n % 10);
            n /= 10;
        }

        for (int i = 0; i < integerList.size(); i++) {
//            System.out.println(integerList.get(i));
            if(i < integerList.size()/2){
                firstHalf += integerList.get(i);
            }
            else {secondHalf += integerList.get(i);}

        }
//        System.out.println(firstHalf);
//        System.out.println(secondHalf);
//
//        System.out.println(Arrays.toString(integerList.toArray()));
        if (firstHalf == secondHalf)
            return true;
        return false;
    }


//                                      TOP SOLUTION
//    String s = n+"";
//    int sum = 0;
//
//    for(int i=0; i<s.length()/2; i++)
//    sum+=(s.charAt(i)-s.charAt(s.length()-1-i));
//
//    return sum==0;

    public static void main(String[] args) {
        IsLucky lucky1 = new IsLucky();
        System.out.println(lucky1.solution(1230));

    }
}
