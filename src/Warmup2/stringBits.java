package Warmup2;

public class stringBits {

//    Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
//
//
//    stringBits("Hello") → "Hlo"
//    stringBits("Hi") → "H"
//    stringBits("Heeololeo") → "Hello"
    public static void main(String[] args) {

    }


    public String stringBits(String str) {
        String newStr = "";
        for(int i = 0; i < str.length(); i+=2) {
            newStr = newStr + str.substring(i,i+1);
        }
        return newStr;
    }

}
