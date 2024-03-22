/*Sophia Colonello
  11/2/20
  this program will be the driver for practice 15b */

  import java.util.Scanner;

  public class Practice_15b
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //variables

		  	int choice = 0;
		  	double money = 0, item = 0;

		  //constructor
		  	VendingMachine vm = new VendingMachine(money, item);


		  //welcome message
		  	System.out.println("\n\n\t\t\tW E L C O M E  T O  S O P H I A ' S  V E N D I N G  M A C H I N E");

		  //do-while loop
		  	do
		  	{
				money = 0;
				item = 0;

				//asking them what they would like to do
					System.out.print("\nPick an option:\n\n\t1. Insert Money\n\t2. Select an Item\n\t3. Quit");
					System.out.print("\n\tEnter: ");
					choice = sc.nextInt();

				//validation while loop
					while(choice < 1 || choice > 3)
					{
						System.out.print("\n\n\t\tERROR! Please enter 1 or 2: ");
						choice = sc.nextInt();
					}

				//if statement
					if(choice == 1)
					{
						System.out.print("\n\n\tHow much money was inserted: ");
						money = sc.nextDouble();
						money = vm.moneyVal(money);
						vm.setMoney(money);
						vm.insertMoney();

					}
					else if(choice == 2)
					{
						System.out.print("\n\n\tHow much was the item: ");
						item = sc.nextDouble();
						item = vm.moneyVal(item);
						vm.setItem(item);
						vm.selectItem();

					}
					else
					{
						System.out.println("\n\n\t\tThank you for running!");
						vm.change(money, item);
						System.exit(0);
					}



			}
			while(choice != 3);

		  //final message
		  	System.out.println("\n\n\t\tThank you for running!\n\n");

	  }
  }