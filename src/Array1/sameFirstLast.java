package Array1;

public class sameFirstLast {


//    Given an array of ints, return true if the array is length 1 or more,
//    and the first element and the last element are equal.
//
//
//    sameFirstLast([1, 2, 3]) → false
//    sameFirstLast([1, 2, 3, 1]) → true
//    sameFirstLast([1, 2, 1]) → true


    public boolean sameFirstLast(int[] nums) {
        int first = nums[0];
        int last = nums[nums.length-1];
        if (nums.length >= 1 && first == last) {
            return true;
        }
        return false;

    }

}
