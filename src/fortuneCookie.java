import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class fortuneCookie implements ActionListener{
public static void main(String[] args) {
	fortuneCookie fc = new fortuneCookie();
	fc.showButton();
}
public void showButton() {
	JFrame frame = new JFrame();
	frame.setVisible(true);
	JButton button = new JButton("click me");
	frame.add(button);
	button.addActionListener(this);
	frame.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	Random stuff = new Random();
	int num = stuff.nextInt(5);
	if(num == 0) {
		JOptionPane.showMessageDialog(null, "You will grow taller.");
	}
	else if(num == 1) {
		JOptionPane.showMessageDialog(null, "You will live on Mars somday.");
	}
	else if(num == 2) {
		JOptionPane.showMessageDialog(null, "You will be rich.");
	}
	else if(num == 3) {
		JOptionPane.showMessageDialog(null, "You will become super buff.");
	}
	else if(num == 4) {
		JOptionPane.showMessageDialog(null, "You will get a high five right now.");
	}
}
}