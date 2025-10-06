import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

    System.out.print("Enter Employee Number: ");
    int empNum = input.nextInt();

    System.out.println("How many hours did you work for this week?");
    int hours = input.nextInt();

    System.out.println("What is your regular pay rate?");
    double rate = input.nextDouble();

    Employee emp = new Employee(empNum, rate);

    double regularPay = emp.calculateRegularPay(hours);
    double overtimePay = emp.calculateOvertimePay(hours);

    System.out.println("Reular pay is: " + regularPay);
    System.out.println("Overtime pay is: " + overtimePay);
    }
}    
