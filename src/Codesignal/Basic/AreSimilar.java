package Codesignal.Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AreSimilar {
    boolean solution(int[] a, int[] b) {
        if(Arrays.equals(a, b)){
            return true;
        }
//        int exitCounter = 0;
//        ArrayList<Integer> firsSave = null;
//        ArrayList<Integer> secondSave = null;
//        while (exitCounter < 3){
//
//        for (int i = 0; i < a.length; i++) {
//                if(a[i] != b[i]){
//                    exitCounter ++;
//                    if (exitCounter == 1){
//                        firsSave.;
//                        firsSave.add(b[i]);
//                    }
//                    if(exitCounter == 2){
//                        secondSave.add(a[i]);
//                        secondSave.add(b[i]);
//                    }
//                }
//            System.out.println(firsSave);
//            System.out.println(secondSave);
//            }
//            if(exitCounter == 2)
//                return true;


//        int[] resultArray = Arrays.stream(a).filter
//                (x -> (Arrays.stream(b).noneMatch(y -> y == x))).toArray();
//        System.out.println(Arrays.toString(resultArray));
        int[] integerList = IntStream.range(0, a.length).filter(j -> a[j] != b[j]).toArray();
        int countOfMismatches = integerList.length;
//        if(resultArray.length == 0 & countOfMismatches == 2){
        return countOfMismatches == 2 & a[integerList[0]] == b[integerList[1]] & a[integerList[1]] == b[integerList[0]];


//        int[] resultArray = Arrays.stream(a).filter
//                (x -> (Arrays.stream(b).noneMatch(y -> y == x))).toArray();

//        Решения с резалт арай вызывают ощибку в одном из тестов, видимо логика ошибочка и стрим выполняет не совсем то что я ожидаю,
//      Фактическое сравнение руками работает без ошибок.

//        long counter = IntStream.range(0, a.length).filter(j -> a[j] != b[j]).count();
//        if (resultArray.length == 0 && counter == 2){
//            return true;
//        }
//        return false;




    }



    public static void main(String[] args) {
        AreSimilar areSimilar = new AreSimilar();
        int[] a = {1, 2, 1, 2};
        int[] b = {2, 2, 1, 1};
        System.out.println(areSimilar.solution(a, b));
//        int[] a = {1, 2, 3};
//        int[] b = {1, 10, 2};
//        System.out.println(areSimilar.solution(a, b));
    }
}
