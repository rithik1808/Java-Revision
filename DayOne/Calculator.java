package DayOne;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        scanner.nextLine();
        String operator = scanner.nextLine();
        System.out.println(calculate(number1,number2,operator));
        scanner.close();
    }
    public static double calculate(int number1,int number2, String operator) {
        double result = 0;
        switch (operator) {
            case "+":
                result = number1+number2;
                break;
            case "-":
                result = number1-number2;
                break;
            case "*":
                result = number1*number2;
                break;
            case "/":
                result = (double)number1/(double)number2;
                break;
            default:
                break;
        }
        return result;
    }
}
