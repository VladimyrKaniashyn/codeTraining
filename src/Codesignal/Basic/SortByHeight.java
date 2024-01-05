package Codesignal.Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortByHeight {
    int[] solution(int[] a) {
        ArrayList<Integer> arrayWithStructure = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if(a[i] != -1){
                arrayWithStructure.add(a[i]);
            }
        }

//        System.out.println(Arrays.toString(arrayWithStructure.stream().sorted().toArray()));
//        System.out.println(arrayWithStructure);
        Collections.sort(arrayWithStructure);
        System.out.println(arrayWithStructure);
        ArrayList<Integer> resultList = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == -1){
                ++counter;
                resultList.add(-1);
            }
            if(a[i] != -1){
                resultList.add(arrayWithStructure.get(i - counter));
            }

        }
        System.out.println(resultList);

        int[] intResponce = resultList.stream().mapToInt(Integer::intValue).toArray();
        return intResponce;
    }

    public static void main(String[] args) {
        SortByHeight sortByHeight = new SortByHeight();
        System.out.println(Arrays.toString(sortByHeight.solution(new int[]{-1, 150, 190, 170, -1, -1, 160, 180})));
    }
}
