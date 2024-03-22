/*Mrs. Krauland
  This class models a toy bear */


 public class Bear
 {
	private final String MAKER; 		//bear's manufacturer
	private final String TYPE; 			//type of bear

	public Bear(String maker, String type)
	{
		MAKER = maker;
		TYPE = type;
	}

	public String toString()
	{
		return MAKER + " " + TYPE;
	}
 }