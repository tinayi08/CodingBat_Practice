package Warmup1;

public class backAround {


//    Given a string, take the last char and return a new string with the last char added at the front and back,
//    so "cat" yields "tcatt". The original string will be length 1 or more.
//
//
//    backAround("cat") → "tcatt"
//    backAround("Hello") → "oHelloo"
//    backAround("a") → "aaa"
public static void main(String[] args) {
    backAround b = new backAround();
    System.out.println(b.backAround("a"));
}

    public String backAround(String str) {
        char c = str.charAt(str.length()-1);
        String s = c + str + c;
        return s;
    }

}
