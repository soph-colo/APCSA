/*Sophia Colonello
  3/21/21
  this program will find the sum of all the positive integers which cannot be written as the sum of two abundant numbers. */

   public class Euler23
   {
	   //variables
	   	private static final int MAX = 28123;
	   	private static boolean[] isAb = new boolean[MAX + 1];

	  public static void main(String[] args)
	  {
		  //variable
		  	int sum = 0;

		  //check
			for(int i = 1; i < isAb.length; i++)
   				isAb[i] = abundant(i);

   		  //for loop
			for(int i = 1; i <= MAX; i++)
			{
				if(!sumOf(i))
    			sum += i;
  			}

  		  //print sum
  			System.out.println(sum);
 		}
 		public static boolean abundant(int n)
 		{
			//variables
			  int sum = 1, end = (int)Math.sqrt(n);

			//for loop
  			  for(int i = 2; i <= end; i++)
  			  {
				  if(n%i == 0)
    			  sum += i+n/i;
			  }

			  if(end*end == n)
   			    sum -= end;

  			  return sum > n;
 		}
 		public static boolean sumOf(int n)
 		{
  			for(int i = 0; i <= n; i++)
  			{
   				if(isAb[i] && isAb[n - i])
    				return true;
  			}
 			return false;
 		}

}