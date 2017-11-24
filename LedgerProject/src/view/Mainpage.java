package view;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import javax.imageio.stream.FileImageOutputStream;
import javax.swing.*;

public class Mainpage {

	JFrame jf = new JFrame("�뵷��");
	JPanel jp = new JPanel();

	public Mainpage() {
		SET_IMG_Area();
		SET_Pannels_Area();
		SET_Label_Area();
		
		jf.setSize(360, 600);

		jp.setBackground(new Color(117, 102, 205));
		jp.setLayout(null);

		jf.add(jp);
		jf.setVisible(true);
		jp.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	

	public void SET_IMG_Area() {

		ImageIcon img = new ImageIcon("mainimg.png");
		JLabel jl = new JLabel(img);
		jl.setSize(200, 204);
		jl.setLocation(75, 80);
		jl.setVisible(true);
		jp.add(jl);

	}
	
	public void SET_Pannels_Area() {
		JPanel sub[]=new JPanel[3];
		
		for(int i = 0 ; i < sub.length;i++)
		{
			sub[i]=new JPanel();
			jp.add(sub[i]);
			sub[i].setBackground(Color.WHITE);
			sub[i].setVisible(true);
			sub[i].setLayout(null);
		}
		
		sub[0].setSize(320,92);
		sub[0].setLocation(15,304);
		sub[1].setSize(320,50);
		sub[1].setLocation(15,402);
		sub[2].setSize(320,92);
		sub[2].setLocation(15,458);
		
		JLabel jl[] = new JLabel[8];
		for(int i = 0 ; i < 5;i++)
		{
			jl[i]=new JLabel();
			jl[i].setSize(320,20);
			jl[i].setFont(new Font("���� ���", Font.PLAIN, 14));
			jl[i].setBackground(Color.WHITE);
			jl[i].setVisible(true);
		}
		
		ImageIcon img = new ImageIcon("plus.png");
		for(int i = 5 ; i < 8;i++)
		{
			jl[i]=new JLabel(img);
			jl[i].setSize(20,20);
			jl[i].setVisible(true);
			
		}
		
		jl[0].setText("����");
		jl[0].setLocation(10, 30);
		jl[1].setText("�뵷���� �Һ������ ���͵帱�Կ�");
		jl[1].setLocation(10, 50);
		jl[2].setText("�Һ�з�");
		jl[2].setLocation(10, 20);
		jl[3].setText("ī������");
		jl[3].setLocation(10, 30);
		jl[4].setText("ī�带 ����� ī�������� Ȯ���ϼ���");
		jl[4].setLocation(10, 50);
		
		jl[5].setLocation(290, 40);
		jl[6].setLocation(290, 20);
		jl[7].setLocation(290, 40);

		sub[0].add(jl[0]);
		sub[0].add(jl[1]);
		sub[0].add(jl[5]);
		sub[1].add(jl[2]);
		sub[1].add(jl[6]);
		sub[2].add(jl[3]);
		sub[2].add(jl[4]);
		sub[2].add(jl[7]);
	}
	
	public void SET_Label_Area() {
		JLabel jl[] = new JLabel[2];
		ImageIcon img = new ImageIcon("menu.png");
		jl[0] = new JLabel("11�� �Һ��");
		jl[1] = new JLabel(img);

		jl[0].setLocation(20, -20);
		jl[1].setLocation(270, -20);

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
