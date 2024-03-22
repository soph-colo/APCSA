
public class Animal
{
	private String name;

	//Constructor
		public Animal(String n)
		{ name = n; }

		public Animal()
		{ name = "No Name"; }

	//This method will give a characteristic descritption of the animal
		public void characteristics()
		{
			System.out.println("I am alive");
		}

	//This method will describe how the animal moves
		public void move()
		{
			System.out.println("I move");
		}

	//toString method to return information
		public String toString()
		{
			return "My name is " + name + " and I am a " + getClass();

				/*What does the getClass() do?
					This returns the name of the class
						says..."class className" */
		}
	}

	/********************************************************************************************************/
	class Bird extends Animal
	{
		public Bird(String n)
		{
			super(n);
		}
		public Bird()
		{
			super();
		}

		public void characteristics()
		{
			super.characteristics();
			System.out.println("I have a beak");
		}
		public void move()
		{
			super.move();
			System.out.println("I fly");
		}
	}
	class Ostrich extends Bird
	{
		public Ostrich(String n)
		{
			super(n);
				/*If the method is not defined in the direct superclass
				  the call statement reverts up the heirarchy until a superclass's
				  version is defined */
		}
		public Ostrich()
		{
			super();
		}

		public void characteristics()
		{
			super.characteristics();
			System.out.println("My eggs are big!");
		}

		public void move()
		{
			System.out.println("I run fast!");
		}
	}
	class Fish extends Animal
	{
		private String waterType;

		public Fish()
		{
			super();
			waterType = "";
		}
		public Fish(String n, String w)
		{
			super(n);
			waterType = w;
		}

		public void characterisitics()
		{
			super.characteristics();
			System.out.println("I can breathe underwater");
		}
		public void move()
		{
			super.move();
			System.out.println("I swim");
		}

		public String getWaterType()
		{
			return waterType;
		}
	}















