/*Mrs. Koegler
  9/6/2019
  This program will demonstrate the methods from the Math class */

import static java.lang.Math.*;
import static java.lang.System.*;

public class MathClassMethods
{
	public static void main(String[] args)
	{
		/*REVIEW:
			 METHODS:		RETURNS:
			Math.PI			3.14...
			Math.round		long
			Math.pow		double
			Math.sqrt		double
			Math.abs		double or int


		We do not need any import, however if you do not want to write
		Math everytime you can use the static import language feature:
			import static java.lang.Math.*;
		*/

		System.out.println(PI);
		System.out.println(round(5.16));

		/*We could use this same idea for our outputs:
			import static java.lang.System.*; */

		out.println(pow(5,2));

		/*NEW MATH METHODS:
			ceil(n)		Returns the next highest whole number as a double*/
				out.println(ceil(5.3));
				out.println(ceil(-4.8));
				out.println(ceil(3));	//ALREADY A WHOLE NUMBER

			//floor(n)	Returns the next lowest whole number as a double

			//min(a,b)	Returns the smaller of the two number as a double or int
				out.println(min(5,8));
				out.println(min(4.3, 2));

			//max(a,b)	Returns the larger of the two numbers as a double or int

			//e			returns 2.711828...

			//log(x)	This is the natural log

			//sin(a)	Returns the sine of angle a, where a is in radians, returns a double
				out.println(sin(PI));

			//cos(a)

			//tan(a)

			//asin(d)	Returns the arcsine of a double value
				out.println(asin(5));

			//acos(d)

			//atan(d)

			//toDegrees(angRad)	Converts radians to degrees returns as a double
				out.println(toDegrees(PI));

			//toRadians(angDeg)	Converts degrees to radians retunrs as a double
				out.println(toRadians(90));

			//random()	returns a double from 0<= r < 1
				out.println(random());

				//How could a random number from 0<= r < 10
				out.println(random() * 10);

				//What if I want to be integer?
				int number = (int)(Math.random() * 10);
				System.out.println(number);

				//What if I want it to start at a specific  number
					//add that number  1-10
					number = (int)(Math.random()* 10)+1;


				//Could also use your random generator:







	}
}