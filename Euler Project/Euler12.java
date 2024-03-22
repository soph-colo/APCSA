/*Sophia Colonello
  10/26/20
  this program will find the first triangle number that has over 500 divisors */

  public class Euler12
  {
	  public static void main(String[] args)
	  {
		  //variables
		  	int num = 0, divisors = 0, sum = 0;

		  //while loop for condition
        	while (divisors <= 500)
        	{
				divisors = 0;
            	num++;
            	sum = triangleNumber(num);

           	    for(int i = 1; i <= Math.sqrt(sum); i++)
           	    {
					if (sum % i == 0)
                      divisors++;
				}

            	divisors *= 2;

			}
		    System.out.println(sum);

     }
     /*this method will accept an int. it will find the triangle number. it will return the triangle number
       @param num is the number to be next calculated for a triangle number
       @return sum as the triangle number*/
     public static int triangleNumber(int num)
     {
		 //variables
         	int sum = 0;

         //for loop to add the numbers to the sum
         	for (int i = 0; i <= num; i++)
             sum += i;

         //return
         	return sum;
     }
  }