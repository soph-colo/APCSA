import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Player{

   //instance variables
   //scorecard, name, dice values array
   //array of totals ++++ 2dim array for scorecard?
   private String name;
   private int[] scorecard= new int[13]; //going to have to be two dimensional for multi players
   private int[] diceValues = new int[5];
   private String[] rerollsChoice = new String[5];
   private boolean[] chosen = new boolean[13];
   private ArrayList<String> playerNames = new ArrayList<String>();
   private ArrayList<Integer> totals = new ArrayList<Integer>();
   private String[] scorecardNames = {"Ones             ", "Twos             ", "Threes           ", "Fours            ", "Fives            ", "Sixes            ", "Three of a Kind    ", "Four of a Kind    ", "Full House (25)    ", "Small Straight (30)", "Large Straight (40)", "Yahtzee (50)       ", "Chance           "};

   //constructors
   public Player(){
     //for computer or one-person player
   }
   public Player(String name){
       this.name=name;
   }

   //setting array for names
   public void setNames(ArrayList <String> names)
   {
   	 for(String n: names)
   	 {
   		playerNames.add(n);
   		totals.add(0);
   	 }
   }

   //get scorecard values
   public void updateScoreCard(){
      Scanner sc = new Scanner(System.in);
      displayscorecard();
      System.out.println("\n\tPlease pick one of the categories above (Ones = 1, Twos = 2 ... Chance = 13): ");
      int choice = sc.nextInt();

      //add validation to see if it was already used
      while(!validateChoice(choice)){
		  System.out.println("\n\tPlease choose 1-13: \n(The category 'Upper Score', 'Upper Bonus', 'Lower Score', and 'Total' do not apply to the options.)");
		  choice=sc.nextInt();
	  }

	  chosen[choice-1]=true;

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

   //get dice values
   public void rollDice()
   {
	   for(int i = 0; i < diceValues.length; i++){
		   diceValues[i] = (int)(Math.random()*6+1);
		   System.out.println("\tDice "+(i+1)+": "+diceValues[i]);
	   }
   }

   //method to reroll
   public void reroll(){
	    Scanner sc = new Scanner(System.in);
        //variables
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

   				//validate
   				while(!(rerollsChoice[i].equalsIgnoreCase("yes")||rerollsChoice[i].equalsIgnoreCase("no"))){
   					System.out.println("\n\tERROR! Please enter yes or no: ");
   					rerollsChoice[i]=sc.nextLine();
   				}

   				//if statement to reroll certain dice
   					if(rerollsChoice[i].equalsIgnoreCase("yes"))
   						diceValues[i] = (int)(Math.random()*6+1);
   			}
   			 //print
   			 	System.out.println("\n\t\tRerolled dice: ");
   			 	for(int i = 0; i < diceValues.length; i++)
   	 				System.out.println("\tDice "+(i+1)+": "+diceValues[i]);
   		}
   		count++;
	   }while(count < 2 && choice.equalsIgnoreCase("reroll"));
   }

   //method to print the scorecard
   public void displayscorecard(){
 		//this is for multiple players
 		System.out.print("\t\t\t\t\t        ");
 		for(int i = 0; i < playerNames.size(); i++)
 		{
 			System.out.print(playerNames.get(i)+"\t\t\t");
 		}
 		System.out.println("");
 		for(int i = 0; i < scorecardNames.length; i++)
 		{
         int bonus=0, lowertotal;
 			System.out.print("\t"+scorecardNames[i]+"\t\t\t");
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
     //prints total
         System.out.println("\tLower Total        \t\t\t"+getLowerScore());
         System.out.println("\tTotal              \t\t\t"+getTotalScore());

         totals.set(0, getTotalScore());
         //0 shoudld be variable j

    }
      public int getUpperScore(){
        int total=0;
          for(int i=0; i<6; i++){
            total+=scorecard[i];
          }
          return total;

      }
      public int getLowerScore(){
        int total=0;
        for(int i=6; i<13; i++){
          total+=scorecard[i];
        }
        return total;
      }
      public int getTotalScore(){
        int bonus=0;
        if(getUpperScore()>=63){
          bonus=35;
        }
        return (getUpperScore()+getLowerScore()+bonus);
      }
      public boolean validateChoice(int choice){
           if((!(choice>=1&&choice<=13))||chosen[choice-1]==true){
             return false;
           }
           else
             return true;
      }
      public String validateReroll(String s){
        Scanner sc = new Scanner(System.in);
        while(!(s.equalsIgnoreCase("done")||s.equalsIgnoreCase("reroll"))){
          System.out.println("\n\t\tPlease enter done or reroll:");
          s=sc.nextLine();
        }
        return s;
      }
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
	  public void getSevenEight(int choice){
	    int count=0;
	    Arrays.sort(diceValues);

		  //find three of a kind case
          for(int i=0; i<diceValues.length-1; i++){
                 if(diceValues[i]==diceValues[i+1]){
                   count++;
			    }
		  }
          if(count==2||count==3){
           for(int i=0; i<diceValues.length; i++)
		    scorecard[choice-1]+=diceValues[i];
		  }
	  }
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
	  public void getYahtzee(int choice){
		//yahtzee case
		boolean same=true;
		  for(int i=1; i<diceValues.length-1; i++){
		    if(diceValues[i]!=diceValues[i+1])
		  	   same=false;
		  	}
		  	if(same)
		  	  scorecard[11]=50;
	  }
	  public void getChance(){
         //chance case
	  	for(int i=0; i<diceValues.length; i++)
		  	scorecard[12]+=diceValues[i];
	  }
	  public void getStraights(int choice){
  		  int count =0;
  		  Arrays.sort(diceValues);
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
	  public String getName(){
		  return name;
	  }
	  public void computerTurn(){
		  //computer's turn
		  System.out.println("\n\tThe computer has rolled: ");
		  rollDice();

		  int choice=0;
		  while(chosen[choice-1]==false)
		  	choice= (int) (Math.random()*13+1);
		  //validate
		  System.out.println("\n\tThe computer has chosen category #"+choice);

          if(choice>=1&&choice<=6)
          	getBasicValues(choice);
          else if(choice==7||choice==8)
            getSevenEight(choice);
          else if(choice==10||choice==11)
          	getStraights(choice);
          else if(choice==12)
          	getYahtzee(choice);
          else if(choice==13)
          	getChance();

          displayscorecard();
	  }
	  public void whoWins(){
		  int maxPoints = 0;
		  int maxPosition = 0;

		  for(int i=0; i<totals.size(); i++){
			  if(maxPoints<totals.get(i))
			  	maxPosition=i;
		  }
		  //print winner and their score
		  	System.out.println("\n\t\t\tThe winner of the game is: "+playerNames.get(maxPosition)+", and their score is: "+totals.get(maxPosition));
	  }
}