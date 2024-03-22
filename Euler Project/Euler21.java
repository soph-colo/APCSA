/*Sophia Colonello
  11/23/20
  this program will find the sum of all amicable numbers under 10000*/

  public class Euler21
  {
	  public static void main(String[] args)
	  {
		  //variable
			int sum = 0;

          //for loop to begin the pairs
        	for (int i = 220; i <= 10000; i++)
        	{
            	if(hasAmicablePair(i))
            	{
                	sum += i;
            	}
        	}

          //printing
        	System.out.println(sum);


	  }
	  /*this method will see if a number has amicable pairs
	  	@param num passed down to to be compared
	  	@return true or false */
   		public static boolean hasAmicablePair(int n1)
   		{
			//variables
        	  int n2 = sumOfDivisors(n1);

        	//if statement for comparison
        	  if (n1 == n2)
        	  	return false;

        	//default return statement
        	  return n1 == sumOfDivisors(n2);

      }
      /*this method will continue to calculate the sum of the proper numbers
        @param num to be added
        @return the added sum */
		public static int sumOfDivisors(int n2)
		{
			//variables
			  int tempSum = 0;

			//for loop
          	  for (int i = 1; i <= n2 / 2; i++)
          	  {
				  if(n2 % i == 0)
                  	tempSum += i;
          	  }

          	//return
          	return tempSum;
    	}

  }