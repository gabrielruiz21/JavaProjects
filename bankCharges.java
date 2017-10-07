import java.util.Scanner;
public class bankCharges
{
   public static void main(String[] args)
   {
      int baseFee = 10 , quantity;
      double checkFee = 0.0, totalFee;
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Hi, please give me the number of checks written for the month");
      quantity = input.nextInt();
      
      if (quantity <= 19)
      {
         checkFee = .10;
      }
      else if (quantity >= 20 && quantity <= 39)
      {
         checkFee = 0.08;
      }
      else if (quantity >= 40 && quantity <= 59)
      {
         checkFee = 0.06;
      }         
      else if (quantity >= 60)
      {
         checkFee = 0.04;
      }
      
      totalFee = baseFee + (quantity * checkFee);
      
      System.out.println(" the base fee is: " + "$" + baseFee + "\n" +
                         " the total check fee for " + quantity + " checks is $" + checkFee + "\n" +
                         " the total bank's service fee for the month is $" + totalFee ); 
   }
}