package Warmup1;


//Given an int n, return the absolute difference between n and 21,
// except return double the absolute difference if n is over 21.
//
//
//        diff21(19) → 2
//        diff21(10) → 11
//        diff21(21) → 0


public class diff21 {

    public static void main(String[] args) {
        diff21 practice = new diff21();
        System.out.println(practice.diff21(22));
    }
    public int diff21(int n) {
        int i = 0;
        if(n > 21) {
            i = (n-21)*2;

        } else {
            i = 21 - n;
        }
        return i;
    }


}
