package String1;

public class conCat {


//    Given two strings, append them together (known as "concatenation") and return
//    the result. However, if the concatenation creates a double-char,
//    then omit one of the chars, so "abc" and "cat" yields "abcat".
//
//
//    conCat("abc", "cat") → "abcat"
//    conCat("dog", "cat") → "dogcat"
//    conCat("abc", "") → "abc"

    public static void main(String[] args) {
        System.out.println(conCat("abc", "cat"));

    }
    public static String conCat(String a, String b) {

        if (a.isEmpty()) {
            return b;
        } else if (b.isEmpty()) {
            return a;
        }
        String lastA = a.substring(a.length()-1);
        String firstB = b.substring(0,1);
        if(lastA.equalsIgnoreCase(firstB)) {
            String s = a.substring(0, a.length()-1);
            return s.concat(b);
        }
        return a.concat(b);
    }

}
