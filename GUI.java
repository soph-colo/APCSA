/*Sophia Colonello
  */
  import javax.swing.*;
  import java.awt.*;
  import java.awt.event.*;

  public class GUI implements ActionListener
  {
	  private int count = 0;
	  private JLabel label;
	  private JLabel label2;
	  private JLabel label3;
	  private JTextField text;
	  public GUI()
	  {
		  //frame and penl
           JFrame frame = new JFrame("Frame");
           JPanel panel = new JPanel();

		 //first label
           label2 = new JLabel("Count the clicks");

		//button
           JButton button = new JButton("Click me");
           button.addActionListener(this);

		//text insert
		   text = new JTextField(20);

		  //second label
           label = new JLabel("Number of clicks: 0");

          //third label ESCAPE CODES DON'T WORK..
          	label3 = new JLabel("\nCategories\nOnes\nTwos...");

          //text area -- BOX ON TOP? idk
			JTextArea textArea = new JTextArea(5, 20);
			textArea.append("\nCategories\nOnes\nTwos...");
			JScrollPane scrollPane = new JScrollPane(textArea);
			textArea.setEditable(true);

		//message popups
			JOptionPane.showMessageDialog(frame, "ERROR!.");
			JOptionPane.showMessageDialog(null, "Hello World!", "Hello", JOptionPane.INFORMATION_MESSAGE);
			String fullName = JOptionPane.showInputDialog(null, "Enter your full name.", "Name", JOptionPane.QUESTION_MESSAGE);
			int lunch = Integer.parseInt(JOptionPane.showInputDialog("What lunch period do you have?")); //for integer
			int ans = JOptionPane.showConfirmDialog(null, "Do you like this class?", "Class Favorites", JOptionPane.YES_NO_CANCEL_OPTION); //rolling dice
			Object[] classes = {"English", "Math", "Programming", "Science"};
			int numFav = JOptionPane.showOptionDialog(null, "Which is your favorite class?", "Class Favorites", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, classes, classes[2]);
			Object[] possibilities = {"the best", "okay", "the worst"};
			String s = (String)JOptionPane.showInputDialog(null, "Seneca Valley is...", "SV", JOptionPane.PLAIN_MESSAGE, null, possibilities, "the best");

		//setting up the panel (have to add things)
           panel.setBorder(BorderFactory.createEmptyBorder(100,100,100,100));
		   panel.setLayout(new GridLayout(0,1));
		   panel.add(text);
		   panel.add(textArea);
		   panel.add(label2);
		   panel.add(button);
		   panel.add(label);
		   panel.add(label3);

		//setting up the frame
		   frame.add(panel, BorderLayout.CENTER);
		   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   frame.setTitle("Title");
		   frame.pack();
		   frame.setVisible(true);

	  }
	  public static void main(String[] args)
	  {
		  new GUI();


	  }
	  public void actionPerformed(ActionEvent e)
	  {
		  count++;
		  label.setText("Number of clicks: "+count);
	  }

  }