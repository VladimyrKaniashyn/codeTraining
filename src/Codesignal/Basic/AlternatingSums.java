package Codesignal.Basic;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AlternatingSums {
    int[] solution(int[] a) {
        int[] first = IntStream.range(0, a.length / 2).toArray();
        if (a.length % 2 !=0){
            first = new int[first.length + 1];
        }
        int[] second = IntStream.range(0, a.length / 2).toArray();

        int firstCounter = 0;
        int secondCounter = 0;
        for (int i = 0; i < a.length;i++) {
            if(i % 2 == 0){
                    first[firstCounter] = a[i];
                    firstCounter++;
            }
            else {
                second[secondCounter] = a[i];
                secondCounter++;
            }

        }
        System.out.println(first.length);
        System.out.println(second.length);
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));

        return new int[]{Arrays.stream(first).sum(), Arrays.stream(second).sum()};
    }

    public static void main(String[] args) {
        AlternatingSums alternatingSums = new AlternatingSums();
        System.out.println(Arrays.toString(alternatingSums.solution(new int[]{50, 60, 60, 45, 70})));
    }
}
