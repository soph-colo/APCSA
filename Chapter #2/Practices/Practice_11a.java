/*Sophia Colonello
  10/12/20
  this program will find out how much kinetic energy something has based on the input. */

  import java.text.DecimalFormat;
  import java.util.Scanner;

  public class Practice_11a
  {
	  public static void main(String[] args)
	  {
		  //decimal formatter
		  	DecimalFormat df = new DecimalFormat("#,###.##");

		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //variables
		  	double kineticEnergy = 0, mass, velocity;

		  //getting the user's input
		  	System.out.print("\nMass: ");
		  	mass = sc.nextDouble();
		  	mass = validation(mass);
		  	System.out.print("\n\nVelocity: ");
		  	velocity = sc.nextDouble();

		  //calling the KE method
		  	kineticEnergy = kinEn(mass, velocity, kineticEnergy);

		  //print
		  	System.out.println("\n\tKinetic Energy: "+df.format(kineticEnergy)+" m/s");


	  }
	  //this method will accept a double. it will validate. it will return a double
	  //@param var input of mass by user
	  //@return
	  public static double validation(double var)
	  {
		  //scanner
		    Scanner sc = new Scanner(System.in);

		  //validate
		  	while(var < 0)
		  	{
				System.out.print("\n\n\t\tERROR! please enter a valid number: ");
				var = sc.nextDouble();
			}

		  //return
		  	return var;
	  }
	  //this method will accept three doubles. it will calculate the kinetic energy. it will return a double
	  //@param mass double for KE calculation
	  //@param velocity double for KE calculation
	  //@param kineticEnergy being calculated
	  //@return the kinetic energy
	  public static double kinEn(double mass, double velocity, double kineticEnergy)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //calculating
		  	kineticEnergy = .5*mass*Math.pow(velocity,2);

		  //return
		  	return kineticEnergy;

	  }
  }