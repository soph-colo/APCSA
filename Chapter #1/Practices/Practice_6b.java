/*Sophia Colonello
  9/20/20
  this program will provide a list of maintenance services and then read out a message */

  import javax.swing.JOptionPane;

  public class Practice_6b
  {
	  public static void main(String[] args)
	  {
		  //creating the object and giving the user options
		  	Object[] services = {"Oil Change - $26", "Radiator Flush - $18","Transmission Flush - $80", "Inspection - $15", "Muffler Replacement - $100", "Tire Rotation -$20"};
		  	int serviceNum = JOptionPane.showOptionDialog(null, "Which service would you like?", "Joe's Automotive", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, services, services[2]);

		  //if statement
		  	if(serviceNum == 0)
		  		JOptionPane.showMessageDialog(null,"Thank you, a serviceman will be right with you to perform a(n) "+services[0], "Service", JOptionPane.INFORMATION_MESSAGE);
			else if(serviceNum == 1)
				JOptionPane.showMessageDialog(null,"Thank you, a serviceman will be right with you to perform a(n) "+services[1], "Service", JOptionPane.INFORMATION_MESSAGE);
			else if(serviceNum == 2)
				JOptionPane.showMessageDialog(null,"Thank you, a serviceman will be right with you to perform a(n) "+services[2], "Service", JOptionPane.INFORMATION_MESSAGE);
			else if(serviceNum == 3)
				JOptionPane.showMessageDialog(null,"Thank you, a serviceman will be right with you to perform a(n) "+services[3], "Service", JOptionPane.INFORMATION_MESSAGE);
			else if(serviceNum == 4)
				JOptionPane.showMessageDialog(null,"Thank you, a serviceman will be right with you to perform a(n) "+services[4], "Service", JOptionPane.INFORMATION_MESSAGE);
			else if(serviceNum == 5)
				JOptionPane.showMessageDialog(null,"Thank you, a serviceman will be right with you to perform a(n) "+services[5], "Service", JOptionPane.INFORMATION_MESSAGE);
	  }
  }