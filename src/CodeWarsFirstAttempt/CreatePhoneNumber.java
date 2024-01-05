package CodeWarsFirstAttempt;

public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        // Your code here!
String phoneNumber = "";
        for (int i = 0; i < numbers.length; i++) {
            //System.out.println(Arrays.toString(Arrays.toString(numbers).toCharArray()) + "dd");
            phoneNumber = "("+numbers[0] + numbers[1]+ numbers[2]+ ") "
                    + numbers[3] + numbers[4] + numbers[5] +"-"
                    +numbers[6]+ numbers[7]+ numbers[8]+ numbers[9];
            //System.out.println(phoneNumber);


//            String phoneNumber = new String("(xxx) xxx-xxxx");
//
//            for (int i : numbers) {
//                phoneNumber = phoneNumber.replaceFirst("x", Integer.toString(i));
//            }
//
//            return phoneNumber;
//
        }
        return phoneNumber;
    }

    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}
