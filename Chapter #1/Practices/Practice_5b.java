/*Sophia Colonello
  9/15/20
  this program will find the radius of the circle based on the area*/

  import java.util.*;
  import java.text.*;

  public class Practice_5b
  {
	  public static void main(String[] args)
	  {
		  //scanner and decimal format
		  	Scanner sc = new Scanner(System.in);
		  	DecimalFormat df = new DecimalFormat("#,###.##");

		  //getting the user's area
		  	System.out.print("Area: ");
		  	double area = sc.nextDouble();

		  //printing
		  	System.out.println("The radius of your circle is: "+df.format(Math.sqrt(area/Math.PI)));

	  }
  }