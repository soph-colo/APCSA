/*Sophia Colonello
  4/2/21
  this program will find the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9 */

  public class Euler24
  {
	  public static void main(String[] args)
	  {
		  //variables
		  	String ans = "";
		  	int[] array = new int[10];
  			for(int i = 0; i < array.length; i++)
   				array[i] = i;

   		  //perm
  		    for(int i = 0; i < 999999; i++)
  		    {
   				if(!perm(array))
    				break;
  			}

  		  //output
  		  	for(int i = 0; i < array.length; i++)
            	ans += array[i];
  			System.out.println(ans);

		}
		public static boolean perm(int[] a)
		{
			//variables
              int i, j, temp, n = a.length;

			//check
			  for(i = n - 2; ; i--)
			  {
				  if(i < 0)
				  	 return false;
                        if (a[i] < a[i + 1])
							break;
              }

            //switch
              for(j = 1; i + j < n - j; j++)
              {
				  temp = a[i + j];
				  a[i + j] = a[n - j];
				  a[n - j] = temp;
              }
              for(j = i + 1; a[j] <= a[i]; j++);
			  temp = a[i];
              a[i] = a[j];
              a[j] = temp;


            //return
              return true;



        }





 }