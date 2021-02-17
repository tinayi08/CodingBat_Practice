package Warmup1;

public class delDel {

//    Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted.
//        Otherwise, return the string unchanged.
//
//
//    delDel("adelbc") → "abc"
//    delDel("adelHello") → "aHello"
//    delDel("adedbc") → "adedbc"
    public static void main(String[] args) {
        delDel n = new delDel();
        System.out.println(n.delDel("aHello"));

    }
    public String delDel(String str) {

        if (str.length() > 3){
            String nStr = str.substring(1,4);
            if(nStr.equalsIgnoreCase("del")) {
                String front = str.substring(0, 1);
                String end = str.substring(4);
                return front + end;
            }
        }
        return str;
    }


}
