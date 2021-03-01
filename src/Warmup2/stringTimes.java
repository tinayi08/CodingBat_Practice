package Warmup2;

public class stringTimes {


//    Given a string and a non-negative int n, return a larger string that is n copies of the original string.
//    stringTimes("Hi", 2) → "HiHi"
//    stringTimes("Hi", 3) → "HiHiHi"
//    stringTimes("Hi", 1) → "Hi"
    public static void main(String[] args) {
        stringTimes m = new stringTimes();
        String str = "hi";
        int n = 2;
        System.out.println(m.stringTimes(str,n));
    }
    public String stringTimes(String str, int n) {

        return str.repeat(n);
    }

}
