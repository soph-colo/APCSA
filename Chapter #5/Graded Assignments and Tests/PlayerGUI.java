import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;
import java.awt.*;

public class PlayerGUI{

   //instance variables
   private  int choice = 0;
   private String name;
   private JTable table;
   private int[] scorecard= new int[13];
   private int[] diceValues = new int[5];
   private int[] rerollsChoice = new int[5];
   private boolean[] chosen = new boolean[13];;
   private ArrayList<Integer> totals = new ArrayList<Integer>();
   private String[] scorecardNames = {"Ones             ", "Twos             ", "Threes           ", "Fours            ", "Fives            ", "Sixes            ", "Three of a Kind    ", "Four of a Kind    ", "Full House (25)    ", "Small Straight (30)", "Large Straight (40)", "Yahtzee (50)       ", "Chance           "};

   //constructors
   public PlayerGUI()
   {

   }

   //get scorecard values
   public void updateScoreCard()
   {

	   //scanner
	   	Scanner sc = new Scanner(System.in);

	   //displaying scorecard and getting the category
		choice = Integer.parseInt(JOptionPane.showInputDialog(null,"1. Ones\n2. Twos\n3. Threes\n4. Fours\n5. Fives\n6. Sixes\n7. Three of a Kind\n8. Four of a Kind\n9. Full House (25)\n10. Small Straight (30)\n11. Large Straight (40)\n12. Yahtzee (50)\n13. Chance\nPlease pick one of the categories above (Ones = 1, Twos = 2...) ", "Pick Category", JOptionPane.QUESTION_MESSAGE));


			//add validation to see if it was already used
      			while(!validateChoice(choice))
		  			choice = Integer.parseInt(JOptionPane.showInputDialog(null, "You have already chosen that category, please select a different one.", "ERROR!!!", JOptionPane.QUESTION_MESSAGE));

	 	chosen[choice-1]=true;
   }

   //get dice values
   public void rollDice()
   {
	   for(int i = 0; i < diceValues.length; i++)
	   {
		   diceValues[i] = (int)(Math.random()*6+1);
	   }
	   JOptionPane.showMessageDialog(null,"Dice 1: "+diceValues[0]+"\nDice 2: "+diceValues[1]+"\nDice 3: "+diceValues[2]+"\nDice 4: "+diceValues[3]+"\nDice 5: "+diceValues[4]+"", "Dice", JOptionPane.INFORMATION_MESSAGE);
   }

   //method to reroll
   public void reroll()
   {
	   //scanner
	   		Scanner sc = new Scanner(System.in);

       //variables
        	int done = 0;
        	int count=0;

      //for loop to get the rerolls
        do{


        	Object[] possibilities = {"done", "reroll"};
        	done = JOptionPane.showOptionDialog(null, "Click \"done\" to keep all your dice, or, click \"reroll\" to reroll", "Reroll", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, possibilities, possibilities[0]);

        	if(done == 1)
        	{

        		for(int i = 0; i < diceValues.length; i++)
        		{
					rerollsChoice[i] = JOptionPane.showConfirmDialog(null,"Dice 1: "+diceValues[0]+"\nDice 2: "+diceValues[1]+"\nDice 3: "+diceValues[2]+"\nDice 4: "+diceValues[3]+"\nDice 5: "+diceValues[4]+"\nChoose yes to reroll, and no to keep:\nDice "+(i+1)+": ", "Rerolling", JOptionPane.YES_NO_CANCEL_OPTION);


   					//if statement to reroll certain dice
   				 		if(rerollsChoice[i] == 0)
   							diceValues[i] = (int)(Math.random()*6+1);
   				}

   			 //print
   				JOptionPane.showMessageDialog(null,"Rerolled dice:\n Dice 1: "+diceValues[0]+"\nDice 2: "+diceValues[1]+"\nDice 3: "+diceValues[2]+"\nDice 4: "+diceValues[3]+"\nDice 5: "+diceValues[4]+"", "Dice", JOptionPane.INFORMATION_MESSAGE);
   		}
   		count++;
	   }
	   while(count < 2 && done == 1);
   }

