package th.th2;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = scanner.nextLine();

        int [] fchar = new int[255];
        for(int i = 0;i< input.length();i++) {
            int ascii = (int)input.charAt(i);
            fchar[ascii] += 1 ;
        }

        int max = 0;
        char character = (char) 255;
        for (int j = 0;j<255;j++){
            if (fchar[j]>max){
                max = fchar[j];
                character  = (char)j;
            }
        }
        System.out.println("The most appearring letter is " + character  +" with " + max+ " times");
    }
}
