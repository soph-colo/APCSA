/*Sophia Colonello
  11/18/10
  this program will find the next best fraction to pi based off of user input */

  import java.util.Scanner;

  public class Practice_18a
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //variables
		  	double num = 0, den = 0;

		  //getting the nums
		  	System.out.print("\nEnter a numerator: ");
		  	num = sc.nextDouble();
		  	num = validation(num);
		  	System.out.print("\nEnter a denominator: ");
		  	den = sc.nextDouble();
		  	den = validation(den);


		  //setting epsilon
		  	double epsilon = Math.abs(Math.PI - num/den);

		  //caclulating the approximation
		  	double approximation = num/den;

		  //while loop
		  	while(!(Math.abs(Math.PI - approximation) < epsilon))
		  	{
				if(approximation < Math.PI)
				{
					num++;
				}
				else if(approximation > Math.PI)
				{
					den++;
				}
				approximation = num/den;
			}

		  //printing output
		  	System.out.println("\nThe next best fractional approximation of PI is: "+(int)num+"/"+(int)den);

	  }
	  /*this method will accept a double. it will validate the input. it will return the validated value
	    @param num will be validated to > 0
	    @return will be the value validated */
	    public static double validation(double num)
	    {
			//scanner
				Scanner sc = new Scanner(System.in);

			//while loop for validation
				while(num < 0)
				{
					System.out.print("\n\n\tERROR! please enter a positive number: ");
					num = sc.nextDouble();
				}

			//return
				return num;
		}
  }