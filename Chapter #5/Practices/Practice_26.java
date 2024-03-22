/*Sophia Colonello
  2/8/21
  this program will simulate the Hunger Games using an ArrayList
  WRITTEN IS BELOW*/

  import java.util.ArrayList;

  public class Practice_26
  {
	  public static void main(String[] args)
	  {
		  //arraylist
		  	ArrayList<String> tributes = new ArrayList<String>();

		  //variables
		  	int random = 0;

		  //adding each tributes name
		  	tributes.add("Cato");
		  	tributes.add("Katniss");
		  	tributes.add("Peeta");
		  	tributes.add("Rue");

		  //adding Finnick to the second spot
		  	tributes.add(1, "Finnick");

		  //printing out all the tributes
		  	System.out.println(tributes);

		  //while loop for killing off the tributes
		  	while(tributes.size() >= 2)
		  	{
				random = (int)(Math.random()*tributes.size());
				System.out.println("\n"+tributes.get(random)+" was killed.");
				tributes.remove(random);
				System.out.println("\nRemaining: "+tributes);
			}

		  //victor
		  	System.out.println("\n\t"+tributes.get(0)+" is the victor!\n\n\n");

	  }
  }

  /*WRITTEN

  	2. The main advantage of ArrayLists is that their size increases and decreases as needed, unlike regular arrays.

  	3. ArrayLists<Integer> equiv = new ArrayLists<Integer>();

  	4. int x = 19;
  	   equiv.set(5,x);

  	5. int var = equiv.get(22);

  	6. int len = equiv.size();

  	7. int kd = equiv.get(107);
  	   equiv.set(107, 17);

  	8. for(int j = equiv.size()-2; j >= 59; j--)
  	   {
		   equiv.set(j+1,j);
	   }
	   equiv.set(59,127);

	9. String myString = buster.get(99);

	10. element
  */