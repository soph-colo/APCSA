/*Sophia COlonello
  2/9/21
  this program will find which value of p <= 1000, is the number of solutions maximised */

  public class Euler39
  {
	  public static void main(String[] args)
	  {
		  //variables
		  	int perMax = 0, triMax = 0, tri = 0;

		  //for loop to determine the maxed perimeter
			  for(int i = 1; i <= 1000; i++)
			  {
				  tri = solutions(i);
				  if(tri > triMax)
				  {
					triMax = tri;
					perMax = i;
				  }
			  }

		  //print
		  	System.out.println(perMax);

	  }
	  public static int solutions(int i)
	  {
		  //variables
		  	int count = 0, c = 0;

		  //nested for loops for proper triangle
			for(int j = 1; j <= i; j++)
			{
				for(int z = j; z <= i; z++)
				{
					c = i - j - z;
					if(z <= c && (Math.pow(j,2) + Math.pow(z,2) == Math.pow(c,2)))
						count++;
	     		}
	   		}

	   	  //return
			return count;

	   }

  }