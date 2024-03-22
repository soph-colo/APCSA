/*Sophia Colonello
  10/29/20
  this program will */

  public class keywordThis
  {
	  //instance variables
	  	private int a;
	  	private int b;

	  //constructor
	  	public keywordThis(int x, int y)
	  	{
			a = x;
			b = y;
		}

	  //mutator method
	  	public void setData(int a, int b)
	  	{
			this.a = a;
			this.b = b;
		}

	  //display the data
	  	public void showData()
	  	{
			System.out.println("a = "+a);
			System.out.println("b = "+b);
		}

	  //i can create a main method and compile this program
	  	public static void main(String[] args)
	  	{
			System.out.println("See we can have a main method in here");
		}



  }