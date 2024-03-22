/*Sophia Colonello
  11/8/20
  this program will be the class that switches names */

  public class SwitchNames
  {
	  //variables
	  	private String fullName;

	  //constructor
	  	public SwitchNames()
	  	{
			fullName = "";
		}

	  //mutator methods
	  	void setName(String fullName)
	  	{
			this.fullName = fullName;
		}

	  //acessor methods
	  	public String getFirst()
	  	{
			//getting the first name
				String first = fullName.substring(0,fullName.indexOf(" ")+1);

			//return
				return first;
		}

		public String getMiddle()
		{
			//getting the middle name
				String middle = fullName.substring(fullName.indexOf(" ")+1);

			//return
				return middle;
		}

	  //method that will swap the names
	  	public void swapNames(SwitchNames nn)
	  	{
			//swapping the names
				nn.setName(nn.getMiddle()+" "+nn.getFirst());


		}



}
