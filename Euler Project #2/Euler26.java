/*Sophia Colonello
 1/18/21
 this program will find the value of d < 1000 for which 1/d contains the longest recurring cycle in its decimal fraction part. */

public class Euler26
{
	public static void main(String[] args)
	{
		//variables
			int value, max = 0, counter, max2 = 0, z;

 	   //for loop  to find the value for d
  		for(int i = 7; i < 1000; i++)
  		{
    		counter = 0;
    		value = 10%i;
    		z = 1000;

    		while(value != 1 && z > 0)
    		{
      			value = value*10;
      			value = value%i;
      			counter++;
      			z--;
    		}
    		if(counter > max && z > 1)
    		{
      			max = counter;
     			max2 = i;
    		}
		}

	  //print
 		System.out.println(max2);
}
}