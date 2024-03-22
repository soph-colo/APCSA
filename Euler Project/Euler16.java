/*Sophia Colonello
  11/5/20
  this program will find the sum of all the numebrs in 2^1000 */


  import java.math.BigInteger;


  public class Euler16
  {
	  public static void main(String[] args)
	  {
		  //big int and making the big number
			BigInteger number = new BigInteger("2");
			number = number.pow(1000);

		  //array for manipulating the numbers and variable
			char[] numbers = number.toString().toCharArray();
			int sum = 0;

		  //getting the sum of the numbers
			for(int i = 0; i < numbers.length; i++ )
			{
				int digit = Character.digit(numbers[i],10);
				sum += digit;
			}

		  //print
		  	System.out.println(sum);


	  }
  }