/*Sophia Colonello
  10/26/20
  this program will find the values of a,b, and c in a + b + c = 1000 that also follow the rules */

  public class Euler9
  {
	  public static void main(String[] args)
	  {
		  //starting with a
		  	for(int a = 3; a <= 1000; a++)
		  	{
				//for loop for b (must be more than)
					for(int b = a+1; b < 1000; b++)
					{
						double cSquare = Math.pow(a,2) + Math.pow(b,2);
						double c = Math.sqrt(cSquare);

						if(a+b+c == 1000)
						{
							System.out.println(a*b*(int)c);
						}
				}
			}
	  }
  }