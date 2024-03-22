/*Sophia Colonello
  9/26/20
  this program will find out the smallest number evenly divisable by numbers 1-20 */

  public class Euler5
  {
	  public static void main(String[] args)
	  {
		  //variables
		    int num = 1;
		  	boolean correct = false;

		  //while
		  	while(correct == false)
		  	{
				if(num%2 == 0)
				{
					if(num%3 == 0)
					{
						if(num%5 == 0)
						{
							if(num%7 == 0)
							{
								if(num%11 == 0)
								{
									if(num%13 == 0)
									{
										if(num%16 == 0)
										{
											if(num%17 == 0)
											{
												if(num%18 == 0)
												{
													if(num%19 == 0)
													{
														if(num%20 == 0)
														{
															correct = true;
															break;
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
				num++;
			}
			//output2
				System.out.println(num);

	  }
  }