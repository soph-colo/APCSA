/*Sophia Colonello
  12/28/20
  this program will the index of the first term in the Fibonacci sequence to contain 1000 digits */

  import java.math.BigInteger;

  public class Euler25
  {
	  public static void main(String[] args)
	  {
		  //variables
			BigInteger firstNum = BigInteger.valueOf(1);
			BigInteger secondNum = BigInteger.valueOf(2);
			BigInteger thirdNum = BigInteger.valueOf(0);
			BigInteger max = BigInteger.TEN.pow(1000-1);
			int answer = 3;

		 //while loop
		 	while(secondNum.compareTo(max) < 0)
			{
				thirdNum = firstNum.add(secondNum);
				firstNum = secondNum;
				secondNum = thirdNum;
				answer++;
			}

		//final output
			System.out.println(answer);


	  }
  }


