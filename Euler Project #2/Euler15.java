/*Sophia Colonello
  4/2/21
  this program will find how many such routes there are through a 20×20 grid */

  import java.math.BigInteger;

  public class Euler15
  {
	  public static void main(String[] args)
	  {
		  //print
		  	System.out.println(fact(40).divide(fact(40 - 20).multiply(fact(20))));

   	  }
 	  public static BigInteger fact(int n)
 	  {
		  //variable
			BigInteger prod = BigInteger.ONE;

		  //for loop for calc
            for(int i = 2; i <= n; i++)
				prod = prod.multiply(BigInteger.valueOf(i));

		  //return
		  	return prod;


        }
}