public class Comedian implements Laughable, Booable
{
	private String name;

	public Comedian(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void boo()
	{
		System.out.println(name+" that was widly inappropriate!");
	}

	public void laugh()
	{
		System.out.println(name+" makes me giggle");
	}

	public void random()
	{
		System.out.println("well this method is random");
	}

	public void setName(String name)
	{
		this.name = name;
	}
}
class Sitcom implements Laughable
{
	private String name;

	public Sitcom(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void laugh()
	{
		System.out.println(name +" cracks me up");
	}
}

class Clown implements Laughable, Booable
{
	private String name;

	public Clown(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void laugh()
	{
		System.out.println(name+" is a funny clown!");
	}

	public void boo()
	{
		System.out.println(name+" is a scary clown!");
	}
}