public class Practice_29
{
	public static void main(String[] args)
	{
		Student s1 = new Student("Brian Lorenzen", new int[] {90, 94, 99}, "none" );
		Student s2 = new Student("Tina LeRoy", new int[] {50, 35, 0}, "none" );


		UnderGrad u1 = new UnderGrad("Tim Broder", new int[] {90, 90, 100}, "none");
		UnderGrad u2 = new UnderGrad("Cory Weleski", new int[] {50, 43, 74}, "none");


		GradStudent g1 = new GradStudent("Kevin Cristel", new int[] {85, 70, 90}, "none", 1234);
		GradStudent g2 = new GradStudent("David Peebles", new int[] {100, 95, 97}, "none", 5894);
		GradStudent g3 = new GradStudent("Katie Chirdon", new int[] {12, 70, 25}, "none", 7721);

		System.out.println("The Students: ");
			s1.computeGrade();
			System.out.println(s1);

			s2.computeGrade();
			System.out.println(s2);


		System.out.println("\nThe Undergrad students: ");
			u1.computeGrade();
			System.out.println(u1);

			u2.computeGrade();
			System.out.println(u2);


		System.out.println("\nThe Grad students: ");
			g1.computeGrade();
			System.out.println(g1);

			g2.computeGrade();
			System.out.println(g2);

			g3.computeGrade();
			System.out.println(g3);





	}
}