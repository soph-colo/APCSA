/*Sophia Colonello
  10/29/20
  this program will be the class Calculations */

  import java.text.DecimalFormat;
  import java.util.Scanner;

  public class Calculations
  {
	  //decimal format
	  	DecimalFormat df = new DecimalFormat("#,###.##");

	  //instance variables
	  	private int x;
	  	private int y;
	  	private int z;
	  	private double a;
	  	private double b;
	  	private double c;

	  //constructor
	  	public Calculations(int x, int y, int z, double a, double b, double c)
	  	{
			this.x = x;
			this.y = y;
			this.z = z;
			this.a = a;
			this.b = b;
			this.c = c;
		}



	  //mutator methods
	  	public void setNum1(int x)
	  	{
			this.x = x;
		}

	  	public void setNum2(int y)
	  	{
			this.y = y;
		}

	  	public void setNum3(int z)
	  	{
			this.z = z;
		}

	  	public void setDou1(double a)
	  	{
			this.a = a;
		}

	  	public void setDou2(double b)
	  	{
			this.b = b;
		}

	  	public void setDou3(double c)
	  	{
			this.c = c;
		}

	  //accessor methods
	  	public int getNum1()
	  	{
			return x;
		}

		public int getNum2()
		{
			return y;
		}

		public int getNum3()
		{
			return z;
		}

	  	public double getDou1()
	  	{
			return a;
		}

		public double getDou2()
		{
			return b;
		}

		public double getDou3()
		{
			return c;
		}

	  //sum of two numbers
	  	public void findSum()
	  	{
			//variable
				int sum;

			//getting the sum
			    sum = getNum1()+getNum2();

			//calling print method
				print(sum);

		}

	  //average of two numbers
	  	public void calcAverage()
	  	{
			//variable
				double avg;

			//getting the avg;
			    avg = (getNum1()+getNum2())/2.0;

			//calling the print method
			    print(avg);
		}

	  //factorial
	  	public void factorial()
	  	{
			//variable
				int sum = 1;

			//getting the factorial
			    if(getNum1() > 0)
			    {
					for(int i = getNum1(); i > 1; i--)
					{
						sum *= i;
				    }
				}
				else
					for(int i = getNum1(); i < -1; i++)
					{
						sum *= i;
					}

			//calling print method
				print(sum);
		}

	  //finding the area of a circle
	  	public void areaOfCircle()
	  	{
			//variable
			    double area;

			//calculating area
				area = Math.PI*Math.pow(getDou1(), 2);

			//calling print method
				print(area);
		}

	  //find the area of a triangle
	  	public void areaOfTriangle()
	  	{
			//variables
				double s, area;

			//calculating
				s = (getDou1()+getDou2()+getDou3())/2.0;
				area = Math.sqrt(s*(s-getDou1())*(s-getDou2())*(s-getDou3()));

			//calling print method
				print(area);

		}

	  //solving quadratic formula
	  	public void solveQuadraticEquation()
	  	{
			//variables
			  double discriminant;

			//calling discrimininant method
				findDiscriminant();
		}

	  //finding discriminant
	  	private void findDiscriminant()
	  	{
			//variable
				double d;

			//calculating
			    d = Math.pow(getNum2(),2) - 4*getNum1()*getNum3();

			//if statement for next method
				findQuadRootNegative(d);
				findQuadRootPositive(d);
		}

	  //finding the negative square root
	  	private void findQuadRootNegative(double d)
	  	{
			//variable
				double negAns;

			//if statement
				if(d < 0)
				{
					System.out.println("\n\n\t\tAnswer: No real solutions\n\n");
				}
				else if(d == 0)
				{
			    	negAns = ((-1*getNum2())-Math.sqrt(d))/(2*Math.pow(getNum1(),2));
			    	print(negAns);

				}
				else
				{
			    	negAns = ((-1*getNum2())-Math.sqrt(d))/(2*Math.pow(getNum1(),2));
			    	print(negAns);
				}



		}

	  //finding the postive square root
	  	private void findQuadRootPositive(double d)
	  	{
			//variables
				double posAns;

			//if statement
				if(d < 0)
				{
					System.out.println("\n\n\t\tAnswer: No real solutions\n\n");
				}
				else if(d == 0)
				{
				    posAns = ((-1*getNum2())+Math.sqrt(d))/(2*Math.pow(getNum1(),2));
			    	print(posAns);

				}
				else
				{
			    	posAns = ((-1*getNum2())+Math.sqrt(d))/(2*Math.pow(getNum1(),2));
			    	print(posAns);
				}

		}

	  //getting the reciprocal
	    public void reciprocal()
	    {
			//printing
				if(getNum2() < 0 && getNum1() < 0)
				{
					System.out.println("\n\n\tThe answer is "+(-1*getNum2())+"/"+(-1*getNum1())+"\n\n");
				}
				else if(getNum1() < 0)
				{
					System.out.println("\n\n\tThe answer is -"+getNum2()+"/"+(-1*getNum1())+"\n\n");
				}
				else if(getNum2() < 0)
				{
					System.out.println("\n\n\tThe answer is -"+(-1*getNum2())+"/"+getNum1()+"\n\n");
				}
				else
					System.out.println("\n\n\tThe answer is "+getNum2()+"/"+getNum1()+"\n\n");

		}


	  //print method
	  	private void print(int n)
	  	{
			System.out.println("\n\n\tThe answer is "+df.format(n));
			System.out.println("\n\n");
		}

	  //print method for doubles
	  	private void print(double n)
	    {
			System.out.println("\n\n\tThe answer is "+df.format(n));
			System.out.println("\n\n");
		}
  }