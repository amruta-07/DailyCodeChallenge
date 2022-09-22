import java.util.Arrays;

public class MissingInteger {
    public static void main(String[] args) {
        int arr[] = { 8, 7, 6, 4, 5, 2, 1 };
        int n = 7;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));// [1, 2, 4, 5, 6, 7, 8]
        int Total_sum = n * (n + 1) / 2;
        int given_integer_sum = 0;
        for (int i = 0; i < n - 1; i++) {
            given_integer_sum += arr[i];
        }
        System.out.println(given_integer_sum);// 25
        System.out.println(Total_sum);// 28
        int missing_integer = Total_sum - given_integer_sum;
        System.out.println(missing_integer);// 3

    }

}
