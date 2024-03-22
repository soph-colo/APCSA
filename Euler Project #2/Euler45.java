/*Sophia Colonello
  3/29/21
  this program will find the next triangle number that is also pentagonal and hexagonal. */

 public class Euler45
 {
	 public static void main(String[] args)
	 {
		 //variables
		 	int tri = 286, pen = 166, hex = 144;
		 	long triangle, pentagon, hexagon, min;

  		 //while loop
  		 	while(true)
  		 	{
   				triangle = (long)tri*(tri + 1)/2;
   				pentagon = (long)pen*(pen*3-1)/2;
   				hexagon  = (long)hex*(hex*2-1);
   				min = Math.min(Math.min(triangle, pentagon), hexagon);
   				if(min == triangle && min == pentagon && min == hexagon)
   				{
   					System.out.println(min);
   					break;
				}
   				if(min == triangle)
   					tri++;
   				if(min == pentagon)
   					pen++;
   				if(min == hexagon)
   					hex++;
  			}
 	 }
 }