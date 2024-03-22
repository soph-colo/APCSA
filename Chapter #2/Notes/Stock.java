/*Mrs. Kerr
  10/26/20
  This program will show students how the toString and equals Methods work in a Stock problem*/

public class Stock
{
	//Declare Instance Variables
		private String symbol;
		private double sharePrice;

	//Constructor
		public Stock(String sym, double price)
		{
			symbol = sym;
			sharePrice = price;
		}

	//Overloading Constructor
		public Stock()
		{
			symbol = "EX";
			sharePrice = 0.0;
		}

	//Mutator methods:
		public void setPrice(double price)
		{	sharePrice = price; }

		public void setSymbol(String sym)
		{	symbol = sym; }

	//Accessor methods:
		public String getSymbol()
		{	return symbol; }

		public double getPrice()
		{	return sharePrice; }



	//TOSTRING METHOD:

		public String toString()
		{
			String str = "The company's symbol is " + symbol + " and it's price is $" + sharePrice;
			return str;

		}


	//EQUALS METHOD:

		public boolean equals(Stock object)		//abc is the object
		{
			if(symbol.equalsIgnoreCase(object.symbol) && sharePrice == object.sharePrice)
				//xyzSymbol				//abcSymbol		//xyzPrice 		//abcPrice
				return true;
			else
				return false;


		}

}