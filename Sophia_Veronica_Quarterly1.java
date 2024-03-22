/*Sophia Colonello and Veronica Pimenova
  10/23/20
  this program will create a schedule based on the user's input. the program will ask the user the start time of school, then, if
  they want an Activity Period, how long this period is, and how many periods are in the day. the program will output a
  neat schedule for the user to see. there will be a text file that will hold all the generated schedules. */

  import java.util.Scanner;
  import java.io.IOException;
  import java.io.FileWriter;
  import java.io.PrintWriter;

  public class Sophia_Veronica_Quarterly1
  {
	  public static void main(String[] args) throws IOException
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //filewriter and printwriter
		    FileWriter fw = new FileWriter("Schedule.txt", true);
		  	PrintWriter pw = new PrintWriter(fw);


		  //variable for do-while
		  	String rerun = "no";

		  //do-while
		  	do
		  	{

				//variables
				  int BETWEENBELLS = 4, startHour, startMinute = 0, periodLength, activityPeriodLength = 0, periods, endHour = 0, endMinute = 0;
				  String startTime, activityPeriod;
				  boolean leaveToEat = true;

				//introduction print
				  System.out.printf("%nLet me fix you a schedule...%n%n");

				//getting the user's start time
				  System.out.printf("%n\tStart Time: ");
				  startTime = sc.nextLine();
				  startTime = validateFormat(startTime);
				  startTime = validateTime(startTime);
				  startHour = Integer.parseInt(startTime.substring(0,startTime.indexOf(":")));
			      startMinute = Integer.parseInt(startTime.substring(startTime.indexOf(":")+1));

	            //asking for the lengths of the periods
			      System.out.printf("%n%n\tHow long do you want the periods to be in minutes: ");
	              periodLength = sc.nextInt();
	              periodLength = validatePer(periodLength);


				//asking if they want an activity period
				  sc.nextLine();
				  System.out.printf("%n%n\tWould you like to include an Activity Period after 3rd Period: ");
				  activityPeriod = sc.nextLine();
				  activityPeriod = yesNo(activityPeriod);


			    //if statement to either get a length for activity period or move on
				  if(activityPeriod.equalsIgnoreCase("yes"))
				  {
						System.out.printf("%n%n\t\tHow long would you like your Activity Period to be in minutes: ");
						activityPeriodLength = sc.nextInt();
				   }

				//asking how many periods they want in a day
				  System.out.printf("%n%n\tHow many periods do you want in the school day: ");
				  periods = sc.nextInt();
				  periods = validatePer(periods);


				//for loop for printing schedule
				  System.out.printf("%n%n");
				  for(int i = 0; i < periods; i++)
				  {

					  //variables for for loop
						endHour = startHour;
					 	endMinute = startMinute+periodLength;

					 //if statements to make sure that the hours minutes are properly formatted
					   if(endMinute > 60)
					   {
						   endHour++;
						   endMinute -= 60;
					   }
					   else if(endMinute == 60)
					   {
						   endHour++;
						   endMinute = 0;
					   }

					   if(endHour >12)
						 endHour -= 12;

					   if(startMinute <= 9)
					   {
						  System.out.printf("\t\tPeriod %d: %d:0%d - %d:%d%n",(i+1),startHour,startMinute,endHour,endMinute);
						  pw.printf("\t\tPeriod %d: %d:0%d - %d:%d%n",(i+1),startHour,startMinute,endHour,endMinute);
					   }
					   else if(endMinute <= 9)
					   {
						  System.out.printf("\t\tPeriod %d: %d:%d - %d:0%d%n",(i+1),startHour,startMinute,endHour,endMinute);
						  pw.printf("\t\tPeriod %d: %d:%d - %d:0%d%n",(i+1),startHour,startMinute,endHour,endMinute);
					   }
					   else if(startMinute <= 9 || endMinute <= 9)
					   {
					      System.out.printf("\t\tPeriod %d: %d:0%d - %d:0%d%n",(i+1),startHour,startMinute,endHour,endMinute);
					      pw.printf("\t\tPeriod %d: %d:0%d - %d:0%d%n",(i+1),startHour,startMinute,endHour,endMinute);
					   }
					   else
					   {
						  System.out.printf("\t\tPeriod %d: %d:%d - %d:%d%n",(i+1),startHour,startMinute,endHour,endMinute);
						  pw.printf("\t\tPeriod %d: %d:%d - %d:%d%n",(i+1),startHour,startMinute,endHour,endMinute);
					   }

					//next calc
					   startMinute = endMinute+BETWEENBELLS;
					   startHour = endHour;

					//if statement for proper output
					  if(startMinute > 60)
					  {
						  startHour++;
						  startMinute -= 60;
					  }
					  else if(startMinute == 60)
					  {
						  endHour++;
						  endMinute = 0;
					  }

					//if statement for activity period
					  if(i == 2 && activityPeriod.equalsIgnoreCase("yes"))
					  {
						 endHour = startHour;
						 endMinute = startMinute+activityPeriodLength;

						 //proper times
						   if(endMinute > 60)
				           {
							  endHour++;
							  endMinute -= 60;
						   }
						   else if(endMinute == 60)
						   {
							  endHour++;
							  endMinute = 0;
					 	   }

						//proper format
					 	  if(startMinute <= 9)
					   	  {
							  System.out.printf("\t\tA Period: %d:0%d - %d:%d%n",startHour,startMinute,endHour,endMinute);
						  	  pw.printf("\t\tA Period: %d:0%d - %d:%d%n",startHour,startMinute,endHour,endMinute);
					      }
					      else if(endMinute <= 9)
					      {
						      System.out.printf("\t\tA Period: %d:%d - %d:0%d%n",startHour,startMinute,endHour,endMinute);
						      pw.printf("\t\tA Perio:: %d:%d - %d:0%d%n",startHour,startMinute,endHour,endMinute);
					      }
					      else if(startMinute <= 9 || endMinute <= 9)
					      {
					         System.out.printf("\t\tA Period: %d:0%d - %d:0%d%n",startHour,startMinute,endHour,endMinute);
					         pw.printf("\t\tA Period: %d:0%d - %d:0%d%n",startHour,startMinute,endHour,endMinute);
					      }
					      else
					      {
						     System.out.printf("\t\tA Period: %d:%d - %d:%d%n",startHour,startMinute,endHour,endMinute);
						     pw.printf("\t\tA Period: %d:%d - %d:%d%n",startHour,startMinute,endHour,endMinute);
					      }
					 }

					 //next calc
					   startMinute = endMinute+BETWEENBELLS;
					   startHour = endHour;

					 //more proper times (am/pm)
					   if(startHour > 12)
					   {
						   startHour -= 12;
						   if(startHour > 5)
						   	leaveToEat = false;

					   }
            	  }

			//saying if the user can use this schedule or not
		      if((startHour > 5 || endHour > 5) && leaveToEat == false)
			  {
				 System.out.printf("%n%n\t\tYou cannot use this schedule, the students need to go home to eat dinnner.");
			  }

			//asking if they want to rerun
			  pw.printf("%n");
			  sc.nextLine();
			  System.out.printf("%n%n\tWould you like to get another schedule: ");
			  rerun = sc.nextLine();
			  rerun = yesNo(rerun);

			}
			while(rerun.equalsIgnoreCase("yes"));

		//exit message
		  System.out.printf("%n\t\tThank you for using the schedule maker! Your schedules have been printed.%n");

		//closing printwriter
		  pw.close();

	  }
	  /**************************************
	  this method will keep rerunning until the user enters a properly formatted time
	  @param accepts a string startTime
	  @return the properly formatted string */
	  public static String validateFormat(String startTime)
	  {
		  //scanner
		  	Scanner sc = new Scanner(System.in);

		  //while loop to get the info
		  	while(!startTime.substring(1,2).equals(":") && !startTime.substring(2,3).equals(":"))
		  	{
				System.out.printf("%n\t\tERROR! Please enter a proper 0:00 formatted time: ");
				startTime = sc.nextLine();
			}

		  //return
		  	return startTime;

	  }
	  /**************************************
      This method will keep rerunning until the start time has been validated.
      @param accepts an string startTime
      @return returns startTime (validated)*/
      public static String validateTime(String startTime)
      {
		  //scanner
          	Scanner sc = new Scanner(System.in);

		  //breaking things up
 		    int startHour = Integer.parseInt(startTime.substring(0,startTime.indexOf(":")));
			int startMinute = Integer.parseInt(startTime.substring(startTime.indexOf(":")+1));

          //validate with while loop
          	if((startHour  < 0 || startHour > 12) || (startMinute < 0 || startMinute > 59))
            {
				System.out.printf("%n\t\tERROR! Please enter a proper morning start time: ");
             	startTime = sc.nextLine();
             	startHour = Integer.parseInt(startTime.substring(0,startTime.indexOf(":")));
			    startMinute = Integer.parseInt(startTime.substring(startTime.indexOf(":")+1));
       		}

         //return
           return startTime;
       }
        /************************************
        This method will accept an int num, re enter it until it is greater than 0 and return it.
        @param accepts int num (period length OR num periods)
        @return returns int num (validates period length OR num periods)*/
        public static int validatePer(int num)
        {
			//scanner
              Scanner sc = new Scanner(System.in);



            //validate with while loop
              while(num<0 || num > 90)
              {
				  System.out.printf("%n\t\tERROR! Please enter a period length: ");
                  num=sc.nextInt();
              }

            //return
              return num;
        }
        /************************************
        this method will accept a string. it will make sure the user enters a yes or a no. it will return a string
        @param accpets string yesNo
        @return string yesNO */
        public static String yesNo(String str)
        {
			//scanner
			  Scanner sc = new Scanner(System.in);

			//while loop to validate
			  while(!(str.equalsIgnoreCase("yes") || str.equalsIgnoreCase("no")))
			  {
					System.out.printf("%n%n%n\t\tERROR! Please enter \"yes\" or \"no\": ");
					str = sc.nextLine();
			  }

			 //return
			   return str;
		}
  }