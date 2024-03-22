/*Sophia Colonello
  10/14/20
  this program will go through a string that the user types in and counts the number of pairs present. */

  import java.util.Scanner;

  public class Practice_13a
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //do-while variable
		  	String rerun = "";

		  //do-while
		  	do
		  	{
				//variables
					int counter = 0;

				//getting the string
					String word;
					System.out.printf("%n%nEnter a string: ");
					word = sc.nextLine().toLowerCase();

				//getting any letter pairs
					for(int i  = 1; i < word.length(); i++)
					{
						if(word.charAt(i) == word.charAt(i-1))
						{
							counter++;
						}
					}

				//print
					System.out.printf("%n%n\"%s\" contains %d letter pair(s)%n%n", word, counter);

				//asking if they want to rerun
					System.out.printf("%n%nWould you like to rerun?:" );
					rerun = sc.nextLine();

				//while loop to validate
					while(!rerun.equalsIgnoreCase("yes") && !rerun.equalsIgnoreCase("no"))
					{
						System.out.printf("%n%n\tERROR! Please enter \"yes\" or \"no\": ");
						rerun = sc.nextLine();

					}
			}
			while(rerun.equalsIgnoreCase("yes"));

		//last line
			System.out.printf("%n%n\tThank you for running!%n%n%n");
	}

  }