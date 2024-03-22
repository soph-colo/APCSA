/*Sophia Colonello
  3/12/21
  this program will be the superclass BankAccount */

  import java.text.DecimalFormat;

  public abstract class BankAccount
  {
	  //instance variables
	  	private double balance;

	  //constructor
	  	public BankAccount(double b)
	  	{
			balance = b;
		}

	  //mutator
	  	public void setBalance(double b)
	  	{
			balance = b;
		}

	  //accessor
	  	public double getBalance()
	  	{
			return balance;
		}

	  //deposit method
	  	public void deposit(double d)
	  	{
			balance += d;
			if(balance < 0)
				balance = 0;
		}

	  //withdraw method
	  	public void withdraw(double w)
	  	{
			balance -= w;
			if(balance < 0)
				balance = 0;
		}

	  //display method -- ABSTRACT
	  	public abstract void display();

  }
  class Checking extends BankAccount
  {
	  //constructor
	  	public Checking(double b)
	  	{
			super(b);
		}

	  //writing a check method
	  	public void writeACheck(double c)
	  	{
			super.withdraw(c+1);
			if(super.getBalance() < 0)
				super.setBalance(0);
		}

	  //display
	  	public void display()
	  	{
			//decimal format
				DecimalFormat df = new DecimalFormat("$#,###.00");

			System.out.println("Account Type: Checking \nBalance: "+df.format(super.getBalance()));

		}

  }
  class Savings extends BankAccount
  {
	  //instance variable
	  	private double intRate;

	  //constructor
	  	public Savings(double b, double ir)
	  	{
			super(b);
			intRate = ir;
		}

	  //add interest rate method
	  	public void addInterest()
	  	{
			double interest = super.getBalance()*intRate;
			super.setBalance(super.getBalance()+interest);
		}

	  //display method
	  	public void display()
	  	{
			//decimal format
				DecimalFormat df = new DecimalFormat("$#,###.00");

			System.out.println("Account Type: Savings\nBalance: "+df.format(super.getBalance()));
		}


	}
	/************************************************************************************************************
	WRITTEN:

		2. keyword abstract, empty methods, and extends

		3. true

		4. true

		5. a

		6. e

		7. a
			*/
