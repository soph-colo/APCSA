/*Sophia Colonello
  10/8/20
  this program will find the sum of all prime numbers below 2 million */

  public class Euler10
  {
	  public static void main(String[] args)
	  {
		  //variables
		  	long sum = 0, prime = 0, max = 2000000;

		  //while loop to keep it going
		   	for (long i = 1; i < max; i++)
		   	{

		  		if(i == 1 || i == 0)
		           sum += 0;

		      //number is prime
		        prime = 1;

		        for(long j = 2; j <= i / 2; ++j)
		        {
		             if (i % j == 0)
		             {
		              	prime = 0;
		              	break;
					 }
		        }

		        if(prime == 1)
		        {
		            sum += i;


		  	    }


  		    }

  		    System.out.println(sum-1);

	  }
  }