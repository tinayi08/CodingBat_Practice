package String1;

public class middleThree {


//    Given a string of odd length, return the string length 3 from its middle,
//    so "Candy" yields "and". The string length will be at least 3.
//
//
//    middleThree("Candy") → "and"
//    middleThree("and") → "and"
//    middleThree("solving") → "lvi"

    public String middleThree(String str) {
        int length = str.length();
        int middle = (length+1)/2;
        String newStr;
        return newStr = str.substring(middle-2,middle+1);
    }

}
