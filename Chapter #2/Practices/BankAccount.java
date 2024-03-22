/*Sophia Colonello
  10/27/20
  this program will be the class that holds multiple methods for the driver program */

  import java.text.DecimalFormat;

  public class BankAccount
  {
	  //df
	  	DecimalFormat df = new DecimalFormat("$#,###.00");

	  //instance variables
	  	private String customerName;
	  	private double initialAmount;

	  //constructor
	  	public BankAccount(String name, double amount)
		{
			customerName = name;
			initialAmount = amount;
		}

	  //mutator methods
	    public void setCustomerName(String name)
	    {
			customerName = name;
		}

		public void setInitialAmount(double amount)
		{
			initialAmount = amount;
		}

	  //print method
	  	public void printAccountInfo(String name, double amount)
	  	{
			System.out.println("\n\n\t"+customerName+", you have "+df.format(initialAmount));
		}


  }