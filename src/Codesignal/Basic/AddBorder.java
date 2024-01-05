package Codesignal.Basic;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AddBorder {
    String[] solution(String[] picture) {

        String[] refactorStrings = new String[picture.length + 2];
        int len = picture[0].length() + 2;
        String symbol = "*";

        for (int i = 0; i < refactorStrings.length; i++) {
            refactorStrings[i] = symbol.repeat(len);
        }

        String[] modifiedInputArray = Arrays.stream(picture)
                .map(str -> "*" + str + "*")
                .toArray(String[]::new);

        System.arraycopy(modifiedInputArray, 0, refactorStrings, 1, modifiedInputArray.length);




        System.out.println(picture.length);
        System.out.println(Arrays.toString(picture));
        System.out.println(Arrays.toString(modifiedInputArray));
        System.out.println(Arrays.toString(refactorStrings));
        return refactorStrings;

    }

    public static void main(String[] args) {
        AddBorder addBorder = new AddBorder();
        addBorder.solution(new String[]{"aa", "**", "gg"});
    }
}
