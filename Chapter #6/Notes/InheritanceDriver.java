//Mrs. Koegler

public class InheritanceDriver
{
	public static void main(String[] args)
	{
		//Demonstrate the Superclass is working
			Superclass sup = new Superclass(5,6,7);
			System.out.println(sup);



		//Print the public variable
			System.out.println("\nThe public variable is "+sup.pub);


		//Same thing for protected
			System.out.println("\nThe protected variable is "+sup.pro);

		//Print the private variable
			System.out.println("\nThe private variable is "+sup.getPrivate());

				/*so for public and protected variables you can:
					objectsName.instanceVariablesName */

		//Show the subclass is working
			Subclass sub = new Subclass(1,2,3,4);
			System.out.println("\n\n"+sub);

		//Call methods using the subclass object that are ONLY in the Superclass
			sub.setPrivate(100);
			System.out.println("\n"+sub);

			sub.setPublic(55);
			System.out.println("\n"+sub);

				//setPublic was overwritten in the subclass so it uses that method

			sup.setPublic(400);
			System.out.println("\n"+sup);

				//because sup was calling the setPublic method it uses the Superclass setPublic


		//change values
			sub.pro = 43;
			System.out.println("\n"+sub);

				//here i'm altering a protected variable without using a mutator method



		//Change values

	}
}
