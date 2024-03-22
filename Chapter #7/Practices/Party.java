/*Sophia Colonello
  4/14/21
  this program will be the party class for practice 36 */

  import java.util.Arrays;

  public class Party
  {
	  //instance variable
	  	final int MAX;
	  	int numGuests;
	  	String[] names;
	  	String hostName;

	  //constructor
	  	public Party(int m, String hn)
	  	{
			MAX = m;
			hostName = hn;
			names = new String[MAX];
		}

	  //addGuests method
	  	public void addGuest(String guest)
	  	{
			//variable
				boolean found = false;

			//checking
				if(numGuests < names.length)
				{
					numGuests++;
					found = isOnList(guest);

				}

				if(!found && numGuests < names.length)
				{
					names[numGuests] = guest;
				}
				else if(found && numGuests <names.length )
				{
					System.out.println(guest+" was already on the guest list.");
					numGuests--;
				}
				else
				{
					System.out.println(guest+" cannot come to the party, there is no space left.");
					numGuests--;
				}
		}

	  //binary search
		public boolean isOnList(String guest)
		{
			//variables
				int start = 0, end = numGuests;
				int mid = 0, helper = 0;
			//while
				while(start <= end)
				{
					Arrays.sort(names);
					mid = (start+end)/2;
					helper = guest.compareTo(names[mid]);
			    	if(helper == 0)
			    		return true;
			    	if(helper > 0)
			        	start = mid+1;
			    	else
			       		end = mid-1;
				}


        		return false;
		}

	  //pritning
	  	public void printParty()
	  	{
			System.out.println("Guest list for "+hostName.toUpperCase()+"'S party:");

			for(int i = 0; i < names.length && names[i] != null; i++)
				System.out.println("\n\t"+names[i]);

		}


}