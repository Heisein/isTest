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

public class CategoryBoard {
	JFrame jf = new JFrame("�뵷��");
	JPanel jp = new JPanel();
	JPanel sub = new JPanel();
	
	public CategoryBoard() {
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
		
		
		JLabel title = new JLabel("�Һ�з�");
		title.setSize(100, 20);
		title.setLocation(140, 16);
		title.setFont(new Font("���� ���", Font.PLAIN, 16));
		title.setForeground(Color.WHITE);
		title.setVisible(true);
		
		
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
		jp.add(jl_menu);

	}

	
	private void SET_Content_Area() {
		sub.setSize(360, 510);
		sub.setLocation(0, 55);
		sub.setLayout(null);
		sub.setBackground(Color.WHITE);
		

		// ī�װ���
		JLabel[] CateName = new JLabel[7];
		CateName[0] = new JLabel("��Ƽ");
		CateName[1] = new JLabel("�ܽ�");
		CateName[2] = new JLabel("��Ʈ");
		CateName[3] = new JLabel("����/����");
		CateName[4] = new JLabel("ī��/����Ŀ��");
		CateName[5] = new JLabel("����");
		CateName[6] = new JLabel("�̺з�");
		
		
		// ���� ����(%)
		JLabel[] CatePercent = new JLabel[7];
		CatePercent[0] = new JLabel("45.12%");
		CatePercent[1] = new JLabel("18.37%");
		CatePercent[2] = new JLabel("15.19%");
		CatePercent[3] = new JLabel("13.04%");
		CatePercent[4] = new JLabel("4.11%");
		CatePercent[5] = new JLabel("1.22%");
		CatePercent[6] = new JLabel("2.94%");
		
		// �ݾ�
		JLabel[] CatePay = new JLabel[7];
		CatePay[0] = new JLabel("115,200");
		CatePay[1] = new JLabel("46,900");
		CatePay[2] = new JLabel("38,780");
		CatePay[3] = new JLabel("33,300");
		CatePay[4] = new JLabel("10,500");
		CatePay[5] = new JLabel("3,120");
		CatePay[6] = new JLabel("7,500");
		
		// �󼼺���(������)
		JLabel[] more = new JLabel[7];
		
		// icon
		ImageIcon[] icon = new ImageIcon[7];
		icon[0] = new ImageIcon("images/1.png");
		icon[1] = new ImageIcon("images/2.png");
		icon[2] = new ImageIcon("images/3.png");
		icon[3] = new ImageIcon("images/4.png");
		icon[4] = new ImageIcon("images/5.png");
		icon[5] = new ImageIcon("images/6.png");
		icon[6] = new ImageIcon("images/7.png");
		

		JLabel[] label = new JLabel[7];
		for (int i = 0; i<7; i++) {
			
			//ī�װ���
			CateName[i].setSize(110, 40);
			CateName[i].setLocation(55, i*55);
			CateName[i].setFont(new Font("���� ���", Font.PLAIN, 16));
			CateName[i].setVisible(true);
			
			//�������
			CatePercent[i].setSize(110, 75);
			CatePercent[i].setLocation(55, i*55);
			CatePercent[i].setFont(new Font("���� ���", Font.PLAIN, 13));
			CatePercent[i].setVisible(true);
			
			//�ݾ�
			CatePay[i].setSize(110, 52);
			CatePay[i].setLocation(230, i*55);
			CatePay[i].setFont(new Font("���� ���", Font.PLAIN, 16));
			CatePay[i].setVisible(true);
			
			// Line
			JLabel Line =new JLabel();
			Line.setBorder(new LineBorder(Color.GRAY,5));
		    Line.setSize(262,2);
		    Line.setLocation(56, 51 + (i*55));
		    Line.setVisible(true);
		    
		    // icon
		    label[i] = new JLabel(icon[i]);
		    label[i].setSize(35, 35);
		    label[i].setLocation(11, 12+(i*54));
		    
		    
			
			//�󼼺���
			ImageIcon moreImg = new ImageIcon("images/more.png");
			more[i] = new JLabel(moreImg);
			more[i].setSize(50, 55);
			more[i].setLocation(290, i*55);
			more[i].setVisible(true);
			more[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					//new SignInCheck();
					jf.setVisible(false);
				}
			});

			sub.add(CateName[i]);
			sub.add(CatePercent[i]);
			sub.add(CatePay[i]);
			sub.add(Line);
			sub.add(label[i]);
			sub.add(more[i]);
		}
		
		jp.add(sub);
	}
}
