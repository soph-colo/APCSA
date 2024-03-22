/*Sophia Colonello
  10/28/20
  this will be a class that is filled with methods i can use later in the year */

  import java.util.Scanner;

  public class UsefulMethods
  {
	  //scanner
	  	Scanner sc = new Scanner(System.in);

	  //instance variables
	  	private int number;

	  //constructor
	  	public UsefulMethods(int num)
	  	{
			number = num;
		}

	  //mutator methods
	    public void setNum(int num)
	    {
			number = num;
		}

		static boolean isPrime(int num)
	    {
	        if (num <= 1)
	            return false;

	        for (int i = 2; i < num; i++)
	        {
	            if (num % i == 0)
	            {
	                return false;
				}
			}

	        return true;
	    }


  }