package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileDAO {
	public void saveUser() {
		UserDAO userDao = new UserDAO();

		ArrayList<User> user = userDao.getUsers();

		try (BufferedWriter bOut = new BufferedWriter(new FileWriter("user.dat"))) {
			for (int i = 0; i < user.size(); i++) {
				bOut.write(user.get(i).toString() + "\n"); // user ������ ũ�⸸ŭ ���ٷ�
															// �����͸� ������
			}
			System.out.println("���� ����!!");
		} catch (FileNotFoundException e) { // FileNotFound : �ش� ������ ������
			System.out.println("user.dat �������� ���� : ���� �������");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<User> loadUser() {
		try (BufferedReader br = new BufferedReader(new FileReader("user.dat"))) {
			while (true) {
				String str = br.readLine();
				ArrayList<User> u = new ArrayList<User>();

				if (str == null) {
					System.out.println("user.txt ���� �б� �Ϸ�");
					break;
				}
				String[] sArr = str.split(",");

				User userTemp = new User(sArr[0], sArr[1], sArr[2], sArr[3]);

				u.add(userTemp);

				return u;
			}
		} catch (FileNotFoundException e) {
			System.out.println("user.txt�� �������� ����!");
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}
}
