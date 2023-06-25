package bt.bt3_2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Hiếu");
        map.put(5, "Giang");
        map.put(2, "Long");
        map.put(4, "Hùng");
        map.put(3, "Phát");
        System.out.println("Trước khi sắp xếp: " + map);
        Map<Integer, String> treeMap = new TreeMap<>(map);
        System.out.println("Sau khi sắp xếp: " + treeMap);
    }
}
