/*Sophia Colonello
  10/13/20
  this program will calculate the profit based off user entered numbers and then show the user if they had a
  profit or a loss. the program will continue until the user enters their last stock sales. */

  import java.text.DecimalFormat;
  import java.util.Scanner;

  public class Practice_11b
  {
	  public static void main(String[] args)
	  {
		  //decimal format
		  	DecimalFormat df = new DecimalFormat("$#,###.00");

		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //variable for do-while
		    String rerun = "";
		    double totalProfit = 0;

		  //do-while loop
		  	do
		  	{
				//variables
					int numberShares = 0;
					double purchasePrice = 0, purchaseCom = 0, salePrice = 0, saleCom = 0, profit = 0;

				//asking the user for the information
					System.out.print("\nNumber of shares: ");
					numberShares = sc.nextInt();

					//validation
						while(numberShares < 0)
						{
							System.out.print("\n\n\t\tERROR! Please enter a positive number: ");
							numberShares = sc.nextInt();
						}

					System.out.print("\nPurchase price per share: ");
					purchasePrice = sc.nextDouble();
					purchasePrice = validation(purchasePrice);

					System.out.print("\nPurchase commission paid: ");
					purchaseCom = sc.nextDouble();
					purchaseCom = validation(purchaseCom);

					System.out.print("\nSale price per share: ");
					salePrice = sc.nextDouble();
					salePrice = validation(saleCom);

					System.out.print("\nSale commission paid: ");
					saleCom = sc.nextDouble();
					saleCom = validation(saleCom);

				//calling method
				  profit = profit(numberShares, purchasePrice, purchaseCom, salePrice, saleCom, profit);

				//calling the method to detail their profit/loss
				  profitLoss(profit);

				  totalProfit += profit;

				//seeing if they have anymore sales
				  sc.nextLine();

				//calculating total sales
				  System.out.print("\n\n\tDo you have anymore stock sales?: ");
				  rerun = sc.nextLine();

			    //validation
			      while(!rerun.equalsIgnoreCase("yes") && !rerun.equalsIgnoreCase("no"))
			      {
					  System.out.print("\n\n\t\tERROR! Please enter \"yes\" or \"no\": ");
					  rerun = sc.nextLine();
				  }


			}
			while(rerun.equalsIgnoreCase("yes"));

		 //printing out final
		 	System.out.println("\n\n\tYour total profit is "+df.format(totalProfit));


	  }
	  /*this program will accept 5 doubles and one int. it will calc the profit. it will return the profit
	    @param numberShares will be number of shares
	    @param purchasePrice will be the price per share
	    @param purhcaeCom will be the commission paid
	    @param salePrice will be the sale price per share
	    @param saleCom will be the csale commission paid
	    @param profit will be the calculated number
	    @return the calculated profit*/
	    public static double profit(int numberShares, double purchasePrice, double purchaseCom, double salePrice, double saleCom, double profit)
	    {
			//calculating the profit
			  profit = ((numberShares*salePrice)-saleCom)-((numberShares*purchasePrice)-purchaseCom);

			//return
			  return profit;
		}
	  /*this program will accept a double. it will share if there was a loss or a profit.
	   	@param profit will profit of the stock sales */
	   	public static void profitLoss(double profit)
	   	{

		  	 //decimal format
		  		DecimalFormat df = new DecimalFormat("$#,###.00");

			 //if statement to determine if it is a loss or a profit
			   if(profit > 0)
				   System.out.println("\n\n\tYour profit was +"+df.format(profit));
			   else
			   		System.out.println("\n\n\tYour loss was "+df.format(profit));
		}
	   /*this program will accept a double. it will validate the var. it will return a double
	    @param var will be validated
	    @return the var */
	    public static double validation(double var)
	    {
			//scanner
				Scanner sc = new Scanner(System.in);

			//validation
				while(var < 0)
				{
					System.out.print("\n\n\t\tERROR! Please enter a positive number: ");
					var = sc.nextDouble();
				}

			//return
				return var;
		}


  }