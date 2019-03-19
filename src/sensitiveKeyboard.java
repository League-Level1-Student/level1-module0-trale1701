import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class sensitiveKeyboard implements KeyListener {
	JFrame frame = new JFrame();
	public static void main(String[] args) {
		sensitiveKeyboard sK = new sensitiveKeyboard();
		sK.createUI();
	}
	void createUI() {
		frame.addKeyListener(this);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "OUCH!!!");
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
