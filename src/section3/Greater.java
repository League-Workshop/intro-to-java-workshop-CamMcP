

import javax.swing.JOptionPane;

public class Greater {
public static void main(String[] args) {
String response =	JOptionPane.showInputDialog("What is your name?");
System.out.println(response + "? That is a nice name. It is very unique " + response);
JOptionPane.showMessageDialog(null, response + "? What a cool name. I don't think I have heard that one in a while " + response );
}
}
