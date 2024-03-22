public class Book
{
	private String myTitle;
	private String myAuthor;
	private boolean myCheckoutStatus;

	public Book(String title, String author)
	{
		myTitle = title;
		myAuthor = author;
		myCheckoutStatus = false;

	}
	public void changeStatus()
	{
		myCheckoutStatus = !myCheckoutStatus;

	}
	public static void main(String[] args)
	{
		Book[] booklist = new Book[2];
		for(Book b: booklist)
		{
			b.changeStatus();
		}
	}
}
