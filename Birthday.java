import java.util.Random;

import javax.swing.JOptionPane;

public class Birthday {

	public static void main(String[] args) {
		
		String another;
		double tCost= 0;
		
		do {
		boolean ageOK = true;
		boolean correct = false;
			
		JOptionPane.showMessageDialog(null, "Welcome to the Toy Company to choose gifts for young children");
		String name = JOptionPane.showInputDialog("Enter the name of the child");
		String ageStr = JOptionPane.showInputDialog("How old is the child?");
		int age = Integer.parseInt(ageStr);
		
		String toyT = JOptionPane.showInputDialog("Choose a toy: a plushie, blocks, or a book");
		
				while (correct == false) {
				if (toyT.equals("plushie") || toyT.equals("blocks")|| toyT.equals("book")) 
				{
					correct = true;
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "Invalid choice\nPlease choose again");
					toyT = JOptionPane.showInputDialog("Choose a toy: a plushie, blocks, or a book");
					correct = false;
				}
				}
			

		toy toy1 = new toy(toyT, age);
		toy1.setAge(age);
		
		ageOK = toy1.ageOK();
		if (ageOK == false) 
		{
			String diff =JOptionPane.showInputDialog("Toy is not age-appropriate\nDo you want to buy a different toy? Yes or No" );
			if (diff.equals("yes") || diff.equals("Yes"))
			{
				toyT = JOptionPane.showInputDialog("Choose a toy: a plushie, blocks, or a book");
			}
		}
		
		toy1.setToy(toyT);
		toy1.setCost(toyT);
		
		JOptionPane.showMessageDialog(null, "Good Choice");
			
		String card = JOptionPane.showInputDialog("Do you want a card with the gift? Yes or No");
		toy1.addCard(card);
		
		String balloon = JOptionPane.showInputDialog("Do you want a balloon with the gift? Yes or No");
		toy1.addBalloon(balloon);
		
		JOptionPane.showMessageDialog(null, "The gift for " + name + toy1.toString());
		
		another = JOptionPane.showInputDialog("Do you want another Toy? Yes or No");	
		
		tCost += toy1.getCost();
		
		}while(another.equals("yes") || another.equals("Yes"));
		
		Random random = new Random();
		
		JOptionPane.showMessageDialog(null, "The total cost of your order is " + tCost);
		JOptionPane.showMessageDialog(null, "Your order number is " + random.nextInt(10000) 
											+ "\nProgrammer: Matt Melmed");
	}


}