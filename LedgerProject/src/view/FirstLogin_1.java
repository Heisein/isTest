package view;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FirstLogin_1 {
	JFrame jf = new JFrame("�뵷��");
	JPanel jp = new JPanel();

	public FirstLogin_1() {
		
		SET_Button_Area();
		SET_IMG_Area();

		jf.setSize(360, 600);
		jp.setBackground(new Color(117, 102, 205));
		jp.setLayout(null);
		jf.add(jp);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void SET_Button_Area() {
		JButton jb[] = new JButton[2];

		jb[0] = new JButton("�α���");
		jb[1] = new JButton("ȸ������");

		jb[0].setBackground(new Color(79, 69, 138));// ���� ���� �ٸ��Ƿ� �ǵ帮�� ����
		jb[1].setBackground(new Color(78, 74, 105));

		jb[0].setLocation(25, 367);
		jb[1].setLocation(25, 426);

		jb[0].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Login_2();
				jf.setVisible(false);
			}
		});

		jb[1].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Terms_3();
				jf.setVisible(false);
			}
		});

		for (int i = 0; i < jb.length; i++) {
			jb[i].setSize(300, 40);
			jb[i].setForeground(Color.WHITE);
			jp.add(jb[i]);
		}

	}

	public void SET_IMG_Area() {
		ImageIcon img = new ImageIcon("images/mainimg.png");
		JLabel jl = new JLabel(img);
		jl.setSize(200, 224);
		jl.setLocation(75, 80);
		jp.add(jl);
	}

}
