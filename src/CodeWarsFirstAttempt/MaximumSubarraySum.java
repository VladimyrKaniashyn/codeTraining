package CodeWarsFirstAttempt;

public class MaximumSubarraySum {
//    public static int sequence(int[] arr) {
//        if(arr.length == 0){
//            return 0;
//        }
//        boolean neg = false;
//        int negativeCounter = 0;
//        for (int i = 0; i < arr.length; i++) {
//
//            if(arr[i] < 0){
//                negativeCounter++;
//            }
//        }
//        if (negativeCounter == arr.length){
//            return -1;
//        }
//        for (int i = 0; i < arr.length-1; i++) {
//            int onlyPositive = arr[i];
//            if(onlyPositive < arr[i]+arr[1+1]){
//                return Arrays.stream(arr).sum();
//            }
//
//        }
//
//
//        int theBiggestSumElement = 0;
//        int BiggestElementIndex = 0;
//        for (int i = 0; i < arr.length-1; i++) {
//            if((arr[i] + arr[i+1]) > theBiggestSumElement){
//                theBiggestSumElement = arr[i] + arr[i+1];
//                BiggestElementIndex = i;
//            }
//        }
//        int theSmollerElement = arr.length;
//        int smollerElementIndex = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] < theSmollerElement){
//                theSmollerElement = arr[i];
//                smollerElementIndex = i;
//            }
//        }
//
//int maxSum = 0;
//        for (int i = BiggestElementIndex; i < arr.length-1; i++) {
//            if(arr[i] != theSmollerElement){
//                maxSum = maxSum + arr[i];
//            }
//
//        }
//        //System.out.println(maxSum);
//
//
//
//        //System.out.println(theBiggestSumElement);
//        //System.out.println(BiggestElementIndex);
//        return maxSum;
//    }


    public static int sequence(int[] arr) {
        int currentElement = 0;
        int a = 0;
        for (int i = 0; i < arr.length; i++) {

        }
        return 66;
    }





    public static int sequencex2(int[] arr) {
        int maximumSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int localSum = 0;
            localSum += arr[i];
            for (int j = i; j < arr.length; j++) {
                if (j != arr.length -1) {
                    localSum += arr[j + 1];
                }
                if (localSum > maximumSum){
                    maximumSum = localSum;
                }

            }
        }

        return maximumSum;
    }
    public static int sequencex3(int[] arr) {
        int m = 0, a = 0, s = 0;
        for (int e : arr) {
            s += e;
            m = Math.min(s, m);
            a = Math.max(a, s - m);
        }
        return a;
    }


//   OR


//    int max_ending_here = 0, max_so_far = 0;
//        for (int v : arr) {
//        max_ending_here = Math.max(0, max_ending_here + v);
//        max_so_far = Math.max(max_so_far, max_ending_here);
//    }
//        return max_so_far;

//    int sumUpTo  = 0;
//    int maxSum = 0;
//    for(int n : arr) {
//        //sum the sequence unless the sum is less than the current element, if that occurs start summing from the current element
//        sumUpTo = Math.max(n, sumUpTo + n);
//        // assign maxSum as the greater of the current sum sequence and previous greatest sequence
//        maxSum = Math.max(maxSum, sumUpTo);
//    }
//    return maxSum;

    public static void main(String[] args) {
        //System.out.println(sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        //System.out.println(sequence(new int[]{-2, -6, -4}));
        //System.out.println(sequence(new int[]{2, 1, 6, 4}));
        //System.out.println(sequencex2(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(sequencex3(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
