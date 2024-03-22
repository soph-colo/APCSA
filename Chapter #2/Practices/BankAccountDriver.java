/*Sophia Colonello
  10/27/20
  this program will be the driver program and access the bankaccount class */

  import java.util.Scanner;

  public class BankAccountDriver
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //variables
		  	String name = "";
		  	double amount = 0;

		  //objects
		  	BankAccount ba = new BankAccount(name, amount);

		  //getting the user's name and the amount
		  	System.out.print("\nEnter your name: ");
		  	name = sc.nextLine();
		  	System.out.print("\n\nEnter you account balance: ");
		  	amount = sc.nextDouble();

		  	ba.setCustomerName(name);
		  	ba.setInitialAmount(amount);

		  //printing
		  	ba.printAccountInfo(name,amount);





	  }
  }