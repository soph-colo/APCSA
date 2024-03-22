/*Sophia Colonello
  11/11/20
  this program will be the class for our chapter 2 test. it will manipulate fractions */

  import java.util.Scanner;
  import java.text.DecimalFormat;

  public class FractionClass2
  {
	  //instance variables
	  	private int num;
	  	private int den;

	  //constructors
	  	public FractionClass2(int num, int den)
	  	{
			this.num = num;
			this.den = den;
		}

	  	public FractionClass2()
	  	{
			num = 0;
			den = 0;
		}

	  //mutator methods
	  	public void setNum(int num)
	  	{
			this.num = num;
		}

		public void setDen(int den)
		{
			this.den = den;
		}

	  //accessor methods
	  	public int getNum()
	  	{
			return num;
		}

		public int getDen()
		{
			return den;
		}

	  //intialize the fraction
	  	public FractionClass2 initialize()
	  	{

		  	//scanner
				Scanner sc = new Scanner(System.in);

			//getting the fractions
				System.out.println("\nEnter the fraction: [numerator then denominator]");
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
				FractionClass2 fraction = new FractionClass2(num,den);
				return fraction;
		}

	  //addition method
	  	public FractionClass2 add(FractionClass2 fraction1, FractionClass2 fraction2)
	  	{

			//adding the two fractions
				int addNum;
				int addDen;

				addNum = (fraction1.getNum()*fraction2.getDen())+ (fraction2.getNum()*fraction1.getDen());
				addDen = (fraction1.getDen()*fraction2.getDen());
				setNum(addNum);
				setDen(addDen);

			//sending back the object
				FractionClass2 fraction = new FractionClass2(addNum,addDen);
				return fraction;

		}

	  //multiplication method
		public FractionClass2 multiply(FractionClass2 fraction1, FractionClass2 fraction2)
		{
			//multiplying the fractions
				int mulNum;
				int mulDen;

				mulNum = (fraction1.getNum()*fraction2.getNum());
				mulDen = (fraction1.getDen()*fraction2.getDen());
				setNum(mulNum);
				setDen(mulDen);

			//sending back the object
				FractionClass2 fraction = new FractionClass2(mulNum,mulDen);
				return fraction;

		}

	  //reduce method
	  	public FractionClass2 reduce(FractionClass2 answerFraction)
	  	{
			//variables
				int num = answerFraction.getNum();
				int den = answerFraction.getDen();

			//fixing the signs
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

			//divisability
				if(num == den)
				{
					setNum(1);
					setDen(1);
				}
				for(int i = num; i > 0; i--)
				{
					if(num%i == 0 && den%i == 0)
					{
						num /= i;
						den /= i;
						setNum(num);
						setDen(den);
					}
				}


			//defualt return
				FractionClass2 fraction = new FractionClass2(num,den);
				return fraction;

		}

	  //print method
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

				System.out.println("\t\t"+df.format(decimal));
		}
  }