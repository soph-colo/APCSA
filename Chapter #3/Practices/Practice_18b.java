/*Sophia Colonello
  11/18/20
  this program will display the three compoenets of a user's phone number that is entered */

  import java.util.Scanner;

  public class Practice_18b
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //title
		  	System.out.println("PHONE NUMBER DISSECTOR");

		  //variable for do while
		  	String phoneNum = " ";

		  //do while
		  	do
		  	{
				//printing instructions
					System.out.print("\n\nEnter a phone number in the form cc-area-local,\nwhere cc = country code digits, area = area code digits,\nand local = local phone digits.\nOr enter q to quit: ");
					phoneNum = sc.nextLine();

				//if the user entered q
					if(phoneNum.equalsIgnoreCase("q"))
					{
						System.out.println("\n\n\t\tThank you for running!!!\n\n\n\n\n");
						System.exit(0);
					}

				//getting the code
					System.out.println("\n\n\tcountry code = "+phoneNum.substring(0,phoneNum.indexOf("-")));
					System.out.println("\tarea code = "+phoneNum.substring(phoneNum.indexOf("-")+1,phoneNum.indexOf("-")+4));
					System.out.println("\tlocal phone number = "+phoneNum.substring(phoneNum.indexOf("-")+5));

			}
			while(!phoneNum.isEmpty());
	  }
  }