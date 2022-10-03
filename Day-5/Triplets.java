import java.util.HashMap;

class Triplets {
    public static void main(String args[]) {
        int a[] = { 2, 1, 4, 3, 7 };
        int n = a.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(a[i], i);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (map.containsKey(a[i] + a[j])) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}