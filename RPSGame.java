/*Sophia Colonello
  1//11/21
  this program will be our second AP Computer Science A quarterly. this program will simualte rock, papers, scissors along with the addition
  of betting. the computer and the user will start out with the same amount of money and each round, and the user will pick how much each player
  bets. the game ends when one player runs out of money or whenever the user wants to quit. */

  import java.util.Scanner;
  import java.text.DecimalFormat;

  public class RPSGame
  {
	  public static void main(String[] args)
	  {
		  //variables
		  	int counter = 1;
		  	double money;
		  	boolean playing = true;
		  	String firstName, lastName;

		  //scanner + decimalformat
		  	Scanner sc = new Scanner(System.in);
		  	DecimalFormat df = new DecimalFormat("$#,###.00");


		  //getting the user's name and how much they want to bet
		  	System.out.print("\n\n\t\tW E L C O M E!!!\n\n\tYou will be playing Theodore.\n\n\tWhat is your first name: ");
		  	firstName = sc.nextLine();

		  		//validation
		  			while(firstName.isEmpty())
		  			{
						System.out.print("\n\n\t\tERROR! Please enter your first name: ");
						firstName = sc.nextLine();
					}

			System.out.print("\n\tWhat is your last name: ");
		  	lastName = sc.nextLine();

		  		//validation
					while(lastName.isEmpty())
					{
						System.out.print("\n\n\t\tERROR! Please enter your last name: ");
						lastName = sc.nextLine();
					}
		  	System.out.print("\n\n\tHow much would you like to start out with?: ");
		  	money = sc.nextDouble();

		  	//validation
		  		while(money <= 0)
		  		{
					System.out.print("\n\n\t\t\tERROR! Please enter a valid amount to start with: ");
					money = sc.nextDouble();
				}


		  //constructors
		  	Player computer = new Player(money);
			Player player = new Player(firstName, lastName, money);

		  //while loop for the rounds
		  	do
		  	{
				//variables
					int choice, ties = 0;
					double bet = 0;

				//asking how much to bet
					System.out.print("\n\n\tRound #"+counter+": How much would you ike to bet?: ");
					bet = sc.nextDouble();

					//validation
						while((bet > player.getMoney() || bet > computer.getMoney()) || bet < 0)
						{
							System.out.print("\n\n\t\tERROR! You cannot bet more than you or Theodore have!: ");
							bet = sc.nextDouble();
						}

				//informing the player of the bets
					System.out.println("\n\n\t\tThere is "+df.format(bet)+" on the line this round.");

				//RPS constructors and values
					RPS pc = new RPS();
		  			RPS cc = new RPS(1);
		  			int playerC = pc.getPlayerChoice();
		  			int computerC = cc.getComputerChoice();

				//calling the compareTo to determine who won
					char results = pc.compareTo(playerC, computerC);
					if(results == 't')
					{
						System.out.println("\n\n\tIt was a tie.");
						ties++;
					}
					else if(results == 'p')
					{
						System.out.println("\n\n\tYou won this round.");
						player.setWins(player.getWins()+1);
						computer.setLosses(computer.getLosses()+1);
						player.setMoney(player.getMoney()+bet);
						computer.setMoney(computer.getMoney()-(bet));
					}
					else if(results == 'c')
					{
						System.out.println("\n\n\tI won this round.");
						computer.setWins(computer.getWins()+1);
						player.setLosses(player.getLosses()+1);
						computer.setMoney(computer.getMoney()+bet);
						player.setMoney(player.getMoney()-(bet));
					}

				//printing out the money
					System.out.println("\n\n\tYou: "+df.format(player.getMoney())+"\t\tTheodore: "+df.format(computer.getMoney()));

				//counter
					counter++;

				//checking to make sure no one went under
					if(player.getMoney() <= 0)
					{
						System.out.print(player.toString());
						System.out.print(computer.toString());
						System.out.println("\n\n\tYou lose!!\n\n");
						System.exit(0);
					}
					else if(computer.getMoney() <= 0)
					{
						System.out.print(player.toString());
						System.out.print(computer.toString());
						System.out.println("\n\n\tYou win!!\n\n");
						System.exit(0);
					}


				//asking if they would like to continue
					sc.nextLine();
					System.out.print("\n\n\tWould you like to continue to the next round? (y/n): ");
					char keepPlaying = sc.nextLine().charAt(0);

					//while loop to validate
						while(!((keepPlaying == 'y' || keepPlaying == 'n') || (keepPlaying == 'Y' || keepPlaying == 'N')))
						{
							System.out.print("\n\n\t\tERROR! Please enter \'y\' or \'n\': ");
							keepPlaying = sc.nextLine().charAt(0);
						}

				//if statement to see if they should continue and what situation it is
					if((keepPlaying == 'n' || keepPlaying == 'N') && player.getMoney() > computer.getMoney())
					{
						System.out.print(player.toString());
						System.out.print(computer.toString());
						System.out.println("\n\n\tYou win!!\n\n");
						System.exit(0);
					}
					else if((keepPlaying == 'n' || keepPlaying == 'N') && computer.getMoney() > player.getMoney())
					{
						System.out.print(player.toString());
						System.out.print(computer.toString());
						System.out.println("\n\n\tYou lose!!\n\n");
						System.exit(0);
					}
					else if((keepPlaying == 'n' || keepPlaying == 'N') && computer.getMoney() == player.getMoney())
					{
						System.out.print(player.toString());
						System.out.print(computer.toString());
						System.out.println("\n\n\tIt was a tie!!\n\n");
						System.exit(0);
					}

			}
			while(playing == true);


	  }
  }