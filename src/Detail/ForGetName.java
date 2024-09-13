package Detail;

import javax.swing.*;
import java.awt.*;
import  java.awt.event.*;

public class ForGetName extends JFrame implements ActionListener,KeyListener{
	JButton btn = new JButton("Ok");
	Drawing label1 = new Drawing();
	Timer timer = new Timer(1000,this); 
	public static int timeCount  = 0;
	public ForGetName() {
		this.setTitle("Name missing");
		timer.start();
		this.addKeyListener(this);
		this.add(label1);
		this.setSize(500,220);
		this.setLocationRelativeTo(null);
	}
	
	
	 public void keyPressed(KeyEvent e) {
		 if (e.getKeyCode() == 10) {
			 // e.getKeyCode == 10 mean pressed Enter button
			 dispose();
		 }
	 }
	 public void keyReleased(KeyEvent e) {}
	 public void keyTyped(KeyEvent e) {}
	 
	 public void actionPerformed(ActionEvent e) {
		if (e.getSource() == timer) {
			timeCount++;
			repaint();
			if (timeCount == 6) {
				timeCount  = 0;
				timer.stop();
				this.dispose();
			}
		}
		
	}
	public class Drawing extends JLabel {
		Drawing(){}
		protected void paintComponent(Graphics g) {
			g.setColor(Color.RED);
			Font font = new Font("SansSerif",Font.BOLD,30);
			g.setFont(font);
			g.drawString("Enter your name before START !", 10, 50);
			g.setColor(Color.red);
			g.fillOval(190, 70, 100, 100);
			Font font2 = new Font("SansSerif",Font.BOLD,80);
			g.setFont(font2);
			g.setColor(Color.YELLOW);
			g.drawString(""+timeCount, 215, 150);
		}
	}
}
