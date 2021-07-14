package Array1;

public class makeMiddle {


//    Given an array of ints of even length, return a new
//    array length 2 containing the middle two elements
//    from the original array. The original array will
//    be length 2 or more.
//
//
//    makeMiddle([1, 2, 3, 4]) → [2, 3]
//    makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
//    makeMiddle([1, 2]) → [1, 2]

    public int[] makeMiddle(int[] nums) {
        int length = nums.length/2;
        int[] array = new int[] {nums[length-1], nums[length]};

        return array;
    }



}
