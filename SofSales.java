import java.util.Scanner;
public class SofSales
{
   public static void main(String [] args)
   {
      double discount, tolPurchase;
      int quantity;
      int retailPrice = 99; 
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Hi there, can you please give me the number of packages purchased");
      quantity = input.nextInt();
      
      if(quantity < 10 )
      {
         discount = 1;
      }
      else if(quantity >= 10 && quantity <= 19)
      {
         discount = 0.20;
      }
      else if(quantity >= 20 && quantity <= 49)
      {
         discount = 0.30;
      }
      else if(quantity >= 50 && quantity <= 99)
      {
         discount = 0.40;
      }
      else 
      {
         discount = 0.50;
      }
           
      tolPurchase = (quantity * retailPrice) * discount;
      
      if(discount == 1)
      {
         discount = 0; 
      }
      
      
      System.out.println("Got it, you got " + discount * 100  + " discount towards your " + quantity + 
                         " Units, the total amount is: " + tolPurchase);
                         
   }
}