/*Sophia Colonello
  11/13/2020
  This program will introduce new String methods.
*/

import java.util.Scanner;

public class NewStringMethods
{
	public static void main(String[] args)
	{

		/*compareTo Method
			returns an int (ASCII distance between two Strings)
			The comparison is based on the Unicode value of each character in the strings.

			if String1.compareTo(String2) < 0
				String1 comes before String2 in the dictionary

			if String1.compareTo(String2) > 0
				String1 comes after String2 in the dictionary

			if String1.compareTo(String2) -- 0
				String1 is String2

			BECAREFUL about case sensitivity:
				ASCII
				-infinitity...0...infinity..A...Z...a...z

			Pro Tip: You can use compareToIgnoreCase() to compare two strings lexicographyically, ignoring
				lower case and upper case differences.

		*/
			String character = "Batman";

			System.out.println(character.compareTo("Spiderman"));
			System.out.println(character.compareTo("Barbie"));
			System.out.println(character.compareTo("abtman"));
			System.out.println(character.compareTo("Batman"));

			System.out.println(character.compareTo("batman"));
			System.out.println(character.compareToIgnoreCase("batman"));



		/*isEmpty()
			returns true if the String is empty, false otherwise
			A space is not considered empty */

			System.out.println(character.isEmpty());

			//Input Validation
				Scanner sc = new Scanner(System.in);
				System.out.println("\n\nPlease enter your name");
				String name= sc.nextLine();

				while(name.isEmpty())
				{
					System.out.println("\n\tERROR: You need to enter something");
					name = sc.nextLine();
				}


		/*replaceAll()
			This is the same as the replace method just called something different

			//Review: Return a new string where all "I" characters are replaced with "p" characters
					String myStr = "Hello";
					System.out.println(myStr.replace('I', 'p'));



    	  replaceFirst()
    	  	This method replaces a String with the new String ONLY in the first
    	  	occurence */

    	  	String saying = "Darius and Myles are best friends.  Darius and Myles eat lunch together";
    	  	System.out.println("\n\n" + saying.replaceFirst("Darius", "Sam"));



    	 /*trim()
    	 	Returns a String
    	 	This method removes all whitespace from the start and the end of the
    	 	String */

    	 	String wolf = "                The big bad wolf huffed and puffed and blew \t\t      ";
    	 	System.out.println(wolf.trim() + " the house down");






	}
}