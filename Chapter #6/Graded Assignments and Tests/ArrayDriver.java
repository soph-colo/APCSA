/*Sophia Colonello
  3/10/21
  this program will be the driver to test the betterarraylist class */

  import java.util.ArrayList;

  public class ArrayDriver
  {
	  public static void main(String[] args)
	  {

		  //create an arraylist
		  	ArrayList<Object>words = new ArrayList<Object>();

		  //constructor
		  	BetterArrayList<Object> ba = new BetterArrayList<Object>(words);

		  //testing
		  	words.add("hi");
		  	ba.addF("bye");
		  	ba.addToEnds("see ya");

		  System.out.println(words);



	  }
  }