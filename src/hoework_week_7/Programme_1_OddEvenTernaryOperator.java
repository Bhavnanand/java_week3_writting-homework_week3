package hoework_week_7;

import java.util.Scanner;

/**
 * 1.Write a javam program that tells us that input number is odd or even?
 * Hint :Use ternary operator(? :)
 * */

public class Programme_1_OddEvenTernaryOperator {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number :");
        int number = scanner.nextInt();
        isItOddOrEvenNumber(number);
        //closing the scanner object
        scanner.close();
    }
    //checking ther number is even or odd
    public  static  void isItOddOrEvenNumber(int number){
        // ternary operator is used
        String evenOrOdd = (number%2 == 0)? "Even"
:"Odd";
        System.out.println("The" +number +"is"+evenOrOdd +"number");}
}
