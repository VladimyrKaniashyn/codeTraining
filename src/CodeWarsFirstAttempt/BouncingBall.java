package CodeWarsFirstAttempt;

public class BouncingBall {
    public static int bouncingBall(double h, double bounce, double window) {
        // your code
        if(h >= 0){
            if(bounce >0 && bounce <1){
                if (window < h){
                    double numberOfBounce = 1.0;
                    while (h > window){
                        h = h * bounce;
                        numberOfBounce += 2;


                    }
                    numberOfBounce -=2;

                    return (int) numberOfBounce;
                }
            }
        }
//         some another variant
//        if ((h <= 0) || (window >= h) || (bounce <= 0) || (bounce >= 1))
//            return -1;
//        int seen = -1;
//        while (h > window) {
//            seen += 2;
//            h = h * bounce;
//        }
//        return seen;

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(bouncingBall(30.0, 0.66, 1.5));
        System.out.println(bouncingBall(3.0, 0.66, 1.5));
    }
}
