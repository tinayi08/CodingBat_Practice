package Array1;

import java.util.EnumSet;

public class maxEnd3 {

//    Given an array of ints length 3, figure out which is larger,
//    the first or last element in the array, and set all the other
//    elements to be that value. Return the changed array.
//
//
//    maxEnd3([1, 2, 3]) → [3, 3, 3]
//    maxEnd3([11, 5, 9]) → [11, 11, 11]
//    maxEnd3([2, 11, 3]) → [3, 3, 3]

    public static void main(String[] args) {
        maxEnd3 x = new maxEnd3();
        int[] nums = new int[] {1, 2, 3};
        int [] array = x.maxEnd3(nums);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }

    public int[] maxEnd3(int[] nums) {
        int first = nums[0];
        int last = nums[2];
        if (first > last) {
            nums[1] = first;
            nums[2] = first;
            return nums;
        } else
            nums[0] = last;
            nums[1] = last;
            return nums;
    }

}
