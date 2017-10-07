import java.util.Scanner;
public class magicDay
{
   public static void main (String [] args)
   {
      int day, month, year;
      String magic;
      
      Scanner input = new Scanner(System.in);
      
      
      System.out.println("please enter the day");
      day = input.nextInt();
      
      System.out.println("please enter a month in numeric form");
      month = input.nextInt();
      
      System.out.println("please enter the last two number of the year");
      year = input.nextInt();
      
      if ((day * month) == year)
      {
         magic = "The date is magic";
          System.out.println(magic);

      }else
      {
         magic = "The date is no magic";
         System.out.println(magic);

      }

      
   }
}