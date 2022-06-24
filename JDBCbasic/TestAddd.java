package JDBCbasic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestAddd{
	public static void main(String[] args) throws Exception {
		testAdd();
	}

	private static void testAdd() throws Exception {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "root");
		Statement stmt = conn.createStatement();
    
		int i = stmt.executeUpdate("INSERT INTO EMP VALUES(38,'SAGAR','PATEL',30000,null)");
		
		System.out.println(i + "Inserted");
		
   
		ResultSet rs = stmt.executeQuery("Select * from emp");

		while (rs.next()) {
			System.out.print("\t" + rs.getString(1));
			System.out.print("\t" + rs.getString(2));
			System.out.print("\t " + rs.getString(3));
			System.out.println("\t" + rs.getString(4));

		System.out.println();
	
	}
	}
}


