/*Sophia Colonello
  4/14/21
  this program will organize an exclusive party with a limited guest list

  1. binary search
  2. a - no break
  3. a
  4. b*/

  import java.util.ArrayList;

  public class Practice_36
  {
	  public static void main(String[] args)
	  {
		  //constructor
			Party party = new Party(20, "Mrs. Koegler");

		  //adding -- i am not sure why it isn't catching Mrs. Kerr twice
			party.addGuest("Mrs. Kerr");
 			party.addGuest("Mr. Magill");
 			party.addGuest("Mrs. Kerr");
 			party.addGuest("Mr. Lowe");
 			party.addGuest("Mr. Walker");
 			party.printParty();

	  }
  }

