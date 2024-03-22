/*Sophia Colonello
  10/1/20
  this program will calculate the decibel level of two sounds */

  import java.util.Scanner;

  public class Practice_10b
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //variables
		  	double dec1, dec2, combination;

		  //getting the info
		  	System.out.print("\nDecibel level 1: ");
		  	dec1 = sc.nextDouble();

		  	//validation
		  		while(dec1 < 0)
		  		{
					System.out.println("\n\n\t\tERROR! Please enter a valid number: ");
					dec1 = sc.nextDouble();
				}

		  	System.out.print("\n\nDecibel level 2: ");
		  	dec2 = sc.nextDouble();

		  	//validation
		  		while(dec2 < 0)
		  		{
					System.out.println("\n\n\t\tERROR! Please enter a valid number: ");
					dec2 = sc.nextDouble();
				}

		  //conversions
		  	dec1 = Math.pow(10,(dec1/10));
		  	dec2 = Math.pow(10,(dec2/10));

		  //combination
		  	combination = dec1+dec2;

		  //coverting back
		  	combination = 10*Math.log10(combination);

		  //printing output
		  	System.out.println("\nCombination decibel level: "+combination+" dB");



	  }
  }