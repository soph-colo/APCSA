/*Sophia Colonello and Veronica Pimenova
  12/13/20
  This program will demonstrate how to use the Canvas class. */


 /*Introduction: The Canvas class in Java is used to make a rectangular area that
   				 can then be drawn on. It is commonly used with other classes in order
   				 to provide maximum efficiency and easier use for the user.

   IMPORT:
   			The first step to using a Canvas class is to have the proper imports.
			The specific import we will use for the Canvas class itself is
			'import java.awt.Canvas;'
			This is part of the java.awt packages that can be imported into a program.
			After that, there are several more imports that are representative of the other classes
			commonly used with Canvas in Java.*/

  //imports Canvas
  import java.awt.Canvas;

  //imports Graphics, Color, and Font (may be used with Canvas)
  import java.awt.Graphics;
  import java.awt.Color;
  import java.awt.Font;

  //imports javax.swing package JFrame (also may be used with Canvas)
  import javax.swing.JFrame;

  import java.util.Scanner;


  /*EXTEND CANVAS:  The next important step of using the Canvas class is 'extend', which allows
  					us to use Canvas in our program.*/
  public class CanvasPractice extends Canvas
  {
	  //this is just the standard call for a main method
	  public static void main(String args[])
	  {

		  /*CONSTRUCTORS: The next step of using the Canvas is to make a JFrame constructor.
		  				  The object JFrame must be used for the constructor in order for the pop up box to be made*/

		  	//names the window
	  		JFrame fr = new JFrame("My Drawing");
	  		JFrame fr2 = new JFrame("My Drawing 2");

	  		//Additionally, we must use a Canvas object, which is set to the program name.
	  		Canvas ca = new CanvasPractice();

	  		Scanner sc = new Scanner(System.in);


			/*Now, we can get to the fun part. Here is an example of how to use the Canvas window we have
			made to make a rectangle.
				EXAMPLE 1:*/

				System.out.println("Press enter to see our first graphic");
				sc.nextLine();

		  	/*add()
		  		-adds the design from the MyCanvas class (found below)*/
    			fr.add(new MyCanvas());

    		/*setSize()
    			-sets the size of the window
    			-(x,y)*/
    			fr.setSize(400, 400);

    		/*setVisible()
    			-default is FALSE
    			-needs to be changed to TRUE so that we can see */
    			fr.setVisible(true);


		  /*EXAMPLE 2: this will change some things up...
		  		-bigger canvas
		  		-black background
		  		-red rectangle
		  		-pink string*/
			System.out.println("Press enter to see another graphic");
			sc.nextLine();

    			fr2.add(new MyCanvas2());
    			fr2.setSize(500,500);
    			fr2.setVisible(true);


	  }
   }
   /*Now that we've called the imports and set the constructors, we can make
   a method called MyCanvas with submethods that set the size, background color, and other
   fun things!*/

   class MyCanvas extends Canvas //don't forget extend canvas!
   {
  	   public MyCanvas()
  	   {
		   /*setBackground()
		   	 -this will set the background by calling the Color class
		   	 -here are all the colors...
		   	 	-black
		   	 	-blue
		   	 	-cyan
		   	 	-darkGray
		   	 	-gray
		   	 	-green
		   	 	-lightGray
		   	 	-magenta
		   	 	-orange
		   	 	-pink
		   	 	-red
		   	 	-white
		   	 	-yellow*/
           setBackground(Color.blue);

           //setting the size
           	 setSize(400, 400);
       }

	   /*This method sets the color, makes the rectangular shape, sets the font, and draws a string.*/
       public void paint(Graphics g)
       {
		   //setting the colors
  		   g.setColor(Color.green);

  		   //filling rectangular shape
  		   //other methods like this include -drawLine -drawRect -drawOval -fillOval
  		   //(x,y,width,height)
           g.fillRect(75, 75, 150, 75);
           g.drawLine(75, 75, 200, 200); //dimensions?
           g.dispose();

       }
       /*Now that we've learned a little bit about using the Canvas class in Java, let's review:

       -imports must be added (import java.awt.Canvas; and others, depending on what you want the program to do).
       -must use the words 'extends Canvas'
       -make constructors to use JFrame and Canvas
       -can add methods such as paint with different things to change the Canvas window we created

       Finally, here is a list of common methods we can call from the Canvas class:

       -setColor
       -setBackground
       -setSize
       -fillRect
       -setFont
       -drawString
       -erase
       -addMouseListener
       -addMouseMotionListener
       -fillOval

       -ADD MORE HERE AND EXPLAIN THEM*/
  }
  class MyCanvas2 extends Canvas //extend!
  {

  	   public MyCanvas2()
  	   {
		   /*setBackground()
		   	 -this will set the background by calling the Color class
		   	 - list all colors*/
           setBackground(Color.black);

           //setting the size
           	 setSize(500, 500);
       }

	   /*This method sets the color, makes the rectangular shape, sets the font, and draws a string.*/
       public void paint(Graphics g)
       {
		   //setting the colors
  		   g.setColor(Color.red);

  		   //filling rectangular shape
  		   //other methods like this include -drawLine -drawRect -drawOval -fillOval
  		   //(x,y,width,height)
           g.fillRect(75, 75, 150, 75);

		  g.setColor(Color.pink);
          /*setFont()
          	-this method sets the font
          	-basic fonts...
          		-bold
          		-italic
          		-timesroman
          		-helvetica
          	-(font name, ?, size) */
            g.setFont(new Font("timesroman", 5, 20)); //what is the middle number??

          /*drawString() -not the bag
          	-this will print out the string
          	-(string, x, y) */
            g.drawString("Hi everyone!", 150, 200);

       }

  }



