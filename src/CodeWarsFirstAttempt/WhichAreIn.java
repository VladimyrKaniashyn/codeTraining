package CodeWarsFirstAttempt;

import java.util.*;

public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {

        //System.out.println(array1.toString().contains("live"));
        System.out.println(Arrays.toString(array2).contains(array1[0]));
        int counter =0;


        for (int i = 0; i < array1.length; i++) {
//            System.out.println(Arrays.toString(array2).contains(array1[array1.length-1]));
            if (Arrays.toString(array2).contains(array1[i])) {
                counter++;
            }

        }
        String[] newArray = new String[counter];

        int resultIndex = 0;
        for (int i = 0; i < array1.length; i++) {

            if (Arrays.toString(array2).contains(array1[i])) {
                newArray[resultIndex++] = array1[i];
            }

        }

        Arrays.sort(newArray);
        return newArray;
    }


    public static String[] inArrayWithList(String[] array1, String[] array2) {
        //ArrayList<String> resultList = new ArrayList<String>();
        TreeSet<String> resultTree = new TreeSet<>();
        for (int i = 0; i < array1.length; i++) {
            if (Arrays.toString(array2).contains(array1[i])) {
                resultTree.add(array1[i]);
            }


        }
        System.out.println(resultTree);

        //return resultTree.toArray(new String[0]);
        return resultTree.stream().toArray(size -> new String[size]);
        //Collections.sort(resultList);
        //return resultList.toArray(new String[0]);
    }


    public static void main(String[] args) {
       // System.out.println(Arrays.toString(inArray(new String[]{"arp", "live", "strong"},
                //new String[]{"lively", "alive", "harp", "sharp", "armstrong"})));


        System.out.println(Arrays.toString(inArrayWithList(new String[]{"arp", "live", "strong"},
                new String[]{"lively", "alive", "harp", "sharp", "armstrong"})));
    }
}
