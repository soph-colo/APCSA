/*Sophia Colonello
  10/29/20
  this program will be the driver program */

  public class keywordThisDriver
  {
	  public static void main(String[] args)
	  {
		  keywordThis obj = new keywordThis(5,3);
		  obj.showData();

		  obj.setData(4,10); //DOESN'T CHANGE
		  obj.showData();

		  /*we would think it would print
		  	a = 4
		  	b = 10

		  	it does not because in our setData method we have
		  	a = a
		  	b = b
		  	the compiler does not know if the left a is the instance variable
		  	or the local variable

		  	we can fix this 2 ways:
		  		1. change local variable names to not mach the instance varibale
		  		   ones

		  		2. using the keyword this

		  	what happens is when the obj is called this, this. is replaced with obj
		  	so the compiler knows the a on the left is the instance variable
		  	and the a on the right is the local variable

		  	using the keyword this is useful for self documentation

		  	note:
		  			if you fail to initialize a reference variable you would get
		  			an error when running he program (NullPointerExecption)

		  			BankAccount ba;

		  			we can later set it = to new BankAccount(name,price); when you get
		  			that information

		  			we can test wheter a variable refers to an object or it is
		  			uninitalized
		  				if(b == null)
		  				{
							code;
						}
		  	*/



	  }
  }