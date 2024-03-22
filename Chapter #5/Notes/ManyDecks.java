/*This program will use our Deck Class to create a program to keep track of
many decks. */

import java.util.Arrays;


public class ManyDecks
{
	//Declare instance variables
		private Deck[] allDecks;

	//Constructor
		public ManyDecks(int num)
		{
			//Create an array to hold the number of decks we want
				allDecks = new Deck[num];

			//Initialize each set sets of decks
				for(int i = 0; i < allDecks.length; i++)
					allDecks[i] = new Deck();

		}

	//Method to shuffle all of the decks
		public void shuffleAll()
		{
			for(Deck d: allDecks)
				d.shuffle();


		}

	//This method will print the decks
		public String toString()
		{
			return Arrays.toString(allDecks);


		}


//Let's create a multiple deck array to use at the Casino
public static void main(String[] args)
{
	ManyDecks many = new ManyDecks(5);
	many.shuffleAll();
	System.out.println(many);



}


}





