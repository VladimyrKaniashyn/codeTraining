package CodeWarsFirstAttempt;

public class Multiplesof3or5 {
    public static int solution(int number) {
        //TODO: Code stuff here
        int count3 = 3;
        int count5 = 5;
        int summa = 0;

        for (int i = 0; i < number; i++) {
            if(i % count3 == 0 || i % count5 == 0){
                summa += i;
            }
        }



        return summa;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
