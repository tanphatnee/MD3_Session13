package bt.bt13;

import java.util.*;

public class MySearch {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập chuỗi :");
//        String str = sc.nextLine();
//
//        List<String> strings= new ArrayList<>();
//        String []chars = str.split("");
//        for (int i = 0; i < chars.length; i++) {
//            if(!chars[i].equals(" ")) {
//                strings.add(chars[i]);
//            }
//        }
//        Collections.sort(strings);
//        System.out.println(strings);
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi:");
        String str = sc.nextLine();

        List<String> strings = new ArrayList<>(Arrays.asList(str.replaceAll("\\s", "").split("")));

        Set<String> uniqueStrings = new TreeSet<>(strings);
        System.out.println(strings);
        System.out.println(uniqueStrings);
    }
}
