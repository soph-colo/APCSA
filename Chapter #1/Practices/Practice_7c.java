/*Sophia Colonello
  9/23/20
  this program will calculate the weight of the user on different planets. */

  import javax.swing.JOptionPane;
  import java.text.DecimalFormat;

  public class Practice_7c
  {
	  public static void main(String[] args)
	  {
		  //do-while variable
		  	int rerun = 1;

		  //decimal format
		  	DecimalFormat df = new DecimalFormat("#,###.##");

		  //options for do-while
		  	Object[] planets = {"Voltar","Krypton","Fertos","Servontos"};

		  //do-while loop
		  	do
		  	{
				//getting the user's weight
				    String askWeight = JOptionPane.showInputDialog(null, "How much do you weigh?", "Weight");
					double weight = Double.parseDouble(askWeight);
					//validation
						weight = validation(weight);

				//drop down box
					String askPlanet = (String)JOptionPane.showInputDialog(null, "Which planet would you like?", "Planet", JOptionPane.PLAIN_MESSAGE, null, planets, "Voltar");

				//switch statement
					switch(askPlanet)
					{
						case "Voltar":
							weight *= .091;
							break;
						case "Krypton":
							weight *= .72;
							break;
						case "Fertos":
							weight *= .865;
							break;
						default:
							weight *= 4.612;
					}

				 //printing out the new weight
				 	JOptionPane.showMessageDialog(null, "Your new weight is "+df.format(weight)+" pounds", "New Weight", JOptionPane.INFORMATION_MESSAGE);

				 //asking if they want to rerun
				 	rerun = JOptionPane.showConfirmDialog(null,"Would you like to rerun?","Rerun",JOptionPane.YES_NO_OPTION);



			}
			while(rerun == 0);
	  }
	  /********************************************************************************************************************
	  this will recieve a double. it will make sure the double is valid. it will return a double */

	  public static double validation(double weight)
	  {
		  //while
		  	while(weight < 0)
		  	{
				String askWeight = JOptionPane.showInputDialog(null,"ERROR! Enter a valid weight", "Valid Weight");
				weight = Double.parseDouble(askWeight);
			}

		  //return
		  	return weight;


	  }
  }