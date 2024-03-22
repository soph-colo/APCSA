/*Sophia Colonello
  10/1/20
  this program will find out the tax information depending on the user's input. */

  import java.util.Scanner;
  import java.text.DecimalFormat;

  public class Practice_10a
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc =  new Scanner(System.in);

		  //decimal format
		  	DecimalFormat df = new DecimalFormat("$#,###.00");

		  //message in the beginning
		  	System.out.println("\n\t\t\t\tS O P H I A \' S  T A X  R E P O R T E R");

		  //variable for do while
		  	char rerun = 'y';

		  //do while
		  	do
		  	{
				//variable
					int exemptions;
					double grossIncome, taxableIncome;
					String filingStatus;
					char charFilingStatus;

				//asking what their status is
					System.out.print("\n\n\nAre you (s)ingle, (m)arried, or (c)ohabiting?: ");
					filingStatus = sc.nextLine().toUpperCase();
					charFilingStatus = filingStatus.charAt(0);


					//validation
						while(!(charFilingStatus == 'S' || (charFilingStatus == 'M' || charFilingStatus == 'C')))
						{
							System.out.print("\n\n\t\tERROR!!! Please enter \"s\", \"m\", or \"c\": ");
							charFilingStatus = sc.nextLine().charAt(0);
						}

				//asking what their income is
					System.out.print("\nWhat is your gross income: ");
					grossIncome = sc.nextDouble();

					//validation
						while(grossIncome <= 0)
						{
							System.out.print("\n\n\t\tERROR!!! Please enter a positive number: ");
							grossIncome = sc.nextInt();
						}

				//asking how many exemptions
					System.out.print("\nHow many exemptions do you have: ");
					exemptions = sc.nextInt();

					//validation
						while(exemptions < 0)
						{
							System.out.print("\n\n\t\tERROR!!! Please enter a valid number: ");
							exemptions = sc.nextInt();
						}

				//calculating taxable income
					taxableIncome = grossIncome-(1000*exemptions);

					//validating
						while(taxableIncome <= 0)
						{
							System.out.print("\n\n\t\tERROR!!! You have too many exemptions, enter a lower number: ");
							exemptions = sc.nextInt();
							taxableIncome = grossIncome-(1000*exemptions);
						}

				//printing the output
					System.out.println("\n\n\t\t\t\tINCOME TAX SUMMARY");

					if(charFilingStatus == 'S')
					{
						System.out.println("\nTax Rate: 20%");
						System.out.println("\nTaxable Income: "+df.format(taxableIncome));
						System.out.println("\nTaxes Owed: "+df.format(.2*taxableIncome));
					}
					else if(charFilingStatus == 'M')
					{
						System.out.println("\nTax Rate: 25%");
						System.out.println("\nTaxable Income: "+df.format(taxableIncome));
						System.out.println("\nTaxes Owed: "+df.format(.25*taxableIncome));

					}
					else if(charFilingStatus == 'C' && taxableIncome < 20000)
					{
						System.out.println("\nTax Rate: 10%");
						System.out.println("\nTaxable Income: "+df.format(taxableIncome));
						System.out.println("\nTaxes Owed: "+df.format(.1*taxableIncome));
					}
					else if(charFilingStatus == 'C' && (taxableIncome >= 20000 && taxableIncome <= 50000))
					{
						System.out.println("\nTax Rate: 15%");
						System.out.println("\nTaxable Income: "+df.format(taxableIncome));
						System.out.println("\nTaxes Owed: "+df.format(.15*taxableIncome));
					}
					else
					{
						System.out.println("\nTax Rate: 30%");
						System.out.println("\nTaxable Income: "+df.format(taxableIncome));
						System.out.println("\nTaxes Owed: "+df.format(.3*taxableIncome));
					}

				//asking if they want to go again
					sc.nextLine();
					System.out.print("\n\nProcess another customer? (\"y\" or \"n\"): ");
					rerun = sc.nextLine().charAt(0);

					//validation
						while(!((rerun == 'y' || rerun == 'Y') || (rerun == 'n' || rerun == 'N')))
						{
							System.out.print("\n\n\t\tERROR!!! Please enter \"y\" or \"n\": ");
							rerun = sc.nextLine().charAt(0);
						}



			}
			while(rerun == 'y' || rerun == 'Y');

		//last message
			System.out.println("\n\n\n\t\t\tThank you for running!");

	  }
  }