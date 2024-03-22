/*Sophia Colonello and Veronica Pimenova
  Period 6
  2/16/21
  This program will represent the driver class of the Yahtzee project. It will use the Player
  class to simulate a game of Yahtzee, asking the user if they would like to play with the computer,
  single, or multiplayer and will proceed accordingly.*/

//imports
import java.util.Scanner;
import java.util.ArrayList;

public class Yahtzee{
  public static void main(String[] args) {

    // scanner
    Scanner sc = new Scanner(System.in);

    //EDITED- variables
    boolean game = true;
    int players = 0, rounds = 0;
    String name = "";
    ArrayList<Player> people = new ArrayList<Player>();

    // welcome message
    System.out.println("\n\t\t\t\t\tY A H T Z E E");

    //EDITED- user input for what type of game they will play and validate input
    System.out.println(
        "\n\tWelcome! Please pick an option: \n\t1. Playing against the computer \n\t2. Playing with people (can be multiplayer or one person)");
    int pick = sc.nextInt();
    while (!(pick == 2 || pick == 1)) {
      System.out.println("\n\t\tERROR! Please enter 1 or 2: ");
      pick = sc.nextInt();
    }

    //EDITED- imulate case to play with computer (2 objects - player and computer)
    if (pick == 1) {
       Player player = new Player("Player");
       Player computer = new Player("Computer");
      do {
        computer.computerTurn();
        turn(player);
        rounds++;
      } while (rounds < 13);

      //DELETED- set up arrayList of Player class and find the winner
      ArrayList<Player> people1 = new ArrayList<Player>();
      people1.add(player);
      people1.add(computer);
      winner(people1);
    }

    //DELETED- case for multi or single players (not with the computer)
    else if (pick == 2) {
      System.out.print("\n\tHow many people are going to play?: ");
      players = sc.nextInt();

      // player num validation
      while (!(players >= 1 && players <= 4)) {
        System.out.print("\n\n\t\tERROR!!! Please enter a valid number of players: ");
        players = sc.nextInt();
      }

      // for loop to get the names
      sc.nextLine();
      for (int i = 0; i < players; i++) {
        System.out.print("\n\tPlayer #" + (i + 1) + ": ");
        name = sc.nextLine();

        // validation for name entering
        while (name.isEmpty()) {
          System.out.print("\n\n\t\tERROR! Please enter a name: ");
          name = sc.nextLine();
        }

        //add the new person to the people
        people.add(new Player(name));
      }

      do {
        //go through each player's turn for 13 rounds
        for (int i = 0; i < people.size(); i++) {
          System.out.println("\n\t" + people.get(i).getName() + "'s turn.");
          turn(people.get(i));
          rounds++;
        }
      } while (rounds < 13);

      //EDITED- find the winner and end the game
      winner(people);
    }
  }

  /*This method will simulate a player's turn
  @param Player player*/
  public static void turn(Player player) {

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

  /*DELETED- This method will find the winner out of ArrayList of type Player.
  @param ArrayList<Player> people*/
  public static void winner(ArrayList<Player> people) {

    //set up variables
    int maxPoints = 0;
    int maxPosition = 0;

    //find final score(s) and winner
    for(int i=0; i<people.size(); i++){
      if(maxPoints<people.get(i).getTotalScore()){
         maxPosition=i;
         maxPoints=people.get(i).getTotalScore();
      }
    }

    //print the end message and winner and score
    System.out.println("\n\n\t\t\tThank you for playing  Y A H T Z E E ");
    System.out.println("\n\t\tThe winner of the game is: "+people.get(maxPosition).getName()+", and their score is: "+people.get(maxPosition).getTotalScore());
  }
}