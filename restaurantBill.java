import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class restaurantBill
{
   public static void main (String [] args)
   {
      String temp;
      int priceMeat;
      double Totaltax;
      double Totaltip;
      double totalBill;
      
      DecimalFormat df = new DecimalFormat("#.##");

      
      temp = JOptionPane.showInputDialog("Can you please provide me with the price of the meal");
      priceMeat=Integer.parseInt(temp);
      
      Totaltax = (priceMeat * 6.75)/100;
      Totaltip = (priceMeat + Totaltax ) * 0.20;
      totalBill = (priceMeat + Totaltax + Totaltip);
      
      
      JOptionPane.showMessageDialog(null, "     Your are all set     \n\n" +                                          
                                          " \nSubtotal:   " + "              $"+priceMeat +
                                          "\nSales Tax (6.75%):     " + df.format(Totaltax) +
                                          "\nTotal Tip (20 %):      " + "  " + df.format(Totaltip) +
                                          "\n\nGrand Total:   " + "         $" + df.format(totalBill));
   }
}
   
