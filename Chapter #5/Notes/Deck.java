/*Resave this program as Deck.
  It is a simple Deck class in which a deck of cards is originally represented
  by the integers 0-51.  Then given:

	Suits: (Hearts, Spades, Clubs, Diamonds) - 13 cards each
	Face Cards: (Jack, Queen, King)
	Ace
	Numbers 2-10
	Shuffled
*/

import java.util.Random;

public class Deck
{
	//Create instance variables
		private final int NUMCARDS = 52;
		private String[] deck = new String[NUMCARDS];


	//Create Constructor
		public Deck()
		{
			//Assign the cards values to nothing instead of null
				for(int i = 0; i < NUMCARDS; i++)
				{
					deck[0] = "";
				}

			//Call method to assign cards
				cards();

		}


		//This method will assign the array suits and the number/facecard
		public void cards()
		{
			//variables
				String suit = "", value = "";

			for(int i=0; i<NUMCARDS; i++)
			{
				//Assign the card a value A, 2-10, J, Q, K
					if(i%12 == 0)
						value = "K";
					else if(i%12 == 11)
						value = "J";
					else if(i%12 == 0)
						value = "Q";
					else if(i%12 == 1)
						value = "A";
					else
						value = ""+i%12;


				//Assign the cards a suit
					/*SUITS:
							0-12	Hearts
							13-25	Diamonds
							26-38	Spades
							39-51	Clubs */

					if(i >= 0 && i <= 12)
						suit = "Hearts";
					else if(i >= 13 && i <= 25)
						suit = "Diamonds";
					else if(i >= 26 && i <= 38)
						suit = "Spades";
					else
						suit = "Clubs";

				deck[i] = value+" of "+suit;

			}
		}

		/*This method will swap the positions
				  @param int i, the position of the current array value
				  @param int j, the random position the cards that are being swapped */
		private void swap(int i, int j)
		{
			String temp = deck[i];
			deck[i] = deck[j];
			deck[j] = temp;




		}

		//This method will shuffle the deck of cards by using a random generator and calling the swap method.
		public void shuffle()
		{
			Random rn = new Random();

			for(int i = 0; i < deck.length; i++)
				swap(i, rn.nextInt(52));

		}

		/*This method will return the entire array
		  @result String holding the entire deck of cards
		  */
		public String toString()
		{
			String output = "";

			for(int i = 0; i < deck.length-1; i++)
				output += "\n"+deck[i];

			return output;

		}







}