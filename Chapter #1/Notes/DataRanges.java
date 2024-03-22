/*Mrs. Krauland
  9/30/15
 This program will demonstrate how to get data ranges*/

 public class DataRanges
 {
	 public static void main (String[] args)
	 {


		/*Integer values in Java are stored exactly as a string of bits
		  (binary numbers)

		  One of the bits storees the sign of the integer
		  	- 0 for positive
		  	- 1 for negative

		  BYTE:
		  	How many bits are in byte? 		8

		  	_ _ _ _ _ _ _ _
		  	0 1 1 1 1 1 1 1 	This holds the largest + integer for a byte

		  						2^7 - 1= 127	*/

		  	System.out.println("The min and max values of byte are: ");
		  	System.out.println(Byte.MIN_VALUE);
		  	System.out.println(Byte.MAX_VALUE);

		  /*INT
		  	The int use four bytes (32 bits).
		  	Taking one bit for a sign; the largest possible integer stored  is
		  	2^31 - 1 */

		  	System.out.println("\nThe min and max value of an int are: ");
		  	System.out.println(Integer.MIN_VALUE);
		  	System.out.println(Integer.MAX_VALUE);


		/*In gernal:
			A n-bit integer uses n/8 bytes of storage
				Range: -2^n-1 to 2^n-1 -1

				The extra value on the negative side comes from not havint to
				store -0. */

			System.out.println("\nThe min and max value of a double are: ");
			System.out.println(Double.MIN_VALUE);
			System.out.println(Double.MAX_VALUE);

		/*IMPORANT AP EXAM INFO: Only the Integer.MIN_VALUE and Integer.MAX_VALUE
		  are part of AP Java subset */













	 }
 }

