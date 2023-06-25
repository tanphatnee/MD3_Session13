package bt.bt2_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) Math.ceil(Math.random() * 10));
        }
        Collections.sort(list);
        System.out.println("Mảng: " + list);
        System.out.print("Nhập vào số bạn muốn tìm: ");
        int target = new Scanner(System.in).nextInt();
        int index = search(list, target);
        if (index == -1) {
            System.out.println("Không tìm thấy phần tử " + target + " trong mảng " + list);
        } else {
            System.out.println(target + " nằm tại vị trí " + (index - 1) + " trong mảng " + list);
        }
    }

    public static int search(ArrayList<Integer> list, int target) {
        int current = 0;
        int next = list.size() - 1;
        while (current <= next) {
            int mid = (current + next) / 2;
            if (list.get(mid) == target) {
                return mid;
            } else if (list.get(mid) < target) {
                current = mid + 1;
            } else {
                next = mid + 1;
            }
        }
        return -1;
    }
}
