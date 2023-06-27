package bt.bt1;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int []arr = getArr();
        System.out.println(Arrays.toString(arr));
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max) {
                max=arr[i];
            }
        }
        System.out.println("Max: " + max);
    }

    private static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*100);
        }
        return arr;
    }


}
