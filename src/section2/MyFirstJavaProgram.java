package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		// START HERE
		Robot john = new Robot();
		john.setSpeed(10);
		john.penDown();
		john.move(100);
		john.turn(45);
		john.move(100);
		john.turn(90);
		john.move(100);
		john.turn(45);
		john.move(100);
		john.turn(90);
		john.move(140);
		john.penUp();
		john.turn(-90);
		john.move(100);
		john.turn(-90);
		john.move(75);
		john.turn(-90);
		john.move(200);
		john.turn(90);
		john.penDown();
		john.move(65);
		john.turn(180);
		john.move(140);
		john.penUp();
		john.turn(180);
		john.move(70);
		john.turn(90);
		john.move(200);

	}
}
