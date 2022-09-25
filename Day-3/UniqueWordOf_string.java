import java.util.HashSet;

public class UniqueWordOf_string {
    public static void main(String[] args) {
        // String str = "hi my name is amruta himy name is amruta";
        String str[] = { "hi", "my", "name", "is", "amruta", "hi", "my" };
        HashSet<String> unique_word = new HashSet<>();
        for (int i = 0; i < str.length; i++) {
            unique_word.add(str[i]);

        }
        System.out.println(unique_word);
        // String[] ans = new String[unique_word.size()];
        // int i = 0;
        // for (String n : unique_word) {
        // ans[i++] = n;

        // }
        // System.out.println(Arrays.toString(ans));
    }

}
