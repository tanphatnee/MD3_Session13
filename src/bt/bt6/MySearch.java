package bt.bt6;

import java.util.Arrays;
import java.util.Collection;
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
        Integer []arr = getArr();
        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần tìm:");
        Integer a = sc.nextInt();
        sc.nextLine();
        System.out.println(search(arr,a));
    }
    private static int search(Integer []arr, Integer value){
        Integer low = 0;
        Integer high = arr.length-1;
        while (low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == value){
                return mid;
            }else if(arr[mid]>value){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
}
