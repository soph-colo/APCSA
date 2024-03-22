/*Sophia Colonello
  5/17/21
  this program will be where most things happen. it will allow the user to run the game in a JPanel. */

 //imports - very generic but i wasn't always sure what i would need
   import java.awt.*;
   import java.awt.event.*;
   import javax.swing.*;
   import java.util.*;

  public class GamePanel extends JPanel implements Runnable
  {
	  //instance variables
	  	static final int GW = 600, GH = 600;
	  	static final Dimension SS = new Dimension(GW,GH);
	  	static final int AD = 10;
	  	static final int SW = 20, SH = 30;
	  	Thread gameThread;
	  	Image image;
	  	Graphics graphics;
	  	Random random;
	  	Player player;
	  	Asteroid[] a;
	  	Score score;

	  //constructor
	  	public GamePanel()
	  	{
			//object items
			  newAsters();
			  newShip();
			  score = new Score(GW,GH);

		    //panel items
			  this.setFocusable(true);
			  this.addKeyListener(new AL());
			  this.setPreferredSize(SS);
			  gameThread = new Thread(this);
			  gameThread.start();
	  	}

	  //method to make new ship (used for restarts and very beginning)
		public void newShip()
		{
			player = new Player((GW-SH)/2,GH-SH, SW, SH);
		}

	  //method to make new Asteroids (used for restarts and very beginning)
		public void newAsters()
		{
			a = new Asteroid[10];
			Random rn = new Random();
	        for(int i = 0; i < a.length;i++)
			  	a[i] = new Asteroid(rn.nextInt(40)+-30,rn.nextInt(500)+50,AD, rn.nextInt(4)+1);
		 }

	  //method to paint the basic panel
		public void paint(Graphics g)
        {
			image = createImage(getWidth(),getHeight());
		  	graphics = image.getGraphics();
		  	draw(graphics);
		  	g.drawImage(image,0,0,this);
	    }

	  //method to draw the objects ONTO the panel
	  	public void draw(Graphics g)
	    {
			player.draw(g);
		  	for(int i = 0 ; i < a.length; i++)
		  		a[i].draw(g);
		  	score.draw(g);
	    }

	  //method to move the objects at an (sometimes) appropriate speed - haha
	  	public void move()
	  	{
			player.move();
		  	for(int i = 0; i < a.length; i++)
		  		a[i].move();
	  	}

	  //method to check the boundaries as well as collisions - winning and losing
		public void checkCollision()
		{
			if(player.y <= 0)
		  	{
				player.y = 0;
				score.score++;
				newShip();
				newAsters();
		  	}
		  	if(player.y >= GH-SH)
		  		player.y = GH-SH;

		  	//check for collisions
		  	  for(int i = 0; i < a.length; i++)
		  	  {
				  if(a[i].intersects(player))	//perfect method for this! - inherited from rectangle class
		  		  {
					  newShip();
		  			  newAsters();
				  }
			  }

	  	  }


	  //needed to override the run method of the runnable interface - got this from a video tutorial
	  	public void run()
	  	{
			  long lastTime = System.nanoTime();
			  double amountOfTicks = 60;
			  double ns = 1000000000/amountOfTicks;
			  double delta = 0;

			  while(true)
			  {
				  long now = System.nanoTime();
				  delta += (now)-lastTime/ns;
				  lastTime = now;
				  if(delta >= 1)
				  {
					  move();
					  checkCollision();
					  repaint();
					  delta--;
				  }
			  }
	  	}

	  //creating own action listener class with proper key pressed and key released methods
	  	public class AL extends KeyAdapter
	  	{
			public void keyPressed(KeyEvent e)
			{
				player.keyPressed(e);
			}
			public void keyReleased(KeyEvent e)
			{
				player.keyReleased(e);
			}
	  	}

	 //main method for the game
	   public static void main(String[] args)
	   {
		   new GameFrame();

	   }

  }
