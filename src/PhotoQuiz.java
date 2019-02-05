/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz implements MouseListener{

	PhotoQuiz() throws MalformedURLException{
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will make sure the program exits when you
																	// close the window
		int num = 0;
		// 1. find an image on the internet, and put its URL in a String variable (from
		// your browser, right click on the image, and select â€œCopy Image Addressâ€�)
		String a = "https://cdn.pixabay.com/photo/2017/08/30/01/05/milky-way-2695569_960_720.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component c = createImage(a);
		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
		quizWindow.add(c);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String answer = JOptionPane.showInputDialog("Do you think space is cool?");
		// 7. print "CORRECT" if the user gave the right answer
		if (answer.equals("yes")) {
			System.out.println("CORRECT");
			num++;
		}
		// 8. print "INCORRECT" if the answer is wrong
		else if (answer.equals("no")) {
			System.out.println("INCORRECT");
		}
		// 9. remove the component from the quiz window (you may not see the effect of
		// this until step 12)
		quizWindow.remove(c);
		// 10. find another image and create it (might take more than one line of code)
		Component z = createImage("https://spacehold.it/1600x900/1.jpg");
		// 11. add the second image to the quiz window
		quizWindow.add(z);
		// 12. pack the quiz window
		quizWindow.pack();
		
		quizWindow.addMouseListener(this);
		// 13. ask another question
		String answer2 = JOptionPane.showInputDialog("Do you think spaceships are cool?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (answer2.equals("yes")) {
			System.out.println("CORRECT");
			num++;
		} else if (answer2.equals("no")) {
			System.out.println("INCORRECT");
		}
		System.out.println("Your score is " + num);
	}
	
	public static void main(String[] args) throws Exception {
		new PhotoQuiz();
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		JLabel imageLabel = null;
		try {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		imageLabel = new JLabel(icon);
		}catch(Exception e) {
			
		}
		return imageLabel;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("HIHIHIH");
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())

}
