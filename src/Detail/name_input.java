package Detail;

import javax.swing.*;
import java.awt.*;
import  java.awt.event.*;
public class name_input extends JPanel implements ActionListener,ItemListener{
	private static int y = 150;
	private static int x = 0;
	private Color color ;
	protected String message="";
	private static int lock = 0;
	public static boolean gNext = false;
	JLabel text = new JLabel();
	JTextField name_txt = new JTextField(13);
	JRadioButton black_word = new JRadioButton("Black");
	JRadioButton pink_word = new JRadioButton("Pink");
	JRadioButton green_word = new JRadioButton("Green");
	Timer timer = new Timer(50,this);
	JPanel extend1 = new JPanel();
	public name_input() {
		this.add(text);
		text.setText("Type your name :");
		text.setFont(new Font("Arial",Font.PLAIN,16));
		this.add(name_txt);
		name_txt.setFont(new Font("Arial",Font.PLAIN,35));
		extend1.add(black_word);
		extend1.add(green_word);
		extend1.add(pink_word);
		this.add(extend1);
		black_word.addItemListener(this);
		green_word.addItemListener(this);
		pink_word.addItemListener(this);
		name_txt.addActionListener(this);
	}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Font font1 = new Font("SansSerif",Font.BOLD,60);
		g.setFont(font1);
		g.setColor(color);
		g.drawString(message, x, y);
		Font font2 = new Font("SansSerif",Font.BOLD,35);
		g.setFont(font2);
		g.setColor(color.BLUE);
		g.drawString("Type your name then Start", (this.getWidth()/2)-225, 250);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == name_txt) {
			gNext = true;
			message = "Player : "+e.getActionCommand();
			repaint();
			timer.start();
			name_txt.setText("");}
		if (e.getSource() == timer) {
			if (lock < 80) {
				x = x + 10;
				lock++;
			}else if (lock>=80){
				x = 0;
				lock = 0;
			}
			repaint();
		}
	}
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == black_word && e.getStateChange() == 1) {
			black_word.setSelected(true);
			green_word.setSelected(false);
			pink_word.setSelected(false);
			color = Color.black;
			repaint();
		}else if (e.getSource() == green_word && e.getStateChange() == 1) {
			black_word.setSelected(false);
			green_word.setSelected(true);
			pink_word.setSelected(false);
			color = Color.green;
			repaint();
		}else if (e.getSource() == pink_word && e.getStateChange() == 1){
			black_word.setSelected(false);
			green_word.setSelected(false);
			pink_word.setSelected(true);
			color = Color.pink;
			repaint();
		}
	}
}
