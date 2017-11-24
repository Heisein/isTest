package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import model.UserDAO;

public class CardRegist_27 {
	JFrame jf = new JFrame("�뵷��");
	JPanel jp = new JPanel();
	JPanel sub = new JPanel();

	public CardRegist_27() {
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

	public void SET_Text_And_Label_Area() {// ī�� ���

		sub.setSize(360, 450);
		sub.setLocation(0, 60);
		sub.setLayout(null);
		sub.setBackground(Color.white);

		JLabel jl_intro = new JLabel("    ������ ������Ȱ�� ���� ���� ������ ���°� �ʿ��ؿ� ");
		jl_intro.setLocation(-1, 0);
		jl_intro.setSize(360, 40);
		jl_intro.setBorder(new LineBorder(Color.GRAY));
		jl_intro.setFont(new Font("���� ���", Font.BOLD, 12));
		sub.add(jl_intro);

		JLabel jl[] = new JLabel[3];
		jl[0] = new JLabel("����");
		jl[1] = new JLabel("���¹�ȣ");
		jl[2] = new JLabel("�Է��Ͻ� �������� ���������� ���۵˴ϴ�");

		jl[0].setFont(new Font("���� ���", Font.PLAIN, 15));
		jl[1].setFont(new Font("���� ���", Font.PLAIN, 15));
		jl[2].setFont(new Font("���� ���", Font.PLAIN, 14));

		jl[0].setLocation(20, 70);
		jl[1].setLocation(20, 130);
		jl[2].setLocation(40, 390);

		jl[0].setSize(100, 50);
		jl[1].setSize(100, 50);
		jl[2].setSize(360, 50);

		for (int i = 0; i < jl.length; i++) {
			sub.add(jl[i]);
		}

		String[] banks = {"���� ����", "��������", "����", "��������","�ϳ�����","�������ݰ�","�������" };

		JComboBox bankBox = new JComboBox(banks);
		bankBox.setSelectedIndex(0);
		bankBox.setSize(200,35);
		bankBox.setLocation(110,80);
		
		JTextField tf1 = new JTextField();
		
		tf1.setSize(200,35);
		tf1.setLocation(110,140);
		tf1.setText("���¹�ȣ '-' ���� �Է�");
		
		tf1.addMouseListener((new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				tf1.setText("");
			}
		}));
			
			
		
		sub.add(tf1);
		sub.add(bankBox);
		jp.add(sub);

	}

	public void SET_IMG_Area() {
		JLabel jl = new JLabel("���");
		jl.setSize(50, 50);
		jl.setLocation(10, 8);
		jl.setFont(new Font("���� ���", Font.BOLD, 11));
		jl.setForeground(Color.WHITE);
		jl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Terms_3();
				jf.setVisible(false);
			}
		});

		jp.add(jl);
	}

	public void SET_Label_Area() {// ��Ÿ �� ����
		JLabel jl[] = new JLabel[2];

		jl[0] = new JLabel("ī�� ���");
		jl[1] = new JLabel("Ȯ��");

		jl[0].setSize(100, 20);
		jl[0].setLocation(140, 20);
		jl[0].setFont(new Font("���� ���", Font.BOLD, 16));

		jl[1].setSize(100, 20);
		jl[1].setLocation(150, 525);
		jl[1].setFont(new Font("���� ���", Font.BOLD, 14));
		for (int i = 0; i < jl.length; i++) {
			jl[i].setForeground(Color.WHITE);
			jp.add(jl[i]);
		}
	}

}