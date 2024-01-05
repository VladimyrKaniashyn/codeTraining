package Codesignal.Basic;


public class areEquallyStrong {
    boolean solution(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        if (yourLeft == friendsLeft | yourLeft == friendsRight
                && yourRight == friendsRight | yourRight == friendsLeft)
        return true;
        else return false;

    }

}
