package DB���α׷�;

import java.sql.*;

import javax.swing.JOptionPane;

public class DB���� {

	public static void main(String[] args) throws Exception {
		//1. Ŀ���� ����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. Ŀ���� ���� ok");
//		2.	DB����
		String url = "jdbc:mysql://localhost:3366/shop";	//ip�� ���ָ� ������ ��𿡼��� ��Ʈ��ũ�� ���� ���� �����ϴ�. 
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("2. DB���� ����");
		
//		3.	SQL�� ����
		String id = JOptionPane.showInputDialog("���̵� �Է�");
		String pw = JOptionPane.showInputDialog("pw �Է�");
		String name = JOptionPane.showInputDialog("name�Է�");
		String tel = JOptionPane.showInputDialog("tel�Է�");
		
		String sql = "insert into member values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);	//sql������ ��ȯ�� ��
		ps.setString(1, id);//1�� ù��° ����ǥ�� �������̶�� ��
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3. sql�� ���� ����");
//		4.	SQL�� ���� ��û
		ps.executeUpdate();
		System.out.println("4. sql�� ���� ��û ����");
		
		
		
	}

}
