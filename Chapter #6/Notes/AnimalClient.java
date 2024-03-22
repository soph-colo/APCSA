import java.util.Scanner;


public class AnimalClient
{
	public static void main(String[] args)
	{
		//Create an array of Animals
			Animal[] animals = new Animal[4];


		//Initialize animals
			animals[0] = new Animal("Herb");
			animals[1] = new Bird("Tweety");
			animals[2] = new Ostrich("Sally");
			animals[3] = new Fish("Name", "Salt");


		//Print the information about the animals

			for(int i = 0; i < 4; i++)
			{
				System.out.println(animals[i]);
				animals[i].characteristics();
				animals[i].move();
				System.out.println("\n\n");
			}


		/*Print that animal[3] is a fish who has water
		 	System.out.println("I live in "+animals[3].getWaterType()+" water");

		 	The way Animal array is declared does not let me use this method


		 	instanceOf
		 		-sees if a refernece object is an instance of a particular class
		 		 Animal userPick = null;	becuase we do not know what they are going to pick

		 	if(userPick isntanceOfFish)
		 		System.out.pritln("Fish are smelly!!");*/








	}
}
