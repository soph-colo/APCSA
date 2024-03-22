/*Sophia Colonello
  3/16/21
  this program will find the number of Sundays that fell on the first of the month during the 20th century */

  public class Euler19
  {
	  public static void main(String[] args)
	  {
		  //variable
		  	int count = 0;

		  //for loop for year and month
	      	for(int y = 1901; y <= 2000; y++)
	  		{
				for(int m = 1; m <= 12; m++)
				{
					if(correct(y, m, 1) == 0)
	     				count++;
				}
			}

		  //printing the number of sundays
		  	System.out.println(count);
	 }
	 public static int correct(int year, int month, int day)
	 {
		  //variables
	  	 	long m = mod((long)month-3, 4800);
	  		long y = mod(year+m / 12, 400);
	  		m %= 12;

	  	  //return
	  		return(int)((y+y/4-y/100+(13*m+2)/5+day+2)%7);
	 }
	 public static long mod(long x, long y)
	 {
		//calc
	  	  x %= y;
	  	  if(y > 0 && x < 0 || y < 0 && x > 0)
	   	  	x += y;

	   	//return
	  	  return x;
	 }



}