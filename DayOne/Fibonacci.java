package DayOne;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(Arrays.toString(findFibonacci(n)));
        scanner.close();
    }

    public static int[] findFibonacci(int n){
        int array[] = new int[n];
        array[0] = 1;
        array[1] = 1;
        for(int i=2;i<n;i++){
            array[i]=array[i-1]+array[i-2];
        }
        return array;
    }
}
