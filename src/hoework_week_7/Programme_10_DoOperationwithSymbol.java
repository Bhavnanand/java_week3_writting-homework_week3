package hoework_week_7;

import java.util.Scanner;

/**
 * Write a java program to input any number and ask user to entre their symbol(+,-,*,/)
 * Find afdition ,subtraction,multiplication and division according tontheir symbol
 * using if else
 */
public class Programme_10_DoOperationwithSymbol {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number :");
        int x = scanner.nextInt();
        System.out.println("Enter the second number :");
        int y = scanner.nextInt();
      System.out.println("Please select the calculation Symbol +,-,* ,/ :");
        char symbol = scanner.next().charAt(0);
        doOperationSelectingSymbol(x, y, symbol);
        //closing the scanner object
        scanner.close();
    }

    //calculating operation based on symbol
    public static void doOperationSelectingSymbol(int x, int y, char symbol) {
        if (symbol == '+') {
            System.out.println(x + "+" + y + "=" + (x +
                    y));
        } else if (symbol == '-') {
            System.out.println(x + "-" + y + "=" + (x -
                    y));
        } else if (symbol == '*') {
            System.out.println(x + "*" + y + "=" + (x *
                    y));
        } else if (symbol == '/') {
            System.out.println(x + "/" + y + "=" + (x /
                    y));
        } else {
            System.out.println("Please enter correct symbol");
        }
    }
}
