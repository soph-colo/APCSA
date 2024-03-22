/*Mrs. Kerr
  11/5/2020
  This program will show student how to copy objects. */


  public class CopyingObjectsDriver
  {
	  public static void main(String[] args)
	  {
		  //variables
		  	int num1 = 5;
		  	int num2 = num1;
		  	System.out.println(num1+" "+num2);

		  	num1 = 2;
		  	System.out.println(num1+" "+num2);


		  //objects
		  	CopyingObjects object1 = new CopyingObjects();
		  	object1.setData(4,5);
		  	CopyingObjects object2 = object1;
		  	object1.showData();
		  	System.out.println();
		  	object2.showData();

		  	object1.setData(40,50);

		  	System.out.println("\n\n");
		  	object1.showData();
			System.out.println();
		  	object2.showData();

		  /*you CANNOT copy objects the same way you copy primitie data variables
		  	we created another way to reference object 1 but it is still only ONE object

		  	how do you copy objects?*/

		  	CopyingObjects obj1 = new CopyingObjects();
		  	obj1.setData(object1.getA(),object1.getB());

		  	/*if you want to create a copy o an object you need to send the attributes over for the new object */




	  }
}


