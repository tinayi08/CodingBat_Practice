package Warmup1;

public class endUp {


//    Given a string, return a new string where the last 3 chars are now in upper case.
//    If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.
//
//
//    endUp("Hello") → "HeLLO"
//    endUp("hi there") → "hi thERE"
//    endUp("hi") → "HI"

    public static void main(String[] args) {
        String str = "He";


        if(str.length()>2) {
            String last = str.toUpperCase().substring(str.length()-3, str.length());
            System.out.println(last+ " last");
            String first = str.substring(0,str.length()-3);
            System.out.println(first+ " first");
            String n = first + last;
            System.out.println(n + " n");
        } else
        System.out.println(str.toUpperCase());

    }

    public String endUp(String str) {

        if(str.length()>2) {
            String last = str.toUpperCase().substring(str.length()-3, str.length());
            String first = str.substring(0,str.length()-3);
            return first + last;

        } else
            return str.toUpperCase();
    }

}
