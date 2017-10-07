import java.util.Scanner;
public class gramCalculator
{
   public static void main (String [] args)
   {
      int calories, fatGrams, caloriesFmFat;
      double percentage;     
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Hi there, can you please give the number of calories");
      calories = input.nextInt();
      
      System.out.println("Me again, can you please give the number of fat grams");
      fatGrams = input.nextInt();
      
      caloriesFmFat = fatGrams * 9;
      percentage = (caloriesFmFat / calories) * 100 ;
      
      if (caloriesFmFat > calories )
      {
         System.out.println("The input is invalid");
      }
      
      if (percentage < 30)
      {
         System.out.println("The food is low in fat");
         System.out.println("The percentage of the calories that come from fat are: " + percentage);
      }
   }
}