package CodeWarsSecondAttempt;

import java.util.ArrayList;
import java.util.List;

public class MessiGoalsFunction {
    public static int goals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals) {
        // your code here
        List<Integer> integerList = new ArrayList<>();
        integerList.add(laLigaGoals);
        integerList.add(copaDelReyGoals);
        integerList.add(championsLeagueGoals);

        return integerList.stream().mapToInt(value -> value).sum();
       // return 777;
    }

    public static void main(String[] args) {
        System.out.println(goals(5,10,2));
    }
}
