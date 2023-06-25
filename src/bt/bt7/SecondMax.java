package bt.bt7;

import java.util.Arrays;
import java.util.TreeMap;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,7,4,6,3};


        Arrays.sort(arr);

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        for (int i = 0; i < arr.length; i++) {
            treeMap.put(arr[i], i);
        }

        int secondMax = treeMap.lowerKey(treeMap.lastKey());

        System.out.println("Phần tử lớn thứ 2 trong mảng là: " + secondMax);
    }
}
