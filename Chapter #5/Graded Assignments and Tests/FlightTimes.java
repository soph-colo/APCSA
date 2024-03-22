/*Sophia Colonello
  2/10/21
  this program will be our flight class. it will determine how long the user's flight will be along with printing out the table if they so choose */

  import java.util.Scanner;

  public class FlightTimes
  {
	  //constructor
	  	public FlightTimes()
	  	{

		}

	  /*this method will accept a string array and a two dim int array. it determine the times for the flights
	  	@param airports is the name of the aiports
	    @param times is the times of the flights */
	  	public void promptForFlightTime(String[] airports, int[][] times)
	  	{
			//scanner
				Scanner sc = new Scanner(System.in);

			//variables
				int dep = 0, arr = 0;

			//asking for departing city
				do
				{
					System.out.println("\nSelect your departing city:\n1. Wsh\n2. Top\n3. KC\n4. Col\n5. StL\n6. Print Entire Chart");
					dep = sc.nextInt();

						//validation
							dep = val(dep);

					if(dep < 6)
						dep -= 1;
					else
					displayFlightTimesTable(airports, times);

				}
				while(dep == 6);

			//asking for arriving city
				do
				{
					System.out.println("\nSelect your arriving city:\n1. Wsh\n2. Top\n3. KC\n4. Col\n5. StL\n6. Print Entire Chart");
					arr = sc.nextInt();

						//validation
							arr = val(arr);

					if(arr < 6)
						arr -= 1;
					else
						displayFlightTimesTable(airports, times);

				}
				while(arr == 6);


			//calculations
				int flightTime = times[arr][dep];

			//printing
				System.out.println("\n\n\tYour flight time will be "+flightTime+" minutes\n\n\n\n\n\n\n");

		}
	    /*this method will accept a string array and a two dim int array. it will display the times table.
	    @param airports is the name of the aiports
	    @param times is the times of the flights */
	  	public void displayFlightTimesTable(String[] airports, int[][] times)
	  	{
			//displaying the singular array
				System.out.print("\n\t");
				for(int i = 0; i < airports.length; i++)
					System.out.print(airports[i]+"\t");

			//displaying the double array
				System.out.println("");
				for(int r = 0; r < times.length; r++)
				{
					System.out.print(airports[r]+"\t");
					for(int c = 0; c < times[r].length; c++)
						System.out.print(times[r][c]+"\t");
					System.out.println("");
				}


		}

		/*this method will accept an int. it will validate the user input. it will return an int.
		@param x is the user's choice
		@return is the validated x */
		public int val(int x)
		{
			//scanner
				Scanner sc =  new Scanner(System.in);

			//while loop
				while(x < 1 || x > 6)
				{
					System.out.print("\n\n\t\tERROR! Please enter a valid choice: ");
					x  = sc.nextInt();
				}

			//return
				return x;
		}


  }