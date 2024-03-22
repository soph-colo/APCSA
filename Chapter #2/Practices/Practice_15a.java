/*Sophia Colonello
  10/29/20
  this program will be the driver program for practice 15a*/

  import java.util.Scanner;

  public class Practice_15a
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //variables
		  	int choice = 0, x = 0, y = 0, z = 0;
		  	double a = 0, b = 0, c = 0;

		  //constructor
		    Calculations ca = new Calculations(x,y,z,a,b,c);

		  //do-while loop
		  	do
		  	{
				//asking for which option
					System.out.println("Which would you like to choose: \n\t1. Calculate Sum of two integer numbers \n\t2. Average two integer numbers \n\t3. Calculate a factorial \n\t4. Calculate the area of a circle \n\t5. Calculate the area of a triangle \n\t6. Solve a quadratic equation \n\t7. Find the reciprocal \n\t8. Quit");
					choice = sc.nextInt();

					//validate the user's choice
					while(choice < 1 || choice > 8)
					{
						System.out.print("\n\t\t\tERROR! Please enter a valid number: ");
						choice = sc.nextInt();
					}

			    //switch statement for the options/getting the info
			    	switch(choice)
			    	{
						case 1:
						{
							System.out.print("\n\nInteger 1: ");
							x = sc.nextInt();

							System.out.print("\nInteger 2: ");
							y = sc.nextInt();

							ca.setNum1(x);
							ca.setNum2(y);

							ca.findSum();

							break;
						}
						case 2:
						{
							System.out.print("\n\nInteger 1: ");
							x = sc.nextInt();

							System.out.print("\nInteger 2: ");
							y = sc.nextInt();

							ca.setNum1(x);
							ca.setNum2(y);

							ca.calcAverage();

							break;
						}
						case 3:
						{
							System.out.print("\n\nInteger: ");
							x = sc.nextInt();
							x = validation(x);

							ca.setNum1(x);

							ca.factorial();

							break;
						}
						case 4:
						{
							System.out.print("\n\nRadius: ");
							a = sc.nextDouble();
							a = validation(a);

							ca.setDou1(a);

							ca.areaOfCircle();

							break;
						}
						case 5:
						{
							System.out.print("\n\nSide 1: ");
							a = sc.nextDouble();
							a = validation(a);

							System.out.print("\n\nSide 2: ");
							b = sc.nextDouble();
							b = validation(b);

							System.out.print("\n\nSide 3: ");
							c = sc.nextDouble();
							c = validation(c);

							while(((a+b < c)|| (a+c < b)) || b+c <a)
							{
								System.out.println("\n\n\tERROR! Not valid numbers for a triangle");
								System.out.print("\n\nSide 1: ");
								a = sc.nextDouble();
								a = validation(a);

								System.out.print("\n\nSide 2: ");
								b = sc.nextDouble();
								b = validation(b);

								System.out.print("\n\nSide 3: ");
								c = sc.nextDouble();
							    c = validation(c);
							}

							ca.setDou1(a);
							ca.setDou2(b);
							ca.setDou3(c);

							ca.areaOfTriangle();

							break;
						}
						case 6:
						{
							System.out.print("\n\nA: ");
							x = sc.nextInt();

							System.out.print("\n\nB: ");
							y = sc.nextInt();

							System.out.print("\n\nC: ");
							z = sc.nextInt();

							ca.setNum1(x);
							ca.setNum2(y);
							ca.setNum3(z);

							ca.solveQuadraticEquation();

							break;
						}
						case 7:
						{
							System.out.print("\n\nNumerator: ");
							x = sc.nextInt();
							while(x == 0)
							{
								throw new ArithmeticException("Cannot divide by 0");
							}

							System.out.print("\nDenominator: ");
							y = sc.nextInt();

							ca.setNum1(x);
							ca.setNum2(y);

							ca.reciprocal();

							break;

						}


					}
			}
			while(choice != 8);

		 //final message
		 	System.out.println("\n\n\t\tThank you for running!\n\n\n\n\n");
	  }
	  /*this method will accept an int. it will validate. it will return an int
	    @param n is the number being validated
	    @return the validated num */
	  	public static int validation(int n)
	  	{
			//scanner
				Scanner sc = new Scanner(System.in);

			//while
				while(n < 0)
				{
					System.out.print("\n\n\t\tERROR! Please enter a valid number: ");
					n = sc.nextInt();
				}

			//return
				return n;
		}
	  /*this method will accept a double. it will validate. it will return a double
	    @param n is the number being validated
	    @return the validated num */
	  	public static double validation(double n)
	  	{
			//scanner
				Scanner sc = new Scanner(System.in);

			//while
				while(n < 0)
				{
					System.out.println("\n\n\t\tERROR! Please enter a valid number: ");
					n = sc.nextDouble();
				}

			//return
				return n;
		}
  }

