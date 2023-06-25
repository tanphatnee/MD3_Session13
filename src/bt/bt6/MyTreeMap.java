package bt.bt6;

import java.util.Arrays;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 3};

        Arrays.sort(arr);
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            treeMap.put(arr[i], i);
        }

        for (int key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }
    }
}
