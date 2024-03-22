/*Sophia Colonello
  1/20/21
  this program will ask the user about an array. it will randomly fill the array. it will then see how many even/odd numbers there are, and print
  the array back to the user */

  import java.util.Scanner;

  public class Practice_21a
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //variables
		  	int arrayLength = 0, even = 0;

		  //asking the user how long they want their array to be
		  	System.out.print("\n\n\tHow many numbers would you like in your array?: ");
		  	arrayLength = sc.nextInt();

		  		//validation
		  			while(arrayLength < 0)
		  			{
						System.out.print("\n\n\t\tERROR! Please enter a valid number of numbers: ");
						arrayLength = sc.nextInt();
					}

		  //initalizing the array
		  	int[] randomArray = new int[arrayLength];

		  //for each loop
		  	for(int i: randomArray)
		  	{
				randomArray[i] = (int)(Math.random()*10+1);
				if(randomArray[i]%2 == 0)
					even++;

				System.out.println(randomArray[i]);
			}

		  //printing the even numbers
		  	System.out.println("\n\tThere are "+even+" even numbers in this array");



	  }
  }