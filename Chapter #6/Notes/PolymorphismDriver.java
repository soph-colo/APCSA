//Mrs. Koegler

public class PolymorphismDriver
{
	public static void main(String[] args)
	{
		//Demonstrate the Superclass is working
			Superclass sup = new Superclass(5,6,7);
			System.out.println(sup);

		//Print the public variable
			System.out.println("\nThe public variable is " + sup.pub);

		//Same thing for protected
			System.out.println("The protected variable is " + sup.pro);

			/*So for public and protected you can:
				objectName.instanceVariableName
			*/

		//Print the private variable
			System.out.println("The private variable is " + sup.getPrivate());


		//Show the subclass is working
			Subclass sub = new Subclass(1,2,3,4);
			System.out.println("\n\n" + sub);

		//Call methods using the subclass object that are ONLY in the Superclass
			sub.setProtected(35);
			System.out.println("\n\n" + sub);

		//Call methods that are in the Superclass and Subclass
			sub.setPublic(100);
			System.out.println("\n\n" + sub);
				/*NOTICE: because we are using the Subclass' object it goes
				   	to the setPublic that was overwritten in the Subclass*/
			sup.setPublic(1000);
				/*NOTICE: Here is used the superclass' object so it changes
				  		 the superclass's information not the subclass!!*/
			System.out.println("\n\n" + sub);


		//Change values
			sub.pro = 43;
			System.out.println("\n\n" + sub);

			/*NOTICE: Here I altered the protected variable without using a mutator
					  method */





		/*POLYMORPHISM:
			DECLARE A SUBCLASS OBJECT
				we can declare by doing it 2 different ways:
					Subclass name = new Subclass();
								or
					Superclass name = new Subclass();
			*/

			Superclass sub2 = new Subclass(10,11,12,13);
			System.out.println("\n\n"+sub2);

			/*when we declare the object as a Superclass, we have restricted this
			  object to only inherit the methods that are in the Superclass.

			  so no methods that are UNIQUE IN THE SUBCLASS will work
			  (only overriden methods will behave in a "subclass" way due to polymorphism) */

			  sub2.setPublic(115);
			  System.out.println("\n\n"+sub2);

			  /*sub2.setSubData(100);

			  		ERROR: this does not work since setPublic is ONLY in the subclass */

			/*DECLARE SUPERCLASS
				Subclass sup2 = new Superclass();
				System.out.println("\n\n"+sup2);

					ERROR: this does not work since a Superclass is not necessarily a Subclass

				Subclass sup2 = (Subclass)(new Superclass());
				System.out.println("\n\n"+sup2);

					ERROR: it compiles, but we get a ClassCastException


				SO IF YOU DECLARE AN OBJECT AS THE SUPERCLASS NAME = NEW SUBCLASS();
				YOU CAN ONLY ISE THE METHODS IN THE SUPERCALSS AND THE OVERRIDEN METHODS
				IN THE SUBCLASS!!!!*/









	}
}
