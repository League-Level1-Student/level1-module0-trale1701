//CREATE THE PANELLLLLLLLLL
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;

public class soundEffectsMachine implements ActionListener{
	JButton button1 = new JButton("button");
	JButton button2 = new JButton("button2");
	JButton button3 = new JButton("button3");
	String sound1 = "airplane-landing_sound.wav";
	String sound2 = "alien-spaceship_sound.wav";
	String sound3 = "service-bell_sound.wav";
	public static void main(String[] args) {
		soundEffectsMachine sEM = new soundEffectsMachine();
		sEM.showButton();
	}
	public void showButton() {
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		
		frame.add(button1);
		button1.addActionListener(this);
		frame.pack();
		
		frame.add(button2);
		button2.addActionListener(this);
		frame.pack();
		
		frame.add(button3);
		button3.addActionListener(this);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == button1) {playSound(sound1);}
		if(arg0.getSource() == button2) {playSound(sound2);}
		if(arg0.getSource() == button3) {playSound(sound3);}
	}
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}

}
