/*Sophia Colonello
  5/17/21
  this program will keep track of the score*/

  import java.awt.*;
  import java.awt.event.*;
  import javax.swing.*;
  import java.util.*;

  public class Score extends Rectangle
  {
	  //variables
	  	static int GW, GH;
	  	static int score;

	  //constructor
	  	public Score(int GW, int GH)
	  	{
			this.GW = GW;
			this.GH = GH;
	  	}

	  //drawing the score
		public void draw(Graphics g)
		{
			g.setColor(Color.white);
		  	g.setFont(new Font("Roboto", Font.PLAIN, 60));
		  	g.drawString(String.valueOf(score),20,50);
	  	}
  }