package DayOne;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(findFactorial(a));
        scanner.close();
    }
    public static int findFactorial(int a){
        int result = a;
        while(--a>0){
            result = result * a;
        }
        return result;
    }
}