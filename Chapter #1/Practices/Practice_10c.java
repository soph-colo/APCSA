/*Sophia Colonello
  10/1/20
  this program will convert wors to pig latin */

  import java.util.Scanner;

  public class Practice_10c
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //intro
		  	System.out.println("\n\n\t\tP I G  L A T I N  C O N V E R T E R");

		 //variable
			String str;


		  //do while
		  	do
		  	{

				//getting a word
					System.out.print("\n\nPlease enter a word: ");
					str = sc.nextLine();

				//if statement
					if((((str.charAt(0) == 'a' || str.charAt(0) == 'e') || (str.charAt(0) == 'i' || str.charAt(0) == 'u')) || ((str.charAt(0) == 'A'|| str.charAt(0) == 'E') || (str.charAt(0) == 'I' || str.charAt(0) == 'U'))))
						System.out.println("\nIn Pig Latin, that is: "+str);
					else
					{
						str = str.toLowerCase();
						char firstChar;
						firstChar = str.charAt(0);
						System.out.println("\nIn Pig Latin, that is: "+str.substring(1)+""+firstChar+"ay");
					}

			}
			while(!str.equalsIgnoreCase("q"));


	  }
  }