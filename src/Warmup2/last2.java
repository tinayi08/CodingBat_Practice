package Warmup2;

public class last2 {

//    Given a string, return the count of the number of times that a substring length 2 appears in the string and
//    also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
//
//
//    last2("hixxhi") → 1
//    last2("xaxxaxaxx") → 1
//    last2("axxxaaxx") → 2

    public static void main(String[] args) {
        last2 m = new last2();
        String str = "hixxhi";

        //System.out.println(newStr);
        System.out.println(m.last2("hixxhi"));
    }

    public int last2(String str) {
        if (str.length() <= 2) {
            return 0;
        }
        int count = 0;
        String newStr = str.substring(str.length()-2,str.length());

        for (int i = 0; i < str.length()-2; i++){
            String s = str.substring(i, i+2);
            if (s.equalsIgnoreCase(newStr)) {
                count++;
            }
        }
        return count;
    }

}
