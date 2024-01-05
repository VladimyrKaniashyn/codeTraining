package CodeWarsFirstAttempt;

public class FindNeedle {
    public static String findNeedle(Object[] haystack) {
        // Your code here
        int count ;
        String ansver = null;
        for (int i = 0; i < haystack.length; i++) {
            if(haystack[i] != null &&
                    haystack[i].toString().contains("needle")){
                //Object c = haystack[i];
                count = i;
                System.out.println(count);
                System.out.println("found the needle at position " + count);
                ansver = Integer.toString(count);
            }
        }
        return "found the needle at position " + ansver;
    }

    public static void main(String[] args) {
        System.out.println(findNeedle(new Object[]{"hay", null, "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"}));
    }
}
