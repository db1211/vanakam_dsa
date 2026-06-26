package arrays;

import java.util.Arrays;

public class ArrayRotation {

    public static int[] arrayRotation(int[] nums, int k) {

        k %= nums.length;
        System.out.println("k" + k);
        if (k == 0) {
            System.out.println("no rotation needed");
            return nums;
        }
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

        return nums;

    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        // System.out.println("arr rotation");
        int[] result = arrayRotation(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 3);
        System.out.println(Arrays.toString(result));
    }
}
