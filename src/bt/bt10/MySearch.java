package bt.bt10;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MySearch {
    private static Integer[] getArr(){
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*100);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }

    public static void main(String[] args) {
        Integer[] arr = getArr();
        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào min:");
        int min = sc.nextInt();
        System.out.println("Nhập vào max:");
        int max = sc.nextInt();
        System.out.println("Số gần nhất sau min có vị trí là: "+ searchMin(arr,min));
        System.out.println("Số gần nhất trước max có vị trí là: "+ searchMax(arr,max));
    }

    private static int searchMax(Integer[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == value) {
                return mid - 1;
            } else if (arr[mid] > value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    private static int searchMin(Integer[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == value) {
                return mid + 1;
            } else if (arr[mid] > value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }
}
