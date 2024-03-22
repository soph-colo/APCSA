/*Mrs. Krauland
  This class implements a store that sells toy bears */

import java.util.ArrayList;
import java.util.Scanner;

public class BearStore
{
	//Create an ArrayList to hold the bears
		ArrayList<Bear> bears = new ArrayList<Bear>();

	/*Fill the store with specified number of standard bears
	  @param num represents how many standard teddy bears the user wants */

	  	public void addStdBears(int num)
	  	{
			for(int i=0; i<num; i++)
				bears.add(new Bear("Acme", "Brown Teddy"));

		}


	/*Fill the store specified number of customized bears
	  @param num represents how many customized bears the user wants*/

	  	public void addSpecBears(int num)
	  	{
			Scanner sc = new Scanner(System.in);

			for(int i=0; i<num; i++)
			{
				System.out.print("\nEnter the bear's maker: ");
				String maker = sc.nextLine();

				System.out.print("\nEnter the bear's type: ");
				String type = sc.nextLine();

				bears.add(new Bear(maker, type));
			}


		}

	//Print all of the bears in the store
		public void displayInventory()
		{
			//Print the array list seperated by commas
				System.out.println("\n " + bears);

			//To print the elements of the list one per line:
				System.out.println();

				for(Bear var: bears)
					System.out.println(var);
		}


	/***********************************************************************
	The driver of the program */

	public static void main(String[] args)
	{
		//Declare Variables
			Scanner sc = new Scanner(System.in);
			BearStore store = new BearStore();

		//Get user info
			System.out.println("How many standard teddy bears would you like to add to your store?");
			int numStd = sc.nextInt();

			System.out.println("How many customized bears would you like to add?");
			int numSpec = sc.nextInt();

		//Add those bears to the store
			store.addStdBears(numStd);
			store.addSpecBears(numSpec);

		//Display the inventory
			store.displayInventory();



	}





 }