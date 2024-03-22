/*Sophia Colonello
  10/27/20
  this program will be the class rectanlge. it will determine if the shape is a square or a rectangle
  based on the user input */

  public class Rectangle
  {
	  //instance variables
	  	private int length, width;

	  //constructor
	  	public Rectangle(int l, int w)
	  	{
			length = l;
			width = w;
		}

	  //mutator methods
	  	public void setLength(int l)
	  	{
			length = l;
		}

		public void setWidth(int w)
		{
			width = w;
		}

	  //accessor methods
	  	public int getLength()
	  	{
			return length;
		}

		public int getWidth()
		{
			return width;
		}

	  //boolean method
	  	public boolean isSquare(int l, int w)
	  	{
			//finding out if it is a square
			  if(l == w)
			  {
				 return true;
			  }
			  else
			  	return false;
		}
  }