/*Sophia Colonello
  2/4/21
  this program will be a class that simulates many spinners at once */

  import java.util.Scanner;

  public class ManySpinners
  {
	  //instance variables
	  	private Spinner[] manySpinners;

	  public ManySpinners(int spots, int numOfSpinners)
	  {
		  //array
		  	manySpinners = new Spinner[numOfSpinners];

		  //getting the names
		  	for(int i = 0; i < numOfSpinners; i++)
		  	{
				manySpinners[i] = new Spinner(spots);

			}
	  }

	  public void spinAll()
	  {
	  }

	  public String toString()
	  {
		  return "";
	  }

  }