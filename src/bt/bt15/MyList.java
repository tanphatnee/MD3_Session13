package bt.bt15;

import java.util.Scanner;

public class MyList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chuỗi");
        String str = sc.nextLine();
        String [] words =str.split("a");
        String max="";
        for(String word :words){
            if(word.length() > max.length()){
                max=word;
            }
        }
        System.out.println("a"+max);

    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập chuỗi:");
//        String input = sc.nextLine();
//
//        String[] words = input.split("a");
//        String maxLengthString = "";
//
//        for (String word : words) {
//            if (word.length() > maxLengthString.length()) {
//                maxLengthString = word;
//            }
//        }
//
//        System.out.println("Chuỗi có độ dài lớn nhất là: a" + maxLengthString);
//    }
}
