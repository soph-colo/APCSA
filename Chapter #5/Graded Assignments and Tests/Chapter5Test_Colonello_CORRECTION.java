/*Sophia Colonello
  3/1/21
  this program will get the user to enter an expression. the expression will be solved by being put into an arraylist*/

  import java.util.ArrayList;
  import java.util.Scanner;

  public class Chapter5Test_Colonello_CORRECTION
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //CHANGE 1: variables
		  	String expressionStr = "";
		  	String element = "";
		  	double calc = 0;

		  //CHANGE 2: array for expressions
		 	ArrayList <String> expression = new ArrayList <String>();

		  //getting the user expression
		  	System.out.print("Enter the expression: ");
		  	expressionStr = sc.nextLine();

		  		//validation
		  			while(expressionStr.isEmpty())
		  			{
						System.out.print("\n\tERROR! Please enter an expression: ");
						expressionStr = sc.nextLine();
					}

		  //CHANGE 3: getting the elements into the arraylist
			for(int i = 0; i < expressionStr.length(); i++)
			{
				if((expressionStr.charAt(i) == ' ' && !element.equals("")))
				{
					expression.add(element);
					element = "";
				}
				else if(expressionStr.length() - 1 == i)
				{
					element += String.valueOf(expressionStr.charAt(i));
					expression.add(element);
					element = "";
				}
				else
					element += String.valueOf(expressionStr.charAt(i));

			}


		  //CHANGE 4: finding the math operators until an answer is gotten
		   	while(expression.size() > 1)
		   	{
				//finding the * and / and calculating
		  		for(int i = 0; i < expression.size(); i++)
		  		{
					if(expression.get(i).equals("*"))
					{
						calc = Double.parseDouble(expression.get(i-1));
						calc *= Double.parseDouble(expression.get(i+1));
						expression.remove(i+1);
						expression.remove(i);
						expression.remove(i-1);
						expression.add(i-1,String.valueOf(calc));
					}
					else if(expression.get(i).equals("/"))
					{
						calc = Double.parseDouble(expression.get(i-1));
						calc /= Double.parseDouble(expression.get(i+1));
						expression.remove(i+1);
						expression.remove(i);
						expression.remove(i-1);
						expression.add(i-1,String.valueOf(calc));
					}
				}
				//finding the + and - and calculating
		    	for(int i = 0; i < expression.size(); i++)
		  		{
					if(expression.get(i).equals("+"))
					{
						calc = Double.parseDouble(expression.get(i-1));
						calc += Double.parseDouble(expression.get(i+1));
						expression.remove(i+1);
						expression.remove(i);
						expression.remove(i-1);
						expression.add(i-1,String.valueOf(calc));
					}
					else if(expression.get(i).equals("-"))
					{
						calc = Double.parseDouble(expression.get(i-1));
						calc -= Double.parseDouble(expression.get(i+1));
						expression.remove(i+1);
						expression.remove(i);
						expression.remove(i-1);
						expression.add(i-1,String.valueOf(calc));
					}
				}
			}

		  //printing the answer
		  	System.out.println(expression);












	  }
  }

