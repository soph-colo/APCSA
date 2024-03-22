   public class MyCanvas extends Canvas //don't forget extend canvas!
   {
  	   public MyCanvas()
  	   {
		   /*setBackground()
		   	 -this will set the background by calling the Color class
		   	 - list all colors*/
           setBackground(Color.blue);

           //setting the size
           	 setSize(400, 400);
       }

	   /*This method sets the color, makes the rectangular shape, sets the font, and draws a string.*/
       public void paint(Graphics g)
       {
		   //setting the colors
  		   g.setColor(Color.green);

  		   //filling rectangular shape
  		   //other methods like this include -drawLine -drawRect -drawOval -fillOval
  		   //(x,y,width,height)
           g.fillRect(75, 75, 150, 75);

          //set Font
            g.setColor(Color.orange);
            g.setFont(new Font("Bold", 5, 20));

          //draw a string
            g.drawString("Hi everyone!", 150, 200);

       }