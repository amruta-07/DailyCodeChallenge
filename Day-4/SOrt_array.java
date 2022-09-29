import java.util.Arrays;

// Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.(without sorting algo)
public class SOrt_array {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 0, 1, 2, 1, 0, 2 };
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        int start = 0;
        int mid = 0;
        int end = arr.length - 1;
        int temp;

        while (mid <= end) {
            if (arr[mid] == 0) {
                temp = arr[start];
                arr[start] = arr[mid];
                arr[mid] = temp;
                mid++;
                start++;

            } else if (arr[mid] == 1) {
                mid++;

            } else if (arr[mid] == 2) {
                temp = arr[mid];
                arr[mid] = arr[end];
                arr[end] = temp;
                end--;

            }

        }
        System.out.println(Arrays.toString(arr));

    }
}
