package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int score = 0;
		// 2. Ask the user a question
		String question = JOptionPane.showInputDialog("What is the square root of one?");
		// 3. Use an if statement to check if their answer is correct
		if (question.equals("1")) {
			score = score + 1;
		} else {
			score = score - 1;
		}
		// 4. if the user's answer was correct, add one to their score

		// 5. Create more questions by repeating steps 1, 2, and 3 below.
		String question2 = JOptionPane.showInputDialog("What is the capital of New York?");
		if (question2.equals("Albany")) {
			score = score + 1;
		} else {
			score = score - 1;
		}
		speak("how do you spell computer?");
		String question3 = JOptionPane.showInputDialog("How do you spell it?");
		if (question3.equals("Computer")) {
			score = score + 1;
		} else {
score = score - 1;
		}
		String question4 = JOptionPane.showInputDialog("What is the first program we made?");
		if (question4.equals("Logical Dot")) {
			score = score + 1;
		} else {
score = score - 1;
		}
		String question5 = JOptionPane.showInputDialog("What was my first robot's name?");
		if (question5.equals("john")) {
			score = score + 999999999;
		} else {
score = score - 999999999;
		}
		// 6. After all the questions have been asked, print the user's score
JOptionPane.showMessageDialog(null, score);
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
