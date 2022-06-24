package JDBCbasic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestGet {
	public static void main(String[] args) throws Exception {

		testget();
	}

	private static void testget() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment", "root", "root");
		Statement stmt = conn.createStatement();

		ResultSet rs = stmt.executeQuery("select * from marksheet where Id=6");
		

		while (rs.next()) {

			System.out.print("\t"+rs.getString("ID"));
			System.out.print("\t"+rs.getString("RollNo"));
			System.out.print("\t"+rs.getString("FName"));
			System.out.print("\t"+rs.getString("LName"));
			System.out.print("\t"+rs.getString("Physics"));
			System.out.print("\t"+rs.getString("Chemistry"));
			System.out.println("\t"+rs.getString("Maths"));

		}
	}

}
