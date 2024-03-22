/*Mrs. Kerr
  11/4/2020
  This program will demonstrate how to pass objects and how to
  return objects*/

public class PassingObjects
{
	//Declare Instance Variables
		private String password;
		private double fee, balance;

	//Create a constructor
		public PassingObjects(String password, double bal)
		{
			this.password = password;
			balance = bal;
			fee = 5;
		}

	//ACCESSOR METHODS:
		/*This method returns the balance
		  @return the balance */
		  public double getBalance()
		  {
			  return balance;
		  }

		/*This method returns the password
		  @return the password */
		  public String getPassword()
		  {
			  return password;
		  }

		/*This method returns the fee
		  @ return the fee */
		  public double getFee()
		  {
			  return fee;
		  }


	/*MUTATOR METHODS:
		This method will set the fee
		@param fee, a double amount for the fee */

		public void setFee(double fee)
		{
			this.fee = fee;
		}

		/*This method will reset the password
		  @param password, a String to change the password */
		  public void setPassword(String password)
		  {
			  this.password = password;
		  }

//We will add more methods here
		/*check to see if a charge needs to be added due to not having enough
		  money in your account
		  @param b a PassingObject object */
		  public void chargeFee(PassingObjects b)
		  {
			  final double MIN_BALANCE = 10;

			  if(b.getBalance() < MIN_BALANCE)
			  	  balance -= fee;
		  }

		  /*this method gets the better balance
		  	@param b1 a PassingObjects object
		  	@param b2 a PassingObjects object
		  	@return better an object that has the better account */
		  	public static PassingObjects betterBalance(PassingObjects b1, PassingObjects b2)
		  	{
				if(b1.getBalance() > b2.getBalance())
					return b1;
				else
					return b2;

			}


}


