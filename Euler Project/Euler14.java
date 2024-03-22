/*Sophia Colonello
  10/30/20
  this program will find the longest collatz sequence starting under a million */

  public class Euler14
  {
	  public static void main(String[] args)
	  {
		  //variables
		  	int largestNum = 0, longest = 0, counter = 0;
		  	long number;

		  //for loop to get the longest sequence
        	for(int i = 2; i < 1000001; i++)
        	{
				number = i;
            	counter = 1;
            	while(number > 1)
            	{
					if(number % 2 == 0)
                     number = number / 2;
                	else
                    number = (number * 3) + 1;
                	counter++;
            	}

            if(counter > longest)
            {
                longest = counter;
                largestNum = i;
            }
        }

		  //printing out the number
		  	System.out.println(largestNum);
        }



  }