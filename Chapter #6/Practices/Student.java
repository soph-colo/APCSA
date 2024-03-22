/*Sophia Colonello
  3/5/21
  this program will be the student class */

  public class Student
  {
	  //instance variables
	  	private final int NUMTEST = 3;
	  	private String name;
	  	private int[] testScores = new int[NUMTEST];
	  	private String grade;
	  	protected double average;

	  //constructos
	  	public Student()
	  	{
			name = " ";
			grade = " ";
		}

	  	public Student(String name, int[] testScores, String grade)
	  	{
			this.name = name;
			this.testScores = testScores;
			this.grade = grade;

		}

	  //accessor methods
	  	public String getName()
	  	{
			return name;
		}

		public String getGrade()
		{
			return grade;
		}

	  //mutator method
	  	public void setGrade(String grade)
	  	{
			this.grade = grade;
		}

	  //method to calculate the test averages
	  	public void calcTestAve()
	  	{
			//variable
				int total = 0;


			//for loop
				for(int i = 0; i < testScores.length; i++)
					total += testScores[i];

		    //calc
		    	average = total/testScores.length;


		}

	  //method to compute grade
	  	public void computeGrade()
	  	{

			//getting the average
				calcTestAve();

			//if statement
				if(name.isEmpty())
					grade = "No Grade";
				else if(average >= 65)
					grade = "Pass";
				else
					grade = "Fail";

		}

	  //to string to display the grade
	  	public String toString()
	  	{
			return "Grade: "+grade;
		}
  }