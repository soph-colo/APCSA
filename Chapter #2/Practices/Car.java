/*Sophia Colonello
  11/5/20
  this program will be the class that will get the functionality for a car */

  import java.util.Scanner;

  public class Car
  {
	  //declaring variables
	  	private String make;
	  	private int year;
	  	private String color;

	  //constructors
	  	public Car()
	  	{
			make = "Buick";
			year = 2013;
			color = "blue";

		}

		public Car(String make, int year, String color)
		{
			this.make = make;
			this.year = year;
			this.color = color;

		}

	  //mutator methods
	  	public void setMake(String make)
	  	{
			this.make = make;
		}

		public void setYear(int year)
		{
			this.year = year;
		}

		public void setColor(String color)
		{
			this.color = color;
		}



	  //accessor methods
	  	public String getMake()
	  	{
			return make;
		}

		public int getYear()
		{
			return year;
		}

		public String getColor()
		{
			return color;
		}

	  //copy method
		public static Car makeCopy(Car sophiaCar)
		{
			return sophiaCar;
		}

	  //initialization method
	  	public void initialization(Car userCar)
	  	{
			//scanner
				Scanner sc = new Scanner(System.in);

			//getting the info
				System.out.print("\nWhat make do you want for your car?\t\t");
				make = sc.nextLine();
				setMake(make);
				System.out.print("\nWhat car year do you want?\t\t\t");
				year = sc.nextInt();

				//validate year
					while(year < 0)
					{
						System.out.print("\n\n\t\tPlease enter a proper year: ");
						year = sc.nextInt();
					}

				setYear(year);
				sc.nextLine();
				System.out.print("\nWhat color car do you want?\t\t\t");
				color = sc.nextLine();
				setColor(color);
		}

	  //display method
	  	public void display(Car sophiaCar, Car userCar)
	  	{
			//printing
				System.out.println("\nSophia's Car:\n\n\t\tMake: "+sophiaCar.getMake()+"\n\t\tYear: "+sophiaCar.getYear()+"\n\t\tColor: "+sophiaCar.getColor());
				System.out.println("\nYour Car:\n\n\t\tMake: "+userCar.getMake()+"\n\t\tYear: "+userCar.getYear()+"\n\t\tColor: "+userCar.getColor());
		}

  }