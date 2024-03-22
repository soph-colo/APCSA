/*Sophia Colonello
  9/26/20
  this program will find the sum of all the squares of the first 100 numbers and the square of the sum of the first 100 numbers
  and find the difference */

  public class Euler6
  {
	  public static void main(String[] args)
	  {
		  //variables
		  	int sumOfSquares = 0, squareOfSum = 0;

		  //for loop to get the numbers
		    for(int i = 1; i <= 100; i++)
		    {
			    sumOfSquares += (int)Math.pow(i,2);
		    }

		  //for loop
		  	for(int j = 1; j <= 100; j++)
		  	{
				squareOfSum += j;
			}
			squareOfSum = (int)Math.pow(squareOfSum,2);

		  //difference
		  	int difference = squareOfSum-sumOfSquares;

		  //printing the difference
		  	System.out.println(squareOfSum+" - "+sumOfSquares+" = "+difference);

	  }
  }