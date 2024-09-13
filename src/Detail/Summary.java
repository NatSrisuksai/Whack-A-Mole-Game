package Detail;

import javax.swing.*;
import java.awt.*;
import  java.awt.event.*;

public class Summary extends JFrame{
	label  lab = new label();
	Summary(){
		super.setTitle("Score");
		this.add(lab);
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	 public class label extends JLabel{
		 private int[] x1 = {50,80,80};
		 private int[] y1 = {80,50,80};
		 private int[] x2 = {200,200,230};
		 private int[] y2 = {80,50,80};
		 private int[] x3 = {200,230,200};
		 private int[] y3 = {200,200,230};
		 private int[] x4 = {80,50,80};
		 private int[] y4 = {200,200,230};
		 label(){}
		 protected void paintComponent(Graphics g) {	
				g.setColor(Color.YELLOW);
			 	g.fillRect(80, 80, 120, 120);
				
				g.setColor(Color.GREEN);
				Font font1 = new Font("SansSerif",Font.BOLD,40);
				g.setFont(font1);
				g.drawString("Score", 85, 120);
				
				Font font2 = new Font("SansSerif",Font.BOLD,60);
				g.setFont(font2);
				g.setColor(Color.RED);
				if (game.score_for_sum < 10) {
					g.drawString(""+(game.score_for_sum), 125, 190);
				}else if (game.score_for_sum >= 10){
					g.drawString(""+(game.score_for_sum), 105, 190);
				}
				
				
				g.setColor(Color.PINK);
				g.fillPolygon(x1,y1,3);
				
				g.fillPolygon(x2,y2,3);
				
				g.fillPolygon(x3,y3,3);
				
				g.fillPolygon(x4,y4,3);
			}
	}
}
