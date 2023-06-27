package bt.bt14;

import java.util.Arrays;
import java.util.Scanner;

public class MyList {

    public static void main(String[] args) {
        int[] arr = {1,3,6,8,3,7,4,5,9,3,6,8,34};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần tìm:");
        int num = sc.nextInt();
        System.out.println(binarySearch(arr, num));
    }

    private static int binarySearch(int [] arr,int value) {
        int left = 0;
        int right = arr.length-1;
        while (left <= right) {
            int middle = (left+right) / 2;
            if(arr[middle]==value){
                return middle;
            }else if(arr[middle] > value) {
                left = middle+1;
            }else {
                right=middle-1;
            }
        }
        return -1;
    }
}

