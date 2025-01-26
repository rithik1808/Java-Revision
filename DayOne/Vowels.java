package DayOne;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(numberOfVowels(s.toLowerCase()));
        scanner.close();
    }
        
    public static int numberOfVowels(String s) {
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') count++;
        }
        return count;
    }
}
