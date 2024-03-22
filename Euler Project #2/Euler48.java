/*Sophia Colonello
  3/29/21
  this program will find the last ten digits of the series, 11 + 22 + 33 + ... + 10001000. */

  import java.math.BigInteger;

  public class Euler48
  {
	  public static void main(String[] ars)
	  {
		  //biginteger variables
  			BigInteger m = BigInteger.TEN.pow(10);
  			BigInteger sum = BigInteger.ZERO;

  		  //for loop to get the sum
  			for (int i = 1; i <= 1000; i++)
   				sum = sum.add(BigInteger.valueOf(i).modPow(BigInteger.valueOf(i), m));

   		  //print
  			System.out.println(sum.mod(m));
 	  }
 }