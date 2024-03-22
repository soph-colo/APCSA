/*Sophia Colonello
  11/23/20
  this program will find the sum of the digits in 100! */

  import java.math.BigInteger;

  public class Euler20
  {
	  public static void main(String[] args)
	  {
		  //big int
		  	BigInteger factorial = BigInteger.valueOf(1);

		  //for loop to get the factorial total
			for (int i = 1; i <= 100; i++)
				factorial = factorial.multiply(BigInteger.valueOf(i));

		  //factorial string variable to calculate the sum of the digits
		  	String factorialStr = factorial.toString();

		  //variable
			int sum = 0;

		  //for loop to get the sum of the digits
			for (int i = 0; i < factorialStr.length(); i++)
			{
				int j = Integer.parseInt(factorialStr.substring(i,i+1));
				sum += j;
			}

		  //printing out the sum
			System.out.println(sum);

	  }

  }