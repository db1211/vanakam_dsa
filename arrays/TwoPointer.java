package arrays;

import java.util.Arrays;

class TwoPointer {

    public static void main(String[] args) {
        System.out.println("twpointer " + "code ");
        int[] arr = { 10, 22, 3, 4 };
        reverse(arr);
    }

    public static void reverse(int[] arr) {

        int first = 0;
        int last = arr.length - 1;

        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        System.out.println("result :" + Arrays.toString(arr));

    }

    // System.out.println("result :" + );

}