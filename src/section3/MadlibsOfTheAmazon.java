package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null,"If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
String Variable1 =	JOptionPane.showInputDialog("enter an adjective");
		// Get the user to enter a type of liquid
String Variable2 = JOptionPane.showInputDialog("enter a liquid");
		// Get the user to enter a body part
String Variable3 = JOptionPane.showInputDialog("enter a body part");
		// Get the user to enter a verb
String Variable4 = JOptionPane.showInputDialog("enter a verb");
		// Get the user to enter a place
String Variable5 = JOptionPane.showInputDialog("enter a place");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		// Make a pop-up for the final story. You can use \n to go to the next line
JOptionPane.showMessageDialog(null, "Piranhas are more " + Variable1 + " during the day, so cross the river at night. Piranhas are attracted to fresh " + Variable2 + " and will most likely take a bite out of your " + Variable3 + " if you " + Variable4 + ".\n Whatever you do , if you have an open wound, try to find another way to get to the " + Variable5 +". Good Luck!" );
	}
}

