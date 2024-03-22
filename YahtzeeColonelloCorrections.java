/*Sophia Colonello and Veronica Pimenova
  Period 6
  2/16/21
  This program will represent the driver class of the Yahtzee project. It will use the Player
  class to simulate a game of Yahtzee, asking the user if they would like to play with the computer,
  single, or multiplayer and will proceed accordingly.*/

  //imports
	import java.util.Scanner;
	import java.util.ArrayList;

    public class YahtzeeColonelloCorrections
    {
		public static void main(String[] args)
		{
			//1. scanner
    			Scanner sc = new Scanner(System.in);

   			//2. variables
    			boolean game = true;
   				int players = 0, rounds = 0;
   				String name = "";

   		    //3. welcome message
   			    System.out.println("\n\t\t\t\t\tY A H T Z E E");

    		//4.user input for what type of game they will play and validate input
    			System.out.print("\n\n\tWelcome! Please enter your name: ");
    			name = sc.nextLine();
    			while(name.isEmpty())
    			{
					System.out.println("\n\t\tERROR! Please enter a name: ");
    			    name = sc.nextLine();
    			}
    			PlayerColonelloCorrections player = new PlayerColonelloCorrections(name);

    		//5. do while loop for game
      			do
      			{
					//go through each player's turn for 13 rounds
         				System.out.println("\n\t"+name+"'s turn.");
         				turn(player);
          				rounds++;
      			}
      			while(rounds < 13);

      	   //6. winner and end the game
      		 System.out.println("\n\n\t\tCongrats "+name+"! You scored a total of "+player.getTotalScore()+" points!\n\n\n\n\n\n");
    }

  /*7. This method will simulate a player's turn
  @param Player player*/
  public static void turn(PlayerColonelloCorrections player)
  {

	//user input for roll
    Scanner sc = new Scanner(System.in);
    System.out.print("\n\tType \"roll\" to roll the dice: ");
    String choice = sc.nextLine();

    //validate input
    while (!choice.equalsIgnoreCase("roll")) {
      System.out.println("\n\n\tPlease enter \"roll\":");
      choice = sc.nextLine();
    }
    System.out.println();

    //roll dice and reroll methods from Player class
    player.rollDice();
    player.reroll();

    // then ask for choice from chart and call update and print chart methods
    player.updateScoreCard();
  }


}