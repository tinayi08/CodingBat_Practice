package Warmup1;

public class front3 {


//    Given a string, we'll say that the front is the first 3 chars of the string.
//    If the string length is less than 3, the front is whatever is there.
//    Return a new string which is 3 copies of the front.
//
//
//    front3("Java") → "JavJavJav"
//    front3("Chocolate") → "ChoChoCho"
//    front3("abc") → "abcabcabc"
public static void main(String[] args) {
    front3 n = new front3();
    System.out.println(n.front3("ab"));


}
    public String front3(String str) {
        String s;
        if(str.length() < 3) {
            s = str;
        } else
        s = str.substring(0,3);

        return s.repeat(3);

    }


}
