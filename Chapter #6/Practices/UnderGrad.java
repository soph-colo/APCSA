/*Sophia Colonello
  3/5/21
  this program will be the undergrad class */

  public class UnderGrad extends Student
  {
	  //constructors
	 	 public UnderGrad()
	 	 {
			  super();

	 	 }

	 	 public UnderGrad(String name, int[] testScores, String grade)
	 	 {
			  super(name, testScores, grade);
	 	 }

	  //overide
		  public void computeGrade()
		  {

			  //compute grade
			  	super.computeGrade();

			  //if statement
				if(average < 70)
					super.setGrade("Fail");

			}

  }