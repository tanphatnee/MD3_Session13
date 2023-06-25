package bt.bt10;

import java.util.Map;
import java.util.TreeMap;

public class RemoveTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Hoa");
        treeMap.put(2, "Hồng");
        treeMap.put(3, "Nhung");
        treeMap.put(4, "My");
        treeMap.put(5, "Ánh");

        System.out.println("TreeMap ban đầu:");
        getTreeMap(treeMap);


        treeMap.remove(3);

        System.out.println("TreeMap sau khi xóa phần tử với khóa là 3:");
        getTreeMap(treeMap);
    }

    private static void getTreeMap(TreeMap<Integer, String> treeMap) {
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
