/*Sophia Colonello
  1/24/21
  this program will find the sum of all products whose multiplicand/multiplier/product identity can be written as a 1 through 9 pandigital */

import java.util.Arrays;


public final class Euler32
{
	public static void main(String[] args)
	{
		//variable
			int sum = 0;

		//for loop to find pandigital products
			for(int i = 1; i < 10000; i++)
			{
				if(panProd(i))
					sum += i;
			}

	   //printing the sum
		 System.out.println(sum);

	}
	//this method will accept an int. it will determine if the number is a pandigital product it will return a boolean
	public static boolean panProd(int n)
	{
		//for loop to test
			for(int i = 1; i <= n; i++)
			{
				if(n % i == 0 && isPan(""+n+i+n/i))
					return true;
			}

		//default return
			return false;
	}
	//this method will accept a string. it will determine if the number is a pandigital
	public static boolean isPan(String str)
	{
		//if statement to weed out invalid numbers
			if(str.length() != 9)
				return false;

		//char arry to hold the number
			char[] array = str.toCharArray();

		//sorting the array
			Arrays.sort(array);

		//return
			return new String(array).equals("123456789");
	}

}