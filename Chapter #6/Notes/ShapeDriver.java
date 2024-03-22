public class ShapeDriver
{
	public static void main(String[] args)
	{
		Shape[] shapes = new Shape[4];

		shapes[0] = new Rectangle(4,5);
		shapes[1] = new Circle(5.4);
		shapes[2] = new Square(13.5);
		/*shapes[3] = new Shape("Triangle");
			NO!!! cannot create an instance of an abstract class */


		for(int i = 0; i < shapes.length; i++)
		{
			if(shapes[i] != null)
				System.out.println(shapes[i].getName()+"\t\t"+shapes[i].perimeter()+"\t\t"+shapes[i].semiPerimeter()+"\t\t"+shapes[i].area());
		}

	}
}