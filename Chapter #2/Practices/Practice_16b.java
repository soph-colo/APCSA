/*Sophia Colonello
  11/8/20
  this program will be the driver for the class that switches names */

  import java.util.Scanner;

  public class Practice_16b
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //variables
		  	String fullName;

		  //constructors
		  	SwitchNames og = new SwitchNames();
		  	SwitchNames nn = new SwitchNames();

		  //getting the full name
		  	System.out.print("\nPlease enter a first and middle name: ");
		  	fullName = sc.nextLine();

		  //setting the value
		  	og.setName(fullName);
		  	nn.setName(fullName);
		  	nn.swapNames(nn);

		  //printing
		  	System.out.println("\n\nThe parent's name is "+og.getFirst()+og.getMiddle());
		  	System.out.println("\n\nThe child's name is "+nn.getFirst()+nn.getMiddle());



	  }
  }