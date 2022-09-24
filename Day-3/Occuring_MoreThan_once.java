// Given an array a[] of size N which contains elements from 0 to N-1, you need to find all the elements occurring more than once in the given array.return array

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Occuring_MoreThan_once
 */
public class Occuring_MoreThan_once {

    public static void main(String[] args) {
        int a[] = { 1, 9, 2, 8, 4, 3, 7, 9, 2, 8, 6, 8 };
        int n = a.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                ans.add(key);
            }
        }
        int result[] = new int[ans.size()];
        int i = 0;
        for (int N : ans) {
            result[i] = N;
            i++;
        }
        System.out.println(Arrays.toString(result));

    }
}