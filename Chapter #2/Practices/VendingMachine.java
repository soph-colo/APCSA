/*Sophia Colonello
  11/2/20
  this program will be the class that simulate a vending machine */

  import java.text.DecimalFormat;
  import java.util.Scanner;

  public class VendingMachine
  {
	  //decimal format
	  	DecimalFormat df = new DecimalFormat("$#,###.00");

	  //scanner
	  	Scanner sc = new Scanner(System.in);

	  //declaring variables
	    private double m, i;
	    double sum = 0, item = 0;
	    int q, d, n, p;

	  //constructor
	  	public VendingMachine(double m, double i)
	  	{
			this.m = m;
		}

	  //mutator methods
	  	public void setMoney(double m)
	  	{
			this.m = m;
		}

		public void setItem(double i)
		{
			this.i = i;
		}

	  //accessor method
	  	public double getMoney()
	  	{
			return m;
		}

		public double getItem()
		{
			return i;
		}

	  //getting the money the user inserted
	  	public void insertMoney()
	  	{
			sum += getMoney();
			setMoney(sum);
			System.out.println("\n\n\tYou have "+df.format(sum));
		}

	  //getting the amount of the item they want to purchase
	  	public void selectItem()
	  	{
			//scanner
				Scanner sc = new Scanner(System.in);

			//variables
				int choice = 0;

			//while loop to make sure money was put in
				while(getMoney() == 0)
				{
					System.out.print("\n\n\t\tPlease enter some money before selecting item: ");
					m = sc.nextDouble();
					setMoney(m);
					insertMoney();
				}

			//making sure the user put in enough money
				while(getItem() > getMoney())
				{
					System.out.println("\n\n\t\t1. Enter more money\n\t\t2. Quit ");
					choice = sc.nextInt();

					//while loop to validate
						while(choice != 1 && choice != 2)
						{
							System.out.print("\n\n\t\tERROR! Please enter 1 or 2: ");
							choice = sc.nextInt();
						}

					if(choice == 1)
					{
						System.out.print("\n\n\t\tHow much more money: ");
						m = sc.nextDouble();
						setMoney(m);
						insertMoney();
					}
					else if(choice == 2)
					{
						System.out.println("\n\n\t\tThank you for running!\n");
						change(m, i);
						System.exit(0);
					}

				}

			//calling the change method
				change(m, i);

		}

	  //the method will give the user change back
	    public void change(double money, double item)
	    {

			//setting up values
				money -= item;

			//calculating the change
			  q = 0;
			  d = 0;
			  n = 0;
			  p = 0;
			  while(money > 0)
			  {
				  if(money > .25 && money%.25 == 0)
			  	  {
					  q = (int)Math.round(money/.25);
			  	  	  money = money - (double)q*.25;
				  }

			  	  if(money > .1 && money%.1 == 0)
			  	  {
					  d = (int)Math.round(money/.1);
					  money = money - (double)d*.1;
			  	  }

			  	  if(money > .05 && money%.05 == 0)
			  	  {
					  n = (int)Math.round(money/.05);
					  money = money - (double)n*.05;
			  	  }


			  	  if(money > .01 && money%.01 == 0)
			  	  {
					  p = (int)Math.round(money/.01);
					  money = money - (double)p*.01;
			 	  }

		  	  }

			//printing
				System.out.println("\n\n\tYour change is: \n\t\t"+q+" quarter(s)\n\t\t"+d+" dime(s)\n\t\t"+n+" nickle(s)\n\t\t"+p+" penny(ies)");

		}

	  //money validation
	  	public double moneyVal(double m)
	  	{
			//scanner
				Scanner sc = new Scanner(System.in);

			//while loop
				while(m < 0)
				{
					System.out.print("\n\n\t\tERROR! Pleas enter a valid money value: ");
					m = sc.nextDouble();
				}

		    //return
		    	return m;
		}

  }