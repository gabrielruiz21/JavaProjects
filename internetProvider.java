import javax.swing.JOptionPane;

public class internetProvider
{
   public static void main(String [] args)
   {
      int hours, extraHours;
      double fee= 0.0;
      String temp, plan;
      
      Scanner input = new Scanner(System.in);
      
      plan = JOptionPane.showInputDialog("      hello there,\n " + 
                                         "Please provide me with the letter of the package you'd purchased");
          
      temp = JOptionPane.showInputDialog("      One more thing,\n " + 
                                         "Please provide me with the number of hours you used \n package " + plan);
      hours = Integer.parseInt(temp);
      
      if (plan.equals("A") || plan.equals("a") )
      {
         fee = 9.95;
         
         if(hours >=11)
         {
            extraHours = hours - 10 ;
            fee = 9.95 + (extraHours * 2.00);
         }
      }
      else if (plan.equals("B") || plan.equals("b"))
      {
         fee = 13.95;
         
         if(hours >= 21)
         {
            extraHours = hours - 20 ;
            fee = 13.95 + (extraHours * 1.00);
         }
      }
      else if (plan.equals("C") || plan.equals("c"))
      {
         fee = 19.95;
      }
      else 
      {
         JOptionPane.showMessageDialog(null, "We only have plans A , B and C, but you wrote : \n " + plan + "\n try again.");
         System.exit(0);
      }
      
      
      JOptionPane.showMessageDialog(null, "Alright I got your info \n This month's bill is for: \n " + fee );
      System.exit(0);
   } 
}