      public int getChoice()
      {
          return choice;
      }
      public int getOnes(int choice)
      {
		  int total = 0;
		  if(choice == 1)
		  {
		  		for(int i=0; i<diceValues.length; i++)
		  		{
		  			 if(1 ==diceValues[i])
		  			 	scorecard[0]+=diceValues[i];
		  		}
		  }


		 return scorecard[0];

	  }
	  public int getTwos(int choice)
	  {
	  		  int total = 0;
	  		  if(choice == 2)
	  		  {
	  		  		for(int i=0; i<diceValues.length; i++)
	  		  		{
	  		  			 if(2 ==diceValues[i])
	  		  			 	scorecard[1]+=diceValues[i];
	  		  		}
	  		  }

	  		 return scorecard[1];

	  }
	  public int getThrees(int choice)
	  {
	  		  int total = 0;
	  		  if(choice == 3)
	  		  {
	  		  		for(int i=0; i<diceValues.length; i++)
	  		  		{
	  		  			 if(3 ==diceValues[i])
	  		  			 	scorecard[2]+=diceValues[i];
	  		  		}
	  		  }

	  		 return scorecard[2];

	  }
	  public int getFours(int choice)
	  {
	  		  int total = 0;
	  		  if(choice == 4)
	  		  {
	  		  		for(int i=0; i<diceValues.length; i++)
	  		  		{
	  		  			 if(4 ==diceValues[i])
	  		  			 	scorecard[3]+=diceValues[i];
	  		  		}
			}

	  		 return scorecard[3];

	  }
	  public int getFives(int choice)
	  {
	  		  int total = 0;
	  		  if(choice == 5)
	  		  {
	  		  		for(int i=0; i<diceValues.length; i++)
	  		  		{
	  		  			 if(5 ==diceValues[i])
	  		  			 	scorecard[4]+=diceValues[i];
	  		  		}
	  		  }

	  		 return scorecard[4];

	  }
	  public int getSixes(int choice)
	  {
	  		  int total = 0;
	  		  if(choice == 6)
	  		  {
	  		  		for(int i=0; i<diceValues.length; i++)
	  		  		{
	  		  			 if(6 ==diceValues[i])
	  		  			 	scorecard[5]+=diceValues[i];
	  		  		}
	  		  }
	  		 return scorecard[5];

	  }

    public int getBonus()
    {
		int bonus = 0;

		if(getUpperScore()>=63)
             bonus=35;

         return bonus;
	}
      public int getUpperScore()
      {
          int total=0;
          for(int i=0; i<6; i++)
            total+=scorecard[i];
          return total;
      }
      public int getLowerScore()
      {
        int total=0;
        for(int i=6; i<13; i++)
          total+=scorecard[i];
        return total;
      }
      public int getTotalScore()
      {
        int bonus=0;
        if(getUpperScore()>=63)
          bonus=35;
        return (getUpperScore()+getLowerScore()+bonus);
      }
      public boolean validateChoice(int choice)
      {
           if((!(choice>=1&&choice<=13))||chosen[choice-1]==true)
             return false;
           else
             return true;
      }
	  public int getSevenEight(int choice)
	  {
	    int count=0;
	    Arrays.sort(diceValues);

	    if(choice == 7 || choice == 8)
	    {

		  //find three of a kind case
          for(int i=0; i<diceValues.length-1; i++){
                 if(diceValues[i]==diceValues[i+1]){
                   count++;
			    }
		  }
          if(count==2||count==3){
           for(int i=0; i<diceValues.length; i++)
		    scorecard[choice]+=diceValues[i];
		  }
	   }
		  return scorecard[choice-1];
	  }
	  public int getFullHouse(int choice)
	  {
          //full house case
          if(choice == 9)
          {
		  	int[] count = new int[6];
		  	for(int i=0; i<diceValues.length; i++){
				 if(diceValues[i]==1)
          	   	count[0]++;
          	   else if(diceValues[i]==2)
          	   	count[1]++;
          	   else if(diceValues[i]==3)
          	   	count[2]++;
          	   else if(diceValues[i]==4)
          	   	count[3]++;
          	   else if(diceValues[i]==5)
          	   	count[4]++;
          	   else if(diceValues[i]==6)
             	count[5]++;
		  	}
		  	int check=0;
		  	for(int i=0; i<count.length; i++){
				  if(count[i]==2){
				  	check++;
				}
				  else if(count[i]==3){
				  	check++;
				}
		  	}
		  	if(check>=2)
		  		scorecard[choice-1]=25;
			}

		  return scorecard[choice-1];
	  }
	  public int getYahtzee(int choice)
	  {
		//yahtzee case
		if(choice == 12)
		{
		  boolean same=false;

		  for(int i=1; i<diceValues.length-1; i++)
		  {
		    if(diceValues[i]!=diceValues[i+1])
		  	   same=false;
		  	 else
		  	 	same = true;
		  }
		  if(same)
		  	 scorecard[11]=50;
		  else
		  	scorecard[11] = 0;
		 }

		  return scorecard[11];
	  }
	  public int getChance(int choice)
	  {
		  if(choice == 13)
		  {
         //chance case
	  	for(int i=0; i<diceValues.length; i++)
		  	scorecard[12]+=diceValues[i];
		}

		  return scorecard[12];
	  }
	  public int getStraights(int choice)
	  {
		  if(choice == 10 || choice == 11)
		  {
  		  int count =0;
  		  Arrays.sort(diceValues);
  		  for(int i=0; i<diceValues.length-1; i++){
  			  if(diceValues[i]==(diceValues[i+1]-1)){
  			    count++;
  			  }
  		  }
          if(count==4)
          {
          	scorecard[10]=40;
          	return scorecard[10];
		}
          if(count==3)
	  	  {
          	scorecard[9]=30;
          	return scorecard[9];
		  }
		}

          return 0;
	  }

}