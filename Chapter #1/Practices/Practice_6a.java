/*Sophia Colonello
  9/20/20
  this program will create dialog boes that allow the user to enter the wholesale cost of an item and then its
  markup percentage, then the program will dispay the retail price and continue to use dialog boxes to ask questions. */

  import javax.swing.JOptionPane;
  import java.text.*;

  public class Practice_6a
  {
	  public static void main(String[] args)
	  {
		  //decimal format
		  	DecimalFormat df = new DecimalFormat("#,###.00");
		  //wholesale price
		  	double wholesale = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the wholesale price.", "Wholesale",JOptionPane.QUESTION_MESSAGE));

		  //markup percetage
		  	double markup = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the markup percentage.","Markup",JOptionPane.QUESTION_MESSAGE));

		  //displaying item retail price
		  	double retail = markup/100*wholesale+wholesale;

		  	JOptionPane.showMessageDialog(null,"The retail price is $"+df.format(retail),"Retail",JOptionPane.INFORMATION_MESSAGE);

		  //seeing if the would like to purchase
		    int answer = JOptionPane.showConfirmDialog(null,"Do you want to purchase?","Purchase?",JOptionPane.YES_NO_OPTION);

		  //if else statement to determine what is next
		  	if(answer == 0)
				JOptionPane.showMessageDialog(null, "Thank you! The price has been adjusted.", "Bought", JOptionPane.INFORMATION_MESSAGE);
			else
				JOptionPane.showMessageDialog(null, "The price will stay the same.", "Not bought", JOptionPane.INFORMATION_MESSAGE);
	  }

  }