package view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class gui_28 {

	public static void main(String[] args) {
		JFrame mf = new JFrame();
		mf.setSize(340, 600);
		
		JPanel panel = new JPanel();
//		panel.setBackground(new Color(255,255,255));
		Image i1 = new ImageIcon("images/27-1.png").getImage();
		JLabel label1 = new JLabel(new ImageIcon(i1));
		Image i2 = new ImageIcon("images/27-2.png").getImage();
		JLabel label2 = new JLabel(new ImageIcon(i2));
		Image i3 = new ImageIcon("images/27-3.png").getImage();
		JLabel label3 = new JLabel(new ImageIcon(i3));
		Image i4 = new ImageIcon("images/27-4.png").getImage();
		JLabel label4 = new JLabel(new ImageIcon(i4));
		Image i5 = new ImageIcon("images/27-5.png").getImage();
		JLabel label5 = new JLabel(new ImageIcon(i5));
		Image i6 = new ImageIcon("images/27-6.png").getImage();
		JLabel label6 = new JLabel(new ImageIcon(i6));
		Image i7 = new ImageIcon("images/27-7.png").getImage();
		JLabel label7 = new JLabel(new ImageIcon(i7));
		
		
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(label4);
		panel.add(label5);
		panel.add(label6);
		panel.add(label7);
		
		
		mf.add(panel);
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
