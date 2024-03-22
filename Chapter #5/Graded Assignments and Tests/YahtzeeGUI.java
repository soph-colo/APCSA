/*This program will represent the driver class of the Yahtzee project.

NOTES:
	-could set things up similar to the manydice and dice classes from earlier...
  -make a class for players, so we could eventually do mulitple?
  -class for the computer's play
  -methods are gonna be SO IMPORTANT!! - need to break things up
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;

public class YahtzeeGUI
{
	public static void main(String[] args)
	{
		//constructor
			PlayerGUI player = new PlayerGUI();

		//scanner
			Scanner sc = new Scanner(System.in);

		//variables
			String name = "";
			int rounds = 0;

		//arrays
			ArrayList<String> names = new ArrayList<String>();
			ArrayList<Integer> diceRoll = new ArrayList<Integer>();


		//welcome message and getting the number of players
			name = JOptionPane.showInputDialog(null, "What is your name? ", "Welcome to Yahtzee!", JOptionPane.QUESTION_MESSAGE);

				//validation
					while(name.isEmpty())
					{
						name = JOptionPane.showInputDialog(null, "Please enter your name to play. ", "ERROR!!!", JOptionPane.QUESTION_MESSAGE);
					}


		//displaying the scorecard
     	String categories[][] = {{"Ones",""},
									 		{"Twos",""},
									 		{"Threes",""},
									 		{"Fours",""},
									 		{"Fives",""},
									 		{"Sixes",""},
									 		{"Upper Score", "0"},
											{"Upper Bonus (35)", "0"},
											{"Three of a Kind", ""},
											{"Four of a Kind", ""},
											{"Full House (25)", ""},
											{"Small Straight (30)", ""},
											{"Large Straight (40)", ""},
											{"Yahtzee (50)", ""},
											{"Chance", ""},
											{"Lower Score", "0"},
									 		{"Total", "0"}};

			Object columns[] = {"Categories", name};
			JTable table = new JTable(categories, columns);
			JOptionPane.showMessageDialog(null, new JScrollPane(table));

		//do while for the game to run
            do
            {

	  			JOptionPane.showMessageDialog(null, name+"'s turn.", "Turn", JOptionPane.INFORMATION_MESSAGE);
	  			turn(player, name);
	  			rounds++;

			}
			while(rounds<13);

		//print output
			JOptionPane.showMessageDialog(null,"\n\n\t"+name+", thank you for playing! You earned "+player.getTotalScore()+" points!", "Congrats!", JOptionPane.INFORMATION_MESSAGE);


		}
	public static void turn(PlayerGUI player, String name)
	{
		//variable
		  String choice = "";

		//scanner
		  Scanner sc = new Scanner(System.in);

		//instructions to roll
		  choice = JOptionPane.showInputDialog(null, "Type \"roll\" to roll: ", "Roll", JOptionPane.QUESTION_MESSAGE);

		  //validation
		  	while(!choice.equalsIgnoreCase("roll"))
		  	{
			 	choice = JOptionPane.showInputDialog(null, "Please type \"roll\" to play: ", "ERROR!", JOptionPane.QUESTION_MESSAGE);
		  	}

		  //rolling and rerolling
		  	System.out.println();
		  	player.rollDice();
		  	player.reroll();

		 //then ask for choice from chart and call update and print chart methods
		    player.updateScoreCard();
		    display(player,name);


	}
	public static void display(PlayerGUI player, String name)
	{
		int choice = player.getChoice();
     	String categories2[][] = {{"Ones",""+player.getOnes(choice)},
									 		{"Twos",""+player.getTwos(choice)},
									 		{"Threes",""+player.getThrees(choice)},
									 		{"Fours",""+player.getFours(choice)},
									 		{"Fives",""+player.getFives(choice)},
									 		{"Sixes",""+player.getSixes(choice)},
									 		{"Upper Score", ""+player.getUpperScore()},
											{"Upper Bonus (35)", ""+player.getBonus()},
											{"Three of a Kind", ""+player.getSevenEight(choice)},
											{"Four of a Kind", ""+player.getSevenEight(choice)},
											{"Full House (25)", ""+player.getFullHouse(choice)},
											{"Small Straight (30)", ""+player.getStraights(choice)},
											{"Large Straight (40)", ""+player.getStraights(choice)},
											{"Yahtzee (50)", ""+player.getYahtzee(choice)},
											{"Chance", ""+player.getChance(choice)},
											{"Lower Score", ""+player.getLowerScore()},
									 		{"Total", ""+player.getTotalScore()}};

			Object columns2[] = {"Categories", name};
			JTable table2 = new JTable(categories2, columns2);
			JOptionPane.showMessageDialog(null, new JScrollPane(table2));
			choice = 0;
	}



}