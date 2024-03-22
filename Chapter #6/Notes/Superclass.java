//Mrs. Koegler

public class Superclass
{
	//Declaring Instance Variables
		private int priv;	//this one can only be accessed from this class
		public int pub;		//this one can be accessed by ANY class
		protected int pro;	//this one can be accessed within this class, subclass, or the same package

	//Constructors
		public Superclass()
		{
			priv = 100;
			pub = 50;
			pro = 25;
		}

		public Superclass(int a, int b, int c)
		{
			priv = a;
			pub = b;
			pro = c;
		}

	//Mutator methods
		public void setPrivate(int num)
		{ priv = num; }

		public void setPublic(int num)
		{ pub = num; }

		public void setProtected(int num)
		{ pro = num; }


	//Accessor Method
		public int getPrivate()
		{ return priv; }


	//toString
		public String toString()
		{ return "Private: " + priv + "\nPublic: " + pub + "\nProtected: " + pro; }




}
