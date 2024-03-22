//Mrs. Koegler

public class InheritanceNotes
{
	public static void main(String[] args)
	{
		/*INHERITANCE:
			Defines a relationship between objects that share characteristics.

			A new class, called a SUBCLASS, is created from an existing class, called
			a SUPERCLASS.  It does this by absorbring its state and behaviors and
			augmenting these with features unique to the new class.  We say that the
			subclass INHERITS characteristics of its superclass.

			So if the subclass inherits characteristics from the superclass which one
			is bigger?



			Inheritance provides an effective mechanism for code resuse.
				Suppose the code for a superclass has been tested and debugged.
				Since a subclass object shares features of a superclass object, the
				only new code required is the additional characteristics of the
				subclass.


			INHERITANCE HIERARCHY:
				A subclass itself could be a superclass for a different subclass.

				EXAMPLE:
										Person
										^    ^
										|	  \
				SUPERCLASS  	     Student  Employee		SUBCLASSES
								     ^     ^
								    /       \
				SUBCLASS	GradStudent 	UnderGrad

					The arrow points to it's superclass, these are our is-a relationships








			  RULES FOR A SUBCLASS:
			  	1.) A subclass inherits the public and protected variables and methods of
			  	    it's superclass.

			  	2.) A subclass can add new private instance variables

			  	3.) A subclass can add new public, private, or static methods

			  	4.) A subclass can override inherited methods (METHOD OVERWRITING)

			  	5.) A subclass should define it's own constructor

			  	6.) A subclass may not redefine a public method as private

			  	7.) A subclass may not override static methods of the superclass

			  	8.) A subclass cannot directly access private member of it's superclass,
			  	    it would have use the accessor/mutator methods


			 TYPES OF ACCESS:
			 	private - only accessible within the class
			 	protected - accessible within the class, via subclasses and members of the
			 				same package
			 	public - accessible from any class


			 IMPLEMENTING SUBCLASS:
			 	The inheritance relationship between a subclass and supercalss is specified
			 	in the declaration of the subclass, using the keyword extends

			 	public class Superclass
			 	{
					CODE;
				}

				public class Subclass extends Superclass
				{
					CODE;
				}


			*/
	}
}