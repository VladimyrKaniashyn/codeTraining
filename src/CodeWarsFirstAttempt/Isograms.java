package CodeWarsFirstAttempt;

public class Isograms {
    public static boolean  isIsogram(String str) {
        // ...
char[] charsConverter = str.toLowerCase().toCharArray();

        for (int i = 0; i < charsConverter.length; i++) {
            for (int j = i + 1; j < charsConverter.length; j++) {
                if(charsConverter[i] == charsConverter[j]){
                    return false;
                }
            }

        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsogram("isogram"));
        System.out.println(isIsogram("aba"));
    }
}
