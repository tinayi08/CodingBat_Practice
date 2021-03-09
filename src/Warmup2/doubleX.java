package Warmup2;

public class doubleX {


//    Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
//
//
//    doubleX("axxbb") → true
//    doubleX("axaxax") → false
//    doubleX("xxxxx") → true


    boolean doubleX(String str) {

        if(str.contains("x")) {
            int x = str.indexOf("x");
            if (str.length() >= x+2) {
                String s = str.substring(x,x+2);
                if (s.equalsIgnoreCase("xx")) {
                    return true;
                }
            }
        }
        return false;
    }

}
