/*Sophia Colonello
  1/28/21
  this program will simulate the rolling of two dice and creates a histogram based off of how many times a number was rolled */

  import java.util.Scanner;

  public class Practice_23b
  {
	  public static void main(String[] args)
	  {
		  //constructor
		  	DiceSimulation ds = new DiceSimulation();

		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //array for frequency
		  	int[] freq = new int[13];

		  //welcome message
		  	System.out.println("\n\tWelcome to the dice throwing simulator!");

		  //variables
		  	char option = 'a';

		  //do while loop
		  	do
		  	{
				//providing the user with options
		  			System.out.print("\n\tOptions: (n)ew simulation, (a)dditional rolls, (p)rint, (q)uit\n\tEnter n, a, p, or q: ");
		  			option = sc.nextLine().charAt(0);

		  		//if statement for each option
		  			if(option == 'n' || option == 'N')
		  				ds.newSimulation(freq);
		  			else if(option == 'a' || option == 'A')
		  				ds.additionalRolls(freq);
		  			else if(option == 'p' || option == 'P')
		  				ds.printReport(freq);
		  			else if(option == 'q' || option == 'Q')
		  				System.exit(0);
		  			else
		  				System.out.print("\nInvalid selection.");




			}
			while(option != 'q');


	  }
  }