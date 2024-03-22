/*Sophia Colonello
  1/20/21
  this program will allow the user to enter phone numbers to store
  SOPHIA YOU WILL NEED TO BUBBLE SORT---- REMEMBER THIS*/

  import java.util.Scanner;

  public class Practice_21c
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //variables
		  	int contacts = 0;
		  	String name = "", phoneNumber = "", yesNo = "";

		  //arrays
		  	String[] names = new String[100];
		  	String[] pn = new String[100];


		  //asking how many phone numbers
		  	System.out.print("\n\n\tHow many contact numbers would you like to enter?: ");
		  	contacts = sc.nextInt();

		  		//validation
		  			while(contacts < 0)
		  			{
						System.out.print("\n\n\t\tERROR! Please enter a valid number of contacts: ");
						contacts = sc.nextInt();
					}

		  //for loop to get the contacts
		  	for(int i = 0; i < contacts; i++)
		  	{
				sc.nextLine();
				System.out.print("\n\n\tEnter contact #"+(i+1)+" (name/phone number (ex. 1234567890)):");
				System.out.print("\n\tName: ");
				name = sc.nextLine();
				System.out.print("\tPhone Number: ");
				phoneNumber = sc.nextLine();

					//validation for phone number
						while(phoneNumber.length() < 10 || phoneNumber.length() > 11)
						{
							System.out.print("\n\n\t\tERROR! Please enter a valid phone number: ");
							phoneNumber = sc.nextLine();
						}

				names[i] = name;
				pn[i] = phoneNumber;
			}

		//properly formating the phone numbers
			for(int z = 0; z < contacts; z++)
			{
				String temp = pn[z];
				if(temp.length() == 10)
				{
					pn[z] = temp.substring(0,3)+"-"+temp.substring(3,6)+"-"+temp.substring(6);
				}
				else
				{
					pn[z] = temp.substring(0,1)+"-"+temp.substring(1,4)+"-"+temp.substring(4,7)+"-"+temp.substring(7);
				}

			}

		//asking if they would like to see the contact list
			System.out.print("\n\n\tWould you like to see your contact list? (yes/no): ");
			yesNo = sc.nextLine();

				//validation
					while(!(yesNo.equalsIgnoreCase("yes") || yesNo.equalsIgnoreCase("no")))
					{
						System.out.print("\n\n\t\tERROR! Please enter \"yes\" or \"no\": ");
						yesNo = sc.nextLine();
					}

			if(yesNo.equalsIgnoreCase("yes"))
			{
				for(int j = 0; j < contacts; j++)
				{
					System.out.println("\n\n\t"+names[j]+"\t"+pn[j]);
				}
			}
			else
				System.exit(0);

	  }
  }