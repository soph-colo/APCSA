/*Sophia Colonello
  10/30/20
  this program will simulate a loyalty proram. everytime the user spends a full dollar, they earn one point.
  for each 100 oins they have a ten-cent discount on gas is given. */

  import java.util.Scanner;
  import java.text.DecimalFormat;

  public class Quiz6
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //decimal format
		  	DecimalFormat df = new DecimalFormat("#,###.##");

		  //variables
		  	int purchases = 0;
		  	double trip = 0, total = 0, gasPrice, finalGasPrice = 0, discount = 0;

		  //asking how many times the customer went to the store
		  	System.out.print("\nHow many times has the customer made a purchase?: ");
		  	purchases = sc.nextInt();
		  	purchases = validation(purchases);

		  //getting the cost of each purchase
		  	System.out.println("\nState the cost of the "+purchases+" purchases: ");
		    for(int i = 0; i < purchases; i++)
		    {
				trip = sc.nextDouble();
				trip = validation(trip);
				total += trip;

			}

		  //asking how much the current gas price is
		  	System.out.print("\n\nHow much is the current gas price?: ");
		  	gasPrice = sc.nextDouble();
		  	gasPrice = validation(gasPrice);

		  //getting the discount amount
		    total = Math.floor(total);
		    if(total > 100)
		    {
				total /= 1000;
				discount = total/10;
			}
			else
			{
				total /= 10;
				discount = total/10;
			}


		  //printing out the final total
		    finalGasPrice = gasPrice-discount;
		  	System.out.println("\n\n\tYou earned a discount of "+(int)(discount*100)+" cents per gallon");
		  	System.out.println("\tThe price per gallon is therefore $"+df.format(finalGasPrice));


	  }
	  /*this method will accept an int. it will validate the number. it will return the validated int
	   @param num will be validated for more than 0
	   @return the validated int */

	   public static int validation(int num)
	   {
		   //scanner
		   	 Scanner sc = new Scanner(System.in);

		   //while loop for validation
		   	 while(num < 0)
		   	 {
				 System.out.print("\n\n\t\tERROR! Please enter a valid number: ");
				 num = sc.nextInt();

			 }

		  //return
		  	return num;
	   }
	  /*this method will accept a double. it will validate the number. it will return the validated double
	   @param num will be validated for more than 0
	   @return the validated double */

	   public static double validation(double num)
	   {
		   //scanner
		   	 Scanner sc = new Scanner(System.in);

		   //while loop for validation
		   	 while(num < 0)
		   	 {
				 System.out.print("\n\n\t\tERROR! Please enter a valid number: ");
				 num = sc.nextDouble();

			 }

		  //return
		  	return num;
	   }
  }
