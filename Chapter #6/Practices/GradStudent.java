/*Sophia Colonello
  3/5/21
  this program will be the gradstudent class */

  public class GradStudent extends Student
  {
	  //instance variabe
	  	private int id;

	  //constructors
	  	public GradStudent()
	  	{
			super();

			id = 0;
		}

		public GradStudent(String name, int[] testScores, String grade, int id)
		{
			super(name, testScores, grade);
			this.id = id;
		}

	  //accessor method
	  	public int getID()
	  	{
			return id;
		}

	  //mutator method
	  	public void setID(int id)
	  	{
			this.id = id;
		}

	  //overide the computer grade
		public void computeGrade()
	    {


			//compute grade
				super.computeGrade();

			//if statement
				if(average >= 90)
					super.setGrade("Pass with Distinction");



		}
  }