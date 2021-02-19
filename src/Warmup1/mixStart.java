package Warmup1;

public class mixStart {

//    Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
//
//
//    mixStart("mix snacks") → true
//    mixStart("pix snacks") → true
//    mixStart("piz snacks") → false
    public static void main(String[] args) {
        mixStart s = new mixStart();
        System.out.println(s.mixStart("mix snacks"));


    }

    public boolean mixStart(String str) {
        if(str.length() > 2){
            String newStr = str.substring(1,3);
            if(newStr.equalsIgnoreCase("ix")){
                return true;
            }
        }
        return false;

    }

}
