import java.util.*;
import java.io.*;

public class SortingArrayList
{
	public static void main(String[] args) throws FileNotFoundException
	{
		//Create ArrayList to hold first names and last names
			ArrayList fnames = new ArrayList[];
			ArrayList lnames = new ArrayList[];

		//Read in the file
			File inFile = new File("names.txt");
			Scanner sc = new Scanner(inFile);

		//Add the names to the arrayList
			for(int i = 0; sc.hasNext(); i++)
			{
				fnames.add(sc.next());
				lnames.add(sc.next());
			}

		/*Sorting an Arraylist
			We still use .sort but it comes from the Collections class instead
			of the Arrays class*/
				Collections.sort(fnames);
				Collecitons.sort(lnames);


		//Print the arraylist
			System.out.println(fnames);
			System.out.println(lnames);







	}
}


