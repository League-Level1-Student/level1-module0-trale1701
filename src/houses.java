import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class houses {
	static Robot t = new Robot();
		
	public static void main(String[] args) {
		t.miniaturize();
		t.setSpeed(100);
		t.setX(50);
		t.setY(550);
		t.setPenColor(Color.green);
		t.penDown();
		t.turn(90);
		t.setWindowColor(Color.DARK_GRAY);
		for (int i = 1; i <= 10; i++) {
			String hAnswer = JOptionPane.showInputDialog("Input the height of the buidings");
			String cAnswer = JOptionPane.showInputDialog("Input the color of the buidings");
			if(hAnswer.equals("large")) {drawFlatHouse(hAnswer,cAnswer);}
			else {drawPointyHouse(hAnswer,cAnswer);}
		}
		t.hide();
		
	}
	public static void drawPointyHouse(String height, String color){
		int numHeight = 0;
		if(height.equals("small")) {numHeight = 60;}
		else if(height.equals("medium")) {numHeight = 120;}
		t.move(10);
		t.turn(270);
		if(color.equals("red")) {t.setPenColor(Color.RED);}
		else if(color.equals("blue")) {t.setPenColor(Color.blue);}
		else if(color.equals("black")) {t.setPenColor(Color.BLACK);}
		t.move(numHeight);
		t.turn(45);
		t.move(10);
		t.turn(90);
		t.move(10);
		t.turn(45);
		t.move(numHeight);
		t.turn(270);	
		t.setPenColor(Color.green);
		t.move(10);
		}

	public static void drawFlatHouse(String height, String color){
		t.move(10);
		t.turn(270);
		if(color.equals("red")) {t.setPenColor(Color.RED);}
		else if(color.equals("blue")) {t.setPenColor(Color.blue);}
		else if(color.equals("black")) {t.setPenColor(Color.BLACK);}
		t.move(250);
		t.turn(90);
		t.move(10);
		t.turn(90);
		t.move(250);
		t.turn(270);
		t.setPenColor(Color.green);
		t.move(10);
		}
	}
