package CodeWars;public class GetTheMiddleCharacter {
    public static String getMiddle(String word) {
        //Code goes here!

        char[] enterWord = word.toCharArray();
        int extra = enterWord.length % 2 == 0? 1 : 0;
        char[] countContainer = new char[1 + extra];

        int startIndex = enterWord.length / 2 - extra;
        int endIndex = enterWord.length / 2;


        for (int i = 0; i <= endIndex - startIndex; i++) {
            countContainer[i] = enterWord[startIndex + i];

        }


        return String.valueOf(countContainer);
    }

    public static void main(String[] args) {
        System.out.println(getMiddle("test"));
        System.out.println(getMiddle("testing"));
    }
}
