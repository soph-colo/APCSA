public class AbstractNotes
{
	public static void main(String[] args)
	{
		/*ABSTRACT CLASS:
			Is a superclass that represents an abstract concept, and therefore
			cannot have an object created of it.

			We do this to force a behavior on a subclass(es)

			It will contain atleast one method that is un-implemented
				- Abstract methods contain no body, and just a header and
				  then a semicolon
				- The rationale is that there no good default code for the
				  method.
				- Every subclass of this abstract class needs to override the
				  method or else that subclass is also abstract.

			CODE:

				public abstract class AbstractClassName
				{
					public void abstractMethod();
				}


			-we can still use extends on an abstract Class
				public abstract class SubClass extends AbstractClass
					-both classes are abstract here

			-eventually in the heirarchy you would need a class to NOT be abstract
				public class Sub extends SubClass


		NOTES:
			1.) An abstract class can have both instance variables, concrete methods
			    (nonabstract), and abstract methods

			2.) Abstract methods are declared with the keyword abstract
			    Have no method body
			    Header is terminated with a semicolon

			3.) You subclasses must override ALL abstract methods, unless that subclass
			    is also abstract.  But then that subclass has to have a subclass.

			4.) An abstract class may or may not have constructors.

			5.) No instances can be created for an abstract class!!! NO OBJECTS

			6.) Polymorphsim works with abstract classes.

		*/




	}
}