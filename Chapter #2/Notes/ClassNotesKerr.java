/*Mrs. Kerr
 10/26/20
 This program will review classes */

 public class ClassNotesKerr
 {
	 public static void main(String[] args)
	 {
		  /*We are working towards Object-Oriented Programming (OOP)
		  	OOP is centered around creating objects.
		  		Class is "transportationVehicles" and Objects are "cars, planes, trains"
				Car is an "object" that has attributes, such as weight and color,
						and methods, such as drive and break.

		  	What objects have we created in Java?
		  		- Arrays
		  		- Scanner
		  		- FileReader
		  		- Decimal Formater

		 	To create a class:
				public class MyClass {
					int x = 5;
				}

			To create an object:
				public static void main(String[] args){
					MyClass myObj = new MyClass();
					System.out.println(myObj.x);
				}

			//------Go to ClassExampleDrive and discuss Scanner Class-------//

			More information about OOP:
				- An object is a software entity that contains data and procedures.
				- The procedures that objects perform are just methods in the class.
				- Objects hide its data but can allow outside code to access it
					BY CALLING IT THROUGH THE OBJECTS
				- The class is the "blueprint" and objects can be created from it.
				- OOP is useful because of the object reusability, so the class could
		  	  		be used in many programs.

			//-------Go to ClassExampleTemplate and discuss each comment through Accessor Methods-------//

			Variable Scope:

			Variables that are in methods are considered local variables and are
				only defined within that method.  So if another method wants that variable
				it would have to call the method.  <--reason for creating instance variables

			The scope a variable is where it is defined/recognized
					{
						int test = 5;
					}
					System.out.println(test);

			Since test is declared inside the braces, test is only recognized inside
				of them, so the scope of the test is inside the braces ONLY.

			Remember what happens in a method stays in a method BUT now that we have
				objects with instance variables they can be changed.

			Driver Program:
			-Objects are created in the "Driver" program.  They provide ENCAPSULATION
				-Encapsulation - a mechanism of wrapping the data (variables) and code
					acting on the data (methods) together as a single unit
				-In Java this means that an object's data is protected by being
		      		"hidden" inside of that object

		    //-----Review additional Methods in ClassExample and call them in the Drive-------

			AP EXAM:
				-All classes will be public
				-All instance variables will be declared as private


			EQUALS METHOD: 	//See Stock and StockDriver for an example
				-Use this method to compare to objects
				-For two objects to be the same then the instance variables
					would be the same
				-The equals method returns Boolean

			toString METHOD:	//See Stock and StockDriver for an example
				-a toString method can be created so you can just print the
		       objects name and it automatically calls the method
		       	-In your driver class all you have to do is print out the object's name:
							System.out.println(objectName);
					-This will automatically go to the toString method in your class and
						prints out what you have in that method.
				-If you do not have a toString in your class and try to print out the
					object it will NOT give a compile-time error, it will print the class's
					name and then numbers and letters after it

			STATIC:  //Show using SimpleStaticExample and SimpleStaticExampleDriver
				-A static variable contains a value that is shared by all instance of
					the class.
				-Static keyword can be used with class, variable, method and block
				-Static members belong to the class instead of a specific instance,
					this means if you make a member static, you can access it without object

				-Typically the use of static variables are:
					- keep track of statistics for object of the class
					- accumulate a total
					- provide a new identity number for each new object of the class

				-static variables  are initialized outside of the constructor and it's
					values can change.
					-If you do not want them to change declare as static final

				-Notice the difference from the methods:

						public static void print()		Performs the operation for the entire class

						public void print()				Performs an operation for an individual object


				-If you have information that applies to the entire class not just a
					particular object, it is appropriate for the method or variable
					to be static


		  	Unified Modeling Language (UML) Diagrams:
		  		-Diagrams to visualize relationships among classes and objects.

		  		Top Section is the Name of the Class
		  		Middle Section is the list of the class's fields or instance variables
		  		Bottom Section holds the class's method names

		  			-------------------------
					| 		Mouse			|		Class Name
					-------------------------
					|	age: int			|		Instance Variables
					|	weight: double		|
					|	percent: double		|
					-------------------------
					|	setPercent(percent) |		Method's
					|	grow(): double		|
					|	display()		    |
					------------------------- */



	 }
 }