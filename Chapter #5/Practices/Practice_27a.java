/*Sophia Colonello
  2/9/21
  this program will be a driver program demonstrating the bank account class. it will ask the user who the bank account belongs to and to enter an amount
  this will continue until the user end it. everything will be displayed at the end.

  WRITTEN IS FOUND BELOW!!!*/

  import java.util.Scanner;
  import java.util.ArrayList;
  import java.text.DecimalFormat;

  public class Practice_27a
  {
	  public static void main(String[] args)
	  {
		  //scanner decimal and bankaccount
		  	Scanner sc = new Scanner(System.in);
		  	DecimalFormat df = new DecimalFormat("$#,###.00");
		  	BankAccount ba = new BankAccount();
			ArrayList<BankAccount> bank = new ArrayList<BankAccount>();

		  //variables
		  	boolean cont = true;
		  	String name = "", nameMax = "";
		  	double amount = 0, amountMax = 0;


		  //loop to get the info
		  	while(cont)
		  	{
				System.out.print("\n\nPlease enter the name to whom the account belongs. (\"exit\" to end): ");
				name = sc.nextLine();

					//validation
						while(name.isEmpty())
						{
							System.out.print("\n\n\t\tERROR! Please enter a name: ");
							name = sc.nextLine();
						}

					//if statement
						if(name.equalsIgnoreCase("exit"))
							break;

				System.out.print("\n\tPlease enter the amount of the deposit: ");
				amount = sc.nextDouble();

					//validation
						while(amount < 0)
						{
							System.out.print("\n\n\t\tERROR! Please enter a valid deposit amount: ");
							amount = sc.nextDouble();
						}

					//getting the max
						if(amountMax < amount)
						{
							amountMax = amount;
							nameMax = name;
						}

				bank.add(new BankAccount(name,amount));
				sc.nextLine();
			}

		  //printing the accounts
		  	System.out.println("\n\nThe accounts: ");
			for(BankAccount b: bank)
				System.out.println(b);

		 //print
		 	System.out.println("\n\n\nThe account with the largest balance belongs to "+nameMax);
		 	System.out.println("The amount is "+df.format(amountMax)+"\n\n\n");

	  }

  }
  /*WRITTEN

	2. I would you an array list. I would set it up similar to the Bear and BearStore examples. Knowing that there is a WeatherDay class, I would set
	   up the constructor to accept whatever variables I want to keep track of (temp, wind speed, etc.). Using the different array list methods,
	   a method to sort the information is possible as well.

	3. for(String al: addressList)
				System.out.println(al);
  */