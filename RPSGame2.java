/*Sophia Colonello
  1//11/21
  this program will... */

  import java.util.Scanner;

  public class RPSGame2
  {
	  public static void main(String[] args)
	  {
		  //variables
		  	double money;
		  	boolean playing = true;

		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //constructors
		  	Player player = new Player();
		  	Player computer = new Player();
		  	RPS pc = new RPS();
		  	RPS cc = new RPS();

		  //getting the amount of money each player will get
		  	System.out.print("\n\n\t\tW E L C O M E!!!\n\n\tHow much would you like to start out with?: ");
		  	money = sc.nextDouble();

		  	//validation (turn into a method)
		  		while(money < 0)
		  		{
					System.out.print("\n\n\t\t\tERROR! Please enter a valid amount to start with: ");
					money = sc.nextDouble();
				}

		  //while loop for the rounds
		  	do
		  	{
				//variables
					int counter = 1, choice, ties = 0;
					double bet = 0;

				//asking how much to bet
					System.out.print("\n\n\tRound #"+counter+": How much would you ike to bet?: ");
					bet = sc.nextDouble();

					//validation AGAIN

				//informing the player of the bets
					System.out.println("\n\n\t\tThere is $"+(bet*2)+" on the line this round.");

				//asking the user what they pick
					System.out.print("\n\n\t1. Rock\n\t2. Paper\n\t3. Scissors\n\tChoice: ");
					choice = sc.nextInt();

					 	//validate

				//setting the values
					pc.setPlayerChoice(choice);
					cc.setComputerChoice((int)Math.random()*3+1);


				//calling the compareTo to determine who won
					char results = pc.compareTo();
					if(results == 't')
					{
						System.out.println("\n\n\tIt was a tie.");
						ties++;
					}
					else if(results == 'p')
					{
						System.out.println("\n\n\tYou won this round.");
						//PLAYER CLASS WHEN WORKING!!
					}
					else if(results == 'c')
					{
						System.out.println("\n\n\tI won this round.");
						//COMPUTER +1
					}

				//printing out the money
					System.out.println("\n\n\tYou: $"+money);


			}
			while(playing == true); //CHANGE TO DIFFERENT PARAMETERS


	  }
  }