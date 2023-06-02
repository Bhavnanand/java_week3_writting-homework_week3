package hoework_week_7;

import java.util.Scanner;

/**
 * Write a jave program input seller id,seller name ,saler amount and basic salary
 * then find this sales
 * commission
 * Sales amount &gt >= 50,000 35%
 * Sales amount &gt;> 30,000 20%
 * &gt >= 20,000 10%
 * &gt>= 10,000 5%
 * &gt<10,000 2%
 *
 */
public class Programme_7_SalesCommission {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter seller name: ");
        String name = scanner.nextLine();
        System.out.println("Enter seller ID : ");
        int sellerId = scanner.nextInt();
        System.out.println("Enter the sales amount : ");
        int salesAmount = scanner.nextInt();
        System.out.println("Enter the basic Salary :");
        int basicSalary = scanner.nextInt();
        // creating a object to call instance method
        Programme_7_SalesCommission salesCommission = new Programme_7_SalesCommission();
        int grossSalary = basicSalary + salesCommission.calculateCommission(salesAmount);
        System.out.println("Seller name is  :" + name);
        System.out.println("Seller Id is  :" + sellerId);
        System.out.println("Seller's sale sales amount :" + salesAmount);
        System.out.println("Seller's basic salary is :" + basicSalary);
        System.out.println("Seller's gross salary is" + grossSalary);
        //closing the scanner object
        scanner.close();
    }
    //calculating the sales commission
    public int calculateCommission (int salesAmount){
        int commission;
        if (salesAmount>= 50000){
            commission =(salesAmount*35)/100;
            System.out.println("Sales commission is "+commission);
        } else if (salesAmount>= 30000){
            commission =(salesAmount*30000)/100;
            System.out.println("Sales commission is "+commission);
        }  else if (salesAmount>=20000){
            commission = (salesAmount*10)/100;
            System.out.println("Sales commission is "+commission);
        } else if (salesAmount>=10000){
            commission = (salesAmount*5)/100;
            System.out.println("Sales commission is "+commission);
        } else {
            commission = (salesAmount*2)/100;
            System.out.println("Sales commission is "+commission);
        }
        return commission;
    }
}