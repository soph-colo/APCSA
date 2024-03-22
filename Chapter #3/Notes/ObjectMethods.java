/*Mrs. Kerr
  11/19/2020
  This method will go over the toString, equals, and hashCode methods
  that will go into a class */

public class ObjectMethods
{
	//Instance variables
		private double x, y;

	//Constructor
		public ObjectMethods(double x, double y)
		{
			this.x = x;
			this.y = y;
		}



	/*toString method to display the numbers that are stored in the object
	  @return the numbers in String form*/

	 public String toString()
	  { return "The numbers are " + x + " and " + y; }



	/*Added: toString method returns a string that "textually represents" this object.
	The result should be a concise but informative representation that is easy
	for a person to read*/

	//**********MAIN METHOD*********************************************************
	public static void main(String[] args)
	{


		//Create an object
			ObjectMethods ex = new ObjectMethods(7,10);

		//Display the object
			System.out.println(ex);

			/*When we attempt to print an object, the inherited toString
			method is invoked.  What you will see is the class's name followed
			by the @ and then numbers that represent the address memory of the
			object.

			For us to just print the the object we need to override the toString
			method.  Even if your program does not need to print an object,
			you should always define a toString method to help with debugging.

			NOTE: Array objects do NOT hav a toString method.  We will need
					to print each individual element.


		equals METHOD:
			All classes inherit the equals method from the Object class
			It will return a boolean
				TRUE - If the object and another are the same object.
				FALSE - Otherwise

			Being the same object means referencing the same memory slot*/

			ObjectMethods ex1 = new ObjectMethods(7,10);
			System.out.println("Are these objects equal? \t" + ex.equals(ex1));

			/*NOTICE: this is false, you are usually thinking about comparing
			the content of the object, but this compares the reference

			Think about the String objects diagram I showed!*/

			ObjectMethods ex2 = ex;
			System.out.println("Are these objects equal? \t" + ex.equals(ex2));

			/*The equals method returns true if the object and another object are the
			same object.  And same object means referencing the same memory slot.

			If you want to compare the content of two objects we can override the
			equals method in our class to do this (with another method)


		hashCode METHOD:
			Every class inherits the hashCode method from the Object class

			The value returned by this method is an integer that is produced by some
			formula that maps your object to an address in a hash table.

			A given object will always produce the same hash code.
				If two objects are equal then they produce the same hash code.

				However the opposite is not always true...Just because two hash codes
				are the same, it does not mean that the two objects are the same.

			If you override the equals method you should override the hashCode method
			at the same time.  However the AP Exam does not test on this, you just have
			to understand the idea of hash codes.

			WHAT YOU SHOULD UNDERSTAND:
				Every object is associated with an integer value called its hash code
				and the objects that are equal have the same has codes.

			Additional Thoughts:
			-A hash code is an integer value that is assiciated with each object in Java.
			-Its main purpose is to facilitate hashing in hash tables, which are used by
					data structures like HashMap.
			*/

	}
}
