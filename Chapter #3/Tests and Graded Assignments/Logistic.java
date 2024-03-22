/*Sophia Colonello
  11/20/20
  this program will be the logisitc class. it will calculate the growth and print the values of each step*/

  import java.util.Scanner;

  public class Logistic
  {
	  //variables
	  	private double growthFactor, x, change;

	  //constructor
	  	public Logistic()
	  	{

		}

	  //mutator methods
	  	public void setGrowthFactor(double growthFactor)
	  	{
			this.growthFactor = growthFactor;
		}

		public void setX(double x)
		{
			this.x = x;
		}

		public void setChange(double change)
		{
			this.change = change;
		}

	  //accessor methods
	  	public double getGrowthFactor()
	  	{
			return growthFactor;
		}

		public double getX()
		{
			return x;
		}

		public double getChange()
		{
			return change;
		}


	  //intialize method
	  	public void intialize()
	  	{
			//scanner
				Scanner sc = new Scanner(System.in);

			//variables
				char again = 'y';

			//do while
				do
				{
					//getting the info
						System.out.print("Enter growth factor: ");
						growthFactor = sc.nextDouble();
						setGrowthFactor(growthFactor);
						System.out.print("Enter inital value: ");
						x = sc.nextDouble();
							//validation
								while(x < 0)
								{
									System.out.println("\n\n\t\tERROR! please enter a positive number: ");
									x = sc.nextDouble();
								}
						setX(x);
						System.out.print("Enter number of steps to simulate: ");
						change = sc.nextDouble();
							//validation
								while(x < 0)
								{
									System.out.println("\n\n\t\tERROR! please enter a positive number: ");
									x = sc.nextDouble();
								}
						setChange(change);

					//math
						step();

					//ask if they want to go again
						sc.nextLine();
						System.out.print("\n\nAgain (y/n): ");
						again = sc.nextLine().charAt(0);

						//while loop to validate
							while(!(again == 'y' || again == 'y') || !(again == 'n' || again == 'N'))
							{
								System.out.println("\n\n\t\tERROR! Please enter y/n: ");
								again = sc.nextLine().charAt(0);
							}

				}
				while(again == 'y' || again == 'Y');


		}

	 //step method
	 	public void step()
	 	{
			//variables
				x = getX();

			//doing the math
				for(double i = 0; i < change; i++)
				{
					x = x + getGrowthFactor()*x*(1-x);
					System.out.printf("%n%n%f",x);
				}


		}

  }