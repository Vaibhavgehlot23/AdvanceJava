package Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class StatementQueries {
	public static void main(String[] args) throws Exception {
		 testinsert();
		//testselect();
	    //testdelete();
		//testUpdate();
        // testget();
         
	}

	private static void testget() throws Exception {
	Class.forName("com.mysql.jdbc.Driver").newInstance();
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","root");
	
	Statement stmt = conn.createStatement();
	
	ResultSet rs = stmt.executeQuery("SELECT * FROM EMP WHERE ID = 2");
	
	while(rs.next()) {
		System.out.println(rs.getString(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getString(3));
		
	}
	stmt.close();
	rs.close();
	conn.close();
		
	}

	private static void testUpdate() throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","root");
		Statement stmt = conn.createStatement();
		
		int i = stmt.executeUpdate("UPDATE EMP SET ID = 2 WHERE FNAME = 'VAIBHAV'");
		
		System.out.println(i  + "record updated");
		
		conn.close();
		stmt.close();
	
		
	}

	
	
	
	private static void testdelete() throws Exception {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new", "root", "root");

		Statement stmt = conn.createStatement();

		int i = stmt.executeUpdate("DELETE FROM EMP WHERE ID = 2");
		System.out.println(1 + "Record deleted");

		conn.close();
		stmt.close();

	}

	private static void testselect() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new", "root", "root");
		Statement stmt = conn.createStatement();

		ResultSet rs = stmt.executeQuery("SELECT * FROM EMP");

		while (rs.next()) {
			System.out.print(rs.getString(1));
			System.out.print(rs.getString(2));
			System.out.println(rs.getString(3));

		}
		rs.close();
		stmt.close();
		conn.close();
	}

	private static void testinsert() throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.Bundle.System");
		System.out.println(rb.getString("Driver"));
		
		Class.forName(rb.getString("Driver")).newInstance();
		Connection conn = DriverManager.getConnection(rb.getString("url"),rb.getString("user"),rb.getString("password"));
		Statement stmt = conn.createStatement();

		int i = stmt.executeUpdate("INSERT INTO EMP VALUES(89,'RAVI','PATIDAR',899,2)");
		System.out.println(i + "Record Inserted");

		conn.close();
		stmt.close();

	}

}
