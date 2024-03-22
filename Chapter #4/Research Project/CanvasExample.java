/*Veronica Pimenova and Sophia Colonello
 12/19/20
 Period 6
 This program will show a Canvas Example.*/

 //imports
   import java.awt.Canvas;
   import java.awt.Graphics;
   import java.awt.Color;
   import java.awt.Font;
   import javax.swing.JFrame;
   import java.util.Scanner;

   public class CanvasExample extends Canvas
   {
	   public static void main(String args[])
	   {
		   //set up jframe, canvas, and scanner
		  	JFrame jf = new JFrame("My Drawing");
		  	JFrame jf2 = new JFrame("My Drawing 2");
		  	Canvas c = new CanvasExample();
	  	  	Scanner sc = new Scanner(System.in);

           //user input
	  	    System.out.println("Welcome to the example! Please hit enter to see the graphic: ");
	  	  	sc.nextLine();

	  	  //setting up our window or example 1
	  	  	jf.add(new MyCanvas());
	  	  	jf.setSize(500,500);
	  	  	jf.setVisible(true);

           //user input
	  	    System.out.println("Please hit enter to see the second graphic: ");
	  	  	sc.nextLine();

	  	  //setting up our window for example 2
		  	jf2.add(new MyCanvas2());
		  	jf2.setSize(850, 700);
		  	jf2.setVisible(true);

	  }
    }
    class MyCanvas extends Canvas
    {
		public MyCanvas()
		{
			//setting te background color
				setBackground(Color.green);

			//setting the size
				setSize(500,500);

		}
		public void paint(Graphics g)
		{
			//setting the color
				g.setColor(Color.red);
				g.drawLine(10,300,475,300);
				g.drawOval(100,50,270,110);
				g.setColor(Color.white);
             /*setFont()
		         -this method sets the font
		         -basic fonts...
		            -bold
		            -italic
		            -timesroman
          			-helvetica */
				g.setFont(new Font("Bold", 100, 50));
				g.drawString("Happy Holidays!", 50, 250);

		}

	}
	class MyCanvas2 extends Canvas
	{
		public MyCanvas2()
		{
			//set the background color
	     		setBackground(Color.pink);
	  	}

	  	public void paint(Graphics g)
	  	{
			//create a green circle, an oval, and a shape
			 g.setColor(Color.green);
	    	 g.fillOval(200, 200, 350,350);
	    	 g.setColor(Color.red);
	    	 g.drawLine(10,10,100,10);
	    	 g.drawLine(10,10,100,100);
	    	 g.drawLine(100,10,10,100);
	    	 g.drawLine(10,100,100,100);

           //write words in a font and draw a few shapes
	    	 g.setFont(new Font("Monaco", 105, 20));
			 g.drawString("This is a circle.", 310, 370);
			 g.drawOval(500,500,100,100);
			 g.drawOval(200,200,50,50);
			 g.setColor(Color.blue);
			 g.drawOval(200,80,200,40);
			 g.setColor(Color.yellow);
			 g.fillOval(700,60,50,50);
			 g.fillOval(400,300,40,40);
       }

    }