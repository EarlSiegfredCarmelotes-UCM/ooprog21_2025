import java.util.Scanner;

public class BankBalance2
{
       public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       
       final double INTEREST_RATE = 0.03;
       double balance;
       int year = 0;
       int choice;
       
       System.out.println("Enter Starting Bank Balance: $");
       balance = input.nextDouble();
       
       do {
          balance = balance + (balance * INTEREST_RATE);
          year++;
          System.out.println("After year " + year + ", your balance is: $" + balance);
          
          System.out.println("Do you want to see your next year balance?  (1 for yes, 0 for no)");
          choice = input.nextInt();
          
       } while ( choice  == 1 );
          System.out.println("Final balance: $" + balance);
       }
}
       
       
       