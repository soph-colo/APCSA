/*Mrs. Koegler
  This program will review the concept of Two Dimensional Arrays */

import java.util.Scanner;

public class TwoDimArrays
{
	public static void main(String[] args)
	{
		/*What do you remember two-dim arrays?
			-declare the same way as 1 dim but two brackets
				int[][] array = new int[rowSize][columnSize]
			-we use nested for loops with 2-dim arrays
				for(int r = 0; r < array.length; r++) 	array.length tells me how many rows there are
					for(int c = 0; c < array[r].length; c++)  array[r].length tells me how many columns there are

			-two-dim array is just an array holding arrays as it's elements

			- Initialize an array with double {{ */
				double[][] array = {{3.4, 2.1, 1.0},
									{5, 4, 6}};

				int[][] mat = {{3,4,5},
				               {6,7,8}};

			/*PROCESSING A TWO-DIMENSIONAL ARRAY:
				There are 3 common ways:
					1.) ROW-COLUMN
						  - for accessing elements
						  - modifying elements (primitive data type or Objects)
						  - replacing elements

					2.) FOR-EACH LOOP
						  - for accessing elements
						  - modifying elements ONLY Objects

					3.) ROW-BY-ROW
						  - for accessing elements
						  - modifying elements (primitive data type or Objects)
						  - replacing elements */


			//ROW-COLUMN: Sum all the elements in the array (LAST YEAR)
				int sum = 0;
				for(int r = 0; r < mat.length; r++)
					for(int c = 0; c < mat[r].length; c++)
						sum += mat[r][c];

				System.out.println("the sum is "+sum);

			//FOR EACH LOOP
				sum = 0;
				for(int[] i: mat)	//rows
					for(int j:i)	//ints in each row
						sum += j;

				System.out.println("the sum is "+sum);

			//ROW-BY-ROW:
				sum = 0;
				for(int r = 0; r < mat.length; r++)
					sum += sumArray(mat[r]);

				System.out.println("the sum is "+sum);

	  }
	   /*This method will sum the value of the row
	    @param integer array
	    @return int that is the sum of the row*/
	    public static int sumArray(int[] arr)
	    {
			int total = 0;
			for(int i = 0; i < arr.length; i++)
				total += arr[i];


			return total;

		}


}