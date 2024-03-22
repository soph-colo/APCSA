/*Sophia Colonello
  2/4/21
  this program will be the spinner class where the user can simulate using a spinner */

  import java.util.Scanner;

  public class Spinner
  {
	  //instance variables
	  	private String[] spotNames;
	  	private int randomSpin = 0;

	  public Spinner(int spots)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //array
		  	spotNames = new String[spots];

		  //getting the names of the spots
		  	System.out.println("\n");
		  	for(int i = 0; i < spots; i++)
		  	{
				System.out.print("\nName for spot #"+(i+1)+": ");
				spotNames[i] = sc.nextLine();
			}

	  }

	  //mutator method for randomSpin
	  	public void setRandomSpin(int randomSpin)
	  	{
			this.randomSpin = randomSpin;
		}

	  public void spin()
	  {
		  //random number
		  	int randomSpin = (int)(Math.random()*(spotNames.length));
		  	setRandomSpin(randomSpin);
	  }

	  public String toString()
	  {
		  return spotNames[randomSpin];

	  }

  }