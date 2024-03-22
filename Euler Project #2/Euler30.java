/*Sophia Colonello
  1/9/21
  this program will find the sum of all numbers that can be written as the sum of fifth powers of their digits */

  public class Euler30
  {
	  public static void main(String[] args)
	  {
		  //variables
		  	int sum = 0;

		  //while loop to compare
		  	for(int i = 2; i < 10000000; i++)
		  	{
				if(i == num(i))
					sum += i;
			}

		  //print
		  	System.out.println(sum);

	  }
	  /*this method will accept an int. it will evalute the number to the fifth power. it will return the num
	  	@param i will be our value
	  	@return a valid big number */
	  	public static int num(int num)
	  	{
			//variables
				int number = 0;

			//while loop to find the big num
				while(num != 0)
				{
					int newNum = num%10;
					number += (int)Math.pow(newNum,5);
					num /= 10;

				}
			 //return
			 	return number;


		}
  }