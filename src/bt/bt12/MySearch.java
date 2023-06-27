package bt.bt12;

import java.util.Scanner;

public class MySearch {
    public static void main(String[] args) {
        double [] arr = {2.5,4.7,5.8,7.9,10.4,15.8,18.4,22.6,26.8,36.7,40.2};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần tìm:");
        double num = sc.nextDouble();
        System.out.println("Số: " + num + " có vị trí là " + search(arr,num));
        double max = 0;
        if (arr[0]<arr[arr.length-1]){
            max = arr[arr.length-1];
        }else{
            max = arr[0];
        }
        System.out.println("Số lớn nhất là: "+max);
    }

    private static int search(double arr[],double value){
        int low = 0;
        int high = arr.length - 1;
        while (low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == value){
                return mid;
            }else if(arr[mid]<value){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return -1;
    }
}
