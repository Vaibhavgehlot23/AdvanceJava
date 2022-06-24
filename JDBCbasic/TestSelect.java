package JDBCbasic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Statement;

public class TestSelect {
	public static void main(String[] args) throws Exception {
		testSelect();
	}

	private static void testSelect() throws Exception {

		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "root");
		Statement stmt = conn.createStatement();

		ResultSet rs = stmt.executeQuery("Select * from emp");

		while (rs.next()) {
			System.out.print("  " + rs.getString(1));
			System.out.print("  " + rs.getString(2));
			System.out.print("  " + rs.getString(3));
			System.out.print("  " + rs.getString(4));
			System.out.println("  " + rs.getString(5));
	
			
		}
		rs.close();
		stmt.close();
		conn.close();
	}
}
