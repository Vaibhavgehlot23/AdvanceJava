package in.co.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import in.co.Bean.MarksheetBean;
import in.co.Bean.StudentBean;

public class StudentModel {

	public Integer nextPk() throws Exception {
		int pk = 0;
		ResourceBundle rb = ResourceBundle.getBundle("in.co.rb.System");
		System.out.println(rb.getString("Driver"));

		Class.forName(rb.getString("Driver")).newInstance();
		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("select max(id) from StudentManagement");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {

			pk = rs.getInt(1);

		}
		return pk + 1;

	}

	public void add(StudentBean bean) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.rb.System");
		System.out.println(rb.getString("Driver"));

		Class.forName(rb.getString("Driver")).newInstance();
		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("Insert into StudentManagement values(?,?,?,?,?)");
		ps.setInt(1, nextPk());
		ps.setString(2, bean.getRollNo());

		ps.setString(3, bean.getFirstName());
		ps.setString(4, bean.getLastName());
		ps.setString(5, bean.getSession());

		int i = ps.executeUpdate();
		conn.commit();
		System.out.println("Inserted : " + i);
		ps.close();
		conn.close();

	}

	public void update(StudentBean bean) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.rb.System");
		System.out.println(rb.getString("Driver"));
		Class.forName(rb.getString("Driver")).newInstance();

		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));
		conn.setAutoCommit(false);
		PreparedStatement ps = conn
				.prepareStatement("update StudentManagement set  FirstName=?, LastName=?,Session=? where rollno=?");

		ps.setString(1, bean.getFirstName());
		ps.setString(2, bean.getLastName());
		ps.setString(3, bean.getSession());
		ps.setString(4, bean.getRollNo());

		int i = ps.executeUpdate();
		conn.commit();
		System.out.println(i + ":Record Updated");
		ps.close();
		conn.close();

	}

	public void delete(StudentBean bean) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.rb.System");
		System.out.println(rb.getString("Driver"));
		Class.forName(rb.getString("Driver")).newInstance();
		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));

		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("delete from StudentManagement where rollno=?");
		ps.setString(1, bean.getRollNo());

		int i = ps.executeUpdate();
		conn.commit();
		System.out.println(i + ":Record Deleted");
		ps.close();
		conn.close();
	}

	public List<StudentBean> get(StudentBean bean) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.rb.System");
		Class.forName(rb.getString("Driver")).newInstance();
		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));

		PreparedStatement ps = conn.prepareStatement("select * from Studentmanagement where rollno = ?");
		ps.setString(1, bean.getRollNo());
		ResultSet rs = ps.executeQuery();
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		while (rs.next()) {

			StudentBean bean1 = new StudentBean();

			bean1.setId(rs.getInt(1));
			bean1.setRollNo(rs.getString(2));
			bean1.setFirstName(rs.getString(3));

			bean1.setLastName(rs.getString(4));
			bean1.setSession(rs.getString(5));

			list.add(bean1);
		}
		return list;

	}

	public List<StudentBean> search() throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.rb.System");
		Class.forName(rb.getString("Driver")).newInstance();
		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));

		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("select * from StudentManagement  ");
		ResultSet rs = ps.executeQuery();
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		while (rs.next()) {

			StudentBean bean1 = new StudentBean();

			bean1.setId(rs.getInt(1));
			bean1.setRollNo(rs.getString(2));
			bean1.setFirstName(rs.getString(3));

			bean1.setLastName(rs.getString(4));
			bean1.setSession(rs.getString(5));

			list.add(bean1);
		}
		return list;
	}

}