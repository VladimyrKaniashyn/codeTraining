package Codesignal.Basic;

public class ArrayChange {
    int solution(int[] inputArray) {
        int moves = 0;
        for (int i = 0; i < inputArray.length-1; i++) {
            if(inputArray[i] >= inputArray[i+1]){
                int diff = inputArray[i] - inputArray[i+1] + 1;
                moves += diff;
                inputArray[i+1] += diff;
            }
        }
        return moves;
    }

    public static void main(String[] args) {
        ArrayChange arrayChange = new ArrayChange();
        System.out.println(arrayChange.solution(new int[]{2, 1, 10, 1}));
    }
}
