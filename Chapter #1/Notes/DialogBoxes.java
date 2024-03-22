/*Mrs. Krauland
  9/17/2015
  This program will show students how to use dialog boxes. */

import javax.swing.JOptionPane;

public class DialogBoxes
{
	public static void main(String[] args)
	{
		/*We can also use Dialog Boxes to get/give information from/to the user

		  What is the import that is needed for Dialog boxes?
		  	import javax.swing.JOptionPane;

		  What is the code to display a message?
		  	JOptionPane.showMessageDialog(null, "MESSAGE", "TITLE BAR TITLE", Message Type);
		  		- null puts it in the center of the screen

		  		-Message Types:
		  			INFORMATION_MESSAGE
		  			WARNING_MESSAGE
		  			DEFAULT_OPTION
		  			QUESTION_MESSAGE */

		  JOptionPane.showMessageDialog(null, "Hello World!", "Hello", JOptionPane.INFORMATION_MESSAGE);


		/*What is the code to input from the user?
			JOptionPane.showInputDialog("MESSAGE");
				null, title bar, and message type are not required but you can still put them in
				Always returns a string */

			String fullName = JOptionPane.showInputDialog(null, "Enter your full name.", "Name", JOptionPane.QUESTION_MESSAGE);
																 //MESSAGE				//TITLE BAR		//MESSAGE TYPE

			String strGrade = JOptionPane.showInputDialog(null, "Enter what grade you are in", "Enter grade number");
				int grade = Integer.parseInt(strGrade);

			int lunch = Integer.parseInt(JOptionPane.showInputDialog("What lunch period do you have?"));

		/*Confirm Dialog:
			- Ask a yes/no question
			- return an integer
				- If the user clicks Yes, a 0 is returned
				- If the user click No, a 1 is returned

			JOptionPane.YES_NO_CANCEL_OPTION

			JOptionPane.YES_NO_OPTION */

			int ans = JOptionPane.showConfirmDialog(null, "Do you like this class?", "Class Favorites", JOptionPane.YES_NO_CANCEL_OPTION);


			/*We want to create our own options for the buttons:
			  Can create an object:*/

			  Object[] classes = {"English", "Math", "Programming", "Science"};
			  int numFav = JOptionPane.showOptionDialog(null, "Which is your favorite class?", "Class Favorites", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, classes, classes[2]);
																																													  //object    button highlighted

			Object[] possibilities = {"the best", "okay", "the worst"};
			String s = (String)JOptionPane.showInputDialog(null, "Seneca Valley is...", "SV", JOptionPane.PLAIN_MESSAGE, null, possibilities, "the best");

		//What is needed at the end of the program for dialog boxes?
			System.exit(0);
	}
}