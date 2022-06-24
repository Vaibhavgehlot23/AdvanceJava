package JDBCbasic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestDelete {
	public static void main(String[] args) throws Exception {

		testDelete();
	}
	private static void testDelete() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment", "root", "root");
		Statement stmt = conn.createStatement();

		int i = stmt.executeUpdate("delete from Marksheet where id=12");
		System.out.println(i + " :RecordDeleted");

	}

}
