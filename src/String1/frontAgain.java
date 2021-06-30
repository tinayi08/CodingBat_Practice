package String1;

public class frontAgain {


//    Given a string, return true if the first 2 chars in the string
//    also appear at the end of the string, such as with "edited".
//
//
//    frontAgain("edited") → true
//    frontAgain("edit") → false
//    frontAgain("ed") → true


    public boolean frontAgain(String str) {
        if (str.length() == 2) {
            return true;
        } else if (str.length() < 2)
            return false;
        String end = str.substring(str.length()-2, str.length());
        String front = str.substring(0, 2);
        if (front.equalsIgnoreCase(end)) {
            return true;
        } else
            return false;


    }

}
