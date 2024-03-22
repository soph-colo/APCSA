/*Mrs. Kerr
  10/25/2020
  This program will show students how the toString and Equals Methods works in a stock problem*/

public class StockDemo
{
	public static void main(String[] args)
	{

		//Create Objects
			Stock xyz = new Stock("xyz", 9.62);
			Stock abc = new Stock();

		//Send info over about abc
			abc.setSymbol("abc");
			abc.setPrice(10.13);

		//Print out information about the objects
			System.out.println("The company symbol is " + xyz.getSymbol() +
				" and the price is $" + xyz.getPrice());

			System.out.println("The company symbol is " + abc.getSymbol() +
				" and the price is $" + abc.getPrice());


		//Print out NEW ways
			System.out.println(xyz);
			System.out.println(abc);



		//See if two objects are the same
			if(xyz.equals(abc))
				System.out.println("\nThe objects are the same");
			else
				System.out.println("\nThe objects are different");

		/*DO NOT DO THIS WHEN COMPARING OBJECTS:
			companyObject1 == companyObject2

			THIS DOES NOT WORK!!!!  You need to be able to check all the
			instance variables that are held in the objects, this just
			compares the reference*/

	}
}