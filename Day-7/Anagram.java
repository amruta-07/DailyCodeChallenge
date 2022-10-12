import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        boolean ans = isAnagram("aabbaac", "aabbaad");
        System.out.println(ans);
    }

    public static boolean isAnagram(String a, String b) {

        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        if (a.length() != b.length()) {
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            return true;
        } else {
            return false;
        }

    }

}
