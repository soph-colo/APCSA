/*Sophia Colonello

 We have used the System.out.println and the System.out.print

 There is a third System.out method:
  	System.out.printf(
	The f stands for formatted

We can use this instead of our decimal formatter
	Decimal formatter obviously only has us format decimal places.
	The printf allows us to handle much more!

Now it's your job to discover how this thing works!!  Write the
following code in a program.  After each output describe how
that specific printf works / what the new code does.

When you are done with this submit your program to Moodle.*/

public class Practice_12
{
	public static void main(String[] args)
	{
		//DECLARING VARIABLES
			double dblTotal = 146565.68943242434;

			int intValue = 4556466;

			String words = "Let's see if we can figure this out";

			String str1 = "Hello";

			String str2 = "World";

			String animal = "cat";

			String animal2 = "elephant";

			String name = "Tony";

		//OUTPUTS
// 1.)
			System.out.printf("%s", words);
				//1. it takes the string variable from after the comma  2. it prints out the string
					//says printing a string


//2.)
			System.out.printf("%s%n", words);
				//1. it takes the string variable from after the comma 2. it prints out the string with no space
					//string and a new line

//3.)
			System.out.printf("%n");
				//1. it formats a line 2. it skips a line
					//new line

//4.)
			System.out.printf("Hello, %s!\n", str2);
						//1. it takes the string variable from after the comma and adds it into the print 2. it prints out both the words "hello" and the variable
							//whatever before the %s will be printed, then the variable, then the rest of the string
//5.)
			System.out.printf("%s%s%n", str1, str2);
					//1. it takes each of the string variables (in order) and prints 2. it prints the two variables side by side
						//two strings + new line

//6.)
			System.out.printf("%20s%20s%n", str1, str2);
				   //1. it takes each of the string variables (in order) and prints with spacing 2. it prints the two variables with a large amount of space in between
						//puts the string length into a field of 20 (controls spacing)
						//fall ---> 16 spaces and then fall

//7.)
			System.out.printf("The animal is a(n) %5s%n", animal2);
			System.out.printf("The animal is a(n) %5s%n", animal);
						//1. it takes the variable from after the comma and prints it 2. the output prints the words and variables with small spacing
							//controls the spacing again, followed by a blank line

//8.)
			System.out.printf("%d%n", intValue);
					//1. it takes the variable from after the comma 2. it prints out the variable
							//prints int
//9.)
			System.out.printf("%,d%n", intValue);
					//1. it takes the variable from after the comma and formats it 2. it gives the variable commas
							//puts comma into an int

//10.)
			System.out.printf("%15d%n", intValue);
					//1. it takes the variable from after the comma and adds space 2. there is a space before the variable is printed
							//field length and prints val

//11.)
			System.out.printf("%f%n", dblTotal);
					//1. it takes the variable from after the comma and prints 2. the variable (a double) is printed
							//prints a floating point

//12.)
			System.out.printf("Total is: $%.2f%n",dblTotal);
					 //1. it takes the variable from after the comma and formats it 2. there is a dollar sign and decimals are included
							//rounds to two decimal places

//13.)
		   	System.out.printf("Total: %,.3f: %n", dblTotal);
		   			//1. it takes the variable from after the comma and formats it 2. there are commas and decimals in the format
						//commas and three decimals

//14.)
		   	System.out.printf("%s%f%n",name, dblTotal);
		   			//1. it takes the proper variable type and prints them 2. it prints out the variable name ad the number right next to each other
						//prints string then a floating point

//15.)
		   	System.out.printf("%s makes %f%n", name, dblTotal);
		   			//1. it takes the proper variable type and prints them in the correct location in the print 2. the name is printed before the output, then, the total is printed while also being formated
						//string word floating-point

//16.)
		   	//The biggest advantage of using printf method over our decimal formatter is... it makes things a lot more efficent, and, there are a lot of options that can be used in a variety of situations.


	}
}