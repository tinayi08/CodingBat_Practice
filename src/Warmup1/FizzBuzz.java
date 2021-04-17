package Warmup1;

public class FizzBuzz {

//    Given an integer n, return a string array answer (1-indexed) where:
//    answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
//    answer[i] == "Fizz" if i is divisible by 3.
//    answer[i] == "Buzz" if i is divisible by 5.
//    answer[i] == i if non of the above conditions are true.

    public static void main(String[] args) {

        int [] array = new int [100];
        for (int i = 0; i < 100; i++) {
            array[i] = i+1;
        }

        System.out.println(checkFizzBuzz(30,array));
    }

    public static String checkFizzBuzz(int num, int[] array) {

        if (array[num] % 3 == 0 && array[num] % 5 == 0) {
            return "FizzBuzz";
        } else if (array[num] % 3 == 0) {
            return "Fizz";
        } else if (array[num] % 5 == 0) {
            return "Buzz";
        } else
            return String.valueOf(array[num]);

    }

}
