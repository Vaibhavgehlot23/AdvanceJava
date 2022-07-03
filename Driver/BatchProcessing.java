package Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class BatchProcessing {
	
		public static void main(String[] args) throws Exception {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Bundles", "root", "root");
			PreparedStatement ps = conn.prepareStatement("insert into apple values(?,?,?,?,?,?,?)");
			ps.setInt(1, 14);
			ps.setString(2, "113");
			ps.setString(3, "rohan");
			ps.setString(4, "mehra");
			ps.setInt(5, 56);
			ps.setInt(6, 54);
			ps.setInt(7,46);
			ps.addBatch();
			
			ps.setInt(1, 15);
			ps.setString(2, "114");
			ps.setString(3, "sidharth");
			ps.setString(4, "malhotra");
			ps.setInt(5, 76);
			ps.setInt(6, 81);
			ps.setInt(7,82);
			ps.addBatch();
			int[] c = ps.executeBatch();
			System.out.println("Inserted Succesfully");
			
			conn.close();
		}

	}



