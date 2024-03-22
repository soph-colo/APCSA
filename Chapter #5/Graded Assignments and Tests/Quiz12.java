/*Sophia Colonello
  This program will simulate the Spinner class and the MultiSpinner class

  I apologize, I ran out of time to properly format so it is a little messy...*/

import java.util.Scanner;

public class Quiz12
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		//Simulation of a Spinner
			System.out.println("How many spots would you like on the spinner?");
			int spots = sc.nextInt();
				if(spots <=1)
					spots = Validate(sc);


		//Create spinner object
			Spinner userSpin = new Spinner(spots);
			userSpin.spin();


		//Print result
			System.out.println("\n\n\tThe spinner landed on " + userSpin);


		//Simulation of multiple spinners
			System.out.println("\n\nHow many spinners do you need?");
			int numOfSpinners = sc.nextInt();
				if(numOfSpinners <=1)
					numOfSpinners = Validate(sc);

			System.out.println("How many spots would you like on the spinner?");
			spots = sc.nextInt();
				if(spots <=1)
					spots = Validate(sc);


			MultiSpinners manySpinners = new MultiSpinners(spots, numOfSpinners);
			manySpinners.spinAll();
			System.out.println("\n\n\tThe results are " + manySpinners);

	}

	/*This method will be called if the input was invalid.
	  @return an integer that is a valid number */
		public static int Validate(Scanner sc)
		{
			int num=-1;

			while(num <=1)
			{
				System.out.println("Please enter a valid number of spots on the spinner.");
				num = sc.nextInt();
			}

			return num;
		}
}