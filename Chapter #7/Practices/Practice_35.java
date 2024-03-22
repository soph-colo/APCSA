/*Sophia Colonello
  4/12/21
  this will have all the practice 35s */

  import java.util.Scanner;

  public class Practice_35
  {
	  public static void main(String[] args)
	  {
		  //1. this program will find the summation of numbers squared
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //variable
		  	int number = 0;

		  //getting the user input
		  	System.out.print("\n\tEnter a number: ");
		  	number = sc.nextInt();

		  		//validation
		  			while(number < 0)
		  			{
						System.out.print("\n\t\tERROR! Please enter a valid number: ");
						number = sc.nextInt();
					}

		  //calling method
		  	System.out.println("\n\n\tsummation: "+summation(number));

		  //2. this program will find all the chickens

		  	//variable
		  		String word = " ";
		  		int counter = 0;

		  	//getting the word
		  		sc.nextLine();
		  		System.out.print("\n\n\tEnter a word: ");
		  		word = sc.nextLine();

		  			//validation
		  				while(word.isEmpty())
		  				{
							System.out.print("\n\n\t\tERROR! Please enter a word: ");
							word = sc.nextLine();
						}

			//calling method
				System.out.println("\n\t\tword: "+chicken(word, counter));


		  //3. this program will do some multiplication

		  	//variables
		  		int x,y;

		  	//getting
		  		System.out.print("\n\n\tx: ");
		  		x = sc.nextInt();
		  		System.out.print("\n\n\ty: ");
		  		y = sc.nextInt();

		  	//calling method
		  		System.out.println("\n\t\tx*y= "+multiplication(x,y));


	  }
	  public static double summation(int number)
	  {
		  if(number <= 1)
		  	return number;

		  return Math.pow(number,2)+summation(number-1);
	  }

	  public static String chicken(String word, int counter)
	  {
		  counter++;
		  if(word.length() < 7 || counter < 0)
		  	return word+"\t"+counter;

		  return chicken(word.replace("chicken",""),counter);

	  }

	  public static int multiplication(int x, int y)
	  {
		  if(y == 1)
		  	return x;

		  return x+multiplication(x,y-1);


	  }



  }
  /*WRITTEN:

  	4. 15

  	5. Prng
  	   123

  	6. c

  	7. e

  	8. d

  	9. a

  	10. e

  	11. e

  	12. b

  	13. c
   */