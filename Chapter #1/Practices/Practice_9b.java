/*Sophia Colonello
  9/30/20
  this program will determine the special car rental code from a license plate */

  import java.util.Scanner;

  public class Practice_9b
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //variables
		  	char var1, var2, var3;
		  	int var4;

		  //getting each
		  	System.out.print("\nMake: ");
		  	String make = sc.nextLine();
		  	System.out.print("\nModel:  ");
		  	String model = sc.nextLine();
		  	System.out.print("\nLicense Plate: ");
		  	String lp = sc.nextLine().toUpperCase();
		  	var1 = lp.charAt(0);
		  	var2 = lp.charAt(1);
		  	var3 = lp.charAt(2);
		  	var4 = Integer.parseInt(lp.substring(4,7));

		  //adding up the ASCII values
		  	int charSum = var1+var2+var3;
		  	int varSum = var4+charSum;

		  //dividing
		  	int findChar = varSum%26;

		  //finding the xth number after A
		  	findChar += 65;

		  //printing
		  	System.out.println("\n\nRental Code: "+(char)(findChar)+""+varSum);




	  }
  }