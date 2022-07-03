package Driver;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class CallAbleStatementt {
	public static void main(String[] args) throws Exception {
	testcallable();
	}

	private static void testcallable() throws Exception {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
				
		CallableStatement cs = conn.prepareCall("{CALL studentCOUNT (?)}");
		 cs.registerOutParameter(1, Types.INTEGER);
          cs.execute();
          System.out.println("STUDENT COUNT "+	cs.getInt(1));
	}

}
