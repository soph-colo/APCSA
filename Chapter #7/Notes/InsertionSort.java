/*Mrs. Koegler
  This program will introduce students to the Insertion Sorting Algorithms */

  public class InsertionSort
  {
  	public static void main(String[] args)
	{

		/*This sorts by breaking into two parts: a sorted list and an
		  unsorted list.

		  So make a[0] is the sorted list.

		  We will then move elements from the unsorted list a[1] to a[a.length-1]
		  one at a time and put in the correct position in the sorted list.

		  8  1	 4	6

		  Sorted			Unsorted
			8				1	4	6
			1	8			4	6
			1	4	8		6
			1	4	6	8



		*/

		int[] a = {5, 2, -1, -2, 0, 3, 15, 4};
		insertionSort(a);
		for(int i=0; i<a.length; i++)
			System.out.println(a[i]);

	}

	public static void insertionSort(int[] a)
	{
		//variable
			int temp = 0;

		//start at first element  - 0 is already "sorted"
			for(int i = 1; i < a.length; i++)	//sorted
			{
				/*so we pick up the element in the "unsorted array and go through
				  the "sorted" array to find where to put the next element */
				for(int j = i; j > 0; j--)	//unsorted part
				{
					if(a[j] < a[j-1])
					{
						temp = a[j];
						a[j] = a[j-1];
						a[j-1] = temp;
					}

				}

			}


	}



}


