/*Sophia Colonello
  11/23/20
  this program will be the BankAccount class and do the behind the scenes */

  import java.util.Scanner;
  import java.text.DecimalFormat;

  public class BankAccount
  {
	  //variables
	  	private String userName;
	  	private String password;
	  	private double balance;
	  	private int counter = 0;

	  //constructors
	  	public BankAccount(String userName, String password, double balance)
	  	{
			this.userName = userName;
			this.password = password;
			this.balance = balance;
		}

		public BankAccount(String userName, String password)
		{
			this.userName = userName;
			this.password = password;
		}

	 //mutator methods
	 	public void setUserName(String userName)
	 	{
			this.userName = userName;
		}

		public void setPassword(String password)
		{
			this.password = password;
		}

		public void setBalance(double balance)
		{
			this.balance = balance;
		}

	//accessor methods
		public String getUserName()
		{
			return userName;
		}

		public String getPassword()
		{
			return password;
		}

		public double getBalance()
		{
			return balance;
		}

	/*this method will compare the two objects to see if they are equal
		@param ba will be the default account
		@param ba2 will be what the user enters to be compared
		@return isEqual to let the user continue*/
		public boolean equals(BankAccount ba, BankAccount ba2)
		{
			//variable for equality
				boolean isEqual = false;

			//if statement
				if(ba2.getUserName().equals(ba.getUserName()) && ba2.getPassword().equals(ba.getPassword()))
				{
					isEqual = true;
				}
				else
					isEqual = false;

			//return
				return isEqual;

		}

	 /*this method will deposit
	   @param object will manipulate the deposits*/
	 	public void deposit(BankAccount ba)
	 	{
			//scanner
				Scanner sc = new Scanner(System.in);

			//variable
				double deposit = 0;

			//getting the deposit
				System.out.print("\n\n\tHow much would you like to deposit?: ");
				deposit = sc.nextDouble();

				//validate
					while(deposit < 0)
					{
						System.out.print("\n\n\t\tERROR! please enter a valid amount: ");
						deposit = sc.nextDouble();
					}

			//setting the balance
				ba.setBalance(ba.getBalance()+deposit);
		}

	  /*this method will withdraw
	    @param object will manage the withdraws*/
	  	public void withdraw(BankAccount ba)
	  	{
			//scanner
				Scanner sc = new Scanner(System.in);

			//variable
				double withdraw = 0;

			//getting the withdraw
				System.out. print("\n\n\tHow much would you like to withdraw?: ");
				withdraw = sc.nextDouble();

				//validate
					while(withdraw < 0)
					{
						System.out.print("\n\n\t\tERROR! please enter a valid amount: ");
						withdraw = sc.nextDouble();
					}


			//setting the balance
				ba.setBalance(ba.getBalance()-withdraw);

				//if statement for overdraw fee
					if(ba.getBalance() < 0)
					{
						ba.setBalance(ba.getBalance()-25.0);
						System.out.println("\n\n\tYou have been charged an overdraw fee of $25");
					}
		}

	  /*this method will get the monthly interest */
	  	public void interest()
	  	{

			//variable interest
				double interest = .008;
				double balance = getBalance();

			//if statement
				if(counter == 0)
				{
					balance *= 1.008;
					setBalance(balance);
				}
				else
					System.out.println("\n\tSorry, you already added your monthly interest!");


				counter++;

		}

	  /*this method will be a toString
	    @param object will be used to access the user's information*/
	  	public void toString(BankAccount ba)
	  	{
			//decimal format
				DecimalFormat df = new DecimalFormat("$#,###.00");

			//printing the results
				System.out.println("\n\n\t"+ba.getUserName()+" you have "+df.format(ba.getBalance()));
		}

	  /*this method will change the password
	    @param object will be used to change the password*/
	  	public void changePassword(BankAccount ba)
	  	{
			//scanner
				Scanner sc = new Scanner(System.in);

			//variables
				String newPassword;
				boolean passwordWorks = true;
				int lengthCounter = 0, numCounter = 0, upperCaseCounter = 0, blankCounter = 0;

			//do while
			  do
			  {
				  lengthCounter = 0;
				  numCounter = 0;
				  upperCaseCounter = 0;
				  blankCounter = 0;

				  //asking them to change the password
					System.out.print("\n\n\tWhat would you like to change your password to?: ");
					newPassword = sc.nextLine();

				  //for loop
					for(int i = 0; i < newPassword.length(); i++)
					{
						lengthCounter++;

						if(Character.isDigit(newPassword.charAt(i)))
							numCounter++;

						if(Character.isUpperCase(newPassword.charAt(i)))
							upperCaseCounter++;

						if(Character.isWhitespace(newPassword.charAt(i)))
							blankCounter++;

					}

				  //validating the new password
					if((lengthCounter < 7) || (numCounter < 1) || (upperCaseCounter < 1) || (blankCounter > 0))
					{
						passwordWorks = false;
					}
					else
						passwordWorks = true;


			  }
			  while(passwordWorks == false);



			//setting the new password
				ba.setPassword(newPassword);
		}


  }