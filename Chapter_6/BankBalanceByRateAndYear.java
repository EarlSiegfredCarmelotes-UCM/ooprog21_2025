import java.util.Scanner;

public class BankBalanceByRateAndYear 
{
       public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       
       
         System.out.print("Enter Intial Balance: ");
         double initialBalance = input.nextDouble();
       
       for (int rate = 2; rate <= 5; rate++) {
         System.out.printf("%nWith an initial balance of %.1f at an interest rate of %d%%%n", initialBalance, rate);
         
         double balance = initialBalance;
         
       for (int year = 1; year <= 4; year++) {
         double interest = (balance * rate / 100.0);
         balance += interest;
         System.out.printf("After year %d balance is $%.4f%n", year, balance);
               
         }
       
       }
       
     input.close();
       
    }
}