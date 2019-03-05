import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JackInTheBox implements ActionListener{
	int num = 0;
	JButton button = new JButton("click me");
	public static void main(String[] args) {
		JackInTheBox j2 = new JackInTheBox();
		j2.showButton();
	}
	
	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		
		frame.add(button);
		button.addActionListener(this);
		frame.pack();
	}
	
	@Override
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String name = "jackInTheBox.png";
		if(e.getSource() == button) {num++;}
		if(num > 4) {showPicture(name);}
	}
	private void showPicture(String fileName) { 
	     try {
	          JLabel imageLabel = createLabelImage(fileName);
	          JFrame frame = new JFrame();
	          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

	private JLabel createLabelImage(String fileName) {
	     try {
	          URL imageURL = getClass().getResource(fileName);
	          if (imageURL == null) {
	               System.err.println("Could not find image " + fileName);
	               return new JLabel();
	          } else {
	               Icon icon = new ImageIcon(imageURL);
	               JLabel imageLabel = new JLabel(icon);
	               return imageLabel;
	          }
	     } catch (Exception e) {
	          System.err.println("Could not find image " + fileName);
	          return new JLabel();
	     }
	}

}
