/*Sophia Colonello
  3/1/21
  this program will get the user to enter an expression. the expression will be solved by being put into an arraylist
  i really struggled with this one haha*/

  import java.util.ArrayList;
  import java.util.Scanner;

  public class Chapter5_Test
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //variables
		  	String expressionStr = "";
		  	double total = 0;


		  //array for expressions
		 	ArrayList <Object> expression = new ArrayList <Object>();

		  //getting the user expression
		  	System.out.print("Enter the expression: ");
		  	expressionStr = sc.nextLine();

		  		//validation
		  			while(expressionStr.isEmpty())
		  			{
						System.out.print("\n\tERROR! Please enter an expression: ");
						expressionStr = sc.nextLine();
					}

		  //for loop to store it into the array
		  	for(int i = 0; i < expressionStr.length(); i++)
		  	{
				if(expressionStr.substring(i,i+1) != "  ")
					expression.add(expressionStr.substring(i,i +1));
			}

		  //looking for the multiplacation and division
				for(int j = 0; j < expression.size(); j++)
				{
					if(expression.get(j) == "*" || expression.get(j) == "/")
					{
						if(expression.get(j) == "*")
						{
							total = (expression.get(j-2))*(expression.get(j+2));
							expression.remove(j);
							expression.set(total, j);
						}
						else
						{
							total = expression.get(j-2)/expression.get(j+2);
							expression.remove(j);
							expression.set(total, j);
						}

					}
					else
					{
						if(expression.get(j) == "+")
						{
							total = expression.get(j-2)+expression.get(j+2);
							expression.remove(j);
							expression.set(total, j);
						}
						else
						{
							total = expression.get(j-2)-expression.get(j+2);
							expression.remove(j);
							expression.set(total, j);
						}

					}


				}

			  //printing
			  	System.out.println(expression);










	  }
  }

