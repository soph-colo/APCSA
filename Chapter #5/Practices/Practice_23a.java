/*Sophia Colonello
  1/28/21
  this program will display a schedule for your work week */

  public class Practice_23a
  {
	  public static void main(String[] args)
	  {
		  //creating the initalized array
		  	int[] workWeek = {0,4,0,2,6,3,6};
		  	int[] nextWeek = new int[workWeek.length];

		  //changing the schedule
		  	for(int i = 0; i < workWeek.length-1; i++)
		  		nextWeek[i] = workWeek[i+1];
		  	nextWeek[workWeek.length-1] = workWeek[0];

		  //printing both
		  	System.out.println("\t\tSun\tMon\tTues\tWed\tThurs\tFri\tSat");
		  	System.out.print("Old Schedule:");
		  	for(int j = 0; j < workWeek.length; j++)
				System.out.print("\t"+workWeek[j]);
			System.out.print("\nNew Schedule:");
			for(int z = 0; z < workWeek.length; z++)
				System.out.print("\t"+nextWeek[z]);
			System.out.println("\n\n\n");

	  }
  }
