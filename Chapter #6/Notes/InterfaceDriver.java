import java.util.Scanner;

public class InterfaceDriver
{
	public static void main(String[] args)
	{
		//Demonstrate the Laughable Interface
			Laughable[] laughs = new Laughable[3];
			laughs[0] = new Comedian("John Oliver");
			laughs[1] = new Sitcom("Big Bang Theory");
			laughs[2] = new Clown("Loopy");



		//Make them laugh
			for(Laughable l: laughs)
				l.laugh();


			System.out.println("\n\n");
		//Since some of our elements implement Booable as well
			for(Laughable l: laughs)
			{
				if(l instanceof Booable)
					((Booable)l).boo();	//we  need to cast since l is type Laughable and Laughable does not have boo method

				if(l instanceof Comedian)
					((Comedian)l).random();
			}











	}
}



