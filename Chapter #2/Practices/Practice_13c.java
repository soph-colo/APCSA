/*Sophia Colonello
  10/15/20
  this program will ask the user to enter an inverse function and a trigonometric ratio. it will find the angle in degrees */

  import java.util.Scanner;

  public class Practice_13c
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //variables
		  	String invFun;
		  	double trigRatio;

		  //asking the user to enter an inverse function
		  	System.out.printf("%nSelect ArcSin(as), ArcCos(ac), or ArcTan(at): ");
		  	invFun = sc.nextLine();

		  //if statement
		  	if(!((invFun.equalsIgnoreCase("as") || invFun.equalsIgnoreCase("ac") || invFun.equalsIgnoreCase("at"))))
		  	{
				System.out.printf("%nNot an allowed function");
				System.out.printf("%n%n\tAngle: NaN%n%n");
				System.exit(0);
			}

		  //getting the ratio
		  	System.out.printf("%nEnter a trigonometric ratio: ");
		  	trigRatio = sc.nextDouble();

		  //calculating by calling method
		  	calc(invFun, trigRatio);
	  }
	  /*this method will accept a string and a double. it will calculate the angle in degrees. */
	  public static void calc(String invFun, double trigRatio)
	  {

		  //making sure that the values fall into the proper magnitude
		    if((invFun.equalsIgnoreCase("as") || invFun.equalsIgnoreCase("ac")) && (trigRatio < -1 || trigRatio > 1))
		    {
				throw new ArithmeticException("\n\n\tMagnitude must not be greateer than unity");
			}

		  //calculating the angle
		  	double angle;

		  //if statement
		  	if(invFun.equalsIgnoreCase("as"))
		  	{
				angle = Math.asin(trigRatio);
				angle = Math.toDegrees(angle);
				System.out.printf("%n%n\tAngle: %.4f%n%n%n",angle);
			}
		  	else if(invFun.equalsIgnoreCase("ac"))
		  	{
				angle = Math.acos(trigRatio);
				angle = Math.toDegrees(angle);
				System.out.printf("%n%n\tAngle: %.4f%n%n%n",angle);
			}
		  	else
		  	{

				angle = Math.atan(trigRatio);
				angle = Math.toDegrees(angle);
				System.out.printf("%n%n\tAngle: %.4f%n%n%n",angle);
			}



	  }
  }