/*Mrs. Koegler
  This section of notes will introduce students to the List Interface */

import java.util.List;
import java.util.ArrayList;


public class ListInterface
{
	public static void main(String[] args)
	{
		/*---------------
		  |    List     |				An ArrayList is-a List
		  |<<Interface>>|
		  ---------------
		  		 ^
		  		  \
		  	---------------
		  	|  ArrayList  |
		  	---------------

		THE LIST INTERFACE:
			A class that implements the List<E> interface is list of elements
			of type E.  This it to encourage and standardize the strategies of
			a class using methods with the same signature (same method names
			and same parameter types).  Java rely on interfaces.

			An interface is a template for designing class that share certain
			qualities.  The ArrayList and LinkedList classes both implement
			lists so they share certain qualities.  So it helps with consistency
			they are implemented using the List interface as a template.

			When we are using a List Interface we will need to:
				import java.util.List;

			When we declare an ArrayList it changes to:
				List<element-type> variableName = new ArrayList<element-type>();

				Notice the only change is the first keyword is now List.

			This allows you to apply methods to any type of List if you are
			accepting a List interface instead of a particular List type.

			The downfall of useing a List Interface is any method that are specific
			to just an ArrayList do not work.


		METHOD Of List<E>
			int size()

			E get(int index)

			E set(int index, E element)

			void add(int index, E element)

			boolean add(E obj)
			   adds obj to the end of the list, always returns true.
			   If the specified element is not of type E, throws the ClassCastException

			E remove(int index)

			ArrayList()
				constructs an empty list

		EXAMPLE:
			1.) Create an ArrayList using the List Interface to contain the number
			    0, 1, 4, 9 using a loop */

			    List<Integer> list = new ArrayList<Integer>();

			    for(int i=0; i<4; i++)
			    	list.add((int)Math.pow(i,2));


			/*2.) Create a method that has the following precondition
			      and postcondition:

			      Precondition: List list is an ArrayList that contains Integer
			      	values sorted in increasing order.
			      PostCondition: a value is inserted in its correct position
			      	in the list*/

			      insert(list, -3);
				  System.out.println(list);
}

	/*This method will insert a vlue in the correct position
	  @param list the List
	  @param value the Integer to be inserted*/
	  public static void insert(List<Integer> list, Integer value)
	  {
			/*for(int i=0; i<list.size(); i++)
			{
				if(list.get(i) > value)
				{
					list.add(i, value);
					break;
				}
				else if(list.size()-1 == i && list.get(i) < value)
					list.add(value);

			}*/


			int index = 0;

			while(index != list.size() && list.get(index) < value)
				index++;

			list.add(index,value);

	  }
 }