/*Sophia Colonello
  9/9/20
  this program will caclualte the sum of fibonaci numbers up to 4,000,000 */

  public class Euler2
  {
	  public static void main(String[] args)
	  {
		  //declaring variable
		   int num1 = 1, num2 = 1, sumEven = 0, sumTotal;
		   long max = 4000000;

		  //doing a for loop
		    while(num2 <= 4000000)
		    {
				sumTotal = num1+num2;
				num1 = num2;
				num2 = sumTotal;

				if(sumTotal%2 == 0)
				{
					sumEven += sumTotal;
				}
			}


		  //printing out result
		  	System.out.println(sumEven);

	  }
  }