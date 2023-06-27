package bt.bt3;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    private static int[][] getArr(){
        int arr[][] = new int[20][20];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j <arr[i].length; j++){
                arr[i][j] = (int)(Math.random()*100);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[][] = getArr();
        System.out.println(Arrays.deepToString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần tìm:");
        int a = sc.nextInt();
        int[] vitri = search(arr, a);
        if (vitri != null) {
            int row = vitri[0];
            int col = vitri[1];
            System.out.println("Số " + a + " có vị trí: [" + row + ", " + col + "]");
        } else {
            System.out.println("Số " + a + " không có trong mảng");
        }
    }


    private static int[] search(int[][] arr, int a) {
        for (int i = 0; i < arr.length; i++) {
            int left = 0;
            int right = arr[i].length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[i][mid] == a) {
                    return new int[]{i, mid};
                } else if (arr[i][mid] < a) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return null;
    }
}

