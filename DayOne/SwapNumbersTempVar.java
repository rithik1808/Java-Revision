package DayOne;

import java.util.Scanner;

public class SwapNumbersTempVar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Before Swap : "+a+" "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap : "+a+" "+b);
        scanner.close();
    }
}
