/*Sophia Colonello
  9/24/20
  this program will ask the user to enter an integer and then square the number until they enter 0 */

  import java.util.Scanner;

  public class Practice_7f
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //rerun variable
		  	String rerun = "";

		  //do-while loop
		  	do
		  	{
				//getting the user's number
					System.out.print("Integer: ");
					double userNum = sc.nextInt();

				//sentinel
					final int SENTINEL = 0;

				//printing
					if(userNum != SENTINEL)
					{
						System.out.println(Math.pow(userNum, 2));
					}

				//asking if they want to rerun
					sc.nextLine();
					System.out.print("\n\n\tWould you like to rerun? ");
					rerun = sc.nextLine();

					while(!rerun.equalsIgnoreCase("yes") && !rerun.equalsIgnoreCase("no"))
					{
						System.out.print("\n\n\n\tERROR! Please enter \"yes\" or \"no\": ");
						rerun = sc.nextLine();

					}

			}
			while(rerun.equalsIgnoreCase("yes"));
	  }
  }