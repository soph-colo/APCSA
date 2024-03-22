/*Sophia Colonello
  5/17/21
  this program will be the ship and handle the ship controls*/

  import java.awt.*;
  import java.awt.event.*;
  import javax.swing.*;
  import java.util.*;

  public class Player extends Rectangle
  {
	  //variables
	  	int yVel;
	  	int speed = 2;

	  //constructor - superclass Rectangle used
	  	public Player(int x, int y,int SW, int SH)
	  	{
			super(x,y,SW,SH);

	  	}

	  //keypressed and keyreleased for movement and stopping
		public void keyPressed(KeyEvent e)
	  	{
			if(e.getKeyCode() == KeyEvent.VK_UP)	//getting keycodes
			{
				setYDirection(-speed);
				move();
			}
			if(e.getKeyCode() == KeyEvent.VK_DOWN)	//getting keycodes again
			{
				setYDirection(speed);
				move();
			}
	  	}

	  	public void keyReleased(KeyEvent e)
	  	{
			if(e.getKeyCode() == KeyEvent.VK_UP)
			{
				setYDirection(0);
				move();
			 }
			 if(e.getKeyCode() == KeyEvent.VK_DOWN)
			 {
				setYDirection(0);
			    move();
			 }
	  	}

	  //method to set y direction - for movement up or down
		public void setYDirection(int y)
		{
			yVel = y;
	  	}

	  //method to move ship
		public void move()
		{
			y += yVel;
	  	}

	  //method to draw the ship
		public void draw(Graphics g)
		{
			g.setColor(Color.blue);
			g.fillRect(x,y,width,height);
		}
  }