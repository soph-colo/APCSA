/*Sophia Colonello
  2/4/21
  this program will be a class that simulates many spinners at once */

  import java.util.Scanner;
  import java.util.Arrays;

  public class MultiSpinners
  {
	  //instance variables
	  	private Spinner[] multiSpinners;
	  	private int randomSpin = 0;

	  public MultiSpinners(int spots, int numOfSpinners)
	  {
		  //array
		  	multiSpinners = new Spinner[numOfSpinners];

		  //getting the names
		  	for(int i = 0; i < numOfSpinners; i++)
		  	{
				multiSpinners[i] = new Spinner(spots);

			}
	  }

	  public void spinAll()
	  {
		  for(Spinner s: multiSpinners)
		  	s.spin();

	  }

	  public String toString()
	  {
		  return Arrays.toString(multiSpinners);
	  }

  }