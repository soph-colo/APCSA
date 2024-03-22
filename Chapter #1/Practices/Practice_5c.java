/*Sophia Colonello
  9/15/20
  this program will solve the quadratic formula */

  import java.util.*;
  import java.text.*;

  public class Practice_5c
  {
	  public static void main(String[] args)
	  {
		  //scanner and df
		  	Scanner sc = new Scanner(System.in);
		  	DecimalFormat df = new DecimalFormat("#,###.##");

		  //getting the values
		  	double a, b, c, answer1, answer2;
		  	System.out.print("\nValue a: ");
		  	a = sc.nextDouble();
		  	System.out.print("\nValue b: ");
		  	b = sc.nextDouble();
		  	System.out.print("\nValue c: ");
		  	c = sc.nextDouble();

		  //getting answers
		    boolean noSol = false;
		  	answer1 = (b*b-4*a*c);
		  	if(answer1 < 0)
		  	{
		  		System.out.println("\n\n\tno real solutions");
		  		System.exit(0);
			}
		  	answer1 = Math.sqrt(answer1);
		  	answer1 += -b;
		  	answer1 /= (2*a);
		  	answer2 = (b*b-4*a*c);
		  	if(answer2 < 0)
		  	{
		  		System.out.println("\n\n\tno real solutions");
		  		System.exit(0);
			}
		  	answer2 = Math.sqrt(answer2);
		  	answer2 = -b-answer2;
		  	answer2 /= (2*a);

		  //if statement
		  	if(answer1 != 0 && answer2 != 0)
				System.out.println("x = "+df.format(answer1)+" and x = "+df.format(answer2));
			else if(answer1 != 0 && answer2 == 0)
				System.out.println("x = "+df.format(answer1));
			else if(answer1 == 0 && answer2 != 0)
				System.out.println("x = "+df.format(answer2));




	  }
  }