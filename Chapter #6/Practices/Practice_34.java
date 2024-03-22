/*Sophia Colonello
  3/18/21
  this program will be the driver to demonstrate our property interface
  WRITTEN IS BELOW*/

  import java.util.Scanner;
  import java.text.DecimalFormat;

  public class Practice_34
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);
		  	DecimalFormat df = new DecimalFormat("$#,###.00");
		  	DecimalFormat DF = new DecimalFormat("#,###");

		  //variable
		  	char con = ' ';
		  	int count = 0, choice = 0;

		  //constructor
		  	Property[] properties = new Property[50];

		  //do-while loop
		  	for(int i = 0; i < properties.length; i++)
		  	{
				System.out.print("\n\nWhat type of house would you like to put on the market?\n\t1. Family Home\n\t2. Townhouse\n\t3. Condominium\n\tEnter here: ");
				choice = sc.nextInt();

					//validation
						while(choice < 1 || choice > 3)
						{
							System.out.print("\n\n\t\tERROR! Please enter a valid choice: ");
							choice = sc.nextInt();
						}

				//if statement
					if(choice == 1)
						properties[i] = new FamilyHome();
					else if(choice == 2)
						properties[i] = new TownHome();
					else
						properties[i] = new Condominium();

				//getting all the values
					properties[i].address();
					properties[i].price();
					properties[i].squareFootage();
					properties[i].bedrooms();
					properties[i].bathrooms();
					properties[i].fireplace();
					properties[i].pool();

					//getting the specifics
						if(choice == 1)
							((FamilyHome)properties[i]).acres();
						else if(choice == 2)
						{
							((TownHome)properties[i]).hoaFees();
							((TownHome)properties[i]).hoaRules();
						}
						else if(choice == 3)
						{
							((Condominium)properties[i]).hoaFees();
							((Condominium)properties[i]).hoaRules();
							((Condominium)properties[i]).floor();
						}

				//printing the values
					System.out.println("\n\nHere is your listing: ");
					System.out.println("\n\tAddress:\t"+properties[i].getAddress());
					System.out.println("\tPrice:\t\t"+df.format(properties[i].getPrice()));
					System.out.println("\tSquare Footage:\t"+DF.format(properties[i].getSquareFootage()));
					System.out.println("\tBedrooms:\t"+properties[i].getBedrooms());
					System.out.println("\tBathrooms:\t"+properties[i].getBathrooms());
					System.out.println("\tFireplace:\t"+properties[i].getFireplace());
					System.out.println("\tPool:\t\t"+properties[i].getPool());

						//printing specifics
							if(choice == 1)
								System.out.println("\tAcres:\t\t"+((FamilyHome)properties[i]).getAcres());
							else if(choice == 2)
							{
								System.out.println("\tHOA Fees:\t"+df.format(((TownHome)properties[i]).getHOAFees()));
								System.out.println("\tHOA Rules:\t"+((TownHome)properties[i]).getHOARules());

							}
							else if(choice == 3)
							{
								System.out.println("\tHOA Fees:\t"+df.format(((Condominium)properties[i]).getHOAFees()));
								System.out.println("\tHOA Rules:\t"+((Condominium)properties[i]).getHOARules());
								System.out.println("\tFloor:\t\t"+((Condominium)properties[i]).getFloor());
							}

				//asking if they want to continue
					sc.nextLine();
					System.out.print("\n\nDo you have any more properties to list? (y/n): ");
					con = sc.nextLine().charAt(0);

						//validation
							while(!(con == 'n' || con == 'N') || !(con == 'y'|| con == 'Y'))
							{
								System.out.print("\n\n\t\tERROR! Pleas enter \"y\" or \"n\": ");
								con = sc.nextLine().charAt(0);
							}

				//break?
					if(con == 'n' || con == 'N')
						break;
			}


	  //exit statement
	  	System.out.println("\n\n\t\tGood luck with your listings!\n\n\n\n\n\n\n");
	}
  }
  /*WRITTEN:

	1. c

	2. c

	3. c

	4. e

	5. a

	6. b
  */