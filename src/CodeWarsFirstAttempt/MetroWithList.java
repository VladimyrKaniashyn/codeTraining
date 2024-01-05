package CodeWarsFirstAttempt;

import java.util.ArrayList;
import java.util.Arrays;

public class MetroWithList {
    public static int countPassengers(ArrayList<int[]> stops) {
        //Code here!

        System.out.println(stops.toString());
        int totalSum = 0;
        for (int[] arr:
             stops) {
            totalSum+=arr[0];
            totalSum-=arr[1];
            System.out.println(Arrays.toString(arr));
        }


        return  totalSum;
    }

    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});
        System.out.println(countPassengers(list));
    }
}
