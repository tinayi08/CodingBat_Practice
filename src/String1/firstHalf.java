package String1;

public class firstHalf {

//    Given a string of even length, return the first half.
//    So the string "WooHoo" yields "Woo".
//
//
//    firstHalf("WooHoo") → "Woo"
//    firstHalf("HelloThere") → "Hello"
//    firstHalf("abcdef") → "abc"

    public String firstHalf(String str) {
        String newStr = str.substring(0,str.length()/2);
        return newStr;
    }

}
