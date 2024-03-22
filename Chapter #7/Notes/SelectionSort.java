/*Mrs. Koegler
  This program will introduce students to the Selection Sorting Algorithm*/

  public class SelectionSort
  {
  	public static void main(String[] args)
	{
		/*This is a "search-and-swap" algorithm
		   - We will find the smallest element in the array and exchange it
		     with a[0]
		   - Then find the smallest element in the subarray and exchange it
		     with a[1]
		   - We continue this process until there is only two elements left
		     and the smaller of the two elments is placed in a[n-2] where
		     n is the length of the array and the last element is then placed
		 */

		 int[] a = {5, 2, -1, -2, 0, 3, 15, 4};
		 selectionSort(a);
		 for(int i=0; i<a.length; i++)
			System.out.println(a[i]);


	}

	public static void selectionSort(int[] a)
	{
		//variable
			int temp, minPos, min;

		//for loop
			for(int i = 0; i < a.length-1; i++)
			{
				//finding the minimum element
					min = a[i];
					minPos = i;

				for(int j = i+1; j < a.length; j++)
				{
					if(a[j] < min)
					{
						min = a[j];
						minPos = j;
					}

				}

				//now we swap
					temp = a[i];
					a[i] = a[minPos];
					a[minPos] = temp;


			}





	}






}