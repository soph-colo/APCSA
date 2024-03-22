/*This program will represent the driver class of the Yahtzee project.

NOTES:
	-could set things up similar to the manydice and dice classes from earlier...
  -make a class for players, so we could eventually do mulitple?
  -class for the computer's play
  -methods are gonna be SO IMPORTANT!! - need to break things up
*/

import java.util.Scanner;
import java.util.ArrayList;

public class Yahtzee
{
	public static void main(String[] args)
	{
		//scanner
			Scanner sc = new Scanner(System.in);

		//variables
			boolean game = true;
			int players = 0, rounds=0;
			String name = "";
			Player player = new Player();

		//arrays
			//ArrayList<Player> names = new ArrayList<Player>();
			ArrayList<String> names = new ArrayList<String>();
			ArrayList<Integer> scores = new ArrayList<Integer>();
			ArrayList<Integer> diceRoll = new ArrayList<Integer>();


		//welcome message and getting the number of players
			System.out.println("\n\t\t\t\t\tY A H T Z E E");

			System.out.println("\n\tWelcome! Please pick an option: \n\t1. Playing against the computer \n\t2. Playing with people (can be multiplayer or one person)");
			int pick = sc.nextInt();
			while(!(pick==2||pick==1)){
				System.out.println("\n\t\tERROR! Please enter 1, 2, or 3: ");
				pick=sc.nextInt();
			}

			if(pick==1){

			   names.add("Player");
			   names.add("Computer");
			   player.setNames(names);
			   //play game with computer
			   do{
				  computer();
			      turn(player);
			      rounds++;
			    }while(rounds<13);

		    }

            else if(pick==2){
			System.out.print("\n\tHow many people are going to play?: ");
			players = sc.nextInt();

				//player num validation
					while(!(players>=1&&players<=4))
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
			player.setNames(names);

			player.displayscorecard();

            do{
          //maybe make a method for this, a for loop that runs through each player and calls the method to get the rolls
	  		for(int i = 0; i < names.size(); i++)
	  		{
	  			System.out.println("\n\t"+names.get(i)+"'s turn.");
	  			turn(player);
	  			rounds++;
			 }
			}
			while(rounds<13);

			//method to find winner
			winner(player);
		}
	}
	public static void turn(Player player){
		  Scanner sc = new Scanner(System.in);
		  System.out.print("\n\tType \"roll\" to roll the dice: ");
		  String choice = sc.nextLine();
		  while(!choice.equalsIgnoreCase("roll")){
			  System.out.println("\n\n\tPlease enter \"roll\":");
			  choice=sc.nextLine();
		  }
		  System.out.println();
		  player.rollDice();
		  player.reroll();

		  //then ask for choice from chart and call update and print chart methods
		  player.updateScoreCard();
	}
	public static void computer(){
		//computer's turn
		Player computer = new Player();
		computer.computerTurn();
	}
	public static void winner(Player player){
		//print final score(s) and winner
		player.whoWins();
	}
}