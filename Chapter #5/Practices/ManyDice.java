/*Sophia Colonello
  2/1/21
  this program will be the class for rolling many dice */

  import java.util.Arrays;

  public class ManyDice
  {
	  //instance variables
	  	private Die[] manyDice;

	  //constructor
	  	public ManyDice(int dice)
	  	{
			manyDice = new Die[dice];

			//for loop for each value
				for(int i = 0; i < manyDice.length; i++)
					manyDice[i] = new Die();

	 	}

	   //to string method
	   	public String toString()
	   	{
			return Arrays.toString(manyDice);
		}

  }