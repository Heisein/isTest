package view;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Set;

import javax.imageio.stream.FileImageOutputStream;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class FindID_7 {
	
	JFrame jf = new JFrame("�뵷��");
	JPanel jp = new JPanel();
	JPanel sub = new JPanel();
	JLabel jl[] = new JLabel[5];

	public FindID_7() {

		SET_Text_And_Label_Area();
		SET_IMG_Area();
		SET_Label_Area();
		
		jf.setSize(360, 600);
		jp.setBackground(new Color(117, 102, 205));
		jp.setLayout(null);
		jf.add(jp);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void SET_Text_And_Label_Area() {//ȸ�� ���� ����
		
		sub.setSize(360, 450);
		sub.setLocation(0, 60);
		sub.setLayout(null);
		sub.setBackground(Color.white);

		JLabel jl_intro = new JLabel("           ���̵� ã�� ���ؼ��� ���������� �ʿ��մϴ�.");
		jl_intro.setLocation(-1, 0);
		jl_intro.setSize(360, 40);
		jl_intro.setVisible(true);
		jl_intro.setBorder(new LineBorder(Color.GRAY));
		sub.add(jl_intro);
		
		JTextArea jta[] = new JTextArea[3];
		jta[0] = new JTextArea("�̸� �Է�");
		jta[1] = new JTextArea("�������(6�ڸ��Է�)");
		jta[2] = new JTextArea("�޴���ȭ ");
		
		
//		
		JLabel jl[] = new JLabel[3];
		jl[0] = new JLabel("�̸� �Է�");
		jl[1] = new JLabel("������� �Է�");
		jl[2] = new JLabel("��ȭ��ȣ �Է�");

		for (int i = 0; i < 3; i++) {
			jl[i].setLocation(20, 40 + (80 * i));
			jta[i].setLocation(20, 70 + (80 * i));
		}
		jta[2].setLocation(140, 230);
//üũ�ڽ� ����
		JCheckBox jcb = new JCheckBox("���� Ȯ���� ���� ����� �����մϴ�.");
		jcb.setSize(340, 30);
		jcb.setLocation(20, 300);
		jcb.setFont(new Font("���� ���", Font.BOLD, 16));
		jcb.setBackground(Color.WHITE);
		sub.add(jcb);

		for (int i = 0; i < jta.length; i++) {
			jl[i].setSize(300, 40);
			
			jl[i].setVisible(true);
			sub.add(jta[i]);
			sub.add(jl[i]);
		}

		for (int i = 0; i < 2; i++) {
			jta[i].setSize(300, 30);
			jta[i].setBackground(Color.white);
			jta[i].setVisible(true);
			jta[i].setBorder(new LineBorder(Color.black));
	
		}
		
		for (int i = 2; i < 3; i++) {
			jta[i].setSize(180, 30);
			jta[i].setBackground(Color.white);
			jta[i].setVisible(true);
			jta[i].setBorder(new LineBorder(Color.black));
	
		}
		jp.add(sub);
		
// �޺��ڽ� ����		
		JComboBox jc = new JComboBox();
		String tele[]= {"SKT","KT","LG","HELLO"};
		jc.setSize(120,30);
		jc.setVisible(true);
		jc.setLocation(20, 230);
		jc.setBackground(Color.WHITE);
		
		for(int i = 0 ; i <tele.length;i++)
		{
			jc.addItem(tele[i]);
		}
		sub.add(jc);
		
		
		//������� ���� [�̺�Ʈ��]
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
		jta[2].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				jta[2].setText("");
			}
		});
	}

	
	public void SET_IMG_Area() {
		ImageIcon img = new ImageIcon("back.png");
		JLabel jl = new JLabel(img);
		jl.setSize(50, 50);
		jl.setLocation(5, 5);
		jl.setVisible(true);
		jl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				new Login_2().point(jf.getLocation());
				jf.setVisible(false);
			}
		});

		jp.add(jl);
	}
	
	public void SET_Label_Area() {//��Ÿ �� ����
		JLabel jl[] = new JLabel[2];
		
		jl[0] = new JLabel("���̵� ã��");
		jl[1] = new JLabel("����");

		jl[0].setSize(100, 20);
		jl[0].setLocation(130, 20);
		jl[0].setFont(new Font("���� ���", Font.PLAIN, 16));

		jl[1].setSize(100, 20);
		jl[1].setLocation(150, 525);
		jl[1].setFont(new Font("���� ���", Font.PLAIN, 14));
		for (int i = 0; i < jl.length; i++) {
			jl[i].setForeground(Color.WHITE);
			jl[i].setVisible(true);
			jp.add(jl[i]);
		}
		jl[1].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				new FindIDResult().point(jf.getLocation());
				jf.setVisible(false);
			}
		});
	}
	public void point(Point p) {
	      if (p != null) {
	         jf.setLocation(p);
	   }
	 }

}
