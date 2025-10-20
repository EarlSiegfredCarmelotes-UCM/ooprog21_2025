import java.util.Scanner;

public class BankBalance
{
    public static void main(String[] args) 
    {
        final double INTEREST_RATE = 0.03;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial bank balance > ");
        double balance = input.nextDouble();

        int year = 0;

        System.out.print("Do you want to see next year's balance?\nEnter 1 for yes or any other number for no >> ");
        int choice = input.nextInt();

        while (choice == 1) 
        {
            year++;
            balance = balance + (balance * INTEREST_RATE);
            System.out.printf("After year %d at %.2f interest rate, balance is $%.1f%n",
                              year, INTEREST_RATE, balance);

            System.out.print("Do you want to see the balance at the end of another year?\nEnter 1 for yes or any other number for no >> ");
            choice = input.nextInt();
        }

        input.close();
    }
}
