
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot robot = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)
		String response=JOptionPane.showInputDialog("What type of color would you want the pen to be?")
;		
		if (response.equals("red")) {
			robot.setPenColor(Color.red);
		}
		if (response.equals("blue")) {
			robot.setPenColor(Color.blue);
		}
		if (response.equals("green")) {
			robot.setPenColor(Color.green);
		}
			
		
		robot.setPenWidth(10);
		robot.penDown();
		robot.move(100);
		robot.turn(90);
		robot.move(100);
		robot.turn(90);
		robot.move(100);
		robot.turn(90);
		robot.move(100);
		robot.turn(90);
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn’t enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
