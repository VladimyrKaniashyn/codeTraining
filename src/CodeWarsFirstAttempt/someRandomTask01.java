package CodeWarsFirstAttempt;

public class someRandomTask01 {
    public static int getSum() {
int[]arr = new int[]{1,-2,3,4,5};
    int sum = 0;
    for (int i=0; i < arr.length; i++){
        if(arr[i] > 0){
            sum = arr[i] + sum;
        }
        else if(arr.length == 0){
            sum = 0;
        }
        System.out.println(sum);
    }
    return sum;
}

    public static void main(String[] args) {
        getSum();
    }
}
