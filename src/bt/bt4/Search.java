package bt.bt4;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        int arr[] = {1,2,6,4,10,6,23,8,45,34};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần tìm:");
        int a = Integer.parseInt(sc.nextLine());
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                flag = true;
                index = i;
                break;
            }else {
               flag=false;
            }
        }
        if (flag == true) {
            System.out.println("Số: " + a + " có vị trí "+ index);
        }else{
            System.out.println("không có số "+ a + " trong mảng");
        }
    }
}
