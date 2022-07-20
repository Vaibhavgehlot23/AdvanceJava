package in.co.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import in.co.Bean.MarksheetBean;

public class MarksheetModel {

	public Integer nextPk() throws Exception {
		int pk = 0;
		ResourceBundle rb = ResourceBundle.getBundle("in.co.rb.System");
		System.out.println(rb.getString("Driver"));

		Class.forName(rb.getString("Driver")).newInstance();
		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("select max(id) from addmarksheet");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {

			pk = rs.getInt(1);

		}
		return pk + 1;

	}

	public void add(MarksheetBean bean) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.rb.System");
		System.out.println(rb.getString("Driver"));

		Class.forName(rb.getString("Driver")).newInstance();
		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("Insert into addmarksheet values(?,?,?,?,?,?)");
		ps.setInt(1, nextPk());
		ps.setString(2, bean.getRollno());

		ps.setString(3, bean.getName());
		ps.setInt(4, bean.getPhy());
		ps.setInt(5, bean.getChem());
		ps.setInt(6, bean.getMaths());

		int i = ps.executeUpdate();
		conn.commit();
		System.out.println("Inserted : " + i);
		ps.close();
		conn.close();

	}

	public void update(MarksheetBean bean) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.rb.System");
		System.out.println(rb.getString("Driver"));
		Class.forName(rb.getString("Driver")).newInstance();

		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));
		conn.setAutoCommit(false);
		PreparedStatement ps = conn
				.prepareStatement("update addmarksheet set id=?, fname=?, lname=?,phy=?,chem=?,maths=? where rollno=?");
		ps.setInt(1, bean.getId());

		ps.setString(2, bean.getName());
		ps.setInt(3, bean.getPhy());
		ps.setInt(4, bean.getChem());
		ps.setInt(5, bean.getMaths());
		ps.setString(6, bean.getRollno());

		int i = ps.executeUpdate();
		conn.commit();
		System.out.println(i + ":Record Updated");
		ps.close();
		conn.close();

	}

	public void delete(MarksheetBean bean) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.rb.System");
		System.out.println(rb.getString("Driver"));
		Class.forName(rb.getString("Driver")).newInstance();
		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));

		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("delete from addmarksheet where rollno=?");
		ps.setString(1, bean.getRollno());

		int i = ps.executeUpdate();
		conn.commit();
		System.out.println(i + ":Record Deleted");
		ps.close();
		conn.close();
	}

	public List<MarksheetBean> get(MarksheetBean bean) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.rb.System");
		Class.forName(rb.getString("Driver")).newInstance();
		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));

		PreparedStatement ps = conn.prepareStatement("select * from addmarksheet where rollno = ?");
		ps.setString(1, bean.getRollno());
		ResultSet rs = ps.executeQuery();
		ArrayList<MarksheetBean> list = new ArrayList<MarksheetBean>();
		while (rs.next()) {

			MarksheetBean bean1 = new MarksheetBean();

			bean1.setId(rs.getInt(1));
			bean1.setRollno(rs.getString(2));
			bean1.setName(rs.getString(3));

			bean1.setPhy(rs.getInt(4));
			bean1.setChem(rs.getInt(5));
			bean1.setMaths(rs.getInt(6));
			list.add(bean1);
		}
		return list;

	}

	public List<MarksheetBean> search(MarksheetBean bean) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.rb.System");
		Class.forName(rb.getString("Driver")).newInstance();
		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));

		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("select * from addmarksheet  ");
		ResultSet rs = ps.executeQuery();
		ArrayList<MarksheetBean> list = new ArrayList<MarksheetBean>();
		while (rs.next()) {

			MarksheetBean bean1 = new MarksheetBean();
			bean1.setId(rs.getInt(1));
			bean1.setRollno(rs.getString(2));
			bean1.setName(rs.getString(3));

			bean1.setPhy(rs.getInt(4));
			bean1.setChem(rs.getInt(5));
			bean1.setMaths(rs.getInt(6));
			list.add(bean1);
		}
		return list;
	}

	public List<MarksheetBean> getMeritList() throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.rb.System");
		Class.forName(rb.getString("Driver")).newInstance();
		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));

		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement(
				"select *,  ((phy + chem + maths)/3) as percentage from addmarksheet where (phy > 40 AND chem > 40 AND Maths > 40) order by (phy + chem + maths) desc");
		ResultSet rs = ps.executeQuery();
		ArrayList<MarksheetBean> list = new ArrayList<MarksheetBean>();
		while (rs.next()) {

			MarksheetBean bean1 = new MarksheetBean();
			bean1.setId(rs.getInt(1));
			bean1.setRollno(rs.getString(2));
			bean1.setName(rs.getString(3));

			bean1.setPhy(rs.getInt(4));
			bean1.setChem(rs.getInt(5));
			bean1.setMaths(rs.getInt(7));
			list.add(bean1);
		}
		return list;

	}

	
}
