package bt.bt7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        List<String> string = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập đoạn văn:");
        String str = sc.nextLine();

        String [] words = str.split(" ");
        for (int i= 0;i<words.length;i++) {
            string.add(words[i]);
        }
        System.out.println(string);

        System.out.println("Nhập chuỗi cần tìm:");
        String keywords = sc.nextLine();
       for (int i=0;i<words.length;i++) {
           if (words[i].equals(keywords)) {
               System.out.println(i);
           }
       }

    }
}
