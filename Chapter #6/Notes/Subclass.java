//Mrs. Koegler

public class Subclass extends Superclass
{
	//Declaring any independent variables
		private int subData;


	//Create constructors (They are not inherited from the superclass)
		public Subclass()
		{
			super(); //this invokes the superclass's constructor
					 //must be the first line of code

			subData = 0;

		}

		public Subclass(int a, int b, int c, int d)
		{
			super(a,b,c);
			subData = d;

		}


	/*SUPER
		This allows us to access the superclass.

		Remember that constructors are not inherited.  If no constructor
		is created in the subclass, the superclass's default constructor
		that has no parameters is generated automatically.  The compiler
		provides the following default constructor:
			public Subclass()
			{
				super();
			}

		If the superclass did not have a default constructor then we would
		get a compile error message. */


	/*This is our new method that is different from the methods in the
	  Superclass */

	  	public void setSubData(int num)
	  	{
			subData = num;
		}


	//This method will override the superclass's setPublic method

		public void setPublic(int num)
		{
			System.out.println("we are in the subclass setting the public variable");
			pub = num;
				/*NOTICE: pub is not declared in this class, but since we INHERIT the public
						  and protected variables, we get free access to it */
		}


	//This method will add on to a method that is declared in the superclass
		public String toString()
		{
			return super.toString()+"\nSub Data: "+subData;

				/*to use any of the metods in the superclass that are public or protected, you can call the method
				  by doing super.methodsName */



		}








}






