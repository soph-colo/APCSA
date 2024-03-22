/*Sophia Colonello
  2/10/21
  this program will be quiz 13. it will use the user's input to determine how long their flight will be */

  public class Quiz13
  {
	  public static void main(String[] args)
	  {
		  //constructor
		  	FlightTimes ft = new FlightTimes();

		  //welcome message
		  	System.out.println("\t\t\t\tWELCOME TO COLONELLO INTERNATIONAL");

		  //arrays
		  	String[] airports = {"Wsh", "Top", "KC", "Col", "StL"};
		  	int[][] times = {{0, 62, 90, 102, 125},
						   	 {83, 0, 59, 85, 97},
						   	 {91, 70, 0, 71, 88},
						   	 {104, 87, 72, 0, 72},
						   	 {119, 101, 90, 74, 0}};

		  //calling the prompt method
		  	ft.promptForFlightTime(airports, times);

	  }
  }