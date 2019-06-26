package section3;

import javax.swing.JOptionPane;

public class WorldDomination {

	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String response = JOptionPane.showInputDialog("DO YOU KNOW HOW TO CODE PUNY MORTAL?");
		// 2. If they say "yes", tell them they will rule the world.
		if (response.equals("yes")) {
			JOptionPane.showMessageDialog(null, "THEN YOU SHALL RULE ALL PUNY HUMAN.");
		}
		// 3. Otherwise, wish them good luck washing dishes.
		else {
			JOptionPane.showMessageDialog(null, "HAVE FUN WASHING THE DISHES MORTAL");
		}
	}
}
