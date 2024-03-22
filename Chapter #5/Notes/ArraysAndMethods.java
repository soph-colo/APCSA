/*Mrs. Koegler
  1/20/21
  This progam will discuss Arrays and methods */

import java.util.Arrays;

public class ArraysAndMethods
{
	public static void main(String[] args)
	{
		/*Since arrays are objects, passing an a parameter that is an array
		  means we are passing an object reference.  So no copy is  made of
		  the array, thus, the elements of the actual array can be accessed
		  and modified


		EXAMPLE: */
			int[] array = {5, 10, 3, 6, 2, 15};

			changeArray(array);		//Notice: not a return method

			for(int i: array)
				System.out.print(i+ " ");
			System.out.println();


		//EXAMPLE: Altering elements in the array

		//WHEN CHANGING ELEMNTS, RETURN AND ALTER ARRAY
			for(int i=0; i<array.length; i++){
				if(array[i] % 2 == 0)
					array[i]=changeElement(array[i]);
			}
			for(int i: array)
				System.out.print(i+ " ");
			System.out.println();


		/*EXAMPLE: an array of elements to be accessed but NOT modified
			Find the minimum value in the array: */
			int min = findMin(array);
			System.out.println("\nMin: "+min);

			//If I want modifiy the array
			Arrays.sort(array);
			System.out.println("\nMin: "+array[0]);


		//EXAMPLE: of swapping elements in an array

			int[] list = {4, 2, 3, 1};
			swap(list, 0, 3);
			for(int var: list)
				System.out.print(var + " ");
	}

	//This method will switch elements in an array
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	// This method will find the minimum value in an array
	public static int findMin(int[] b)
	{
		int min=b[0];
		for(int i=1; i<b.length; i++){
			if(b[i]<min)
				min=b[i];
		}
		return min;
	}

	//The method will multiply a number by 100
	public static int changeElement(int n)
	{
		n*=100;
		return n;
	}

	//The method will add 3 to every element in the array
	public static void changeArray(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
			arr[i]+=3;

	}
}
