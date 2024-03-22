/*Sophia Colonello
  10/13/20
  this program will ask the user to enter a number and then it will print all the prime numbers up to what the user entered */

  import java.util.Scanner;

  public class Practice_11c
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //asking the user for an int
		  	System.out.print("\n\tEnter a number: ");
		  	int num = sc.nextInt();

		  //calling isPrime method
		  	for(int i = 1; i <= num; i++)
		   	{
				if(isPrime(i))
					System.out.println(i);

			}

	  }
	  /*this method will accept an int. it will decide if the num is prime. it will return a boolean
	    @param i will be tried to see if it is prime
	    @return prime if prime or not */
	    public static boolean isPrime(int i)
	    {
			//variables
				boolean prime = true;

		  		if(i == 1 || i == 0)
		           prime = false;

		   //number is prime
		        for(int j = 2; j <= i / 2; ++j)
		        {
		             if (i % j == 0)
		             {
		              	prime = false;
		              	break;
					 }
					 else
						 prime = true;

		        }

		  	//return prime
				return prime;


		}
  }