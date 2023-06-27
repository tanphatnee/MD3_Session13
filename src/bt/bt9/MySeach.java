package bt.bt9;

import java.util.Arrays;
import java.util.Scanner;

public class MySeach {
    private static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*100);
        }
        Arrays.sort(arr);
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
        System.out.println("Số gần nhất sau min có vị trí là: "+ searchMin(arr,min));
        System.out.println("Số gần nhất trước max có vị trí là: "+ searchMax(arr,max));
    }

    private static int searchMin(int[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == value) {
                return mid + 1;
            } else if (arr[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        // Nếu không tìm thấy giá trị gần nhất sau `min`, trả về vị trí của giá trị đầu tiên lớn hơn `min`
        return low;
    }

    private static int searchMax(int[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == value) {
                return mid - 1;
            } else if (arr[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        // Nếu không tìm thấy giá trị gần nhất trước `max`, trả về vị trí của giá trị cuối cùng nhỏ hơn `max`
        return high;
    }
}
