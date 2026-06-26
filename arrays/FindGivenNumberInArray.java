package arrays;
public class FindGivenNumberInArray {

    public static int search(int[] arr, int x) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println("fgvia");
        int res = search(new int[] { 1, 2, 3, 4 }, 0);
        System.out.println(res);
    }

}
