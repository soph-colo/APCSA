/*Sophia Colonello
  9/23/20
  this program will have the user enter a shorthand version of a playing card and the program will spit our the actual card */

  import java.util.Scanner;

  public class Practice_7d
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //variable for do-while
		    String rerun = "yes";


		  //do-while loop
		  	do
		  	{
				//getting the cardnotation
					System.out.print("\nEnter card notation: ");
					String cn = sc.nextLine();
					cn = cn.toUpperCase();
					char first = cn.charAt(0);
					char second = cn.charAt(1);
					if(second == '0')
					{
						second = cn.charAt(2);
					}

			    //switch statement
			    	String cs1 = "error", cs2 = "error";
			    	switch(first)
			    	{
						case 'A':
							cs1 = "Ace of";
							break;
						case '2':
							cs1 = "Two of";
							break;
						case '3':
							cs1 = "Three of";
							break;
						case '4':
							cs1 = "Four of";
							break;
						case '5':
							cs1 = "Five of";
							break;
						case '6':
							cs1 = "Six of";
							break;
						case '7':
							cs1 = "Seven of";
							break;
						case '8':
							cs1 = "Eight of";
							break;
						case '9':
							cs1 = "Nine of";
							break;
						case 'J':
							cs1 = "Jack of";
							break;
						case 'Q':
							cs1 = "Queen of";
							break;
						case 'K':
							cs1 = "Three of";
							break;
						case '1':
							cs1 = "Ten of";
							break;
						default:
							System.out.println("ERROR!!! Please rerun.");
					}

					switch(second)
					{
						case 'D':
							cs2 = " Diamonds";
							break;
						case 'H':
							cs2 = " Hearts";
							break;
						case 'S':
							cs2 = " Spades";
							break;
						case 'C':
							cs2 = " Clubs";
							break;
						default:
							System.out.println("ERROR!!! Please rerun.");
					}

				//printing
				    if(cs1 != "error" && cs2 != "error")
						System.out.println("Card selected: "+cs1+""+cs2);

				//asking if they want to rerun
					System.out.print("\n\n\tWould you like to rerun? Enter \"yes\" or \"no\": ");
					rerun = sc.nextLine();

				//validation
					while(!rerun.equalsIgnoreCase("yes") && !rerun.equalsIgnoreCase("no"))
					{
						System.out.print("\n\n\tERROR! Please enter \"yes\" or \"no\": ");
						rerun = sc.nextLine();
					}



			}
			while(rerun.equalsIgnoreCase("yes"));

	  }

  }