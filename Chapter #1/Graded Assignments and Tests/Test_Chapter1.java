/*Sophia Colonello
  10/6/20
  this program will calculate the net present value for Mr. Lowe's proposed project. the user will enter
  the present year and the discount rate. from there, the user will enter the proper net cash
  flow. the program will determine if Mr. Lowe should go forward with his project or not.*/

  import java.util.Scanner;
  import java.text.DecimalFormat;

  public class Test_Chapter1
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //decimal format
		  	DecimalFormat df = new DecimalFormat("$#,###.00");

		  //variable for do while
		  	char rerun = 'n';

		  //variables
		  	int presentYear, cashFlowYear;
			final int PRESENTYEAR;
			double discountRate, cashFlow = 0, presentValue, totalValue = 0;

		  //getting the present year and the discount rate
		  	System.out.print("Enter the present year: ");
		  	presentYear = sc.nextInt();

		  	//validation for the PRESENTYEAR
		  		while(presentYear != 2020)
		  		{
					System.out.print("\n\n\t\tERROR!!! What year is it really?: ");
					presentYear = sc.nextInt();
				}
			PRESENTYEAR = presentYear;

		  	System.out.print("\n\nEnter the discount rate as a decimal: ");
		  	discountRate = sc.nextDouble();

		  	//validation for the discountRate
		  		while(discountRate < 0 || discountRate > 1)
		  		{
					System.out.print("\n\n\t\tERROR!!! Please enter a proper discount rate: ");
					discountRate = sc.nextDouble();
				}


		  //do while loop
		  	do
		  	{

				//printing out the proper year
					System.out.print("\n\nYear of net cash flow: ");
					cashFlowYear = sc.nextInt();

					//validation
						while(cashFlowYear <= PRESENTYEAR)
						{
							System.out.println("\n\n\t\tERROR!!! Please enter a year in the future: ");
							cashFlowYear = sc.nextInt();
						}

				//getting the cashflow
					System.out.print("\n\nEnter net cash flow: ");
					cashFlow = sc.nextDouble();

			    //calculating for the present value
			    	presentValue = cashFlow/(Math.pow((1+discountRate),(cashFlowYear-PRESENTYEAR)));

			    //adding the presentValue to the total
			        totalValue += presentValue;

				//asking if there are any more cashflows
					sc.nextLine();
					System.out.print("\n\n\t\tAny more cash flows? (y/n): ");
					rerun = sc.nextLine().charAt(0);

					//validation
						while(!(rerun == 'y' || rerun == 'Y') && !(rerun == 'n' || rerun == 'N'))
						{
							System.out.print("\n\n\t\tERROR!!! Please enter \"y\" or \"n\": ");
							rerun = sc.nextLine().charAt(0);
						}

			}
			while(rerun == 'y' || rerun == 'Y');

		 //printing the present value
		 	System.out.println("\nThe new prsent value is: "+df.format(totalValue));

		 //determining if they should invest or not
		 	if(totalValue < 0)
				System.out.println("\nYou should not invest in this project.\n\n\n\n");
			else
				System.out.println("\nYou should invest in this porject!\n\n\n\n");

	  }
  }