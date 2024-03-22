/*Sophia Colonello
  11/16/20
  this program will ask the user to enter to strings, the program will compare them and share which on will go before the other in the dictionary */

  import java.util.Scanner;

  public class Practice_17a
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //variables
		  	String rerun = "";

		  //do-while
		  	do
		  	{
				//variables
					String strings;

				//getting the two strings
					System.out.print("\nEnter two strings: ");
					strings = sc.nextLine();

				//while loop for blank
					while(strings.isEmpty())
					{
						System.out.print("\n\n\tPlease enter two strings: ");
						strings = sc.nextLine();
					}
					String one = new String(strings.substring(0,strings.indexOf(" ")));
					String two = new String(strings.substring(strings.indexOf(" ")+1));


				//comparing
					if(one.compareToIgnoreCase(two) < 0)
					{
						System.out.println(one+" comes before "+two+" in the dictionary");
					}
					else if(one.compareToIgnoreCase(two) > 0)
					{
						System.out.println(two+" comes before "+one+" in the dictionary");
					}
					else if(one.compareToIgnoreCase(two) == 0)
					{
						System.out.println(one+" and "+two+" are the same word");
					}

				//asking if they would like to rerun

					System.out.print("\n\n\t\trerun?: ");
					rerun = sc.nextLine();

					//while loop for val
						while(!rerun.equalsIgnoreCase("yes") && !rerun.equalsIgnoreCase("no"))
						{
							System.out.print("\n\n\t\tERROR! please enter \"yes\" or \"no\": ");
							rerun = sc.nextLine();
						}

			}
			while(rerun.equalsIgnoreCase("yes"));

			//exit message
				System.out.println("\n\n\t\tThank you for running!!!\n\n\n\n\n\n\n");

	  }
  }