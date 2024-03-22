/*Sophia Colonello
  10/17/20
  this program will find the largest palindrome that is a product of two three digit numbers */

  public class Euler4
  {
	  public static void main(String[] args)
	  {
		  //variables
		  	int num = 0, answer = 0;

		  //for loop to get biggesst num
		  	for(int i = 999; i > 99; i--)
		  	{
            	for(int j = 999; j > 99; j--)
            	{
                	num = i * j;

                	if(num == reverse(num) && num > answer)
                	{
                    	answer = num;
                	}
            	}
        	}
        System.out.println(answer);
    }
    /*this program will accept an int. it will reverse the number. it will return an int*/
    public static int reverse(int num)
    {
		//variables
        	int reverse = 0, last = 0;

        //while loop to make reverse
        	while (num != 0)
        	{
        	    last = num % 10;
        	    reverse = reverse * 10 + last;
        	    num /= 10;
        	}

        //return
        	return reverse;

	  }
  }