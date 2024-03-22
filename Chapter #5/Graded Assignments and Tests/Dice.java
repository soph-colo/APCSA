/*Sophia Colonello
  2/17/21
  this will be dice class  */

  public class Dice
  {
	  public Dice()
	  {

	  }

	  public int roll()
	  {
		  //variables
		  	int roll = 0;

		  //randomroll
		  	roll = (int)Math.random()*6+1;

		  //return
		  	return roll;

	  }
  }