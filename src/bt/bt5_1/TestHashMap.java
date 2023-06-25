package bt.bt5_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestHashMap {
    public static void main(String[] args) {
        Map<Integer, Integer>map = new HashMap<>();
        for (int i = 0; i < 5; i++) {
           map.put(i + 1, (int) Math.ceil(Math.random() * 10));
        }

        System.out.print("Nhập vào key bạn muốn tìm: ");
        int key = new Scanner(System.in).nextInt();
        boolean test = map.containsKey(key);
        if (test) {
            System.out.println("Có tồn tại !!!");
        } else {
            System.out.println("Không tồn tại !!!");
        }
    }
}
