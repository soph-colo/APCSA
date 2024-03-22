/*Mrs. Koegler
  This program will introduce the concept of an ArrayList */


import java.util.ArrayList;


public class ArrayListNotes
{
	public static void main(String[] args)
	{
		/*The ArrayList class provides the basic functionality that comes
		  with a standard array, plus provides additional aspects.

		  The ArrayList is built using an array, but the array is hidden
		  in the background so you cannot access it directly.

		  It stores an ordered collectino of values and allows access using
		  the values indexes.

		  ADVANTAGES:
		  	1.) It shrinks and grows as needed in the program

		  	2.) The last slot is ALWAYS the size of the list -1, whereas a partically
		  	    filled array the programmer must keep track of the last slot currently
		  	    used.

		  	3.) You can insert/remove elements with a single statement and any shifting
		  	    elements is handled automatically.  In a standard array we had to write
		  	    the code that shifted the elements.


		 Most of the methods we will use are the java.util package.  We will go over
		 a couple of most popular methods, but there are many more out there that you
		 can go out and learn.

		 IMPORT:
		 	java.util.ArrayList;

		 INITIALIZE:
		 	ArrayList<element-type> variableName = new ArrayList<element-type>();
		 		  or
		 	ArrayList<element-type> variableName = new ArrayList<>();
		 		This way can result in errors due to type inferencing failing to work.

		 	When initialize an ArrayList it has no elements in it.
		 	element type is an object/class

		 	Example:
		 		ArrayList<Student> students = new ArrayList<Student>();
		 			Each element in the list must be of type Student

		 	Compare the above ArrayList example to this corresponding standard array
		 		Student[] students = new Student[100];

		 	What are the syntax differences between an ArrayList and a standard array?
		 		1.) The data type in an ArrayList must be with the word ArrayList where as
		 		   in a standard array it is just the data type.

		 		2.) Standard array you  need to send the length, arrayList does have that

		 		3.) ArrayList have a () at the end.

		 		4.) ArrayList have <> where the standard array has []

		 		5.) ArrayList CANNOT use primitive data type.*/

		ArrayList<String> colors = new ArrayList<String>();


		/*METHODS:
		 	add Method:
		 		public void add(E element)
		 			Adds the specified element to the end of the list
		 			Notice the parameter is an E element, so that element can
		 			be any type of data.*/

				colors.add("red");
				colors.add("white");
				colors.add("blue");

			//toString Method:

				System.out.println(colors);



			/*Accessing elements:
				In a standard array we used arr[2] to get the element in position
				2.  With an ArrayList we do not [], so instead we use the
				get method

				public E get(int index)*/

				System.out.println(colors.get(1));


			/*Update an element
				In a standard array: arr[2] = "yellow";
				Use the set methods
					public E set(int index, E element)
						Notice this method returns an E element which is the element
						that was originally there*/


				System.out.println(colors.set(0,"pink"));
				System.out.println(colors);



			/*Another add method
				public void add(int index, E element)
					This method inserts the element at the specified index and then
					all other elements automatically move to the next higher index
					position*/


				colors.add(2, "purple");
				System.out.println(colors);



			/*public boolean contains(Object elem)
				Returns true if the list contains the specified element*/

				System.out.println("\n\nDoes the list contain black? "+colors.contains("black"));


			/*public int indexOf(Object elem)
				Searches for the FIRST occurence of the element and returns the position
				it is in.
				Returns -1 if the element is not in the list*/

				System.out.println("Purple is in the position "+colors.indexOf("purple"));


			/*public int lastIndexOf(Object elem)



			public E remove(int index)
				Removes and returns the element of the specified index position.
				It automatically shifts all high elements down one position*/

				System.out.println(colors.remove(3));


			/*public boolean isEmpty()
				Returns true if teh list contains no elements


			public int size()
				This returns the size of the ArrayList just like our
				.length with a standard array*/

			System.out.println(colors.size());



		/*We just did an example with Strings.  We know that an ArrayList holds
		  Objects/Classes.  What would we do if wanted to hold integers and doubles?*/


			ArrayList<Integer> exInt = new ArrayList<Integer>();
			ArrayList<Double> exDouble = new ArrayList<Double>();

		  //We can do this...

			double num = 15.53;
			exDouble.add(num);
			System.out.println(exDouble);	//AUTOBOXING



		  /*REVIEW:
		      Autoboxing is the automatic wrapping of primitive data types into their
		      wrapper class.

		      This an automatic conversion Java makes and we do not need to call the
		      intValue() or doubleValue() methods.

		      Even though we do not write the code these operations are still
		      occuring.  This results in a decreased run-time.  You therefore should
		      consider using a standard array for programs that manipulate numbers/data
		      that do not need Objects*/



	}

}
