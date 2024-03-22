/*Sophia Colonello
  9/24/20
  this program will have the user input their name, then display the first and second intital then reverse the name */

  import java.util.Scanner;

  public class Practice_7e
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
				//asking for name
					System.out.print("\n\nPlease enter you name: ");
					String userName = sc.nextLine();

				//getting the inititals
					char first = userName.charAt(0);
					int secondPlacement = userName.indexOf(" ");
					char second = userName.charAt(secondPlacement+1);

				//getting the name backwords
					userName = userName.toLowerCase();
				    char[] reverse = new char[userName.length()];
				    for(int i = 0; i < userName.length(); i++)
				    {
						reverse[i] = userName.charAt(i);
					}

				//printing
					System.out.print("\n"+first+ "." +second+". reversed would be ");

					for(int j = userName.length()-1; j >= 0; j--)
					{
						System.out.print(reverse[j]);
					}

				//asking if they want to rerun
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