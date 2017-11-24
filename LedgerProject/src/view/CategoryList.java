package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class CategoryList {
	JFrame jf = new JFrame("�뵷��");
	JPanel jp = new JPanel();
	JPanel sub = new JPanel();
	
	public CategoryList() {
		SET_Title_Area();	
		SET_Content_Area();
		
		jf.setSize(360, 600);
		jp.setLayout(null);
		jf.add(jp);
		jp.setBackground(new Color(117, 102, 205));
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void SET_Title_Area() {
		ImageIcon back = new ImageIcon("images/back.png");
		JLabel jl_back = new JLabel(back);
		jl_back.setSize(50, 50);
		jl_back.setLocation(5, 3);
		jl_back.setVisible(true);
		jl_back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//new CategoryList();
				jf.setVisible(false);
			}
		});
		
		
		JLabel title = new JLabel("�Һ񳻿�");
		title.setSize(100, 20);
		title.setLocation(140, 16);
		title.setFont(new Font("���� ���", Font.PLAIN, 16));
		title.setForeground(Color.WHITE);
		title.setVisible(true);
		
		// ��Ʈ��ư
		ImageIcon chart = new ImageIcon("images/chart.png");
		JLabel jl_chart = new JLabel(chart);
		jl_chart.setSize(35, 35);
		jl_chart.setLocation(255, 12);
		jl_chart.setVisible(true);
		
		// �޴���ư
		ImageIcon menu = new ImageIcon("images/menu.png");
		JLabel jl_menu = new JLabel(menu);
		jl_menu.setSize(50, 50);
		jl_menu.setLocation(290, 5);
		jl_menu.setVisible(true);
		jl_menu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//new CategoryList();
				jf.setVisible(false);
			}
		});
		
		jp.add(jl_back);
		jp.add(title);
		jp.add(jl_chart);
		jp.add(jl_menu);
		
	}
	
	private void SET_Content_Area() {
		sub.setSize(360, 600);
		sub.setLocation(0, 55);
		sub.setLayout(null);
		sub.setBackground(Color.WHITE);
		
		// ����ݳ���
		JLabel[] ListName = new JLabel[6];
		ListName[0] = new JLabel("GS25������");
		ListName[1] = new JLabel("���ڽ��𰭳���");
		ListName[2] = new JLabel("ATM�Ա�");
		ListName[3] = new JLabel("GS25������");
		ListName[4] = new JLabel("�Ҵ㰭����");
		ListName[5] = new JLabel("���Ա�");
		
		// ������Ͻ�
		JLabel[] ListDate = new JLabel[6];
		ListDate[0] = new JLabel("2017.11.18 ���� 09:34");
		ListDate[1] = new JLabel("2017.11.18 ���� 01:36");
		ListDate[2] = new JLabel("2017.11.18 ���� 11:21");
		ListDate[3] = new JLabel("2017.11.18 ���� 09:34");
		ListDate[4] = new JLabel("2017.11.17 ���� 08:52");
		ListDate[5] = new JLabel("2017.11.17 ���� 09:21");
		
		// �Աݾ�
		JLabel[] ListDeposit = new JLabel[6];
		ListDeposit[0] = new JLabel("    - 5,000");
		ListDeposit[1] = new JLabel("   - 12,000");
		ListDeposit[2] = new JLabel("");
		ListDeposit[3] = new JLabel("    - 2,200");
		ListDeposit[4] = new JLabel("    - 9,000");
		ListDeposit[5] = new JLabel("");
		
		// ��ݾ�
		JLabel[] ListWithdraw = new JLabel[6];
		ListWithdraw[0] = new JLabel("");
		ListWithdraw[1] = new JLabel("");
		ListWithdraw[2] = new JLabel("+ 120,000");
		ListWithdraw[3] = new JLabel("");
		ListWithdraw[4] = new JLabel("");
		ListWithdraw[5] = new JLabel("  + 50,000");
		
		// �ܾ�
		JLabel[] ListPay = new JLabel[6];
		ListPay[0] = new JLabel("212,022��");
		ListPay[1] = new JLabel("217,022��");
		ListPay[2] = new JLabel("229,022��");
		ListPay[3] = new JLabel("109,022��");
		ListPay[4] = new JLabel("111,222��");
		ListPay[5] = new JLabel("120,222��");
		
		ImageIcon add = new ImageIcon("images/add.png");
		JLabel jl_add = new JLabel(add);
		jl_add.setSize(35, 35);
		jl_add.setLocation(280, 440);
		sub.add(jl_add);

		
		for(int i=0; i<6; i++) {
			
			// ����ݳ���
			ListName[i].setSize(120, 50);
			ListName[i].setLocation(25, i*55);
			ListName[i].setFont(new Font("���� ���", Font.PLAIN, 16));
			ListName[i].setVisible(true);

			// ������Ͻ� ListDate
			ListDate[i].setSize(150, 85);
			ListDate[i].setLocation(25, i*56);
			ListDate[i].setFont(new Font("���� ���", Font.PLAIN, 13));
			ListDate[i].setVisible(true);
			
			// �Աݾ� ListDeposit
			ListDeposit[i].setSize(150, 50);
			ListDeposit[i].setLocation(250, i*55);
			ListDeposit[i].setFont(new Font("���� ���", Font.PLAIN, 15));
			ListDeposit[i].setForeground(Color.RED);
			ListDeposit[i].setVisible(true);
			
			// ��ݾ� ListWithdraw 
			ListWithdraw[i].setSize(150, 50);
			ListWithdraw[i].setLocation(250, i*55);
			ListWithdraw[i].setFont(new Font("���� ���", Font.PLAIN, 15));
			ListWithdraw[i].setForeground(Color.BLUE);
			ListWithdraw[i].setVisible(true);
			
			// �ܾ� ListPay  
			ListPay[i].setSize(150, 85);
			ListPay[i].setLocation(245, i*56);
			ListPay[i].setFont(new Font("���� ���", Font.PLAIN, 16));
			ListPay[i].setVisible(true);
			
			
			// Line
			JLabel Line =new JLabel();
			Line.setBorder(new LineBorder(Color.GRAY, 5));
		    Line.setSize(293,2);
		    Line.setLocation(25, 58 + (i*57));
		    Line.setVisible(true);
			
			sub.add(ListName[i]);
			sub.add(ListDate[i]);
			sub.add(ListDeposit[i]);
			sub.add(ListWithdraw[i]);
			sub.add(ListPay[i]);
			sub.add(Line);
		}
		
		jp.add(sub);
	}
	
}
