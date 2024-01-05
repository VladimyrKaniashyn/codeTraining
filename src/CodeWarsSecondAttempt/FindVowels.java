package CodeWarsSecondAttempt;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindVowels {

    private static boolean counterOfChars (char cha, Set<Character> vowelss){

        return vowelss.stream().anyMatch(vowel -> vowel.equals(cha));
    }
    public static int getCount(String str) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
         return Stream.of(str.chars().mapToObj(i -> (char) i))
                 .flatMap(Function.identity())
                .filter(ch ->
//                    containsChar(ch, vowels)
                        counterOfChars(ch, vowels)
                )
                .collect(Collectors.counting())
                 .intValue();

//        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));
//        list.stream().filter(a -> a.contains("a")).collect()
//
//
////                    int counter = 0;
////        if(list.stream().equals("a")) {
////            counter += 1;
////        }
////        return counter;
////                }).forEach(System.out::println);
//        //list.stream().filter(e -> e.contains("a"));
//
//        int total = list.stream().map(s -> s.replace("a", "")).map(s -> s.length())
//                .reduce(0, Integer::sum);
//        System.out.println(total);
//        return 0;
    }

    public static void main(String[] args) {
        System.out.println(getCount("abracadabra"));
    }

//    private static boolean containsChar(char ch, Set<Character> vowels) {
//        return vowels.stream()
//                .anyMatch(vowel -> vowel.equals(ch));
//    }
}
