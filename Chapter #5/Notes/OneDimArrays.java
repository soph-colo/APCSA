/*Mrs. Koegler
  1/18/2021
  These notes will review One-Dimensional Arrays */

public class OneDimArrays
{
	public static void main(String[] args)
	{
		/*What do you remember about arrays?
			- use them to hold multiple items (like a list of names)
			- have indexes - start at zero and go to the array length - 1
			- when we declare we have to set the size which is inal

				- dataType[] arrayName = new dataType[size];
				- dataType[] arrayName = {element, element...};

			- there are two dimensional arrays (we will get to these)
			- arrays always are using for loops
			- can call individual element arrayName[index];
			- arrayName.length will return the length of the array
				- .length() gets Strings BE CAREFUL!
			- sort the array automatically
				- Arrays.sort(arrayName);
				- need to import java.util.Arrays;

				NEW: Arrays.sort(arrayName, position, diffPosition) will sort part of the array

			- bubble sort: sort corresponding arrays and sort by one of the arrays
			- Error we get: ArraysIndexOutOfBoundException
			- arrays are objects (notice the keyword new)
				- when an array is altered in a method, it is altered everywhere
				- you do not have to return an array, but you can

			automatic fills for an array for:
				int = 0
				double = 0.0
				boolean = false
				char = ''
				String = null
				Objects = null

			to see if two arrays are the same
				- check individual elements
				- method that can do this



			NEW: When we want to display or "work with" EVERY element in an array we
				 should use a for-each  loop (also is called an enhanced for loop)

				 for(arrayDataType dummyVariable: arrayName)
				 {
					 CODE;
					 CODE;
				 }
			*/

				double[] coins = {.01,.05,.1,.25,.5};
				for(double i: coins)
					System.out.println(i);


				/*Always use a for-each loop EXCEPT when:
					- to access the index of a specific element
					- to access just some of elements
					- alter the array (replacing/removing primitive data type elements)


					If you have an array of Objects you can use a for-each loop and then
					use mutator methods of the Object to modify the fields of the instance
					variables (We will look at this in a future section). */

	}
}