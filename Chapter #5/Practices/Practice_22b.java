/*Sophia Colonello
  1/21/21
  this program will randomly generate numbers with a user entered min and max. there will be no repeated numbers */

  import java.util.Scanner;

  public class Practice_22b
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //variables
		  	int min = 0, max = 0, num = 0;

		  //asking the user the min and max and how many numbers
		  	System.out.print("Min: ");
		  	min = sc.nextInt();
		  	System.out.print("\nMax: ");
		  	max = sc.nextInt();

		  		//validation for the max value
		  			while(max < min)
		  			{
						System.out.print("\n\n\t\tERROR! Please enter valid values: ");
				  		System.out.print("\nMin: ");
		  				min = sc.nextInt();
		  				System.out.print("\nMax: ");
		  				max = sc.nextInt();
					}
		  	System.out.print("\nHow many numbers do you want?: ");
		  	num = sc.nextInt();
		  	num = validation(num, min, max);

		  //creating the array
		  	int[] array = new int[num];

		  //for loop to generate the numbers
		  	generate(array, min, max);

		  //printing
		  	for(int i = 0; i < array.length; i++)
		  		System.out.println(array[i]);

	  }
	  //this method will accept an int. it will validate the number of numbers. it will return the validated number
	  public static int validation(int num, int min, int max)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //while loop
		  	while(num < 0 || num > (max-min))
		  	{
				System.out.print("\n\n\t\tERROR! Please enter a valid number: ");
				num = sc.nextInt();
			}

		  //return
		  	return num;

	  }
	  //this method will accept an int array, and two ints. it will fix any repitition found.
	  public static void generate(int[] array, int min, int max)
	  {

			for(int i = 0; i < array.length; i++)
			{
				array[i] = (int)(Math.random()*(max-1)+min);
				for(int j = i+1; j < array.length; j++)
				{
					while(array[i] == array[j])
					{
						array[j] = (int)(Math.random()*(max-1)+min);
					}
				}
			}



	  }
  }

  /*WRITTEN:
  	3. int counter = 0;
  	   for(int i = array2.length-arr1.length; i < array2.length; i++)
  	   {
		   array2[i] = arr1[counter];
		   counter++;
	   }

	4.  a[1] = a	a[2] = b
		b[1] = a2	b[2] = b*/