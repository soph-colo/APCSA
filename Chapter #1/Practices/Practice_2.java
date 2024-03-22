/*Sophia Colonello
  9/9/20
  this program will simulate a game where the contestant guesses the name of the celebrity based off a certain
  number of letters provided. the program will tell the use if they are correct or not.*/

  import java.util.*;

  public class Practice_2
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //name variable
		  	String firstName, lastName, name = "";

		  //for loop for 3 different names
		  	for(int i = 0; i < 3; i++)
		  	{
				//if statement to determine turn
				  if(i == 0)
				  {
					//name
		  				firstName = "Justin";
		  				lastName = "Bieber";
		  				name = firstName+" "+lastName;
		  				System.out.println(firstName.substring(2)+" "+lastName.substring(0,lastName.length()-3));
			   	  }
			   	  if(i == 1)
			   	  {
					  //name
					  	firstName = "John";
					  	lastName = "Wayne";
					  	name = firstName+" "+lastName;
		  				System.out.println(firstName.substring(2)+" "+lastName.substring(0,lastName.length()-3));
				  }
				  if(i == 2)
			   	  {
					  //name
					  	firstName = "Mark";
					  	lastName = "Wahlberg";
					  	name = firstName+" "+lastName;
		  				System.out.println(firstName.substring(2)+" "+lastName.substring(0,lastName.length()-3));
				  }


		        //asking for their answer
		  			System.out.print("\nAnswer: ");
		  			String answer = sc.nextLine();

		  		//checking to see if they are correct
		    		if(answer.equalsIgnoreCase(name))
		    		{
						System.out.println("\n\n\t\t\tCORRECT!");
					}
					else
						System.out.println("\n\n\t\t\tINCORRECT!");

			}

	  }
  }