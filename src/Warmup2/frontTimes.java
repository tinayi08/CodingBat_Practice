package Warmup2;

public class frontTimes {

//    Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
//    or whatever is there if the string is less than length 3. Return n copies of the front;
//
//
//    frontTimes("Chocolate", 2) → "ChoCho"
//    frontTimes("Chocolate", 3) → "ChoChoCho"
//    frontTimes("Abc", 3) → "AbcAbcAbc"

    public static void main(String[] args) {
        frontTimes m = new frontTimes();
        System.out.println(m.frontTimes("AB", 3));
    }

    public String frontTimes(String str, int n) {
        if(str.length() >= 3) {
            String newString = str.substring(0,3);
            return newString.repeat(n);
        } else
            return str.repeat(n);

    }

}
