/*Sophia Colonello
  5/16/21
  this program will hold all the info for asteroids flying across the screen.  */

  import java.awt.*;
  import java.awt.event.*;
  import javax.swing.*;
  import java.util.*;


  public class Asteroid extends Rectangle
  {
	  //variables
	  	int speed;

	  //constructor
		public Asteroid(int x, int y, int d, int speed)
	  	{
			super(x,y,d,d);
			this.speed = speed;
			move();
	  	}

	  //method to move the asteroids across the screen
		public void move()
 		{
			System.out.println("");
		  	x += speed;
	  	}


	  //method to draw the asteroids
	  	public void draw(Graphics g)
	  	{
			  g.setColor(Color.white);
			  g.fillOval(x,y,height,width);
	  	}

  }