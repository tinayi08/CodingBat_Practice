package Warmup1;

public class frontBack {


//    Given a string, return a new string where the first and last chars have been exchanged.
//
//
//    frontBack("code") → "eodc"
//    frontBack("a") → "a"
//    frontBack("ab") → "ba"
    public String frontBack(String str) {
        if(str.length() <= 1) return str;

        String middle = str.substring(1, str.length()-1);
        String newStr = str.charAt(str.length()-1) + middle + str.charAt(0);
        return newStr;

    }

}
