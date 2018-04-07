/* Itzel Martinez
Part one of MadLib assignment. This program is to 
run GUI that prompts user for 5 different words then generates a MadLib
and then prompts user if he or she would like to play again */

import javax.swing.JOptionPane;


public class MadLib {

	public static void main(String[] args) {
		
		boolean playAgain = false;
		
		do {
		
			String place = JOptionPane.showInputDialog("Enter a PLACE:");
			String object = JOptionPane.showInputDialog( "Enter an OBJECT (plural):");
			String name = JOptionPane.showInputDialog("Enter a NAME:");
			String food = JOptionPane.showInputDialog("Enter a FOOD:");
            String animal = JOptionPane.showInputDialog("Enter an ANIMAL:");
            String name2 = JOptionPane.showInputDialog("Enter another NAME:");
            String country = JOptionPane.showInputDialog("Enter a COUNTRY:");
            String month = JOptionPane.showInputDialog("Enter a MONTH:");
            String adjective = JOptionPane.showInputDialog("Enter an ADJECTIVE:");
            String urname = JOptionPane.showInputDialog("Enter YOUR NAME:");
            

            JOptionPane.showMessageDialog(null, "I'm going to the " + place + " I lost my " + object + " so if you find them, please keep me in the loop. \nBe sure to tell " + name + " to give me a " + food + " ASAP because I'm so hungry I could \neat a " + animal + " (no exaggeration). " + name2 + " told me about your trip to " + country + " \nlast " + month + " it sounded " + adjective + " but hey to each their own don't you think, " + urname + "?"); 
			
			int choice = JOptionPane.showConfirmDialog(null, "Do you want to play again?"); // This box gives the user the option to play again
			
			if (choice == JOptionPane.YES_OPTION) {
			
				playAgain = true;
			} 
			
			else if (choice == JOptionPane.NO_OPTION || choice == JOptionPane.CANCEL_OPTION) {
			
				playAgain = false;
			}
		} while (playAgain); // if playAgain is true, game restarts

	}

}
