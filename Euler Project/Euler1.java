/*Sophia Colonello
  9/8/20
  this program will find the multiples of 3 or 5 under 1000 and add them together */


 public class Euler1
 {
	 public static void main(String[] args)
	 {
		 //declaring variable
		 	int sum = 0;

		 //for loop to determine if the number is a multiple of 3 or 5
		 	for(int i = 0; i < 1000; i++)
		 	{
				if(i%3 == 0 || i%5 == 0)
				{
					sum+=i;
				}
			}

		//print
			System.out.println(sum);

	 }
 }