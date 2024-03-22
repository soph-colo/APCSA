/*Sophia Colonello
  3/30/21
  this program will be the class for products in my store */

  import java.text.DecimalFormat;

  public class Product implements Items
  {
	  //instance variables
	  	private String proName = " ";
	  	private double proPrice = 0;
	  	private int proInventory = 0;

	  //constructor
	  	public Product(String proName, double proPrice, int proInventory)
	  	{
			this.proName = proName;
			this.proPrice = proPrice;
			this.proInventory = proInventory;
		}

	  //toString
	  	public String toString()
	  	{
			DecimalFormat df = new DecimalFormat("$#,###.00");
			return "\n\t\tProduct: "+proName+"\t\tPrice: "+df.format(proPrice)+"\tInventory: "+proInventory+"\n";
		}

	  //accessor and mutator methods
	  	public String getProName()
	  	{
			return proName;
		}

		public double getProPrice()
		{
			return proPrice;
		}

		public int getProInventory()
		{
			return proInventory;
		}

		public void setProName(String n)
		{
			proName = n;
		}

		public void setProPrice(double p)
		{
			proPrice = p;
		}

		public void setProInventory(int i)
		{
			proInventory += i;
		}
  }