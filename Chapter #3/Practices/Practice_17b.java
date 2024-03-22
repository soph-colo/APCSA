/*Sophia Colonello
  11/16/20
  this program will display a sample thank you card. it will ask the user to enter specific values for the card and then print out
  the personalized card */

  import java.util.Scanner;

  public class Practice_17b
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //variables
		    String giftGiverName, gift, explaination, userName;

		  //do-while
		  	do
		  	{


				//making string object for card phrase
					String card = new String("Dear INSERT NAME,\n\nThank you so much for my Christmas gift! I greatly aprreciate the INSERT GIFT! It will help me EXPLAINATION!\n\nSincerely,\nYOUR NAME");
					System.out.println(card);

				//getting the info
					System.out.print("\n\nGift giver's name: ");
					giftGiverName = sc.nextLine();
					quit(giftGiverName);
					System.out.print("\n\nGift: ");
					gift = sc.nextLine();
					quit(gift);
					System.out.print("\n\nExplaination: ");
					explaination = sc.nextLine();
					quit(explaination);
					System.out.print("\n\nYour name: ");
					userName = sc.nextLine();
					quit(userName);

				//replacing
					card = card.replace("INSERT NAME", giftGiverName);
					card = card.replace("INSERT GIFT", gift);
					card = card.replace("EXPLAINATION", explaination);
					card = card.replace("YOUR NAME", userName);
					System.out.println(card+"\n\n\n\n\n\n\n");

			}
			while((!giftGiverName.equalsIgnoreCase("q") && !gift.equalsIgnoreCase("q")) && (!explaination.equalsIgnoreCase("q") && !userName.equalsIgnoreCase("q")));

	  }
	  /*this method will accept a string. it will see if te program needs to continue.
	    @param word that needs to be validated */
	    public static void quit(String word)
	    {
			if(word.equalsIgnoreCase("q"))
			{
				System.out.println("\n\n\t\tThank you for running!!!\n\n\n\n\n");
				System.exit(0);
			}
		}
  }
