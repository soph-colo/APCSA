/*Sophia Colonello
  1/25/21
  this program will find the sum of all numbers that are equal to the sum of their factorial digits */

  public class Euler34
  {
	  public static void main(String[] args)
 	  {
		  //variables
		  	int sum = 0;



		  //for loop to find the sum
		  	for(int j = 3; j < 10000000; j++)
		  	{
			  	if(j == factorialSum(j))
			    	sum += j;
		  	}

		  //printing the final sum
			System.out.println(sum);
	}
	public static int factorialSum(int x)
	{
		//array of factorial values through 9
			int[] factorials = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};

		//variable
			int sum = 0;

		//while loop to get the sum of the numbers in the factorial
			while (x != 0)
			{
				sum += factorials[x % 10];
				x /= 10;
			}
			return sum;
	}

}