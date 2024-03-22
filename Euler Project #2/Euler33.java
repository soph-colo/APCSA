/*Sophia Colonello
  4/2/21
  this program will find the product of these four fractions is given in its lowest common terms, find the value of the denominator */

  public class Euler33
  {
	  public static void main(String[] args)
	  {
		  //variables
 			int num = 1, den = 1, n0, d0, n1, d1;

 		  //for loop
 		  	for(int d = 10; d < 100; d++)
 		  	{
				for(int n = 10; n < d; n++)
				{
    				n0 = n % 10;
    				n1 = n / 10;
    				d0 = d % 10;
    				d1 = d / 10;
    				if(n1 == d0 && n0 * d == n * d1 || n0 == d1 && n1 * d == n * d0)
    				{
						num *= n;
     					den *= d;
    				}
   				}
  			}

  		  //print
  			System.out.println(den/gcd(num,den));
 	  }
  	  public static int gcd(int x, int y)
  	  {
		  //while loop
		    while(y != 0)
		    {
				int z = x % y;
				x = y;
				y = z;
			}

		  //return
			return x;


       }
}