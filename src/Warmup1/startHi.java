package Warmup1;

public class startHi {


//    Given a string, return true if the string starts with "hi" and false otherwise.
//
//
//            startHi("hi there") → true
//    startHi("hi") → true
//    startHi("hello hi") → false

    public static void main(String[] args) {
        startHi m = new startHi();
        System.out.println(m.startHi("hi"));
    }
    public boolean startHi(String str) {
        if(str.length() > 1) {
            String hi = str.substring(0,2);
            if (hi.equalsIgnoreCase("hi") && str.length() > 1) {
                return true;
            }
        }
        return false;
    }

}
