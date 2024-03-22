/*Mrs. Kerr
 10/12/20
 This program will demonstrate Javadoc Comments*/

 public class JavadocComments
 {
	 public static void main (String[] args)
	 {
		 /*Javadoc Comments uses Tags, so from here on out you will be using
		   them.

		   Tags can be used at the end of each comment section to provide
		   more structured information about the code being described.

		   3 Types of Tags:
		   		@param followed by the parameter's name and a description of it

		   		@return followed by a simple description of the return value

		   		@throws is used to describe an Exception which is thrown in the method


		   	Examples:
		   		Get's the first and last name of a student
		   		@return the student's name
		   			public static String getName()
		   			{
						CODE;
						return name;
					}



				Changes the name of the student to an ID number
				@param name The name is the first and last name of a student
					public static void setId(String name)
					{
						CODE;
					}


				AP QUESTION:
					/**Puts obj at location loc in this grid and returns the object
					  *previously at this location.
					  *Returns null if loc was not previously occupied
					  *Precondition: obj is not null, and loc is valid in the grid
					  *@param loc the location where object is placed
					  *@param obj the object to be placed
					  *@return the object previously at the location
					  *@throws NullPointerException if the object is null
					  */

					  //public static E put(Location loc, E obj)
			}
 }

