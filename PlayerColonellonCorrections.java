/*Sophia Colonello and Veronica Pimenova
  Period 6
  2/16/21
  This program will represent the Player class for the Yahtzee game program.
  It will simulate needed methods of a player or computer during their turn.*/

//imports
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class PlayerColonelloCorrections{

   //instance variables
   private String name;
   private int[] scorecard= new int[13];
   private int[] diceValues = new int[5];
   private String[] rerollsChoice = new String[5];
   private boolean[] chosen = new boolean[13];
   private String[] scorecardNames = {"Ones             ", "Twos             ", "Threes           ", "Fours            ", "Fives            ", "Sixes            ", "Three of a Kind    ", "Four of a Kind    ", "Full House (25)    ", "Small Straight (30)", "Large Straight (40)", "Yahtzee (50)       ", "Chance           "};

   //constructors
   public Player(){
   }
   public Player(String name){
       this.name=name;
   }

   /*This method will get scorecard values based on user input and rules.*/
   public void updateScoreCard(){

	  //set up scanner
      Scanner sc = new Scanner(System.in);

      //print initial scorecard
      displayscorecard();

      //user input for category
      System.out.println("\n\tPlease pick one of the categories above (Ones = 1, Twos = 2 ... Chance = 13): ");
      int choice = sc.nextInt();

      //add validation to see if it was already used
      while(!validateChoice(choice)){
		  System.out.println("\n\tPlease choose an unmarked category 1-13: \n(The category 'Upper Score', 'Upper Bonus', 'Lower Score', and 'Total' do not apply to the options.)");
		  choice=sc.nextInt();
	  }
	  chosen[choice-1]=true;

      //change the values in the scorecard based on user input of choice
      if(choice>=1&&choice<=6){
		  getBasicValues(choice);
	  }
	  else if(choice==7||choice==8){
		  getSevenEight(choice);
	  }
	  else if(choice==9){
		  getFullHouse(choice);
	  }
	  else if(choice==10||choice==11){
		  getStraights(choice);
	  }
	  else if(choice==12){
		  getYahtzee(choice);
	  }
      else if(choice==13){
		  getChance();
	  }
	  //print the current scorecard
	  displayscorecard();
   }

   //This method will roll the dice and print their current values
   public void rollDice()
   {
	   for(int i = 0; i < diceValues.length; i++){
		   diceValues[i] = (int)(Math.random()*6+1);
		   System.out.println("\tDice "+(i+1)+": "+diceValues[i]);
	   }
   }

   //This method will reroll the dice based on user input.
   public void reroll(){

	    //set up scanner and variables
	    Scanner sc = new Scanner(System.in);
        String choice = "";
        int count=0;

        //for loop to get the rerolls
        do{
        	System.out.print("\n\tIf you would keep all your dice, type \"done\", or, type \"reroll\" to pick your dice: ");
        	choice = validateReroll(sc.nextLine());

        	if(choice.equalsIgnoreCase("reroll"))
        	{
   			System.out.println("\n\t\tType:\"yes\" to reroll and \"no\" to keep the current value:");
        		for(int i = 0; i < diceValues.length; i++)
        		{
   				System.out.print("\tDice "+(i+1)+": ");
   				rerollsChoice[i] = sc.nextLine();

   				//validate user input for yes or no
   				while(!(rerollsChoice[i].equalsIgnoreCase("yes")||rerollsChoice[i].equalsIgnoreCase("no"))){
   					System.out.println("\n\tERROR! Please enter yes or no: ");
   					rerollsChoice[i]=sc.nextLine();
   				}

   				//if statement to reroll certain dice
   					if(rerollsChoice[i].equalsIgnoreCase("yes"))
   						diceValues[i] = (int)(Math.random()*6+1);
   			}
   			 //print the rerolled dice
   			 	System.out.println("\n\t\tRerolled dice: ");
   			 	for(int i = 0; i < diceValues.length; i++)
   	 				System.out.println("\tDice "+(i+1)+": "+diceValues[i]);
   		}
   		count++;
	   }while(!(choice.equalsIgnoreCase("done")|| count>=2));
   }

   //This method will display the scorecard with its current values.
   public void displayscorecard(){

	//print the name and format
    System.out.println("\t\t\t\t\t\t"+name);
    System.out.println("");

        //print the scorecard and values in it
 		for(int i = 0; i < scorecardNames.length; i++)
 		{
         int bonus=0, lowertotal;

 			System.out.print("\t"+(i+1)+". "+scorecardNames[i]+"\t\t\t");
         if(chosen[i]==true)
            System.out.println(scorecard[i]);
         else
            System.out.println();

         if(i==5){
           //prints upper score and Bonus
           System.out.println("\tUpper Score        \t\t\t"+getUpperScore());
             if(getUpperScore()>=63)
               bonus=35;
           System.out.println("\tUpper Bonus (35)  \t\t\t"+bonus);

         }
 		}
     //prints totals
         System.out.println("\tLower Total        \t\t\t"+getLowerScore());
         System.out.println("\tTotal              \t\t\t"+getTotalScore());
    }

    /*This method will get the upper score (total of first 6 parts of the chart)
    @return int total*/
      public int getUpperScore(){
        int total=0;

          //total the scorecard for the first six parts
          for(int i=0; i<6; i++){
            total+=scorecard[i];
          }
          return total;
      }

      /*This method will get the lower score
      @return int total*/
      public int getLowerScore(){
        int total=0;

        //for loop to get total
        for(int i=6; i<13; i++){
          total+=scorecard[i];
        }
        return total;
      }

      /*This method will get the total score of the scorecard
      @return int of total score*/
      public int getTotalScore(){
        int bonus=0;

        //see if there needs to be a bonus added
        if(getUpperScore()>=63){
          bonus=35;
        }
        return (getUpperScore()+getLowerScore()+bonus);
      }

      /*This method will validate the choice of the user's scorecard value
      @param int choice
      @return boolean true or false*/
      public boolean validateChoice(int choice){
           if((!(choice>=1&&choice<=13))||chosen[choice-1]==true){
             return false;
           }
           else
             return true;
      }

      /*This method will validate if the person entered done or reroll
      @param String s
      @return String s*/
      public String validateReroll(String s){
        Scanner sc = new Scanner(System.in);

        //validation for user input
        while(!(s.equalsIgnoreCase("done")||s.equalsIgnoreCase("reroll"))){
          System.out.println("\n\t\tPlease enter done or reroll:");
          s=sc.nextLine();
        }
        return s;
      }

      /*This method will get the scorecard values for user input 1-6
      @param int choice*/
      public void getBasicValues(int choice){
          int total=0;
		  for(int i=0; i<diceValues.length; i++){
		  	 if(choice==diceValues[i]){
		  	 	total+=diceValues[i];
			}
		  }
		  //find the total and change it
		  scorecard[choice-1]=total;
	  }

	  /*This method will change the scorecard for three or four of kind
	  @param int choice*/
	  public void getSevenEight(int choice){
	    int count=0, maxCount=0;
	    Arrays.sort(diceValues);

      //find maxCount to see how many of the same number there are
      for(int i=0; i<diceValues.length-1; i++){
          if(diceValues[i]==diceValues[i+1]){
            count++;
            if(count>maxCount){
              maxCount=count;
            }
			    }
          else
            count=0;
		  }
      if((maxCount>=2&&choice==7)||(maxCount>=3&&choice==8)){
        // satisfied this category
        for(int i=0; i<diceValues.length; i++)
		      scorecard[choice-1]+=diceValues[i];
		  }
	  }

	  /*This method will check for the full house case and update the scorecard accordingly.
	  @param int choice*/
	  public void getFullHouse(int choice){
          //full house case
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

		  //get check and change scorecard based on case 'full house'
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

	  /*This method will check for the yahtzee case and change the scorecard accordingly
	  @param int choice*/
	  public void getYahtzee(int choice){

		//yahtzee case check and change
		boolean same=true;
		  for(int i=1; i<diceValues.length-1; i++){
		    if(diceValues[i]!=diceValues[i+1])
		  	   same=false;
		  	}
		  	if(same)
		  	  scorecard[11]=50;
	  }

	  //This method will check for the chance case and change the scorecard accordingly
	  public void getChance(){
         //chance case
	  	for(int i=0; i<diceValues.length; i++)
		  	scorecard[12]+=diceValues[i];
	  }

	  /*This method will check for straights (large or small) and change the scorecard accordingly
	  @param int choice*/
	  public void getStraights(int choice){
  		  int count =0;
  		  Arrays.sort(diceValues);

  		  //get count and change accordingly
  		  for(int i=0; i<diceValues.length-1; i++){
  			  if(diceValues[i]==(diceValues[i+1]-1)){
  			    count++;
  			  }
  		  }
          if(count==4)
          	scorecard[10]=40;
          if(count==3)
          	scorecard[9]=30;
	  }

	  /*This method will get the name
	  @return String name*/
	  public String getName(){
		  return name;
	  }

}