package JDBCbasic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestInsert {
	public static void main(String[] args) throws Exception {

		testInsert();

	}

	private static void testInsert() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment", "root", "root");
		Statement stmt = conn.createStatement();

		int i = stmt.executeUpdate("insert into Marksheet values (35,112,'neha','sharma',89,90,78)");
		System.out.println(i + "RecordInserted");

	}

}
