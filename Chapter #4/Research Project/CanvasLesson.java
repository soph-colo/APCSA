/*Sophia Colonello and Veronica Pimenova
  12/16/20
  Period 6
  This program will provide some information about the Canvas class and what to use with it. */


 /*INTRO:	 -The Canvas class in Java is used to make a rectangular window that the user can
 			  draw on and make graphic designs on
 			 -It is commonly used with other classes (Graphics & JFrame)
 			  to offer a range of options that are efficent for the programmer


   IMPORTS:	-The first step to using a Canvas class is to have the proper imports
   			-Most of the imports will come from the java.awt package (Abstract Windows Toolkit)
			-The specific import we will use for the Canvas class itself is 'import java.awt.Canvas;'
			-This is part of the many java.awt pacakes that can be imported into a program
				-There are many more that we will use in our examples*/

  //imports Canvas
  	import java.awt.Canvas;

  //imports Graphics, Color, and Font (may be used with Canvas)
 	import java.awt.Graphics;
 	import java.awt.Color;
 	import java.awt.Font;

  //imports javax.swing package JFrame (also may be used with Canvas)
  	import javax.swing.JFrame;

  //imports our traditional Scanner package (you all know how to do this)
  	import java.util.Scanner;


  /*EXTEND CANVAS:  -The next important step of using the Canvas class is 'extend', which allows
  					 us to use Canvas in our program.*/
  public class CanvasLesson extends Canvas
  {
	  //this is just the standard call for a main method
	  public static void main(String args[])
	  {

		  	/*CONSTRUCTORS: -The next step of using the Canvas is to make a JFrame constructor
		  				 	-The object JFrame must be used for the constructor in order for the pop up box to be made*/

		  		//JFRAME: names the window
	  				JFrame jf = new JFrame("My Drawing");

	  			//CANVAS: additionally, we must use a Canvas object, which is set to the program name
	  				Canvas ca = new CanvasLesson();

	  			//SCANNER: again, we know what this does
	  				Scanner sc = new Scanner(System.in);


			/*EXAMPLE 1: -now, we can get to the fun part, here is a very basic example of how to use the Canvas class to make
			          	 a rectangle (don't worry, it gets better than this later) */

	 			System.out.print("Press enter to see our first graphic: ");
				sc.nextLine();

				//BASIC METHODS:

		  			/*add():
		  				-adds the design from the MyCanvas class (found below)*/
    					jf.add(new MyCanvas());


    				/*setSize():
    					-sets the size of the window
    					-(x,y)*/
    					jf.setSize(400, 400);


    				/*setVisible():
    					-default is FALSE
    					-needs to be changed to TRUE so that we can see */
    					jf.setVisible(true);

	  }
   }
   /*MYCANVAS:	-Now that we've called the imports and set the constructors, we can make
   				 a method called MyCanvas with submethods that set the size, background color, and other
   				 fun things!*/

   class MyCanvas extends Canvas //don't forget extend canvas!
   {
	   /*MYCANVAS: -this method will set our background */
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

           /*setSize()
           		-sets the size of your background
           		-(x,y)*/
           	 setSize(400, 400);
       }

	   /*PAINT: -method sets the color of our graphics and makes the rectangular shape*/
       public void paint(Graphics g)
       {
		   /*setColor():
		   		-this method will use the Graphics and Color classes to set our color
		   		-this color will stay the same until it is changed again
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
  		   		g.setColor(Color.green);

  		   /*fillRect():
  		   		-this method will draw a filled in rectangle
  		   		-(x,y,width,height)*/
  		   		g.fillRect(75, 75, 150, 75);

  		   		/*similar methods to spice up your window (from the Graphics class) include
  		   			-fillOval
  		   			-drawLine
  		   			-drawString
  		   			-drawImage
  		   			-and many more!*/
       }
       /*SUMMARY:	-now that we've learned a little bit about using the Canvas class in Java, let's review:

						-imports must be added
							-import java.awt.Canvas; and others, depending on what you want the program to do.
       					-must use the words 'extends Canvas'
       					-make constructors to use JFrame and Canvas
      					-can add methods in your MyCanvas method such as paint with different things to change the Canvas window we created */

  }




