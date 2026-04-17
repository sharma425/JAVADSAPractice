package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArraysHashing {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 1, 3 };
        System.out.println(countFrequencies(arr));
    }

    public static List<List<Integer>> countFrequencies(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l = null;
        for (Integer key : map.keySet()) {
            l = new ArrayList<Integer>();
            l.add(key);
            l.add(map.get(key));
            list.add(l);
        }

        return list;
    }
}
