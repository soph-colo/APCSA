/*Sophia Colonello
  1/20/21
  this program will create an array that will be manipulated */

  public class Practice_21b
  {
	  public static void main(String[] args)
	  {
		  //initializing the array
		  	int[] array = new int[50];

		  //variable
		  	int counter = 0;

		  //filling the array
		  	for(int i = 0; i < array.length; i++)
		  	{
				array[i] = (int)(Math.random()*100+1);
				System.out.println(array[i]);
			}

			System.out.println("\n\n");

		  //changing the array
		  	for(int j = 0; j < array.length; j++)
		  	{
				if(j%2 == 0)
					array[j] = 0;

				System.out.println(array[j]);

			}

	  }
  }