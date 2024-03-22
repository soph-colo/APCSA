/*Mrs. Kerr
  12/3/2020
  This program will talk about the Wrapper Class*/


public class WrapperClass
{
	public static void main(String[] args)
	{



		/*Wrapper classes provide a way to use primitive data types as objects.
		The table below shows the primitive type and the equivalent wrapper class:
			Primitive:		Wrapper Class:
				byte			Byte
				short			Short
				int				Integer **Need to know 5 methods**
				long			Long
				float			Float
				double			Double **Need to know 5 methods**
				boolean			Boolean
				char			Character

		A Wrapper class takes either an existing object or a value of a
		  primitive data type and "wraps" or "boxes" it into an object.

		  The point of the wrapper class is to provide extended capabilities
		  	- It can be used in generic methods that require objects as
		  	  parameters
		    - It can be used in a Java containing class that requires items
		      to be objects (We will do this later in the year)


		  In each case, the wrapper class allows:
		  	1.) Construction of an object from a single value
		  		(Wrapping/boxing of the primitive data type)

		  	2.) Retrieve primitive data types from an object
		  		(Unwrapping/unboxing from the object)



		 The Integer Class:
		 	- The Integer class wraps a value of type int into an object
		 	- An object of type Integer contains one instance variable
		 	- keyword is Integer

		 	Here are the Integer methods you need to know for the AP EXAM:

		 	1.) Construct an Integer Object (WRAPPING/BOXING): */

		 		Integer intObj1 = new Integer(6);

		 		//You could also create a generic Object
		 		Object obj = new Integer(5);

		 		/*Object class is the superclass of the Integer class.
		 		  Integer class is a subclass of the Object class

		 		We can also declare Integer Objects like we do for Strings...*/
		 		Integer numInt = 5;
		 		System.out.println(numInt);

		   /*2.) intValue()
		   			- Returns the value of the Integer object as an int (UNBOXING)*/

		   			int num1 = intObj1.intValue();
		   			System.out.println(num1);

		   /*3.) toString()
		   			- Returns a String representing the value of the Integer Object*/

		   			System.out.println(intObj1);

		   	/*4.) equals(Object obj)
		   			Returns a boolean
		   			Returns true if and only if the Integer object has the same int value
		   			as the the Object being excepted.
		   				NOTICE: This is different that our generic equals method which
		   				        tests the reference of objects.

		   				        So the equals is overridden in the Integer class to
		   				        compare the content
		   			This method throws a ClassCassException if object is not an Integer*/

		   			Integer intObj2 = new Integer(6);

		   			if(intObj1.equals(intObj2))
		   				System.out.println("The values are the same");
		   			else
		   				System.out.println("The values are different");


					/*WE CANNOT DO THIS:
						int num2 = intObj2.intValue();

						if(num1.equals(num2))
							System.out.println("The values are the same");
		   				else
		   					System.out.println("The values are different");

		   				We CANNOT use the equals methods on int primitive data types we
		   				need to use our == to test them


		   			THIS EXAMPLE IS ALLOWED: */

		   				if(intObj1.equals(obj))
		   					System.out.println("The values are the same");
						else
		   					System.out.println("The values are different");

						//Or vice versa....if(obj.equals(intObj1))


			/*5.) compareTo(Integer variableName)
					- Returns an int
						- If the object calling it comes before the object as the argument
						  it returns a negative number
						-    ""  after "" it returns a positive number
						- If the are the same value it returns a 0


				  THIS WILL NOT WORK LIKE THE EQUALS METHOD where the object that is
				  being class HAS TO BE THE INTEGER OBJECT!!!
						BAD: ->   if(intObj1.compareTo(obj) < 0)

						How can I fix that line to make it work?
							Cast it! */

						if(intObj1.compareTo((Integer)obj) < 0)
							System.out.println(intObj1 + " is less than " + obj);


			/*The Double Class:
				It is the EXACT same thing as the Integer class, but intead of holding ints
				it holds doubles

				You will need to know 5 same methods for the AP EXAM */

















	}
}