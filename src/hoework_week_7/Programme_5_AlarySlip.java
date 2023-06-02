package hoework_week_7;

import java.util.Scanner;

/**
 * WAP to input employee id ,name,basic salary then find HRA,TA,DA,PF and Gross
 * Salary
 * HRA =Basic salary 10%
 * DA =Basic sa;ary 8%
 * Ta =Basic salary 9%
 * PF = Basic salary 20%
 * Gross salary = Basic salary+HRA+TA+DA-PF
 * Print in the following format
 *  | Salary Slip |
   * |______________________________|
  * | Employee Id : 2564 |
  * | Employee Name : Jay |
  * |______________________________|
  * | Basic Salary : 25000.0 |
  * | HRA 10% : 2500.0 |
  * | DA 8% : 2250.0 |
  * | TA 9% : 2000.0 |
  * | PF - 20%; : 5000.0 |
  * |______________________________|
  * | Gross Salary : 26750.0 |
  * |===========================|
 */
public class Programme_5_AlarySlip {
    public static void main(String[] args) {
        //Scanner declaration for reading input frim console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ypur name : ");
        String name = scanner.nextLine();
        System.out.println("Enter your Employee ID :");
        int employeeId =scanner.nextInt();
        System.out.println("Enter basic salary :");
        double basicSalary =scanner.nextDouble();
        //Calculating HRA,DA,TA,Pf
        double hRA =calculateHRA(basicSalary);
        double da = calculateDA(basicSalary);
        double ta = calculateTA (basicSalary);
        double pf = calculatePf(basicSalary);
        //Calculating the gross salary
        double grossSalary = basicSalary+hRA+da+ta-pf;
        System.out.println("---------------------------------------");
        System.out.println("|Salary Slip                          |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Employee ID:" + employeeId + "                     |");
        System.out.println("|Employee Name:" + name + "                    |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Basic Salary: " + basicSalary + "                |");
        System.out.println("|HRA 10%     : " + hRA + "                 |");
        System.out.println("|TA 8%       : " + ta + "                 |");
        System.out.println("|DA 9%       : " + da + "                 |");
        System.out.println("|PF -20%     : " + pf + "                |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Gross Salary: " + grossSalary + "                |");
        System.out.println("|-------------------------------------|");
        // Closing scanner object
        scanner.close();
    }
    //Calculating HRA
    public static double calculateHRA (double basicSalary){
        return (basicSalary*10)/100;}
    //calculate hRA
    public static double calculateDA( double basicSalary){
       return (basicSalary*8)/100;
    }
    //calcualting /TA
    public static double calculateTA(double basicSalary){
        return (basicSalary*9)/100;
}
//Calculate PF
    public static double calculatePf( double basicSalary){
        return (basicSalary*20)/100;
    }
}
