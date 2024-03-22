/*Mrs. Krauland
  8/31/2015
  This program will be a review how to start writing programs*/

/*What package is automatically provided?
	java.lang

  We can import all the class from the packages
  	import packageName.*;

  Or we can can call the single class from the package
    import packageName.ClassName;

  ***IMPORTANT: AP EXAM DOES NOT REQUIRE KNOWLEDGE OF PACKAGES
  				YOU WILL NOT BE EXPECTED TO WRITE IMPORT STATEMENTS!!


  Java must have atleast one class.  It contains the main method.
  The java files that comprise your program are called source files.
  A compiler converts your source code into machine-readable form called
  bytecodes.*/


public class ReviewDay1
{
	public static void main(String[] args)
	{
		/*Recall: public signals that the class or method is usable
		  				 outside of this class
		  		  static is used for methods that will not access
		  		         any objects of a class
		  		  Most methods in Java operate on objects so they are
		  		    	 not static
		  		  But the MAIN METHOD is ALWAYS STATIC

		 ***IMPORTANT: AP EXAM WILL ONLY HAVE APPLICATIONS THERE WILL
		 			BE NO APPLETS!!***

		 COMMENTS:
		 	Block Comments  /*    END SYMBOL */
		 	//Line Comments

		 /*PRINTING:
		 	What is the difference between print and println?
		 		print: prints on the current line and stop there
		 		println: completes printing on the current line then falls
		 				 to the subsequent line.*/

		 		System.out.println("Peter Piper picked a peck of pickled peppers");
				System.out.print("Sally sells sea sells down by the seashore");
				System.out.println("OOPSIE I'm running into Sally");

			//How could you get a blank line?
				System.out.println();
				System.out.print("\n");

			/*ESCAPE CODES:
				\n 	New Line
				\t 	Tab
				\" 	Puts in a double quote
				\r 	Returns
				\b	Backspace
				\'	Puts in a single quote
				\\	Puts in a \

				***IMPORTANT: FOR AP EXAM \n, \", \', \\

				*/

			System.out.println("Welcome to \na new line");
			System.out.println("He is known as \"Hothead Harry\"");
			System.out.println("The file path is d:\\Files\\");



	}

}