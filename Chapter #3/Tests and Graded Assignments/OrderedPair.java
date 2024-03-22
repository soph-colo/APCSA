/*Sophia Colonello
  12/8/20
  this program will be the class... */

  public class OrderedPair
  {
	  //variables
	  	private double x;
	  	private double y;
	  	private double a;

	  //constructors
	  	public OrderedPair(double x, double y)
	  	{
			this.x = x;
			this.y = y;

		}

		public OrderedPair(double a)
		{
			this.a = a;
		}

	 //accessor methods
	 	public double getX()
	 	{
			return x;
		}

		public double getY()
		{
			return y;
		}


	 /*this method will ind the midpoint
	 	@param will be the second object
	 	@return will be the midpoint*/
		public OrderedPair findMidpoint(OrderedPair op2)
		{
			//finding the variables
				double x1 = getX();
				double x2 = op2.getX();
				double y1 = getY();
				double y2 = op2.getY();
				double xVal = 0;
				double yVal = 0;

			//doing the calculations
				xVal = (x1+x2)/2;
				yVal = (y1+y2)/2;

				OrderedPair midpoint = new OrderedPair(x,y);

			//return
				return midpoint;


		}

	  /*this method will find the quadrant the ordred pair is located in
	  	@return a statement that tells the user where */
	  	public String findQuadrant()
	  	{
			//getting the variables
				double x = getX();
				double y = getY();
				String response = "";

			//if statement to find where it is located
				if(x == 0 && y == 0)
				{
					response = "the origin";
				}
				else if(x == 0 && y != 0)
				{
					response = "the x-axis";
				}
				else if(x != 0 && y == 0)
				{
					response = "the y-axis";
				}
				else if(x > 0 && y > 0)
				{
					response = "the first quadrant";
				}
				else if(x < 0 && y > 0)
				{
					response = "the second quadrant";
				}
				else if(x < 0 && y < 0 )
				{
					response = "the third quadrant";
				}
				else
					response = "the fourth quadrant";

			//return
				return response;
		}

	  /*this method will find the distance between the two
	  	@param the first object
	  	@return the double value of the distance */
	  	public double findDistance(OrderedPair op1)
	  	{
			//finding the variables
				double x1 = getX();
				double x2 = op1.getX();
				double y1 = getY();
				double y2 = op1.getY();

			//doing the calculations
				double dis = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));

			//return
				return dis;
		}

	  /*this method will find the slope
	  	@param the first object
	  	@return the double value of the slope */
	  	public double findSlope(OrderedPair op1)
	  	{
			//finding the variables
				double x1 = getX();
				double x2 = op1.getX();
				double y1 = getY();
				double y2 = op1.getY();
				double slope = 0;

			//finding the slope
				slope = (y2-y1)/(x2-x1);

			//return
				return slope;

		}

	  /*this method will print out the coordinates
	  	@return the coordinates as a string */
	  	public String toString()
	  	{
			//printing
				return "("+getX()+","+getY()+")";

		}

	  /*this will compare the ordred pairs
	  	@param the second object
	  	@return t/f */
	  	public boolean equals(OrderedPair op2)
	  	{
			//finding the variables
				double x1 = getX();
				double x2 = op2.getX();
				double y1 = getY();
				double y2 = op2.getY();

			//comparing
				if(x1 == x2 && y1 == y2)
					return true;
				else
					return false;
		}
  }