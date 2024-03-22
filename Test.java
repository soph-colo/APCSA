import java.util.Scanner;

public class Test
{
	public static void main(String[] args)
	{

		//scanner
			Scanner sc = new Scanner(System.in);

		//variables
			int num = 0;

		//creating object
			UsefulMethods uf = new UsefulMethods(num);

		//setting the values
			System.out.print("enter a number: ");
			num = sc.nextInt();

			if(uf.isPrime(num))
			{
				System.out.println("prime");
			}
			else
				System.out.println("not prime");

	}
}