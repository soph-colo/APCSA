/*Sophia Colonello
  11/5/20
  this program will be the driver program that will take the user's information for their car */

  import java.util.Scanner;

  public class Practice_16a
  {
	  public static void main(String[] args)
	  {

		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //variables
		  	String choice = "f";
		  	String make = "m";
		  	int year = 0;
		  	String color = "c";

		  //constructors
		  	Car sophiaCar = new Car();
		  	Car userCar = new Car();

		  //asking what the user wants to do
		  	System.out.println("Would you like to make a copy of Sophia's car or create a new car?");
		  	System.out.print("\n\t\tType COPY or CREATE: ");
		  	choice = sc.nextLine();

		  	//validate user's input
		  		while(!choice.equalsIgnoreCase("create") && !choice.equalsIgnoreCase("copy"))
		  		{
			  		System.out.print("\t\tType COPY or CREATE:");
		  			choice = sc.nextLine();

				}
		 //if statement for next step
		 	if(choice.equalsIgnoreCase("copy"))
		 	{
			  	userCar.makeCopy(sophiaCar);
			  	sophiaCar.display(sophiaCar, userCar);
			}
			else if(choice.equalsIgnoreCase("create"))
			{
				userCar.initialization(userCar);
				sophiaCar.display(sophiaCar, userCar);
			}



	  }
  }