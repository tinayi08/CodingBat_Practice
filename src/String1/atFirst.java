package String1;

public class atFirst {


//    Given a string, return a string length 2 made of its first 2 chars.
//    If the string length is less than 2, use '@' for the missing chars.
//
//
//    atFirst("hello") → "he"
//    atFirst("hi") → "hi"
//    atFirst("h") → "h@"

    public static void main(String[] args) {
        System.out.println(atFirst("hello"));
    }

    public static String atFirst(String str) {
        if (str.length() > 1) {
            return str.substring(0,2);
        } else if (str.length() == 1) {
            return str + "@";
        }
            return "@@";
    }

}
