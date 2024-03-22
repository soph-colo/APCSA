/*Sophia Colonello
  2/9/21
  this program will be the bank account class */

  import java.util.ArrayList;
  import java.text.DecimalFormat;


  public class BankAccount
  {
	  //instance variables
	  	private String name;
	  	private double amount;

	  //constructor
	  	public BankAccount()
	  	{

		}

	  	public BankAccount(String name, double amount)
	  	{
			this.name = name;
			this.amount = amount;

	  	}

	  //toString
	  	public String toString()
	  	{
			//decimal format
				DecimalFormat df = new DecimalFormat("$#,###.00");

			//return
				return "\n\t"+name+"\t\t"+df.format(amount);
		}


  }