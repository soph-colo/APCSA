/*Sophia Colonello
  3/9/21
  this program will be the driver for the student class. it will demonstrate polymorphism */

  import java.util.Scanner;

  public class Practice_30
  {
	  public static void main(String[] args)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //array to hold students
		  	Student[] students;

		  //variables
		  	int numStu = 0;
		  	char gu = ' ';
		  	String name = " ";
		  	int[] scores = new int[3];
		  	int id = 0;
		  	String grade = " ";

		  //asking the user how many students
		  	System.out.print("\nHow many students are there: ");
		  	numStu = sc.nextInt();

		  		//validation
		  			while(numStu < 1)
		  			{
						System.out.print("\n\n\t\tERROR! Please enter a proper number of students: ");
						numStu = sc.nextInt();
					}

		  //array
		  	students = new Student[numStu];

		  //setting the different students
		  	for(int i = 0; i < students.length; i++)
		  	{
				sc.nextLine();
				System.out.print("\nStudent "+(i+1)+": ");
				System.out.print("\n\n\tName: ");
				name = sc.nextLine();
					//validation
						while(name.isEmpty())
						{
							System.out.print("\n\n\t\tERROR! Please enter a name: ");
							name = sc.nextLine();
						}

				for(int j = 0; j < scores.length; j++)
				{
					System.out.print("\n\tTest "+(j+1)+": ");
					scores[j] = sc.nextInt();
						//validation
							while(scores[j] < 0)
							{
								System.out.print("\n\n\t\tERROR! Please enter a proper score: ");
								scores[j] = sc.nextInt();
							}
				}
				System.out.print("\n\t(G)rad, (U)ndergrad, or (N)either: ");
				gu = sc.next().charAt(0);
					//validation
						while(!((gu == 'G' || gu == 'U') || gu == 'N'))
						{
							System.out.print("\n\n\t\tERROR! Please enter (g)rad, (u)ndergrad or (n)either: ");
							gu = sc.next().charAt(0);
						}
				if(gu == 'G')
				{
					System.out.print("\n\tID #: ");
					id = sc.nextInt();
					students[i] = new GradStudent(name, scores, grade, id);
				}
				else if(gu == 'U')
					students[i] = new UnderGrad(name, scores, grade);
				else if(gu == 'N')
					students[i] = new Student(name, scores, grade);


			  //calculating
				students[i].computeGrade();

			}

			//printing the grades
				System.out.println("\n\n\n");
				for(int a = 0; a < students.length; a++)
					System.out.println(students[a]);

	  }
  }
  /*WRITTEN:

  	2. I believe the problem occurs at this point
  		int x = s.getID();
  	   because, due to the laws of polymorphism, only overidden
  	   methods of the subclass can be accessed by the superclass. The class Student CAN NOT
  	   access the getID method from the GradStudent class, as it is not overidden.

  	3. spin  float  flip

  */
