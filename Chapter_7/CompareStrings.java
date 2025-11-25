import java.util.Scanner;

public class CompareStrings
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       
       String name;
       String correctName = "Earl";
       System.out.print("Enter your name > ");
       name = input.nextLine();
       
       if(name.equals(correctName))
         System.out.println(name + " equals " + correctName);
       else
         System.out.println(name + " does not equal " + correctName);
    }
}