/*Mrs. Krauland
  10/3/2016
  This program will demonstrate the ASCII*/

  public class ASCII
  {
	  public static void main(String[] args)
	  {
		 // char ch = "hello"; 		ERROR
		 // String x = 'x';			ERROR
		 int x = 'A';			  //WORKS
		 System.out.println(x);

		 char character = 'a';
		 String word = Character.toString(character);
		 //outputs the value of 'A' from the ASCII table

		 /*char variables are used to store a single letter
		   they are actually integers
		   		char is a 16-bit unsigned into data type
		   		Here is an example of a 16 bit pattern: 0000000011001101

		   ASCII stands for American Standard Code for Information Interchange.
		   		Prononced ask-key

		   		ASCII YOU MUST KNOW:
		   			'0' = 48		'1' = 49	'2' = 50 ......
		   			'A' = 65		'B' = 66	'C' = 67 ......
		   			'a' = 97		'b' = 98	'c' = 99 ...... */


		  /* int j = 50;
		     char ch = j;

		     	ILLEGAL: Possible loss of percision.
		     			 ASCII has 536 options while an int has 2 billion options
		     			 If we want this to work we need to cast*/

		     	int j = 50;
		     	char ch = (char)j; //cast
		     	System.out.println(ch);


		  //CHARACTERS:
		  	char let = 'A';
		  	char fun = 65;

		  	System.out.println(let + "\t" + fun);
		  		//This prints the characters since it is declared as a charcter

		  	char test = 'a', go =97;
		  	System.out.println(test + "\t" + go);


		  //ADDING:
		  	char sum = 'B' + 1;
		  	System.out.println(sum);
		  		//So this prints out C since sum is declared as a char

		  	System.out.println('B' + 1);
		  		//Prints out 67, this is not declared as a char so it is considered an int

		  	System.out.println((char)('B' + 1));


		/*REVIEW: CHARACTER METHODS:
			Character.isLetter()			determines if a char is a letter
			Character.isWhiteSpace()		determines if white space
			Character.isDigit()				determines if it is a digit
			Character.isLetterOrDigit()		determines if it is a letter or digit
			Character.isUpperCase()			determines if uppercase
			Character.isLowerCase()			determines if lowercase

			Return a boolean */

		//matching char to number starting at 48 ending with 255
		  System.out.println("\n\n");
		  for(int i=48; i<=300; i++)
		  	System.out.println(i+"\t"+(char)i);


			char ex = 'a';

			System.out.println("\n\n" + Character.isDigit(ex));
			System.out.println(Character.isLetter(ex));


	  }
	}