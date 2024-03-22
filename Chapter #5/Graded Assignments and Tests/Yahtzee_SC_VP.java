/*Sophia Colonello and Veronica Pimenova
2/16/21
Period 6
This program will

NOTES:
	-we could set things up similar to the manydice and dice classes from earlier...
  -make a class for players, so we could eventually do mulitple?
  -class for the computer's play
  -methods are gonna be SO IMPORTANT!! - need to break things up


  I think the classes are a really good idea!!

*/

import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.*;

public class Yahtzee_SC_VP
{
	public static void main(String[] args)
	{
		//scanner
			Scanner sc = new Scanner(System.in);
			JFrame frame = new JFrame("Hello");

		//variables
			boolean game = true;
			int players = 0;
			String name = "";

		//constructors
			Player player = new Player();

		//arrays
			//ArrayList<Player> names = new ArrayList<Player>();
			ArrayList<String> names = new ArrayList<String>();
			ArrayList<Integer> scores = new ArrayList<Integer>();
			ArrayList<Integer> diceRoll = new ArrayList<Integer>();


		//welcome message and getting the number of players
			System.out.println("\t\t\t\t\tY A H T Z E E");
			System.out.print("\n\n\tHow many people are going to play?: ");
			players = sc.nextInt();

				//player num validation
					while(players < 1 || players > 5)
					{
						System.out.print("\n\n\t\tERROR!!! Please enter a valid number of players: ");
						players = sc.nextInt();
					}

		//for loop  to get the names
			sc.nextLine();
			for(int i = 0; i < players; i++)
			{
				System.out.print("\n\tPlayer #"+(i+1)+": ");
				name = sc.nextLine();

					//validation
						while(name.isEmpty())
						{
							System.out.print("\n\n\t\tERROR! Please enter a name: ");
							name = sc.nextLine();
						}
				names.add(name);

			}


		//display scorecard --- do we need to fix the design? -- MOVE THIS TO PLAYER CLASS??
			player.displayScoreCard(names);		//to string to display actual names


     	 //in a do-while loop?
      	    do
      	    {
				//maybe make a method for this, a for loop that runs through each player and calls the method to get the rolls
					for(int i = 0; i < names.size(); i++)
					{
						System.out.println("\n\t"+names.get(i)+"'s turn.");
						turn(names);
					}


			}
			while(game);


			System.out.println("\n\tThank you for playing!");
			//display final score

	}
	public static void turn(ArrayList <String> names)
	{
		//constructor
			Player player = new Player();

		//scanner
			Scanner sc = new Scanner(System.in);

		//variables
			String choice = "";

		//asking the player what they want to do
			System.out.print("\nType \"roll\" to roll the dice: ");
			choice = sc.nextLine();

				//validation

		//if statement
			if(choice.equalsIgnoreCase("roll"))
				player.rollDice();


		//ask for reroll -- while loop (only allowed 2 more rolls)
			player.askForDiceRerolls();

		//method for asking which category
			player.displayScoreCard(names);
			askPlayerForCategory(player);


		//method for determing their points -- maybe whole class???


	}
  public static void askPlayerForCategory(Player player)
  {
	  //scaner
	  	Scanner sc = new Scanner(System.in);

	  //variables
	  	String choice = "";

   	 //ask user for category --
		System.out.print("\n\n\tWhich category would you like to pick: ");
		choice = sc.nextLine();

		//validating the category
			if(!player.isValidCategory(choice))
			{
				System.out.print("\n\n\t\tERROR! Choice another category: ");
				choice = sc.nextLine();
			}

		//setting correct choice



		//method for the determining their score
  }

}