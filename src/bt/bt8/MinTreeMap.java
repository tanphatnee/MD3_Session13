package bt.bt8;

import java.util.TreeMap;

public class MinTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(5, 1);
        treeMap.put(2, 2);
        treeMap.put(8, 3);
        treeMap.put(1, 4);
        treeMap.put(9, 5);
        treeMap.put(3, 6);


        int min = treeMap.firstKey();

        System.out.println("Phần tử nhỏ nhất trong TreeMap là: " + min);
    }
}
