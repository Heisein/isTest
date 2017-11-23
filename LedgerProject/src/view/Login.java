package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import model.User;
import model.UserDAO;

public class Login {
	JFrame jf = new JFrame("�뵷��");
	JPanel jp = new JPanel();
	JTextField jta[] = new JTextField[2];
	JLabel jl[] = new JLabel[2];
	UserDAO users = new UserDAO();

	public Login() {

		SET_Text_Area();
		SET_Button_Area();
		SET_Label_Area();
		SET_IMG_Area();

		jf.setSize(360, 600);

		jp.setBackground(new Color(117, 102, 205));
		jp.setLayout(null);

		jf.add(jp);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void SET_Text_Area() {
		jta[0] = new JTextField("���̵� �Է�(�̸���)");
		jta[1] = new JPasswordField("��й�ȣ �Է�");

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

		ImageIcon img = new ImageIcon("images/mainimg.png");
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

		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				char[] pass = ((JPasswordField) jta[1]).getPassword();
				String userPwd = "";
				for(int i=0; i<pass.length;i++){
					userPwd += pass[i];
				}
				
				System.out.println(jta[0].getText() + " " + userPwd);
				
				User loginUser = users.loginMethod(jta[0].getText(), userPwd);
				if(loginUser != null){
					System.out.println("�α��� ����!" + loginUser.getUserID());
				}else{
					System.out.println("���̵� Ȥ�� ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				}
			}
		});

		jp.add(jb);
	}

	public void SET_Label_Area() {

		jl[0] = new JLabel("���̵� ã��");
		jl[1] = new JLabel("��й�ȣ ã��");

		jl[0].setLocation(95, 450);
		jl[1].setLocation(180, 450);

		jl[0].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				jl[0].setText("");
			}
		});

		jl[1].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				jl[1].setText("");
			}
		});

		for (int i = 0; i < jl.length; i++) {
			jl[i].setSize(100, 100);
			jl[i].setForeground(Color.WHITE);
			jl[i].setVisible(true);
			jp.add(jl[i]);
		}

	}

}
