/*Sophia Colonello
  2/1/21
  this program will the driver program that allows the user to enter how many dice are thrown and display the result
  WRITTEN ARE AT THE BOTTOM!!!*/

  import java.util.Scanner;

  public class Practice_24a
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //variables
		  	int dice = 0;

		  //asking how many die they want
		  	System.out.print("How many dice would you like to roll?: ");
		  	dice = sc.nextInt();

		  	//validate
		  		while(dice < 0)
		  		{
					System.out.print("\n\n\tERROR! Please enter a valid number of dice: ");
					dice = sc.nextInt();
				}

			//constructors
		  		ManyDice md = new ManyDice(dice);

		  //if statement to determine which class to call
		  	System.out.println(md);

	  }
  }

  /*WRITTEN:

  	2.	countNegs:
  			-the method is efficent.
  			-the best case for this method would be the least amount of runs. in this case, the least amount of loops would run if the array was sorted.
  			 since the method uses the bare minimum (for each loop, and an if statement), it can be efficent with different array lengths/values.
  	    	-the worst case for this method would be the most amount of runs. in this case, the most amount of loops would run if the array was scrambled and
  	    	 more runthroughs were needed.

  	    second code:
  	    	-this method is not very efficent.
  	     	-the best case for this method would be the least amount of runs. in this case, combining some of the code and
  	     	 checking to see if the task has been accomplished and terminating would help.
  	     	-the worst case for this method would be if there were many more runs than necessary. this code requires a lot of runs, even after
  	     	 the task is accomplished.

  	3.	b

  	4. 	a
  		*/