/*Sophia Colonello
  11/11/20
  this program will be the class for our chapter 2 test. it will manipulate fractions by initializing, adding, multiplying,
  reducing, and printing, all accessed through the Test2 file*/

  import java.util.Scanner;
  import java.text.DecimalFormat;

  public class FractionClass
  {
	  //instance variables
	  	private int num;
	  	private int den;

	  //constructors
	  	public FractionClass(int num, int den)
	  	{
			num = 0;
			den = 0;
		}

		public FractionClass()
		{

		}

	  //mutator methods- will set each value
	  	public void setNum(int num)
	  	{
			this.num = num;
		}

		public void setDen(int den)
		{
			this.den = den;
		}

	  //accessor methods- will return each value
	  	public int getNum()
	  	{
			return num;
		}

		public int getDen()
		{
			return den;
		}

	  /*this method will initialize the fraction objects
	  	@return the initalized fraction object */
	  	public FractionClass initialize()
	  	{
			//scanner
				Scanner sc = new Scanner(System.in);

			//getting the fractions
				System.out.println("\nEnter the fraction: [numerator then denimator]");
				num = sc.nextInt();
				den = sc.nextInt();

				//while loop to make sure the user put in the correct info
					while(den == 0)
					{
						System.out.print("\n\n\t\tERROR! Please enter a number that is NOT a zero: ");
						den = sc.nextInt();
					}

				//setting the num and den to
					setNum(num);
					setDen(den);

			//return an object
				FractionClass fraction = new FractionClass(num,den);
				return fraction;
		}

	  /*this method will add the two fractions together
	  	@param fraction1 is the first fraction
	  	@param fraction2 is the second fraction
	  	@return fraction is the added fraction */
	  	public FractionClass add(FractionClass fraction1, FractionClass fraction2)
	  	{
			//if statement to make sure the user put in values first
				if(fraction1 == null || fraction2 == null)
				{
					fraction1.initialize();
					fraction2.initialize();
				}
			//variables
				int addNum;
				int addDen;

			//adding
				addNum = (fraction1.getNum()*fraction2.getDen())+(fraction2.getNum()*fraction1.getDen());
				addDen = (fraction1.getDen()*fraction2.getDen());

			//setting the nums
				setNum(addNum);
				setDen(addDen);

			//returning the object
				FractionClass fraction = new FractionClass(addNum,addDen);
				return fraction;
		}

	/*this method will multiply the two fractions together
		@param fraction1 is the first fraction
		@param fraction2 is the second fraction
		@return fraction is the multiplied fraction */
		public FractionClass multiply(FractionClass fraction1, FractionClass fraction2)
		{
			//variables
				int mulNum;
				int mulDen;

			//multiplying
				mulNum = (fraction1.getNum()*fraction2.getNum());
				mulDen = (fraction1.getDen()*fraction2.getDen());

			//setting the nums
				setNum(mulNum);
				setDen(mulDen);

			//returning the object
				FractionClass fraction = new FractionClass(mulNum,mulDen);
				return fraction;
		}

	/*this method will reduce the final fraction
		@param answerFraction is the fraction object to be reduced
		@return fraction is the reuced version */
		public FractionClass reduce(FractionClass answerFraction)
		{
			//variables
				int num = answerFraction.getNum();
				int den = answerFraction.getDen();

			//fixing the sings if statement
				if(num < 0 && den < 0)
				{
					num *= -1;
					den *= -1;
					setNum(num);
					setDen(den);
				}
				if(num > 0 && den < 0)
				{
					num *= -1;
					setNum(num);
				}

			//divisability if statement
				if(num == den)
				{
					setNum(1);
					setDen(1);
				}
				for(int i = num; i > 0; i--)
				{
					if(num%i == 0 && den%i==0)
					{
						num /= i;
						den /= i;
						setNum(num);
						setDen(den);
					}
				}

			//return (default)
				FractionClass fraction = new FractionClass(num,den);
				return fraction;

		}

	  //this method will print the fractions in two different formats
	  	public void print()
	  	{
			//decimal format
				DecimalFormat df = new DecimalFormat("#,###.###");

			//variables
				int num = getNum();
				int den = getDen();
				double decimal = (double)num/den;

			//printing out the fraction
				System.out.println("\n\t\t"+num+"/"+den);

			//printing out the decimal
				System.out.println("\t\t"+df.format(decimal)+"\n\n");
		}

  }