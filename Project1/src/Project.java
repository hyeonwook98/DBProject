import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Project {

	public static void main(String[] args) {
		Connection conn;
		PreparedStatement pstmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/madang?&serverTimezone=Asia/Seoul", "madang", "madang");
			System.out.println("DB ����Ϸ�");
			
		}catch(ClassNotFoundException e) {
			System.out.println("JDBC ����̹� �ε� ����");
		}catch(SQLException e) {
			System.out.println("SQL �������");
		}
	}	
}