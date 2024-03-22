/*Mrs. Krauland
  This program will talk about interfaces */

  public class InterfaceNotes
  {
	  public static void main(String[] args)
	  {
		/*INTERFACE:
		  	 An interface is a collection of related methods, either
		  	 abstract(header only) or default method (implementation provided
		  	 in the interface).  An interface is a contract between a program
		  	 designer and the program implementer.  The uses of interfaces is
		  	 essential to success in LARGE programming projects.

		  	 Default methods will not be tested on the AP Exam.  Non-default
		  	 methods (abstract) will be tested.  You may be required to design,
		  	 create, or modify classes that implement interfaces with abstract
		  	 methods.

		  	 The non-default methods are both public and abstract.

		  	 The classes that implement a given inteface may represent objects
		  	 that are vastly different.  However they all  have a capability of
		  	 the features expressed in the method of the interface.

		  	 Example:
		  	 	You could have a FlyingObject class and it may have methods fly and
		  	 	isFlying in it.

		  	 	Some classes that may implement the FlyingObject could be:
		  	 		Bird, Airplane, Buttefly, Witch, etc...
		  	 	These classes are very different from one another so it does not make
		  	 	sense to have them in a single inheritance hierarchy.


		  	 A class that implements an interface cand define any number of methods.
		  	 It contracts to provide implementation of ALL the non default (abstract)
		  	 methods declared in the interface.  If it fails to implement any of these
		  	 methods, the class must be declared as abstract.

		  	 CODE:
		  	 	An interface is declared with keyword: interface

		  	 	public interface FlyingObject
		  	 	{
					void fly();
					boolean isFlying();
				}

				Interfaces are implented using the keyword: implement

					public class Bird implements FlyingObject
					{


					}
					Since Bird implements FlyingObject this means that the Bird class
					MUST have fly() and isFlying() in it.

					If Bird has subclass it would automatically implement the interface
					FlyingObject, since fly and isFlying would be inherited

						public class Cardinal extends Bird
						{

						}

				A class that extends a superclass and also wants to directly implement
				an interface:

					public class LadyBug extends Insect implements FlyingObject
					{

					}

				Here Insect does not use the FlyingObject as an interface so we
				have to implement FlyingObject in the head for the LadyBug.


				ABSTRACT VS INTERFACE:
					- Use an abstract class for an object that is application-specific
					  but incomplete without its subclasses.

					- Consider using an interface when its methods are suitable for your
					  program but could be equally applicable in a variety of different
					  programs

					- An interface typically doesn't provide implementations for any of
					  its methods, whereas abstract class do.

					- It is no possible to create an instance of an interface object
					  or an abstract class object*/








	  }
  }