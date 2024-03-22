/*Sophia Colonello
  9/15/20
  this program will ask the user for various dimensions of shapes and then spit out the area
  ******************it wouldn't let me submit more than one file so i combined all three programs. i didn't want to bother you during
  your classes with a stupid question haha!*/


  import java.util.*;
  import java.text.*;

  public class Practice_5a
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //decimal format
		  	DecimalFormat df = new DecimalFormat("#,###.##");

		  //variables
		 	double baseTri, heightTri, areaTri, heightRec, widthRec, areaRec, radiusCirc, areaCirc;

		  //asking the user for the base and height of a triangle
		    System.out.print("\nTriangle Base: ");
		    baseTri = sc.nextDouble();
		    baseTri = validation(baseTri);
		    System.out.print("\nTriangle Height: ");
		    heightTri = sc.nextDouble();
		    heightTri = validation(heightTri);
		    areaTri = baseTri*(heightTri/2);

		  //asking the user for the height and width of a rectangle
		  	System.out.print("\nRectangle Height: ");
		    heightRec = sc.nextDouble();
		    heightRec = validation(heightRec);
		    System.out.print("\nRectangle Width: ");
		    widthRec = sc.nextDouble();
		    widthRec = validation(widthRec);
		    areaRec = heightRec*widthRec;

		  //asking the user for the radius of a circle
		  	System.out.print("\nCircle Radius: ");
		    radiusCirc = sc.nextDouble();
		    radiusCirc = validation(radiusCirc);
		    areaCirc = Math.pow(radiusCirc,2)*Math.PI;

		  //displaying output
		  	System.out.println("\n\nShape\t\t\tArea\nTriangle\t\t"+df.format(areaTri)+"\nRectangle\t\t"+df.format(areaRec)+"\nCircle\t\t\t"+df.format(areaCirc));

		  /*****************************************************************************************************************
		  program #2 */

		  //getting the user's area
		  	System.out.print("Area: ");
		  	double area = sc.nextDouble();

		  //printing
		  	System.out.println("The radius of your circle is: "+df.format(Math.sqrt(area/Math.PI)));

		  /*****************************************************************************************************************
		  program #3 */

		  //getting the values
		  	double a, b, c, answer1, answer2;
		  	System.out.print("\nValue a: ");
		  	a = sc.nextDouble();
		  	System.out.print("\nValue b: ");
		  	b = sc.nextDouble();
		  	System.out.print("\nValue c: ");
		  	c = sc.nextDouble();

		  //getting answers
		  	answer1 = Math.sqrt(b*b-4*a*c);
		  	answer1 += -b;
		  	answer1 /= (2*a);
		  	answer2 = Math.sqrt(b*b-4*a*c);
		  	answer2 -= -b;
		  	answer2 /= (2*a);

		  //if statement
		  	if(answer1 != 0 && answer2 != 0)
				System.out.println("x = "+df.format(answer1)+" and x = "+df.format(answer2));
		  	else if(answer1 != 0 && answer2 == 0)
				System.out.println("x = "+df.format(answer1));
		 	else if(answer1 == 0 && answer2 != 0)
				System.out.println("x = "+df.format(answer2));
		  	else
		  		System.out.println("no real solutions");

	  }
	  public static double validation(double element)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //if statement
		 	while(element < 0)
		 	{
				System.out.print("\n\t\tERROR!!! Please enter a valid number: ");
				element = sc.nextDouble();
			}

		  //return
		  	return element;
	  }
  }