package Driver;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatementt {
	public static void main(String[] args) throws Exception {
		testselect();
		// testinsert();
		// testupdate();
		// testget();
		// testdelete();
	}

	private static void testdelete() throws Exception {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/TP", "root", "root");

		PreparedStatement ps = conn.prepareStatement("DELETE FROM TP WHERE ID = ?");
		ps.setInt(1, 3);

		int i = ps.executeUpdate();
		System.out.println(i + " records deleted");
		conn.close();
		ps.close();

	}

	private static void testupdate() throws Exception {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/TP", "root", "root");

		PreparedStatement ps = conn.prepareStatement("UPDATE TP SET FNAME = ? WHERE ID = ?");
		ps.setString(1, "VAIBHAV");
		ps.setInt(2, 1);

		int i = ps.executeUpdate();
		System.out.println(i + " records inserted");
		conn.close();
		ps.close();

	}

	private static void testget() throws Exception {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/TP", "root", "root");
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM TP WHERE ID = 6");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.print(rs.getString(1));
			System.out.print(rs.getString(2));
			System.out.println(rs.getString(3));
		}
		conn.close();
		ps.close();
		rs.close();

	}

	private static void testselect() throws Exception {

		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/TP", "root", "root");
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM TP");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.print(rs.getString(1));
			System.out.print("\t" + rs.getString(2));
			System.out.println("\t" + rs.getString(3));
		}
		conn.close();
		ps.close();
		rs.close();
	}

	private static void testinsert() throws Exception {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/TP", "root", "root");

		int id = 6;
		String Fname = "k";
		String Lname = "j";
		PreparedStatement ps = conn.prepareStatement("INSERT INTO TP VALUES(?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, Fname);
		ps.setString(3, Lname);

		int i = ps.executeUpdate();
		System.out.println(i + "Done");
		conn.close();
		ps.close();

	}

}
