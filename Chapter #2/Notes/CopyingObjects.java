public class CopyingObjects
{
	//Instance Variables
		private int a, b;

	//Constructor
		public CopyingObjects()
		{
			a = 0;
			b = 0;
		}

	/*Constructor
	  @param x, integer value
	  @param y, integer value */
	  	public CopyingObjects(int x, int y)
	  	{
			a = x;
			b = y;
		}

	/*This method will allow the user to set the values
	  @param x, integer value
	  @param y, integer value */
		public void setData(int x, int y)
		{
			a = x;
			b = y;
		}

	/*This method will return the value of a
	  @return the value of a */
	  	public int getA()
	  	{
			return a;
		}

	/*This method will return the value of b
	  @return the value of b */
	  	public int getB()
	  	{
			return b;
		}

	//This method will display the variables
		public void showData()
		{
			System.out.println("a = " + a);
			System.out.println("b = " + b);
		}





}


