package RlTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Viols {



public static void main(String[] args) {
    int[] firstArray = {1, 2, 3, 3, 4};
    int[] secondArray = {2, 3, 4, 5};

    Arrays.stream(firstArray).distinct()
            .filter(first -> Arrays.stream(secondArray).anyMatch(second -> second == first))
            .forEach(System.out::println);


    ArrayList<Integer> firstList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
    ArrayList<Integer> secondList = new ArrayList<>(Arrays.asList(2, 3, 4, 5));

    firstList.retainAll(secondList);
    System.out.println(firstList);

    }
}
