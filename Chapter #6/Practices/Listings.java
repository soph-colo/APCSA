/*Sophia Colonello
  3/18/21
  this program will be our listings super class and subclasses for the different housing types */

  import java.util.Scanner;

  public class Listings implements Property
  {
	  //instance variable
	  	String address;
	  	double price, bathrooms;
	  	int squareFootage, bedrooms;
	  	boolean fireplace, pool;

	  //constructor
	  	public Listings()
	  	{
			address = " ";
			price = 0;
			squareFootage = 0;
			bedrooms = 0;
			bathrooms = 0;
			fireplace = false;
			pool = false;
		}

	  //interface methods
	  	public void address()
	  	{
			//scanner
				Scanner sc = new Scanner(System.in);

			//asking about address
				System.out.print("\nWhat is the address of the home? ");
				address = sc.nextLine();
		}

		public void price()
		{
			//scanner
				Scanner sc = new Scanner(System.in);

			//asking about price
				System.out.print("\nWhat is the price of the home? ");
				price = sc.nextDouble();

				//validation
					while(price < 0)
					{
						System.out.print("\n\n\t\tERROR! Please enter a valid price: ");
						price = sc.nextDouble();
					}
		}

		public void squareFootage()
		{
			//scanner
				Scanner sc = new Scanner(System.in);

			//asking about sf
				System.out.print("\nWhat is the square footage of the home? ");
				squareFootage = sc.nextInt();

				//validation
					while(squareFootage < 0)
					{
						System.out.print("\n\n\t\tERROR! Please enter a valid square footage: ");
						squareFootage = sc.nextInt();
					}
		}

		public void bedrooms()
		{
			//scanner
				Scanner sc = new Scanner(System.in);

			//asking about bedrooms
				System.out.print("\nHow many bedrooms? ");
				bedrooms = sc.nextInt();

				//validation
					while(bedrooms < 0)
					{
						System.out.print("\n\n\t\tERROR! Please enter a valid number: ");
						bedrooms = sc.nextInt();
					}
		}

		public void bathrooms()
		{
			//scanner
				Scanner sc = new Scanner(System.in);

			//asking about bathrooms
				System.out.print("\nHow many bathrooms? ");
				bathrooms = sc.nextDouble();

				//validation
					while(bathrooms < 0)
					{
						System.out.print("\n\n\t\tERROR! Please enter a valid number: ");
						bathrooms = sc.nextDouble();
					}
		}

		public void fireplace()
		{
			//scanner
				Scanner sc = new Scanner(System.in);

			//asking about fp
				System.out.print("\nDoes it have a fireplace? (y/n):  ");
				char yn = sc.nextLine().charAt(0);

				//validation
					while(!(yn == 'y' || yn == 'n'))
					{
						System.out.print("\n\n\t\tERROR! Please enter \'y\' or \'n\': ");
						yn = sc.nextLine().charAt(0);
					}

			//if
				if(yn == 'y')
					fireplace = true;
		}
		public void pool()
		{
			//scanner
				Scanner sc = new Scanner(System.in);

			//asking about pool
				System.out.print("\nDoes it have a pool? (y/n):  ");
				char yn = sc.nextLine().charAt(0);

				//validation
					while(!(yn == 'y' || yn == 'n'))
					{
						System.out.print("\n\n\t\tERROR! Please enter \'y\' or \'n\': ");
						yn = sc.nextLine().charAt(0);
					}

			//if
				if(yn == 'y')
					pool = true;
		}

	  //accessor methods
	  	public String getAddress()
	  	{
			return address;
		}

		public double getPrice()
		{
			return price;
		}

		public int getSquareFootage()
		{
			return squareFootage;
		}

		public int getBedrooms()
		{
			return bedrooms;
		}

		public double getBathrooms()
		{
			return bathrooms;
		}

		public boolean getFireplace()
		{
			return fireplace;
		}

		public boolean getPool()
		{
			return pool;
		}

  }
  class FamilyHome extends Listings
  {
	  //instance variables
	  	double acres;

	  //constructor
	  	public FamilyHome()
	  	{
			super();
			acres = 0;
		}

		public void acres()
		{
			//scanner
				Scanner sc = new Scanner(System.in);

			//asking about address
				System.out.print("\nHow much land does the house sit on? (acres):  ");
				acres = sc.nextDouble();

				//validation
					while(acres < 0)
					{
						System.out.print("\n\n\t\tERROR! Please enter a proper value: ");
						acres = sc.nextDouble();
					}
		}

		public double getAcres()
		{
			return acres;
		}
  }
  class TownHome extends Listings
  {
  	  //instance variables
		double hoaFees;
		boolean hoaRules;

  	  //constructor
  	  	public TownHome()
  	  	{
  			super();
  		}

	   //HOA methods
	   	public void hoaFees()
	   	{
			//scanner
				Scanner sc = new Scanner(System.in);

			//asking for the fee amount
				System.out.print("\nHow much is the HOA fee? ");
				hoaFees = sc.nextDouble();

					//validation
						while(hoaFees < 0)
						{
							System.out.print("\n\n\t\tERROR! Please enter a valid amount: ");
							hoaFees = sc.nextDouble();
						}
		}

		public double getHOAFees()
		{
			return hoaFees;
		}

		public void hoaRules()
		{
			//scanner
				Scanner sc = new Scanner(System.in);

			//asking if the rules are strict or not

				System.out.print("\nAre the HOA rules strict? (y/n): ");
				char yn = sc.nextLine().charAt(0);

					//validation
						while(!(yn == 'y' || yn == 'n'))
						{
							System.out.print("\n\n\t\tERROR! Please enter \'y\' or \'n\': ");
							yn = sc.nextLine().charAt(0);
						}

			//if
				if(yn == 'y')
					hoaRules = true;
		}

		public boolean getHOARules()
		{
			return hoaRules;
		}

   }
  class Condominium extends TownHome
  {
	  //instance variables
	  	String floor;

	  //constructor
	  	public Condominium()
	  	{
			super();
			floor = " ";
		}
		public void floor()
		{
			//scanner
				Scanner sc = new Scanner(System.in);

			//asking about address
				System.out.print("\nWhat floor is the Condominium on? ");
				floor = sc.nextLine();

		}

		public String getFloor()
		{
			return floor;
		}

   }