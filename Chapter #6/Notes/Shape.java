	/*Mrs. Koegler
  This program will show and example of an Abstract class*/

public abstract class Shape
{
	//Instance Variable
		private String name;

	//Constructor
		public Shape(String name)
		{this.name = name;  }

	//Accessor
		public String getName()
		{ return name; }

	//Abstract methods
		public abstract double area();
		public abstract double perimeter();

			/*the area is calculated differently depending on the shape

			  perimeter is always the sides added up, but depending on the shape, determines
			  how many sides

			  since every shape has an area and perimeter, declaring them as
			  abstract ensures each subclass has to create that method */


	/*Create other methods in the Superclass that call the methods that are
	  abstract*/
	  public double semiPerimeter()
	  { return perimeter()/2;}

}


class Circle extends Shape
{
	//Instance variable
		private double radius;

	//Constructor
		public Circle(double r)
		{
			super("Circle");
			radius = r;
		}

	//HAVE to give code to the abstract methods since the Circle class is not abstract
		public double area()
		{
			return Math.PI*Math.pow(radius,2);
		}

		public double perimeter()
		{
			return 2*Math.PI*radius;
		}

}


class Rectangle extends Shape
{
	//Instance Variables
		private double length, width;

	//Constructor
		public Rectangle(double l, double w)
		{
			super("Rectangle");
			length = l;
			width = w;
		}

		public Rectangle(double l, double w, String name)
		{
			super(name);
			length = l;
			width = w;
		}


	//Give code to abstract methods
		public double area()
		{
			return length*width;
		}
		public double perimeter()
		{
			return 2*length+2*width;
		}

}

class Square extends Rectangle
{
	//Constructor
		public Square(double side)
		{
			super(side,side, "Square");
		}


}


















