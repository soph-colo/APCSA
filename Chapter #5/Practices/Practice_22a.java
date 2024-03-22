/*Sophia Colonello
  1/21/21
  this program will manipulate an intialized array, each value being squared */

  import java.text.DecimalFormat;

  public class Practice_22a
  {
	  public static void main(String[] args)
	  {
		  //decimal format
		  	DecimalFormat df = new DecimalFormat("#,###.##");
		  //array
		  	double[] array = {-5,15,2.5,17.1,3,0};

		  //calling the method to square
		  	squareArray(array);

		  //printing
		  	for(int i = 0; i < array.length; i++)
		  		System.out.println(df.format(array[i]));

	  }
	  //this method will take an array. it will square all the values in the array
	  public static void squareArray(double[] array)
	  {
		  //for loop to change all the values
		  	for(int i = 0; i < array.length; i++)
		  	{
				array[i] = Math.pow(array[i], 2);
			}

	  }
  }