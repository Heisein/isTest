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
	JFrame jf = new JFrame("용돈조");
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
		
		
		JLabel title = new JLabel("소비내역");
		title.setSize(100, 20);
		title.setLocation(140, 16);
		title.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		title.setForeground(Color.WHITE);
		title.setVisible(true);
		
		// 차트버튼
		ImageIcon chart = new ImageIcon("images/chart.png");
		JLabel jl_chart = new JLabel(chart);
		jl_chart.setSize(35, 35);
		jl_chart.setLocation(255, 12);
		jl_chart.setVisible(true);
		
		// 메뉴버튼
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
		
		// 입출금내역
		JLabel[] ListName = new JLabel[6];
		ListName[0] = new JLabel("GS25강남점");
		ListName[1] = new JLabel("피자스쿨강남점");
		ListName[2] = new JLabel("ATM입금");
		ListName[3] = new JLabel("GS25역삼점");
		ListName[4] = new JLabel("소담강남점");
		ListName[5] = new JLabel("김입금");
		
		// 입출금일시
		JLabel[] ListDate = new JLabel[6];
		ListDate[0] = new JLabel("2017.11.18 오후 09:34");
		ListDate[1] = new JLabel("2017.11.18 오후 01:36");
		ListDate[2] = new JLabel("2017.11.18 오전 11:21");
		ListDate[3] = new JLabel("2017.11.18 오후 09:34");
		ListDate[4] = new JLabel("2017.11.17 오후 08:52");
		ListDate[5] = new JLabel("2017.11.17 오전 09:21");
		
		// 입금액
		JLabel[] ListDeposit = new JLabel[6];
		ListDeposit[0] = new JLabel("    - 5,000");
		ListDeposit[1] = new JLabel("   - 12,000");
		ListDeposit[2] = new JLabel("");
		ListDeposit[3] = new JLabel("    - 2,200");
		ListDeposit[4] = new JLabel("    - 9,000");
		ListDeposit[5] = new JLabel("");
		
		// 출금액
		JLabel[] ListWithdraw = new JLabel[6];
		ListWithdraw[0] = new JLabel("");
		ListWithdraw[1] = new JLabel("");
		ListWithdraw[2] = new JLabel("+ 120,000");
		ListWithdraw[3] = new JLabel("");
		ListWithdraw[4] = new JLabel("");
		ListWithdraw[5] = new JLabel("  + 50,000");
		
		// 잔액
		JLabel[] ListPay = new JLabel[6];
		ListPay[0] = new JLabel("212,022원");
		ListPay[1] = new JLabel("217,022원");
		ListPay[2] = new JLabel("229,022원");
		ListPay[3] = new JLabel("109,022원");
		ListPay[4] = new JLabel("111,222원");
		ListPay[5] = new JLabel("120,222원");
		
		ImageIcon add = new ImageIcon("images/add.png");
		JLabel jl_add = new JLabel(add);
		jl_add.setSize(35, 35);
		jl_add.setLocation(280, 440);
		sub.add(jl_add);

		
		for(int i=0; i<6; i++) {
			
			// 입출금내역
			ListName[i].setSize(120, 50);
			ListName[i].setLocation(25, i*55);
			ListName[i].setFont(new Font("맑은 고딕", Font.PLAIN, 16));
			ListName[i].setVisible(true);

			// 입출금일시 ListDate
			ListDate[i].setSize(150, 85);
			ListDate[i].setLocation(25, i*56);
			ListDate[i].setFont(new Font("맑은 고딕", Font.PLAIN, 13));
			ListDate[i].setVisible(true);
			
			// 입금액 ListDeposit
			ListDeposit[i].setSize(150, 50);
			ListDeposit[i].setLocation(250, i*55);
			ListDeposit[i].setFont(new Font("맑은 고딕", Font.PLAIN, 15));
			ListDeposit[i].setForeground(Color.RED);
			ListDeposit[i].setVisible(true);
			
			// 출금액 ListWithdraw 
			ListWithdraw[i].setSize(150, 50);
			ListWithdraw[i].setLocation(250, i*55);
			ListWithdraw[i].setFont(new Font("맑은 고딕", Font.PLAIN, 15));
			ListWithdraw[i].setForeground(Color.BLUE);
			ListWithdraw[i].setVisible(true);
			
			// 잔액 ListPay  
			ListPay[i].setSize(150, 85);
			ListPay[i].setLocation(245, i*56);
			ListPay[i].setFont(new Font("맑은 고딕", Font.PLAIN, 16));
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
