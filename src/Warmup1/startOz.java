package Warmup1;

public class startOz {

//    Given a string, return a string made of the first 2 chars (if present),
//    however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
//
//
//    startOz("ozymandias") → "oz"
//    startOz("bzoo") → "z"
//    startOz("oxx") → "o"



    public String startOz(String str) {
        if (str.length() > 1) {
            String n = str.substring(0, 2);
            String o = str.substring(0, 1);
            String z = str.substring(1, 2);
            if (n.equalsIgnoreCase("oz")) {
                return n;
            } else if (o.equalsIgnoreCase("o")) {
                return o;
            } else if (z.equalsIgnoreCase("z")) {
                return z;
            } else
                return "";

        }
        return str;
    }
}
