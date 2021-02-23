package Warmup1;

public class close10 {

//    Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
//    Note that Math.abs(n) returns the absolute value of a number.
//
//
//    close10(8, 13) → 8
//    close10(13, 8) → 8
//    close10(13, 7) → 0



    public int close10(int a, int b) {
        int aAbs = Math.abs(10-a);
        int bAbs = Math.abs(10-b);
        if (aAbs < bAbs){
            return a;
        } else if (bAbs < aAbs) {
            return b;
        } else
            return 0;

    }

}
