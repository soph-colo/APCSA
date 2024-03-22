/*Mrs. Krauland
  8/31/2016
  This program will demonstrate the use of Java Operators */

 public class Operators
 {
	 public static void main(String[] args)
	 {
		/*MATHEMATICAL OPERATORS
			 * 	multiplication
			 + 	addition
			 - 	subtraction
			 /*	integer division	int/int	= int (cuts off the decimals)
			 /	floating point division
			 		double/double
			 		double/int
			 		int/double

			 		5/7 	change to 5.0/7
			 		(double)5/7
			 %	modular division - the result is the remainder

			Order of Operations:
				Parenthesis  (inner one then outer) Casting
				* / %	(left to right)
				+ -

			Example: 19 % 5 * 3 + 14 / 5
						4 * 3 + 14 / 5
						12 + 14 / 5
						12 + 2
						  14

			Anytime you do an operation with a double and an int the result
			will always be a double.


	RELATIONAL OPERATORS:
		>		greater than
		< 		less than
		>=		greater than or equal to
		<=		less than or equal to
		==		equal to
		!=		not equal to

		Relational operators are used in boolean expressions.

		Why should you not use == and != to test for equality of floating
		point numbers?
			The number cannot always be represented exactly in the computer
			memory so a round-off error occurs.



	LOGICAL OPERATORS
		||		Or
		&&		And
		!		Not

		Used to apply boolean expressions to form compound boolean expressions

		Truth Tables:

		A		B		A&&B		A||B		!A		!A && (B||A)
		T		T		  T			 T			F			F
		F		F		  F			 F			T			F
		T		F		  F			 T			F			F
		F		T		  F		 	 T			T			T


		A		B		!(A||B) =>  !A && !B
		T		T		   F
		F		F		   T
		T		F	       F
		F		T		   F

		Logical Operators are evaluated left to right.  The evaluation
		automatically stops as soon as the condition is known.

				F && T		Stops reading right at the &&
				T || _		Stops reading right at the ||

			if(scoreTotal/numScore > 90 && numScore != 0)
				This will cause run-time error (Arithmetic Error: Div by zero)


			if(numScore != 0 && scoreTotal/numScore>90)
				This will not cause an error



	ASSIGNMENT OPERATORS:
		=		x = 2;

		We can perform a "chaining" of assignments

		x=2, y=5, z=10;
		a=b=c=3;


	COMPOUND ASSIGNMENT OPERATORS:
		+= 		x+=4		x = x + 4;
		-=
		*=
		/=
		%=


	INCREMENT DECREMENT OPERATORS:
		++		x++		x = x+1
		--

		What is the difference between ++x and x++?
			++x adds one first
			x++ adds it after

			We see this mainly in print lines and loops


	OPERATOR PRECEDENCE
		Highest		( )
					 !	++	--
					 *	/	%
					 + 	-
					 <	>	<=	>=
					 ==		!=
					 &&
					 ||
					 = 	+=	-=	*= /=	%=

		EXAMPLE		i=7
					i++ + 3 < 6 - 1
					11 < 5
					FALSE */

	 }
 }