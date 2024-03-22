/*Sophia Colonello
  3/29/21
  this program will be the storeowner class so store owners can access the proper methods*/

  import java.util.Scanner;
  import java.util.ArrayList;

  public class StoreOwner extends GroceryStore
  {
	  ArrayList<Product> products;

	  public StoreOwner(ArrayList<Product> p)
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
  				while(choice != 7)
  				{

  					//getting choice
  						System.out.print("\n\t1. Display All Inventory\n\t2. Add New Item\n\t3. Restock Inventory\n\t4. See Inventory\n\t5. Change Price\n\t6. Remove Item\n\t7. Exit \n\tEnter choice here: ");
  						choice = sc.nextInt();

  						//validate
  							while(choice < 1 || choice > 7)
  							{
								System.out.print("\n\n\t\tERROR! Please enter a proper choice: ");
								choice = sc.nextInt();
							}

  					//if choice
  						if(choice == 1)
  							super.display(products);
						else if(choice == 2)
							addNew();
						else if(choice == 3)
							super.addMore(products);
						else if(choice == 4)
							seeInventory();
						else if(choice == 5)
							changePrice();
						else if(choice == 6)
							removeItem();


				}

  		}
  		public void addNew()
  		{
			//scanner
				Scanner sc = new Scanner(System.in);

			//variables
				String name;
				double price;
				int inventory;
				boolean check = false;

			//getting the info
				System.out.print("\n\n\tProduct Name: ");
				name = sc.nextLine();

					//validate
						while(name.isEmpty())
						{
							System.out.print("\n\t\tERROR! Please enter a name: ");
							name = sc.nextLine();
						}

					//checking to see if we already have it
						while(check == false)
						{
							for(int i = 0; i < products.size(); i++)
							{
								if(name.equalsIgnoreCase(products.get(i).getProName()))
								{
									check = true;
									break;
								}
							}
							if(check == true)
							{
								System.out.print("\n\t\tERROR! Please enter a new product name: ");
								name = sc.nextLine();
							}
							else
								break;


						}

				System.out.print("\n\tProduct Price: ");
				price = sc.nextDouble();

					//validate
						while(price < 0)
						{
							System.out.print("\n\t\tERROR! Please enter a proper price: ");
							price = sc.nextDouble();

						}
				System.out.print("\n\tProduct Inventory: ");
				inventory = sc.nextInt();

					//validate
						while(inventory < 0)
						{
							System.out.print("\n\t\tERROR! Please enter a proper inventory value: ");
							inventory = sc.nextInt();
						}

			//products
				products.add(new Product(name, price, inventory));
		}

		public void seeInventory()
		{
			//scanner
				Scanner sc = new Scanner(System.in);

			//variables
				String name;
				int inventory, num = 0;
				boolean check = false;

			//getting the item they want
				System.out.print("\n\n\tWhat is the name of the item you would like to see the inventory for: ");
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

			//printing
				System.out.println("\n\n\tProduct: "+products.get(num).getProName()+"\tInventory: "+products.get(num).getProInventory());

		}
		public void changePrice()
		{
			//scanner
				Scanner sc = new Scanner(System.in);

			//variables
				String name;
				double price;
				int num = 0;
				boolean check = false;

			//getting the item they want
				System.out.print("\n\n\tWhat is the name of the item you would like to change the price for: ");
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

				System.out.print("\n\tWhat would you like to change the price to?: ");
				price = sc.nextDouble();

					//validate
						while(price < 0)
						{
							System.out.print("\n\t\tERROR! Please enter a proper price: ");
							price = sc.nextDouble();

						}

			//printing
				products.get(num).setProPrice(price);

		}

		public void removeItem()
		{
			//scanner
				Scanner sc = new Scanner(System.in);

			//variables
				String name;
				int inventory, num = 0;
				char remove = 'y';
				boolean check = false;

			//asking how about info
				System.out.print("\n\n\tWhat is the name of the item you would like to remove: ");
				name = sc.nextLine();

				//validation
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

				//remove item
					System.out.print("\n\t\tAre you sure you would like to remove \""+products.get(num).getProName()+"\"? (y/n): ");
					remove = sc.nextLine().charAt(0);

						//validation
  							while(remove != 'y' && remove != 'n')
  							{
  								System.out.print("\n\t\tERROR! Please enter y/n: ");
  								remove = sc.nextLine().charAt(0);
  							}

					if(remove == 'y')
						products.remove(num);
					else
						System.out.println("\n\t\tAlright, exiting.");

		}

  }