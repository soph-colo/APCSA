/*Mrs. Koegler
  This program will introduce students to Searching Algorithms */

import java.util.Arrays;

public class SearchingAlgorithms
{
	public static void main(String[] args)
	{
		/*What are ways we can search a list of elements?	5	27	13	9

			We can use a for loop go through all of the elements,
			check using an if statements to see if the element is in the list.
			Once you hit the element that you are looking for you can break
			out of the loop.

			This is a SEQUENTIAL search
				- Starts at the first element of the list
				- Compares the "key" to each element until the "key" is found
				  or there are no more elements in the list
				- You should stop searching as soon the "key" is found

				BEST CASE:	the "key" is the first element
				WORST CASE: the "key" is the last element or "key" is not in the list



			BINARY SEARCH:
				The elements in the list are SORTED!!
				A divide-and-conquer approach is provided for the most efficient
				algorithm, using a recursive method


				Best Case:
				Worst Case: */

				int[] a = {4,2,10,5,-2,15,0};

				//sort the array
					Arrays.sort(a);

				/*our goal is to find the middle number
				  determine if that middle number is the "key", < "key", or > "key"
				  	if == to the key return
				  	if < "key" we need to find the middle number from 0 to middle number - 1
				  	if > "key" we need to find the middle number from number + 1 to length */

				//Use the binary search method:
					int key = -2;
					boolean found = binSearch(a,key, 0, a.length-1);

				//output
					if(found)
						System.out.println(key+" was in the array");
					else
						System.out.println(key+" was not in the array");


	}

	public static boolean binSearch(int[] a, int key, int start, int end)
	{
		//only works for 15?
		/*if(a[end+start/2] == key)
			return true;
		else if(a[end+start/2] < key)
		{
			end = end+start/2-1;
			binSearch(a,key,0,end);
		}
		else if(a[end+start/2] < key)
		{
			start = end+start/2+1;
			binSearch(a,key,start,a.length);
		}

		return false; */
		//lets try again

		//find middle number
			int mid = (start+end)/2;

		//if statmenet --- BASE CASE
			if(a[mid] == key)
				return true;
			else if(start > end)
				return false;
		//checking the two other options
			else if(a[mid] > key)
				return binSearch(a,key,start,mid-1);
			else if(a[mid] < key)
				return binSearch(a,key,mid+1,end);

		//default
			return false;




	}

	/*In Binary Search:
		BEST CASE: key is the middle element
		WORST CASE: key is not in the array or the key is the first or last element



	Which search is most efficent sequential or binary?
		BINARY

	*/

}