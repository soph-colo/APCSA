/*Sophia Colonello
  1/28/21
  this program will be the dice rolling class */

  import java.util.Scanner;

  public class DiceSimulation
  {
	  //instance variables
	  	private int totalRolls = 0;


	  //this method will simulate a new roll
	  	public void newSimulation(int[] freq)
	  	{
			//variables
				int rolls = 0; totalRolls = 0;

			//scanner
				Scanner sc = new Scanner(System.in);

			//for loop to set all the elements to 0
				for(int i = 0; i < freq.length; i++)
					freq[i] = 0;

			//asking how many rolls they want
				System.out.print("\n\tHow many dice rolls would you like to simulate?: ");
				rolls = sc.nextInt();

					//validate the user input
						validation(rolls);
						totalRolls += rolls;

			//for loop to fill up array
				rolls(freq, rolls);

		}
		public void additionalRolls(int[] freq)
		{
			//variables
				int moreRolls = 0;

			//scanner
				Scanner sc = new Scanner(System.in);

			//asking how many more
				System.out.print("\n\tHow many additional rolls?: ");
				moreRolls = sc.nextInt();

					//validation
						validation(moreRolls);
						totalRolls += moreRolls;

		   //adding the additional rolls
		   		rolls(freq, moreRolls);

		}
		public void printReport(int[] freq)
		{
			//basic message
				System.out.println("\n\n\tDICE ROLLING SIMULATION RESULTS\n\tEach \"*\" represents 1% of the total number of rolls.\n\n\tTotal number of rolls: "+totalRolls);

			//for loop to display 	FIX THE TOTAL ROLLS!!!
				for(int i = 2; i < freq.length; i++)
				{
					System.out.print("\n\t"+i+": ");
					for(int j = 0; j < ((double)freq[i]/totalRolls)*100; j++)
						System.out.print("*");
				}
				System.out.println("\n");

		}
		public static int validation(int rolls)
		{
			//scanner
				Scanner sc = new Scanner(System.in);

			//validate the user input
				while(rolls < 1)
				{
					System.out.print("\n\n\t\tERROR! Please enter a valid number of rolls: ");
					rolls = sc.nextInt();
				}

		   //return
		   		return rolls;

		}
		public static void rolls(int[] freq, int r)
		{
			//dice
              int dice1 = 0, dice2 = 0;
			//for loop to get the rolls
				for(int j = 0; j < r; j++)
				{
					dice1 = (int)(Math.random()*6+1);
					dice2 = (int)(Math.random()*6+1);
					freq[dice1+dice2] += 1;
				}

		}


  }