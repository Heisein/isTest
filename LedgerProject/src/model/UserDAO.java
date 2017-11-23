package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class UserDAO {
	ArrayList<User> users = new ArrayList<User>();
	FileDAO files = new FileDAO();

	public UserDAO() {
		this.loadUser();
	}

	public ArrayList<User> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}

	public String insertUser(String userId, String userPwd, String userName, String userPhone) {
		if (!checkUser(userId)) {
			users.add(new User(userId, userPwd, userName, userPhone));
			this.saveUser();
			return userId + "\nȸ�����Կ� �����߽��ϴ�.";
		} else {
			return "�̹� �����ϴ� ���̵��Դϴ�.";
		}

	}

	public boolean checkUser(String userId) {
		boolean result = false;

		for (int i = 0; i < users.size(); i++) {
			if (userId.equals(users.get(i).getUserID())) {
				result = true;
				break;
			}
		}

		return result;
	}

	public User loginMethod(String userId, String userPwd) {
		User userTemp = null;
		
		if (checkUser(userId)) {
			for (int i = 0; i < users.size(); i++) {
				if ((userId.equals(users.get(i).getUserID()) && (userPwd.equals(users.get(i).getUserPwd())))) {
					userTemp = users.get(i);
				}
			}
		}
		
		return userTemp;
	}

	public void saveUser() {
		try (BufferedWriter bOut = new BufferedWriter(new FileWriter("user.dat"))) {
			for (int i = 0; i < users.size(); i++) {
				bOut.write(users.get(i).toString() + "\n"); // user ������ ũ�⸸ŭ ���ٷ�
															// �����͸� ������
			}
			System.out.println("���� ����!!");
		} catch (FileNotFoundException e) { // FileNotFound : �ش� ������ ������
			System.out.println("user.dat �������� ���� : ���� �������");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void loadUser() {
		try (BufferedReader br = new BufferedReader(new FileReader("user.dat"))) {
			while (true) {
				String str = br.readLine();

				if (str == null) {
					System.out.println("user.txt ���� �б� �Ϸ�");
					break;
				}
				String[] sArr = str.split(",");

				User userTemp = new User(sArr[0].trim(), sArr[1].trim(), sArr[2].trim(), sArr[3].trim());

				users.add(userTemp);

			}
		} catch (FileNotFoundException e) {
			System.out.println("user.txt�� �������� ����!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
