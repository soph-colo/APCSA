/*Sophia Colonello
  9/11/20
  this program will find the largest prime factor of 600851475143 */

  public class Euler3
  {
	  public static void main(String[] args)
	  {
		  //variables
		  	long specialNum = 600851475143L, largest = 0;

		  //for loop to go through each number to see if it is prime
			for(int i = 2; i < specialNum; i++)
			{
				if(specialNum%i == 0)
				{
					specialNum /= i;
				}
				largest = i+1;
			}

		  //print
		  	System.out.println(largest);

	  }
  }