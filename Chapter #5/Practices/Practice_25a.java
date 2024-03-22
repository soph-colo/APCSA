/*Sophia Colonello
  2/3/21
  this program will sum the numbers of each row, column, and entire array using the different methods*/

  import java.util.Scanner;

  public class Practice_25a
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //array for the whole program
		  	int[][] array = new int[2][2];

		  //for loop to get the nums
			for(int r = 0; r < array.length; r++)
				for(int c = 0; c < array[r].length; c++)
				{
					System.out.print("row "+(r+1)+", column "+(c+1)+": ");
					array[r][c] = sc.nextInt();
				}

		  //printing the array
		  	System.out.println("\n\n");
	    	for(int r = 0; r < array.length; r++)
	    	{
	           for(int c = 0; c < array[r].length; c++)
	              System.out.print(array[r][c]+" ");
				System.out.println("");
		 	}

		  //calling method to get the sum of each row
		  	rowSum(array);

		  //calling method to get the sum of each column
		  	colSum(array); //NOT WORKING

		  //calling method to get the total of the array
		  	int arraySum = 0;
		  	for(int r = 0; r < array.length; r++)
				arraySum += arraySum(array[r]);
			System.out.println("\n\n\ttotal sum of the array: "+arraySum);

	  }
	  //this method will...
	  public static void rowSum(int[][] array)
	  {
		  //variable
		  	int rowSum = 0;

		  //row column for loop to get the sums
    	 	for(int r = 0; r < array.length; r++)
    	 	{
            	for(int c = 0; c < array[r].length; c++)
              		rowSum += array[r][c];
           	 	System.out.print("\n\n\tsum of row "+(r+1)+": "+rowSum);
           	 	rowSum = 0;
		 	}

	  }
	  //this method will...
	  public static void colSum(int[][] array)
	  {
		  //variable
		  	int colSum = 0, counter = 0;

		  //loops
   	 		for(int c = 0; c < array[0].length; c++)
    	 	{
            	for(int r = 0; r < array.length; r++)
              		colSum += array[r][c];
           	 	System.out.print("\n\n\tsum of column "+(c+1)+": "+colSum);
           	 	colSum = 0;
		 	}



	  }
	  //this method will/
	  public static int arraySum(int[] array)
	  {
		  //array sum
		  	int arraySum = 0;

		 //for loop
			for(int i = 0; i < array.length; i++)
				arraySum += array[i];

		 //return
			return arraySum;

	  }
  }