/*Sophia Colonello
  12/21/20
  this program will find the sum of the numbers on the 1001 by 1001 diagonal*/

  public class Euler28
  {
	  public static void main(String[] args)
	  {
		  //variables
		 	int spiralLength = 1001;
		    long sum = 0;

		  //for loop to get the sum
		  	for (int i = 3; i <= spiralLength; i += 2)
		  	{
				sum += (4 * i * i - 6 * (i - 1));
			}

		  //output
    	  	System.out.println(sum);

	 }
  }