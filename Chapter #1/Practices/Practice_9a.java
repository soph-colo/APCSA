/*Sophia Colonello
  9/30/20
  this program willa sk the user for a character and will tell the user if the character is lowercase, uppercase, or a digit */

  import java.util.Scanner;

  public class Practice_9a
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //variable
		  	char ch;

		  //getting the user's character
		  	System.out.print("\n\nPlease enter a character: ");
		  	ch = sc.next().charAt(0);

		  //determing what it is
		  	if(Character.isDigit(ch))
		  		System.out.println("\n\n"+ch+" is a digit\n\n\n\n\n");
		  	else
		  	{
				if(Character.isUpperCase(ch))
					System.out.println("\n\n"+ch+" is upper case\n\n\n\n\n");
				else
					System.out.println("\n\n"+ch+" is lower case\n\n\n\n\n");
			}


	  }
  }