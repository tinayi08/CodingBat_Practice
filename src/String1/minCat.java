package String1;

public class minCat {


//    Given two strings, append them together (known as "concatenation") and return the result.
//    However, if the strings are different lengths,
//    omit chars from the longer string so it is the same length as the shorter string.
//    So "Hello" and "Hi" yield "loHi". The strings may be any length.
//
//
//    minCat("Hello", "Hi") → "loHi"
//    minCat("Hello", "java") → "ellojava"
//    minCat("java", "Hello") → "javaello"


    public String minCat(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        String newString = "";
        if (aLength < bLength) {
            newString = a + b.substring(b.length()-aLength, b.length());
        } else if (aLength > bLength) {
            newString = a.substring(a.length()-bLength, a.length()) + b;
        } else
            newString = a + b;

        return newString;
    }

}
