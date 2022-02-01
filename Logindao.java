package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.Loginform;

public class Logindao {

	private String dburl = "jdbc:mysql://localhost:3306/userdb";
	private String dbUname = "root";
	private String dbpassword = "1704";
	private String dbDriver = "com.mysql.jdbc.Driver";

	public void loadDriver(String dbDriver) {

		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(dburl, dbUname, dbpassword);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return con;
	}

	public boolean validate(Loginform lf) {

		boolean status = false;

		loadDriver(dbDriver);
		Connection con = getConnection();

		String sql = "select * from employee where id = ? and name = ?";

		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);

			ps.setInt(1, lf.getId());
			ps.setString(2, lf.getName());

			ResultSet rs = ps.executeQuery();
			status = rs.next();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return status;
	}
}
