package Array1;

public class double23 {


//    Given an int array, return true if the array contains 2
//    twice, or 3 twice. The array will be length 0, 1, or 2.
//
//
//    double23([2, 2]) → true
//    double23([3, 3]) → true
//    double23([2, 3]) → false

    public static void main(String[] args) {

        int [] nums = new int[] {3,3};
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                count2++;
                System.out.println("count2" + count2);
            } else if (nums[i] == 3) {
                count3++;
                System.out.println("count3" + count3);
            }

        }
        if (count2 > 1 || count3 > 1) {
            System.out.println(count2 + " count 2");
            System.out.println("count 3 " + count3);
        }
    }

    public boolean double23(int[] nums) {
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                count2++;
            } else if (nums[i] == 3) {
                count3++;
            }
        }
        if (count2 > 1 || count3 > 1) {
            return true;
        }
        return false;
    }

}
