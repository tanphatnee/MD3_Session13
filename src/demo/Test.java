package demo;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hieu");
        list.add("Khanh");
        list.add("Giang");
        list.add("Hung");
        list.add("Phat");
        System.out.println(list.indexOf("Hieu"));

        int arr[] = {1,3,5,6,8,9};
        System.out.println( binarySearch(arr,0,6,5));


    }

    public static int binarySearch(int arr[],int low,int high,int value) {
         low = 0;
         high = arr.length - 1;
        while(high>= low){
            int mid = (high+low)/2;
            if(arr[mid]==value){
                return mid;
            }
            if (arr[mid]>value){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }
}
