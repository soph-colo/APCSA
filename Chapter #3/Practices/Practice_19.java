/*Sophia Colonello
  11/23/20
  this program will simulate a bank account with multiple different options to choose from. the user can manipulate their money, the interest amount,
  and their password.*/

  import java.util.Scanner;
  import java.text.DecimalFormat;

  public class Practice_19
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //variables
		    int counter = 0;
		    String userName = "", password = "";

		  //creating objects
		  	BankAccount ba = new BankAccount("AB84", "sTeelers84", 1548623.87);
		  	BankAccount ba2 = new BankAccount(userName, password);

		  //intro statement
		  	System.out.println("\t\t\t\t\tWELCOME TO SOPHIA'S BANK\n\n");

		  //do while loop
		  	do
		  	{
				//asking for the username
					System.out.print("\nWhat is your username: ");
					userName = sc.nextLine();
					ba2.setUserName(userName);

				//asking for the password
					System.out.print("\n\nWhat is your password: ");
					password = sc.nextLine();
					ba2.setPassword(password);

				//seeing if they entered the proper information
					if(ba.equals(ba, ba2))
					{
						transactions(ba);
					}
					else
					{
						counter++;
						System.out.println("\n\n\t\tYou entered an incorrect username or password, please try again");
					}

				//another if statement
					if(counter == 3)
					{
						System.out.println("\n\nOh no! You have been locked out, please call the help desk or try back in 24 hours\n\n\n\n");
						System.exit(0);
					}

			}
			while(counter < 3);

	  }
	  /*this method will manage the transactions
	    @param the object that needs manipulated */
	    public static void transactions(BankAccount ba)
	    {
			//scanner
				Scanner sc = new Scanner(System.in);

			//decimal format
				DecimalFormat df = new DecimalFormat("$#,###.00");

			//variable
				int choice = 0;

			//do while loop
				do
				{
					//getting the choice
						System.out.println("\n\nWhat type of transaction would you like to do?");
						System.out.println("1. Make a deposit\n2. Make a withdraw\n3. Add your monthly interest\n4. Get balance\n5. Change your password\n6. Quit");
						choice = sc.nextInt();

							//validating choice
								while(choice < 1 || choice > 6)
								{
									System.out.print("\n\n\t\tERROR! please enter a valid choice: ");
									choice = sc.nextInt();
								}

					//switch statement
						switch(choice)
						{
							case 1:
							{
								ba.deposit(ba);
								break;
							}
							case 2:
							{
								ba.withdraw(ba);
								break;
							}
							case 3:
							{
								ba.interest();
								break;
							}
							case 4:
							{
								ba.toString(ba);
								break;
							}
							case 5:
							{
								ba.changePassword(ba);
								break;
							}
							default:
							{
								System.out.println("\n\n\t\tThank you for visiting Sophia's Online Banking!!!\n\n\n\n\n\n\n");
								System.exit(0);
							}

						}
				}
				while(choice != 6);

		}
  }