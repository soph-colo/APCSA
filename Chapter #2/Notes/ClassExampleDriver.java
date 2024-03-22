/*Sophia Colonello
  10/26/20
  this program will review the concept of classes by using a driver program

  this porgram must be saed in the same folder as the ClassExample class */

  import java.util.Scanner;

  public class ClassExampleDriver
  {
	  /*scanner is actually a class, and we create an object, sc

	  	with this object we can access the methods from the
	  	  Scanner Class throughthe object: sc.nextInt();

	  	we access the Scanner class throught the Java package but
	  	  now we will create out own classes and use them



	  */
	  static Scanner sc = new Scanner(System.in);

	  public static void main(String[] args)
	  {
		  //creating objects
		  	ClassExample obj1 = new ClassExample();
		  	ClassExample obj2 = new ClassExample(5,2);

		  //set variables - using mutator methods
		  	obj1.setNumbers(55,3);

		  //if you want to print the values - using accessor emthods
		  	System.out.println(obj1.getNum1());
		  	System.out.println(obj2.getNum2());

		  //we can add and print
		  	obj1.add();
		  	obj2.print();

		  	obj1.divide();
		  	obj2.print();



	  }
  }

