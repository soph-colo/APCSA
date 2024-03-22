/*Sophia Colonello
  2/1/21
  this program will be the class for rolling a singular die */

  import java.util.Arrays;

  public class Die
  {
	  //instance variable
	  	private int[] roll = new int[1];

	  //constructor
	  	public Die()
	  	{
			roll();
	 	}

	   //getting the roll
	   	public void roll()
	   	{
			//storing the "roll"
				for(int i = 0; i < roll.length; i++)
					roll[i] = (int)(Math.random()*6+1);

		}

		public String toString()
		{
			return Arrays.toString(roll);

		}

  }