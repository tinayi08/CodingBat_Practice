package String1;

public class hasBad {


//    Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
//    such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length,
//    including 0. Note: use .equals() to compare 2 strings.
//
//    hasBad("badxx") → true
//    hasBad("xbadxx") → true
//    hasBad("xxbadxx") → false

    public static void main(String[] args) {

        System.out.println(hasBad("xxb"));

    }

    public static boolean hasBad(String str) {
        if (str.length() < 4 && str.contains("bad")) {
            return true;
        } else if (str.length() < 4 && !str.contains("bad")) {
            return false;
        }

        String newStr = str.substring(0,4);
        if (newStr.contains("bad")) {

            return true;
        }
        return false;
    }

}
