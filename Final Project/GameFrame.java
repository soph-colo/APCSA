/*Sophia Colonello
  5/16/21
  this program will build the frame of the program - the outside box*/

  import java.awt.*;
  import java.awt.event.*;
  import javax.swing.*;
  import java.util.*;

  public class GameFrame extends JFrame
  {
	  //instance variables - creating panel object
	  	GamePanel panel = new GamePanel();

	  //constructor for building
	  	public GameFrame()
	  	{
			//all frame and panel settings
			  panel = new GamePanel();
			  this.add(panel);
			  this.setTitle("Space Race");
			  this.setResizable(false);
			  this.setBackground(Color.black);
			  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			  this.pack();
			  this.setVisible(true);
			  this.setLocationRelativeTo(null);

	  	}
  }
