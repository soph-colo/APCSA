/*Sophia Colonello
  2/4/21
  this program will intialize an array and manipulate some of the values. it will then find the sums of major and minor diagonals.
  NUMBER 3!!!

  3. you cannot use a for-each loop in this instance becuase a for-each loop is used to access EVERY elemnet in an array. this
     program asked us to edit one row.*/

  public class Practice_25b
  {
	  public static void main(String[] args)
	  {
		  //array
		  	int[][] matrix = {{2, -1, 5},
		  					{15, 3, -3},
		  					{11,12,22}};

		  //calling the addition method
		  	addition(matrix);

		  //calling the major diagonal line
		  	int majorDia = major(matrix);

		  //calling the minor diagonal line
		  	int minorDia = minor(matrix);

		  //output
		  	System.out.println("\nMajor Diagonal: "+majorDia+"\nMinor Diagonal: "+minorDia);


	  }
	  /*this methd will accept a two dim array. this method will add 10 to the second row.
	  @param matrix is the array to be manipulated */
	  public static void addition(int[][] matrix)
	  {
		  //adding ten to the middle row
		  	for(int c = 0; c < matrix.length; c++)
		  		matrix[1][c] += 10;
	  }
	  /*this method will accept a two dim array. it will find the major diagonal sum. it will return an int.
	  @param matirx is the array for the major diagonal
	  @return m the sum */
	  public static int major(int[][] matrix)
	  {
		  //variable
		  	int m = 0;

		  //getting the major diagonal
		  	for(int r = 0; r < matrix.length; r++)
				m += matrix[r][r];

		  //return
		  	return m;
	  }
	  /*this method will accept a two dim array. it will find the te minor diagonal sum. it will return an int.
	  @param matrix is the array for the minor diagonal
	  @return m the sum */
	  public static int minor(int[][] matrix)
	  {
		  //variable
		  	int m = 0, c = 0;

		  //getting the minor diagonal
		  	for(int r = matrix.length-1; r >= 0; r--)
		  	{
		  		m += matrix[r][c];
		  		c++;
			}

		  //return
		  	return m;
		}
  }