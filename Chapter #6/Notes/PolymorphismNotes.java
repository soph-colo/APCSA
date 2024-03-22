//Mrs. Koegler

public class PolymorphismNotes
{
	public static void main(String[] args)
	{
		/*POLYMORPHISM:
			A method that has been OVERRIDEN in atleast one subclass is said to
			be polymorphic.

			Polymorphsim is the mechanism of selecting the appropriate method
				for a particular object in a class heirarchy.
				The correct is chosen because in Java method call statements are
				always determiend by the TYPE OF THE ACTUAL OBJECT, not the
				type of the Object Reference!!!

					Superclass s = new Subclass();
					  s is the object reference
					  but the actual object is a Subclass

				If our grade calculation program we could have:
					Student s = new Student();
					Student g = new GradStudent();
					Student u = new UnderGrad();

				If we had the code
					s.computeGrade();
					g.computeGrade();
					u.computeGrade();

				These would all perform correct operations for their particular
				instance.
				This selection of the correct method occuring during the run of the
				program.

			DYNAMIC BINDING (LATE BINDING):
				Dynamic binding is making a run-time decision about which instance
				method to call.

				This occurs when a method is OVERRIDEN

				NOTE: Overloading methods occurs at compile time by comparing
					  method's signatures.  This is known as static binding or
					  early binding.

				The compiler determines IF a method can be called (is it legal?).
				While the run-time environment determines HOW it will be called
				(which overriden method should be used?)*/



	}
}