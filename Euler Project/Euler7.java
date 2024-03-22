/*Sophia Colonello
  9/26/20
  this program will find the 10,001st prime number */

  public class Euler7
  {
	  public static void main(String[] args)
	  {
		  //variable
		  	int counter = 0, num = 0, prime = 0, finalNum = 0;

		  //for loop to keep it going until i get the proper count
        	for (int i = 0; counter < 10001; i++)
        	{
				//if statement to get rid of 1 and 0
            		if (i == 1 || i == 0)
            		    counter += 0;

            	//number is prime
            		prime = 1;

            		for (int j = 2; j <= i / 2; ++j)
            		{
            		    if (i % j == 0)
            		    {
            		        prime = 0;
            		        break;
            		    }
            		}

  	          		if (prime == 1)
  	          		{
  	          		    counter++;
  	          		    finalNum = i;
			  		}
  		    		}

				System.out.println(finalNum);












	  }
  }