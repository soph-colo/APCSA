/*Sophia Colonello
  11/12/2019
  This program will talk about String Objects*/


public class StringObjects
{

	public static void main(String[] args)
	{
		/*The String class has multiple methods that we worked with.
		  We know that a String is a sequence of characters.

		  A STRING LITERAL consists of zero or more characters
		  	Examples:
		  		String str = "";
		  		       str = "2468";
		  		       str = "We need to finish this before LEAD";
		  	We can continue to change our string


		  We can also make STRING OBJECTS:
		  	String objects are immutable, which means that there are no methods
		  	to change them after they've been constructed.

		  	You can always create a new String that is mutated form of an
		  	existing String

		  */
		  	String name = new String("Harry");
		  	System.out.println(name);

		  	name = new String("Sal");
		  	System.out.println(name);

		  	/*NOTICE: We had to use the keyword "new".
		  	          Harry has NOT been changed like String literals,
		  	          he is merely discarded.
		  	          The reference  now refers to the new person Sal


		  	//We can add onto our String Objects*/
		  		name = name + " the III";
		  		System.out.println(name);


		  //Other ways to initialize String Objects
		  	String s1 = null;
		  	String s2 = new String();



	}
}