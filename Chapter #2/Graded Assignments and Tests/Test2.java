/*Sophia Colonello
  11/11/20
  this program will be the driver program for the chapter 2 test. it will interact witht the FractionClass class to
  let the user enter, add, multiply and print fractions.*/

  import java.util.Scanner;

  public class Test2
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //variable for do-while
		  	char choice = 'a';
		  	int num = 0;
		  	int den = 0;

		  //constructors
		  	FractionClass fraction1 = new FractionClass();
		  	FractionClass fraction2 = new FractionClass();
		  	FractionClass answerFraction = new FractionClass();

		  //do while loop
		  	do
		  	{
				//asking the user what they would like to do
					System.out.println("What would you like to do: \n\t[E]nter Fractions\n\t[A]dd\n\t[M]ultiply\n\t[Q]uit");
					System.out.print("\n\n\tEnter: ");
					choice = sc.nextLine().charAt(0);


				//if statement based of their choice
					if(choice == 'e' || choice == 'E')
					{
						//calling the method to intialize the fraction
							fraction1.initialize();
							fraction2.initialize();

					}
					else if((choice == 'a' || choice == 'A') && (fraction1 == null || fraction2 ==null))
					{
						//calling the method to intialize the fraction since they haven't entered any values
							fraction1.initialize();
							fraction2.initialize();

					}
					else if(choice == 'a' || choice == 'A')
					{
						//calling the method to add the two fractions
							answerFraction.add(fraction1,fraction2);
							answerFraction.reduce(answerFraction);
							answerFraction.print();

					}
					else if((choice == 'm' || choice == 'M') && (fraction1 == null || fraction2 ==null))
					{
						//calling the method to intialize the fraction since they haven't entered any valyes
							fraction1.initialize();
							fraction2.initialize();

					}
					else if(choice == 'm' || choice == 'M')
					{
						//calling the method to multiply the two fractions
							answerFraction.multiply(fraction1,fraction2);
							answerFraction.reduce(answerFraction);
							answerFraction.print();

					}
					else if(choice == 'q' || choice == 'Q')
					{
						System.out.println("\n\n\n\tThank you for running!\n\n\n\n");
						System.exit(0);

					}


			}
			while(choice != 'Q' || choice != 'q');

	  }
  }