import java.util.ArrayList;

public class Review
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5};
		ArrayList <Object> arr2 = new ArrayList <Object>();		//DON'T KNOW HOW TO PARSE
		arr2.add("h");
		arr2.add(3);
		arr2.add(4);

		for(int a: arr)
			System.out.println(a);

		for(Object o: arr2)
			System.out.println(o);
	}
}