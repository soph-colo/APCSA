/*Sophia Colonello
  3/30/21
  this program will be the driver*/

  import java.util.Scanner;
  import java.util.ArrayList;

  public class Chapter6_Project
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //variables
		  	String person = " ";
		  	int i = 0;

		  //constructor to stock items
		  	GroceryStore store = new GroceryStore();
		  	ArrayList<Product> p = store.getArray();
		  	GroceryStore user;

		  	do
		  	{
				//asking them what they are
 					System.out.print("\n\n\tAre you a Store Owner or a Customer? Or, would you like to exit: ");
 					person = sc.nextLine();

 						//if
 							if(person.equalsIgnoreCase("exit"))
 								break;

 						//validation
 							while(!(person.equalsIgnoreCase("Store Owner") || person.equalsIgnoreCase("Customer")))
 							{
 								System.out.print("\n\t\tERROR! Please enter \"Store Owner\" or \"Customer\": ");
 								person = sc.nextLine();
 							}

 				 //if statement for calls
 				 	if(person.equalsIgnoreCase("Store Owner"))
 				 	{
 				 		user = new StoreOwner(p);
				 		user.menu();
					}
 					else if(person.equalsIgnoreCase("Customer"))
 					{
 						store = new Customer(p);
 						store.menu();
					}


			}
			while(!person.equalsIgnoreCase("exit"));


	  //exit message
	  	System.out.println("\n\n\n\n\n\t\t\t\tThank you for visiting! Come again soon!\n\n\n\n\n\n\n\n\n");

	}
  }