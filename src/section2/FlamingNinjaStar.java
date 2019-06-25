package section2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class FlamingNinjaStar {
	
	public static void main(String[] args) {

		int baseSize = 300;		//the size of the black part of the star
		int flameSize = 200;		//the length of the flaming arms
		
		// 1. Make a new robot, and set it's pen down.
Robot john5 = new Robot();
john5.penDown();
		// *14. Use the methods setX and setY to move the ninja star into the center of the screen
		
		// *15. Make some adjustments to see what other kinds of shapes you can make.

		// 12. Set the robot speed to 100
john5.setSpeed(100);
		// 13. Use a for loop to repeat all of the code below 25 times
for (int i = 0; i < 25; i++) {
	

			// 2. Turn the robot 1/8 of a circle
		john5.turn(45);
			// 3. Move the robot 64 pixels
john5.move(64);
john5.setPenColor(Color.ORANGE);
			// 4. Turn the robot 40 degrees to the LEFT. (Negative numbers will turn the robot counter-clockwise.)
			john5.turn(-40);
			// 5. Move the robot the distance in the variable flameSize
			john5.move(flameSize);
			// 6. Turn the robot 170 degrees
			john5.turn(170);
			// 7. Move the robot the distance in the variable flameSize (again)
			john5.move(flameSize);
			john5.setPenColor(Color.BLACK);
			// 8. Turn the robot 64 degrees to the right
			john5.turn(64);
			// 9. Move the robot the distance in the variable baseSize
			john5.move(baseSize);
}
			// 10. Check that your shape is the same as Figure 1. This is one arm of the ninja star.
			
			// 11. Color your ninja star like Figure 2.
		
	}

}


