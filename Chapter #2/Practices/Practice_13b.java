/*Sophia Colonello
  10/15/20
  this program will check to see if a user entered variable name is legal */

  import java.util.Scanner;

  public class Practice_13b
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //variables for rerun
		  	boolean rerun = true;

		  //rerun
		  	do
		  	{
				//getting the user's variable name
					String varName;
					System.out.printf("%n%nEnter your variable name (q to quit): ");
					varName = sc.nextLine();

				//if statement for q
					if(varName.equalsIgnoreCase("q") || varName.equalsIgnoreCase("Q"))
					{
						rerun = false;
						break;
					}

				//calling the method to test the variable
					legality(varName);

			}
			while(rerun);

			//last output
				System.out.printf("%n%n\tThank you for running!%n%n");


	  }
	  /*this program will accept a string. it will decide if it is "legal"
	    @param varName the variable name being tested*/
	  public static void legality(String varName)
	  {
		  //boolean
		  	boolean legal = true;

		  //checking for spaces
			for(int i = 0; i < varName.length();i++)
			{
				if(Character.isWhitespace(varName.charAt(i)))
				{
					legal = false;
					break;
				}

			}

		  //if statement
		  	if(Character.isDigit(varName.charAt(0)))
		  	{
				System.out.printf("%n%n\tThe variable %s is illegal!%n%n%n",varName);

			}
			else if(!legal)
			{
				System.out.printf("%n%n\tThe variable %s is illegal!%n%n%n",varName);

			}
			else if(Character.isUpperCase(varName.charAt(0)))
			{
				System.out.printf("%n%n\tThe variable %s is legal, but uses poor style.%n%n%n",varName);
			}

			else
			{
				System.out.printf("%n%n\tThe variable %s is legal!%n%n%n",varName);
			}



	  }
  }