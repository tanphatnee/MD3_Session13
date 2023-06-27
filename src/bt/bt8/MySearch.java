package bt.bt8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MySearch {
    private static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*100);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = getArr();
        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào min:");
        int min = sc.nextInt();
        System.out.println("Nhập vào max:");
        int max = sc.nextInt();
        List<Integer> newArray = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++){
            if(arr[i] >= min&&arr[i] <= max){
                newArray.add(arr[i]);
            }
        }
        System.out.println(newArray);
    }
}
