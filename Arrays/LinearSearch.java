package Arrays;

/**
 * LinearSearch - Rohan Bawa
 */
public class LinearSearch {
    public static int search(int arr[], int arrayLength, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 2, 1, 56, 1, 2, 12, 123, 432, 23, 536, 56, 5123 };
        final int target = 5;
        int result = search(arr, arr.length, target);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + result);
        }
    }

}