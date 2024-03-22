/*Sophia Colonello
  10/27/20
  this program will be the driver program for rectangle. it will access the methods in the class */

  import java.util.Scanner;

  public class RectangleDriver
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //variables
		  	int l = 0, w = 0;
		  	boolean square = false;

		  //object
		  	Rectangle rt = new Rectangle(l, w);

		  //getting the length and width
		  	System.out.print("\nLength: ");
		  	l = sc.nextInt();

		  	System.out.print("\n\nWidth: ");
		  	w = sc.nextInt();

		  //setting the numbers
		  	rt.setLength(l);
		  	rt.setWidth(w);

		  //determining if it is a square
		  	square = rt.isSquare(l,w);

		  	if(square)
		  		System.out.println("\n\tSquare: "+rt.getLength()+"x"+rt.getWidth());
		  	else
		  		System.out.println("\n\tRectangle: "+rt.getLength()+"x"+rt.getWidth());



	  }
  }