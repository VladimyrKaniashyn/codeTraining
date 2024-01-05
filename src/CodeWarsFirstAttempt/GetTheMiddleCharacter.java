package CodeWarsFirstAttempt;public class GetTheMiddleCharacter {
    public static String getMiddle(String word) {
        //Code goes here!
//
//        char[] enterWord = word.toCharArray();
//        int extra = enterWord.length % 2 == 0? 1 : 0;
//        char[] countContainer = new char[1 + extra];
//
//        int startIndex = enterWord.length / 2 - extra;
//        int endIndex = enterWord.length / 2;
//
//
//        for (int i = 0; i <= endIndex - startIndex; i++) {
//            countContainer[i] = enterWord[startIndex + i];
//
//        }
//
//        return String.valueOf(countContainer);
//
//
//        creating second version downstairs
//
//
//
//
//
//
    char[] arrayOfChars = word.toCharArray();

        int evenOdd = arrayOfChars.length % 2 == 0? 1 : 0;
        char[] requiredChars = new char[1 + evenOdd];
        int firstCharIndex = arrayOfChars.length / 2 - evenOdd;
        int secondCharIndex = arrayOfChars.length / 2;
        for (int i = 0; i <= secondCharIndex - firstCharIndex; i++) {
            requiredChars[i] = arrayOfChars[firstCharIndex + i];
        }
return String.valueOf(requiredChars);
    }

    public static void main(String[] args) {
        System.out.println(getMiddle("test"));
        System.out.println(getMiddle("testing"));
    }
}
