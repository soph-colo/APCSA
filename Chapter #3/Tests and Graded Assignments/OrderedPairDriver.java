/*Sophia Colonello
  12/8/20
  This program will be the driver of your Ordered Pair Class */

import java.text.DecimalFormat;

public class OrderPairDriver
{
	public static void main(String[] args)
	{
		//Declare Decimal Formatter
			DecimalFormat df = new DecimalFormat("#,###.##");

		//Declare Objects
			OrderedPair op1 = new OrderedPair(3,-9);
			OrderedPair op2 = new OrderedPair(5,1);

			/*OrderedPair op1 = new OrderedPair(-3,4);
			OrderedPair op2 = new OrderedPair(0,0);

			OrderedPair op1 = new OrderedPair(3.5,-15);
			OrderedPair op2 = new OrderedPair(3.5,-15);*/

		//Find the midpoint of the two ordered pairs
			OrderedPair mid = op1.findMidpoint(op2);
			System.out.println("The midpoint of the two coordinates is " + mid);

		//Find out what quadrant the ordered pair is in
			String quad = op2.findQuadrant();
			System.out.println("\nThe quadrant "+ op2 + " falls in/on " + quad);

		//Find the distance between the two points
			System.out.println("\nThe distance between the two coordinates is "+ df.format(op2.findDistance(op1)));

		//Find the slope given the two points.
			System.out.println("\nThe slope of the two coordinates is " + op2.findSlope(op1));

		//Decides and displays if the two ordered pairs are equal
			if(op1.equals(op2))
				System.out.println("\nThe two ordered pairs are equal");
			else
				System.out.println("\nThe two ordered pairs are not equal");
	}

}
