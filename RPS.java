/*Sophia Colonello
  1/9/21
  this program will be the RPS class */

  import java.util.Scanner;

  public class RPS
  {
	  //instance variables
	  	private int playerChoice, computerChoice;

	  //constructors
	  	public RPS()
	  	{
			//scanner
				Scanner sc = new Scanner(System.in);

			//variables
				int choice = 0;

			//asking the user what they pick
				System.out.print("\n\n\t1. Rock\n\t2. Paper\n\t3. Scissors\n\tChoice: ");
				choice = sc.nextInt();

				//validating choice
					while(choice < 1 || choice > 3)
					{
						System.out.print("\n\n\t\tERROR! Please enter 1, 2, or 3: ");
						choice = sc.nextInt();
					}

			//setting
				playerChoice = choice;

		}

		public RPS(int choice)
		{
			//random integer
				int random = (int)(Math.random()*3+1);

			//setting
				computerChoice = random;
		}

	  //mutator methods
	  	public void setPlayerChoice(int playerChoice)
	  	{
			this.playerChoice =  playerChoice;
		}
	  	public void setComputerChoice(int computerChoice)
	  	{
			this.computerChoice = computerChoice;
		}

	  //accessor methods
	  	public int getPlayerChoice()
	  	{
			return playerChoice;
		}
	  	public int getComputerChoice()
	  	{
			return computerChoice;
		}

	 /*compareTo method
	 	@param playerChoice is the player's choice
	 	@param computerChoice is the computer's choice
	 	@return result is the char that determines the print */
	 	public char compareTo(int playerChoice, int computerChoice)
	 	{
			//variables
				int pc = playerChoice;
				int cc = computerChoice;

			//if statement to find out who wins this round
				if(pc == cc)
					return 't';
				else if(pc == 1 && cc == 2)
					return 'c';
				else if(pc == 1 && cc == 3)
					return 'p';
				else if(pc == 2 && cc == 1)
					return 'p';
				else if(pc == 2 && cc == 3)
					return 'c';
				else if(pc == 3 && cc == 1)
					return 'c';
				else if(pc == 3 && cc == 2)
					return 'p';

			//default return
				return 't';

		}



  }