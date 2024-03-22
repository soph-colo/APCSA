/*Sophia Colonello
  9/22/20
  this program will find out what if a certain year is a leap year. */

  import java.util.Scanner;

  public class Practice_7a
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //variable for rerun
		  	String rerun;

		  //do-while loop for rerun
		  	do
		  	{
				System.out.print("Enter a year: ");
				int year = sc.nextInt();
				year = validation(year);

				//if statement to start the process
				  if(year%4 == 0 && year%100 == 0)
				  {
					  if(year%400 == 0)
					  	System.out.println(year+" is a leap year");
					  else
					  	System.out.println(year+" is NOT a leap year");
				  }
				  else if(year%4 == 0)
				  	System.out.println(year+" is a leap year");
				  else
				  	System.out.println(year+" is NOT a leap year");

				//asking if they would like to rerun
				 sc.nextLine();
				 System.out.print("\n\n\tWould you like to enter another number (enter \"yes\" or \"no\")? ");
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
	  /*********************************************************************************************************************
	  this method will accept an int. it will determine if the int is valid. it will return an int. */

	  public static int validation(int year)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //if statement for the validation
		  	if(year < 0)
		  	{
				System.out.print("\n\n\tERROR! Please enter a valid number: ");
				year = sc.nextInt();
			}

		  //return
		  	return year;


	  }
  }