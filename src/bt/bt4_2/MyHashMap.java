package bt.bt4_2;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            map.put(i + 1, "index: " + i);
        }
        System.out.println("Mảng cũ: " + map);

        Map<Integer, String> newMap = new HashMap<>();
        newMap.putAll(map);
        System.out.println("Mảng mới: " + newMap);

    }
}
