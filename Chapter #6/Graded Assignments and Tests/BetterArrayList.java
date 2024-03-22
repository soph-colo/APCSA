/*Sophia Colonello
  3/10/21
  this program will be the subcass of the superclass ArrayList */

  import java.util.ArrayList;

  public class BetterArrayList<E> extends ArrayList<E>
  {
	  //instance
	  	private ArrayList<E> array = new ArrayList<E>();

	  //constructor
	 	public BetterArrayList(ArrayList<E> array)
	    {
			this.array = array;

	    }

	  //unique methods
	  	public void addF(E element)
	  	{
			array.add(0,element);

		}
		public void addToEnds(E element)
		{
			array.add(0,element);
			array.add(array.size(),element);

		}
		public String toString()
		{
			return array+" I am an array from the class BetterArrayList";
		}




  }