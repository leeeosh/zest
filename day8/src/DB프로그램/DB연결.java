package DB프로그램;

import java.sql.*;

import javax.swing.JOptionPane;

public class DB연결 {

	public static void main(String[] args) throws Exception {
		//1. 커넥터 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 설정 ok");
//		2.	DB연결
		String url = "jdbc:mysql://localhost:3366/shop";	//ip를 써주면 전세계 어디에서도 네트워크를 통해 연결 가능하다. 
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("2. DB연결 성공");
		
//		3.	SQL문 결정
		String id = JOptionPane.showInputDialog("아이디 입력");
		String pw = JOptionPane.showInputDialog("pw 입력");
		String name = JOptionPane.showInputDialog("name입력");
		String tel = JOptionPane.showInputDialog("tel입력");
		
		String sql = "insert into member values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);	//sql문으로 변환한 것
		ps.setString(1, id);//1은 첫번째 물음표에 넣을것이라는 뜻
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3. sql문 결정 성공");
//		4.	SQL문 실행 요청
		ps.executeUpdate();
		System.out.println("4. sql문 실행 요청 성공");
		
		
		
	}

}
