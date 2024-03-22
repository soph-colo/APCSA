/*Sophia Colonello
  9/22/20
  this program will find the distance from the home office to each of the two trucks */

  import java.util.Scanner;

  public class Practice_7b
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //variable for do-while
		  	String rerun = "yes";

		  //do-while loop for rerun
		    do
		    {
				//variables IN the do-while
				 double x1, y1, x2, y2, disTruckA, disTruckB;

				//getting the information
				  System.out.print("\n\tx-coordinates for truck A: ");
				  x1 = sc.nextDouble();
				  System.out.print("\n\ty-coordinates for truck A: ");
				  y1 = sc.nextDouble();
				  System.out.print("\n\tx-coordinates for truck B: ");
				  x2 = sc.nextDouble();
				  System.out.print("\n\ty-coordinates for truck B: ");
				  y2 = sc.nextDouble();

				 //doing the math for truck A
				   disTruckA = Math.sqrt(Math.pow(x1,2)+Math.pow(y1,2));

				 //doing the math for truck B
				   disTruckB = Math.sqrt(Math.pow(x2,2)+Math.pow(y2,2));

				 //if statement
				   if(disTruckA < disTruckB)
					 System.out.println("\n\n\tTruck A is closer to home office");
				   else if(disTruckB < disTruckA)
				   	 System.out.println("\n\n\tTruck B is closer to home office");
				   else
				   	 System.out.println("Both trucks are equally far away from home office");

				//asking if they would like to rerun
				 sc.nextLine();
				 System.out.print("\n\n\tWould you like to rerun (enter \"yes\" or \"no\")? ");
				 rerun = sc.nextLine();

				//validation
				  while(!rerun.equalsIgnoreCase("yes") && !rerun.equalsIgnoreCase("no"))
				  {
					  System.out.print("\n\n\tERROR! Please enter \"yes\" or \"no\": ");
					  rerun = sc.nextLine();
				  }
			}
			while(rerun.equalsIgnoreCase("yes"));
	  }
  }