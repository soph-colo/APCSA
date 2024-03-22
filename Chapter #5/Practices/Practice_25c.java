/*Sophia Colonello
  2/4/21
  this program will access a text file. the data will be manipulated and then outputed into another text file */

  import java.io.File;
  import java.io.FileWriter;
  import java.io.PrintWriter;
  import java.util.Scanner;
  import java.text.DecimalFormat;

  public class Practice_25c
  {
	  public static void main(String[] args) throws Exception
	  {
		  //file stuff and scanner
		  	File sales = new File("sales.txt");
		  	Scanner sc = new Scanner(sales);
		    FileWriter fw = new FileWriter("salesData.txt");
		  	PrintWriter pw = new PrintWriter(fw);

		  //array
		  	double[][] sd = new double[6][4];
		  //storing the info into a two dim array.
     		while(sc.hasNextLine())
     		{
         		for(int r = 0; r < sd.length; r++)
         		{
					for(int c = 0; c < sd[r].length; c++)
						sd[r][c] = sc.nextDouble();

				}
     		}

     	//calling method for division totals
     		pw.print(divisionTotals(sd));

     	//calling method for the quarter comparisons
     		pw.print(quarterCompare(sd));

     	//calling method for total of each quarter
     		pw.print(quarterTotal(sd));

     	//calling method for difference between each comapies quarter
     		pw.print(compQuartDiff(sd));

     	//calling method or the average of each quarter
     		pw.print(averageQuart(sd));

     	//calling method for highest sales
     		pw.print(highestSales(sd));

     	//formatting
     		System.out.println("Check your salesData.txt file!");
     		pw.close();

	  }
	  /*this method will accept a two dim array. this method will get the totals of each divison.
	  	@param sd is the two dim array to be manipulated*/
	  public static String divisionTotals(double[][] sd)
	  {
		  //variables
		  	double total = 0;
		  	String output = "";

		  //file and df
		  	DecimalFormat df = new DecimalFormat("$#,###.00");

		  //getting the totals
		  	output += "\n\n";
         	for(int r = 0; r < sd.length; r++)
         	{
				for(int c = 0; c < sd[r].length; c++)
					total += sd[r][c];
				output += "Division "+(r+1)+" Total Sales: "+df.format(total)+"\n";
				total = 0;
			}

		  //return
		  	return output;

	  }
	  /*this method will accept a two dim array. this method will compare each of the quarters.
	  	@param sd is the two dim array to be manipulated*/
	  public static String quarterCompare(double[][] sd)
	  {
		  //variable
		  	double diff = 0;
		  	String output = "";

		  //file and decimal format
		  	DecimalFormat df = new DecimalFormat("$#,###.00");

		  //for loops for each of the quarters
		  	output += "\n\n";
		  	for(int r = 0; r < sd.length; r++)
		  	{
				for(int c = 0; c < sd[r].length-1; c++)
				{
					diff = sd[r][c+1]-sd[r][c];
					output += "Division "+(r+1)+" Difference from Quarter "+(c+1)+" to Quarter "+(c+2)+": "+df.format(diff)+"\n";
				}
				diff = 0;
				output += "\n\n";
			}

		  //return
		  	return output;
	  }
	  /*this method will accept a two dim array. this method will get the totals of each quarter.
	  	@param sd is the two dim array to be manipulated*/
	  public static String quarterTotal(double[][] sd)
	  {
		  //variable
		  	double total = 0;
		  	String output = "";

		  //decimal format
		  	DecimalFormat df = new DecimalFormat("$#,###.00");

		  //for loops for each quarter total
		  	output += "\n\n";
		  	for(int c = 0; c < sd[0].length; c++)
		  	{
				for(int r = 0; r < sd.length; r++)
				{
					total += sd[r][c];
				}
				output += "Quarter "+(c+1)+" sales: "+df.format(total)+"\n";
				total = 0;
			}

		  //return
		  	return output;

	  }
	  /*this method will accept a two dim array. this method will compare each of the quarters.
	  	@param sd is the two dim array to be manipulated*/
	  public static String compQuartDiff(double[][] sd)
	  {

		  //variable
		  	double diff = 0, total = 0;
		  	String output = "";

		  //file and decimal format
		  	DecimalFormat df = new DecimalFormat("$#,###.00");

		  //for loops for each quarter total
		  	output += "\n\n";
		  	for(int c = 0; c < sd[0].length-1; c++)
		  	{
				for(int r = 0; r < sd.length; r++)
				{
					diff = sd[r][c+1]-sd[r][c];
					total += diff;
				}
				output += "Company Difference from Quarter "+(c+1)+" to Quarter "+(c+2)+": "+df.format(total)+"\n";
				diff = 0;
				total = 0;
			}

		  //return
		  	return output;

	  }
	  /*this method will accept a two dim array. this method will get yhe average of each quarter.
	  	@param sd is the two dim array to be manipulated*/
	  public static String averageQuart(double[][] sd)
	  {
		  //variables
		  	double average = 0, total = 0;
		  	String output = "";

		  //file and decimal format
		  	DecimalFormat df = new DecimalFormat("$#,###.00");

		  //for loop for averages
		  	output += "\n\n";
		  	for(int c = 0; c < sd[0].length; c++)
		  	{
				for(int r = 0; r < sd.length; r++)
				{
					total += sd[r][c];
				}
				average = total/sd.length;
				output += "The sales average for all divisions for Quarter "+(c+1)+": "+df.format(average)+"\n";
				total = 0;
			}

		 //return
		 	return output;

	  }
	  /*this method will accept a two dim array. this method will get the highest of each quarter.
	  	@param sd is the two dim array to be manipulated*/
	  public static String highestSales(double[][] sd)
	  {
		  //variables
		  	double highest = 0;
		  	int highestDivision = 0;
		  	String output = "";

		  //file and decimal format
		  	DecimalFormat df = new DecimalFormat("$#,###.00");

		  //for loop to get the highest sales
		  	output += "\n\n";
		  	for(int c = 0; c < sd[0].length; c++)
		  	{
				highest = 0;
				for(int r = 0; r < sd.length; r++)
				{
					if(sd[r][c] > highest)
					{
						highest = sd[r][c];
						highestDivision = r+1;
					}
				}
				output += "Division "+highestDivision+" had the highest sales for Quarter "+(c+1)+" with sales of : "+df.format(highest)+"\n";
			}

		  //return
		  	return output;
	  }
  }