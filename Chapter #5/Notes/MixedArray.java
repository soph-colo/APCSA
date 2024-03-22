/*Mrs. Krauland
  This program will show how to declare an array of mixed data types*/

public class MixedArray
{
	public static void main(String[] args)
	{
		/*How would declare a standard array that holds:
			Tammy, 3.3, 16, Tony, 4.0, 17

			declare a String array and parse the numbers
			create a class that holds the person's information and create an array of that class
		*/

		Object[] var = {"Tammy",3.3,16,"Tony", 4.0, 17};

		for(int i = 0; i < var.length; i++)
		{
			System.out.println(var[i]);
		}

		int value = (int)var[2] +(int)var[5];






	}
}