package view;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import javax.imageio.stream.FileImageOutputStream;
import javax.swing.*;

public class Login_2 {

	JFrame jf = new JFrame("�뵷��");
	JPanel jp = new JPanel();

	public Login_2() {
		SET_Text_Area();
		SET_IMG_Area();
		SET_Button_Area();
		SET_Label_Area();

		jf.setSize(360, 600);

		jp.setBackground(new Color(117, 102, 205));
		jp.setLayout(null);

		jf.add(jp);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void SET_Text_Area() {

		JTextArea jta[] = new JTextArea[2];
		jta[0] = new JTextArea("���̵� �Է�(�̸���)");
		jta[1] = new JTextArea("��й�ȣ �Է�");

		jta[0].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				jta[0].setText("");
			}
		});

		jta[1].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				jta[1].setText("");
			}
		});

		jta[0].setLocation(25, 320);
		jta[1].setLocation(25, 370);

		for (int i = 0; i < jta.length; i++) {
			jta[i].setSize(300, 40);
			jta[i].setBackground(Color.white);
			jta[i].setVisible(true);
			jp.add(jta[i]);
		}

	}

	public void SET_IMG_Area() {

		ImageIcon img = new ImageIcon("images/tree.png");
		JLabel jl = new JLabel(img);
		jl.setSize(200, 224);
		jl.setLocation(75, 80);
		jl.setVisible(true);
		jp.add(jl);

	}

	public void SET_Button_Area() {
		JButton jb = new JButton("�α���");
		jb.setSize(300, 40);
		jb.setLocation(25, 440);
		jb.setBackground(new Color(78, 74, 105));
		jb.setForeground(Color.WHITE);
		jb.setVisible(true);
		jb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				new Mainpage().point(jf.getLocation());
				jf.setVisible(false);
			}
		});
		jp.add(jb);
	}

	public void SET_Label_Area() {
		JLabel jl[] = new JLabel[2];
		jl[0] = new JLabel("���̵� ã��");
		jl[1] = new JLabel("��й�ȣ ã��");

		jl[0].setLocation(95, 450);
		jl[1].setLocation(180, 450);

		jl[0].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				new FindID_7().point(jf.getLocation());
				jf.setVisible(false);
			}
		});

		jl[1].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				new FindPWD_10().point(jf.getLocation());
				jf.setVisible(false);
			}
		});

		for (int i = 0; i < jl.length; i++) {
			jl[i].setSize(100, 100);
			jl[i].setForeground(Color.WHITE);
			jl[i].setVisible(true);
			jp.add(jl[i]);
		}

	}
	

	public void point(Point p) {
		if (p != null) {
			jf.setLocation(p);
		}
	}

}
