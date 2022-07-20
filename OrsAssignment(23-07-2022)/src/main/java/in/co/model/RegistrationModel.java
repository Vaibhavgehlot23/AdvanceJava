package in.co.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;



import com.mchange.util.impl.EmptyMEnumeration;
import com.mysql.jdbc.Driver;

import in.co.Bean.RegistrationBean;

public class RegistrationModel extends RegistrationBean {

	public Integer nextPk() throws Exception {
		int pk = 0;
		ResourceBundle rb = ResourceBundle.getBundle("in.co.rb.System");
		System.out.println(rb.getString("Driver"));

		Class.forName(rb.getString("Driver")).newInstance();
		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));
		PreparedStatement ps = conn.prepareStatement("select max(id) from registration");
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			pk = rs.getInt(1);

		}
		return pk + 1;

	}

	public void add(RegistrationBean bean) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.rb.System");
		System.out.println(rb.getString("Driver"));

		Class.forName(rb.getString("Driver")).newInstance();
		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("insert into registration values(?,?, ?, ?, ?, ?, ?, ?)");
		ps.setInt(1, nextPk());
		ps.setString(2, bean.getFirstName());
		ps.setString(3, bean.getLastName());
		ps.setString(4, bean.getLogin());
		ps.setString(5, bean.getPassword());
		ps.setString(6, bean.getGender());
		ps.setDate(7, new java.sql.Date(bean.getDob().getTime()));
		ps.setString(8, bean.getMobileNo());

		int i = ps.executeUpdate();
		conn.commit();
		System.out.println(i + ":Record Inserted");
		ps.close();
		conn.close();

	}

	public RegistrationBean Authenticate(String S, String t) throws Exception {
		ResourceBundle rb1 = ResourceBundle.getBundle("in.co.rb.System");
		System.out.println(rb1.getString("Driver"));

		Class.forName(rb1.getString("Driver")).newInstance();
		Connection conn = DriverManager.getConnection(rb1.getString("url"), rb1.getString("user"),
				rb1.getString("password"));
		PreparedStatement ps = conn.prepareStatement("Select * from registration where login = ? and pwd = ? ");

		ps.setString(1, S);
		ps.setString(2, t);

		ResultSet rs = ps.executeQuery();

		RegistrationBean rb = new RegistrationBean();

		while (rs.next()) {

			rb.setFirstName(rs.getString(2));
			rb.setLastName(rs.getString(3));
			rb.setLogin(rs.getString(4));
			rb.setPassword(rs.getString(5));
			rb.setGender(rs.getString(6));
			rb.setDob(rs.getDate(7));
			rb.setMobileNo(rs.getString(8));

		}

		return rb;

	}

	public RegistrationBean forget(String s) throws Exception {
		ResourceBundle rb1 = ResourceBundle.getBundle("in.co.rb.System");
		System.out.println(rb1.getString("Driver"));

		Class.forName(rb1.getString("Driver")).newInstance();
		Connection conn = DriverManager.getConnection(rb1.getString("url"), rb1.getString("user"),
				rb1.getString("password"));
		PreparedStatement ps = conn.prepareStatement("Select pwd from registration where login = ?  ");
		ps.setString(1, s);
		ResultSet rs = ps.executeQuery();

		RegistrationBean rb = new RegistrationBean();
		while (rs.next()) {
			rb.setPassword(rs.getString(1));

		}
		return rb;

	}
}
