/*Sophia Colonello
  3/29/21
  this program will be the customer class so that customers can access the proper methods */

  import java.util.Scanner;
  import java.util.ArrayList;
  import java.text.DecimalFormat;

  public class Customer extends GroceryStore
  {
	  //instance variable
	  	ArrayList<Product> products;
	 	ArrayList<String> purchasedName = new ArrayList<String>();
	 	ArrayList<Integer> purchasedInv = new ArrayList<Integer>();

	  public Customer(ArrayList<Product> p)
	  {
		  super(1);
		  products = p;

	  }
	  public void menu()
	  {
		    //menu
		    	super.menu();

  			//scanner
  				Scanner sc = new Scanner(System.in);

  			//variables
  				int choice = 0;

  			//while loop
  				while(choice != 5)
  				{

  					//getting choice
  						System.out.print("\n\t1. Display All Inventory\n\t2. Buy Items\n\t3. Return Items\n\t4. Print Reciept\n\t5. Exit\n\tEnter choice here: ");
  						choice = sc.nextInt();

  						//validate
  							while(choice < 1 || choice > 5)
  							{
								System.out.print("\n\n\t\tERROR! Please enter a proper choice: ");
								choice = sc.nextInt();
							}

  					//if choice
  						if(choice == 1)
  							super.display(products);
						else if(choice == 2)
							buyItems();
						else if(choice == 3)
							super.addMore(products);
						else if(choice == 4)
							printReciept();


				}

  		}

  		public void buyItems()
  		{
			//scanner
				Scanner sc = new Scanner(System.in);

			//variables
				char done = ' ';
				String name;
				int inv, num = 0;
				boolean check = false;

			//while loop
				while(done != 'n')
				{
					//asking what item they want
						System.out.print("\n\n\tWhat item would you like to purchase: ");
						name = sc.nextLine();

							//validate
								while(check == false)
								{
									for(int i = 0; i < products.size(); i++)
									{
										if(name.equalsIgnoreCase(products.get(i).getProName()))
										{
											check = true;
											num = i;
											break;
										}
									}
									if(check == true)
										break;
									else
									{
										System.out.print("\n\t\tERROR! Please enter a name of a product that we have: ");
										name = sc.nextLine();
									}
								}

						purchasedName.add(name);

					//asking how manu
						System.out.print("\n\tHow many: ");
						inv = sc.nextInt();

							//validate
								while(inv < 0)
								{
									System.out.print("\n\t\tERROR! Please enter a valid number: ");
									inv = sc.nextInt();
								}

							//while loop to check it's not more than inv
								while(inv > products.get(num).getProInventory())
								{
									System.out.print("\n\t\tERROR! We do not have enough of that in stock! Try a smaller amounter: ");
									inv = sc.nextInt();
								}

						purchasedInv.add(inv);
						products.get(num).setProInventory(-inv);

					//any more items
						sc.nextLine();
						System.out.print("\n\n\tAny more items to purchase? (y/n): ");
						done = sc.nextLine().charAt(0);

						//validation
  							while(done != 'y' && done != 'n')
  							{
  								System.out.print("\n\t\tERROR! Please enter y/n: ");
  								done = sc.nextLine().charAt(0);
  							}

					//fixing the inventory
						if(done == 'n')
							break;

				}

		}

		public void printReciept()
		{
			//decimal format
				DecimalFormat df = new DecimalFormat("$#,###.00");

			//intro
				System.out.println("\n\n\tKOEGLER WORLD: ");

			//total
				double total = 0;

			//for loop
				System.out.println("\n\tProduct:	Bought:		Price:");
				for(int i = 0; i < purchasedName.size(); i++)
				{
					for(int j = 0; j < products.size(); j++)
					{
						if(purchasedName.get(i).equalsIgnoreCase(products.get(j).getProName()))
						{
							System.out.println("\n\t"+products.get(j).getProName()+"\t\t"+purchasedInv.get(i)+"\t\t"+df.format(products.get(j).getProPrice()));
							total += purchasedInv.get(i)*products.get(j).getProPrice();

						}
					}

				}

				System.out.println("\n\n\t\t\t\tTOTAL: "+df.format(total));
		}
  }