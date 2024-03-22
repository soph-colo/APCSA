/*Sophia Colonello
  9/25/20
  this will be out quiz #3. the program will ask the user to enter a year to find out when easter is. the program will
  then go through a long list of math to determine when easter falls on that specific year.*/

  import java.util.Scanner;

  public class Quiz3
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //variable for do while
		  	String rerun= "";

		  //do-while loop for rerun
		  	do
		  	{
				//variables
					int year, day;
					String month;

				//asking the user to enter a year
					System.out.print("\n\nWhat year do you want to know what date Easter falls on: ");
					year = sc.nextInt();

					//validation for year
						while(year < 1583)
						{
							System.out.print("\n\n\tERROR! Please enter a year including/after 1583: ");
							year = sc.nextInt();
						}

				//let's start the math
					int a = year%19;
					int b = year/100;
					int c = year%100;
					int d = b/4;
					int e = b%4;
					int f = (b+8)/25;
					int g = (b-f+1)/3;
					int h = (19*a+b-d-g+15)%30;
					int i = c/4;
					int k = c%4;
					int r = (32+2*e+2*i-h-k)%7;
					int m = (a+11*h+22*r)/491;
					int n = (h+r-7*m+114)/31;
					int p = (h+r-7*m+114)%31;

				//getting the month for the variable n
					if(n == 3)
						month = "March";
					else
						month = "April";

				//getting the day from value p
					day = p+1;

				//printing out correct output
					if(year <= 2020)
						System.out.println("\n\n\t\tEaster in "+year+" fell on "+month+" "+day+".");
					else
						System.out.println("\n\n\t\tEaster in "+year+" will fall on "+month+" "+day+".");

				//asking if they want to rerun
					sc.nextLine();
					System.out.print("\n\n\tWould you like to rerun? (\"yes\" or \"no\"): ");
					rerun = sc.nextLine();

					//validation for input
						while(!rerun.equalsIgnoreCase("yes") && !rerun.equalsIgnoreCase("no"))
						{
							System.out.print("\n\n\tERROR! Please enter \"yes\" or \"no\": ");
							rerun = sc.nextLine();
						}

			}
			while(rerun.equalsIgnoreCase("yes"));

		  //final message
		  	System.out.println("\n\n\tThank you for running this program!\n\n\n\n\n\n");


	  }
  }