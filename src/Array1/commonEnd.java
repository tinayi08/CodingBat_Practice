package Array1;

public class commonEnd {



//    Given 2 arrays of ints, a and b, return true if they have the same first element or
//    they have the same last element. Both arrays will be length 1 or more.
//
//
//    commonEnd([1, 2, 3], [7, 3]) → true
//    commonEnd([1, 2, 3], [7, 3, 2]) → false
//    commonEnd([1, 2, 3], [1, 3]) → true

    public boolean commonEnd(int[] a, int[] b) {
        int aFront = a[0];
        int aEnd = a[a.length-1];
        int bFront = b[0];
        int bEnd = b[b.length-1];

        if (aFront == bFront || aEnd == bEnd) {
            return true;
        }
        return false;
    }

}
