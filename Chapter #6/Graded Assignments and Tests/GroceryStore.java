/*Sophia Colonello
  3/30/21
  this program will be the superclass. it will hold the basics for a grocery store*/

  import java.util.ArrayList;
  import java.util.Scanner;

  public class GroceryStore extends Store
  {
	  //array
	  	ArrayList<Product> products = new ArrayList<Product>();

	  //constructor
	  	public GroceryStore()
	  	{
			//adding the products
				products.add(new Product("Milk",5,20));
				products.add(new Product("Eggs",2.5,25));
				products.add(new Product("Cheese",3,50));
				products.add(new Product("Potato Chips", 4.25,50));
				products.add(new Product("Pretzels",3.75,30));
				products.add(new Product("Goldfish",4,25));
				products.add(new Product("Vanilla Cake",10,10));
				products.add(new Product("Chocolate Cake",10,10));
				products.add(new Product("Sugar Cookies",5,45));
				products.add(new Product("Apple",1,25));
				products.add(new Product("Banana",.5,20));
				products.add(new Product("Mango",1.5,30));

		}
		public GroceryStore(int i)
		{
		}

		public ArrayList<Product> getArray()
		{
			return products;
		}

		public void menu()
		{
			System.out.println("\n\n\t\t\t\t W E L C O M E   T O   K O E G L E R   W O R L D!!!");
		}

	  //display
	  	public void display(ArrayList<Product> products)
	  	{
			//displaying
				for(Product var: products)
					System.out.println(var);
		}

	  //add new
	  	public void addMore(ArrayList<Product> products)
	  	{
			//scanner
				Scanner sc = new Scanner(System.in);

			//variables
				String name;
				int inventory, num = 0;
				boolean check = false;

			//asking how about info
				System.out.print("\n\n\tWhat is the name of the item you would like to restock/return: ");
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

				System.out.print("\n\tHow many of that item would you like to restock/return: ");
				inventory = sc.nextInt();

					//validation
						while(inventory < 0)
						{
							System.out.print("\n\t\tERROR! Please enter a proper number of items to restock/return: ");
							inventory = sc.nextInt();

						}

			//resetting the inventory
				products.get(num).setProInventory(inventory);

		}






  }