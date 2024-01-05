package Codesignal.Basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReverseInParentheses {
    String solution(String inputString) {
//        String pattern = "\\((.*?)\\)";
////        String pattern = "\\(([^()]+)\\)";
//
//        StringBuilder outputB = new StringBuilder();
//        int lasIndex = 0;
//        Matcher matcher = Pattern.compile(pattern).matcher(inputString);
//
//        while (matcher.find()){
//            int startIndex = matcher.start(1);
//            int endIndex = matcher.end(1);
//
//            String reversed = new StringBuilder(matcher.group(1)).reverse().toString();
//            outputB.append(inputString.substring(lasIndex, startIndex));
//            outputB.append(reversed);
//            lasIndex = endIndex;
//        }
//        outputB.append(inputString.substring(lasIndex));
//
//
//        System.out.println(outputB);
//
//        return null;

//        StringBuilder str = new StringBuilder(inputString);
//        int start, end;
//        while(str.indexOf("(") != -1){
//            start = str.lastIndexOf("(");
//            end = str.indexOf(")", start);
//            str.replace(start, end + 1, new StringBuilder(str.substring(start+1, end)).reverse().toString());
//        }
//        System.out.println(str);
//        return str.toString();





        StringBuilder builder = new StringBuilder(inputString);
        int start, end;
        while (builder.indexOf("(") != -1){
            start = builder.lastIndexOf("(");
            end = builder.indexOf(")", start);
            builder.replace(start, end + 1 , new StringBuilder(builder.substring(start + 1, end)).reverse().toString());
        }
        System.out.println(builder);
        return builder.toString();
    }

    public static void main(String[] args) {
        ReverseInParentheses reverseInParentheses = new ReverseInParentheses();
        reverseInParentheses.solution("foo(bar(baz))blim");
        reverseInParentheses.solution("foo(bar)blim(rat)");

    }

}
