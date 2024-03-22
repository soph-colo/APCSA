/*Sophia Colonello
  3/15/21
  this program will play with the list interfaces... */

  import java.util.Scanner;
  import java.util.List;
  import java.util.ArrayList;

  public class Practice_33
  {
	  public static void main(String[] args)
	  {
		  //calling methods
		  	List<Integer> list = create();
		  	System.out.println(list);
		  	swap(list);
		  	decrease(list);


	  }
	  public static List<Integer> create()
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //creating list
		 	List<Integer> list = new ArrayList<Integer>();

		  //filling values
		  	System.out.print("\nHow many integers?: ");
		  	int val = sc.nextInt();

		  		//validate
		  			while(val <= 0)
		  			{
						System.out.print("\n\n\t\tERROR! Please enter a valid value: ");
						val = sc.nextInt();
					}

			for(int i = 0; i < val; i++)
				list.add((int)(Math.random()*100));

		   //return
			 return list;
	  }
	  public static void swap(List<Integer> list)
	  {
		  //variables for swaping
		  	int i = (int)(Math.random()*list.size());
		  	int j = (int)(Math.random()*list.size());

		  		//validation
		  			while(j == i)
		  				j = (int)(Math.random()*list.size());

		  //swaping
			int temp = list.get(i);
			list.set(i,list.get(j));
			list.set(j,temp);

		  //printing
		  	System.out.println(list);

		  //sorting BY HAND
			for (int a = 0; a < list.size(); a++)
        	{
            	for (int b = a + 1; b < list.size(); b++)
            	{
            	    if(list.get(a) > list.get(b))
            	    {
            	        temp = list.get(a);
            	        list.set(a,list.get(b));
            	       	list.set(b, temp);
            	    }
            	}
			}

		  //printing
		  	System.out.println(list);
	  }
	  public static void decrease(List<Integer> list)
	  {
		  //variable
		  	int temp = 0;

		  //sorting
			for (int a = 0; a < list.size(); a++)
        	{
            	for (int b = a + 1; b < list.size(); b++)
            	{
            	    if(list.get(a) < list.get(b))
            	    {
            	        temp = list.get(a);
            	        list.set(a,list.get(b));
            	       	list.set(b, temp);
            	    }
            	}
			}

		  //printing
		  	System.out.println(list);
	  }
	  public static void insert(List<String> lists, String element)
	  {
	  int index = 0;
	  while(element.compareTo(lists.get(index)) < 0)
	  index++;
	  lists.add(index, element);
  }
  }
  /*WRITTEN:

  		2. ListInterface exists to allow the programmer to apply methods to any type
  		   of List, rather than a specified type. This is beneficial as these basic
  		   methods can be used on any list.

  		3. false

  		4. E element

  		5. it gets moved to the right one position

  		6. d

  		7. c

  		8. e

  */