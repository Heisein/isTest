package view;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.stream.FileImageOutputStream;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Terms_3 {
	
	JFrame jf = new JFrame("¿ëµ·Á¶");
	JPanel jp = new JPanel();
	boolean check1 = false;
	boolean check2 = false;
	JCheckBox jc[] = new JCheckBox[4];
	JLabel jl[] = new JLabel[2];
	JPanel sub[] = new JPanel[2];

	public Terms_3() {

		SET_Label_Area();
		SET_Check_Area();
		SET_IMG_Area();

		jf.setSize(360, 600);
		jp.setBackground(new Color(117, 102, 205));
		jp.setLayout(null);
		jf.add(jp);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void SET_Label_Area() {

		jl[0] = new JLabel("¾à°üµ¿ÀÇ");
		jl[1] = new JLabel("´ÙÀ½");

		jl[0].setSize(100, 20);
		jl[0].setLocation(140, 20);
		jl[0].setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 16));

		jl[1].setSize(100, 20);
		jl[1].setLocation(150, 525);
		jl[1].setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 14));
		for (int i = 0; i < jl.length; i++) {
			jl[i].setForeground(Color.WHITE);
			jl[i].setVisible(true);
			jp.add(jl[i]);
		}
		jl[1].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				new Join().point(jf.getLocation());
				jf.setVisible(false);
			}
		});
	}

	public void SET_Check_Area() {

		for (int i = 0; i < sub.length; i++) {
			sub[i] = new JPanel();
			sub[i].setVisible(true);
		}

		sub[0].setSize(360, 450);
		sub[0].setLocation(0, 60);
		sub[0].setLayout(null);
		sub[0].setBackground(Color.white);
		sub[0].setBorder(new LineBorder(Color.BLACK, 1));
		sub[1].setSize(360, 250);
		sub[1].setLocation(0, -50);
		sub[1].setLayout(null);
		sub[1].setBackground(Color.white);
		sub[1].setBorder(new LineBorder(Color.BLACK, 1));

		for (int i = 0; i < jc.length; i++) {
			jc[i] = new JCheckBox();
		}

		jc[0].setSize(250, 50);
		jc[0].setLocation(10, 0);
		jc[0].setText("¿ëµ·Á¶ ÀÌ¿ë¾à°ü ÀüÃ¼ µ¿ÀÇ");
		jc[0].setBorder(new LineBorder(Color.BLACK, 2));
		jc[0].setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		jc[0].setBackground(Color.WHITE);

		jc[0].addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				for (int i = 1; i < jc.length; i++) {
					if (jc[i].isSelected() == true) {
						jc[i].setSelected(false);
					} else {
						jc[i].setSelected(true);
					}
				}
			}
		});

		jc[1].setLocation(10, 100);
		jc[1].setSize(250, 45);
		jc[1].setText("ÀÌ¿ë¾à°ü µ¿ÀÇ(ÇÊ¼ö)");
		jc[1].setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		jc[1].addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if (jc[1].isSelected()) {
					check1 = true;
				} else {
					check1 = false;
				}
			}
		});
		jc[2].setLocation(10, 150);
		jc[2].setSize(250, 45);
		jc[2].setText("°³ÀÎÁ¤º¸ Ã³¸®¹æÄ§ µ¿ÀÇ(ÇÊ¼ö)");
		jc[2].setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		jc[2].addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if (jc[2].isSelected()) {
					check1 = true;
				} else {
					check1 = false;
				}
			}
		});

		jc[3].setLocation(10, 200);
		jc[3].setSize(250, 45);
		jc[3].setText("Á¦3ÀÚ Á¤º¸Á¦°ø µ¿ÀÇ(¼±ÅÃ)");
		jc[3].setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));

		for (int i = 1; i < jc.length; i++) {
			jc[i].setBackground(Color.WHITE);
			jc[i].setVisible(true);
			sub[1].add(jc[i]);
		}
		sub[0].add(jc[0]);
		sub[0].add(sub[1]);

		jp.add(sub[0]);

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
				new FirstLogin_1();
				jf.setVisible(false);
			}
		});
		
		jp.add(jl);
	}
	public void point(Point p) {
	      if (p != null) {
	         jf.setLocation(p);
	   }
	 }

}
