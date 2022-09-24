import java.util.Arrays;

public class MoveUppercase_charToend {
    public static void main(String[] args) {
        char[] a = { 'q', 'A', 'r', 'W', 'E', 'O', 'b' };
        int n = a.length;
        // Arrays.sort(a);
        // System.out.println(Arrays.toString(a));// [A, E, O, W, q, r]
        int start = 0;
        int end = n - 1;
        while (start <= end) {

            if ((int) a[start] <= 91 && (int) a[end] >= 97) {
                char temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
            if (a[start] >= 97) {
                start++;
            }
            if (a[end] <= 91) {
                end--;
            }
            // if(a[start]<)
        }
        System.out.println(Arrays.toString(a));

    }

}
