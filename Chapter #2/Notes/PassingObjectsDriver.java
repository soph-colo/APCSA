/*Mrs. Kerr
  11/4/2020
  This program will demonstrate the PassingObjects Class */

 public class PassingObjectsDriver
 {
	 public static void main(String[] args)
	 {
		 //creating object
		 	PassingObjects matt = new PassingObjects("Matt", 7);
		 	System.out.println("Matt's account has $"+matt.getBalance());

		 //test the charging fee
		 	matt.chargeFee(matt);
		 	System.out.println("Matt's account is $"+matt.getBalance());


		 //test the comparison method
		 	PassingObjects quang = new PassingObjects("password", 1059);
		 	PassingObjects betterFunds = null;

		 	betterFunds = PassingObjects.betterBalance(matt, quang);
		 	System.out.println("the better account "+betterFunds.getPassword());

		 /*NOTICE: with a method declared as static we can use the Class's name toa ccess it not a specific object

		 	if the main method was in the class we would not even need to do the PassingObjects._______ we could
		 	directly call the method just like we did any other method before classes

		 	when to use static methods:
		 		-almost all static methods accept arguments, perform some calculation and return a value
		 		-if a method doesn't modify the state of an object or you not using an instance variables
		 		-if it only works on the arguments sent oer
		 		-do not use if the method is redifined in the hierarchy

		 	when you pass an object to a method, can the mthod modify the object?
		 		-yes, the objects can be modified in any program

		 	remember that ifa ariable is changed it does not stay modified unless you return it and reset it */



	 }
 }