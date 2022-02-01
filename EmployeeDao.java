package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmployeeDao {
	public int save(int id, String name, String email, Float salary) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb", "root", "1704");
		PreparedStatement ps = con.prepareStatement("insert into employee value (?,?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setNString(3, email);
		ps.setFloat(4, salary);
		int i = ps.executeUpdate();
		return i;

	}
}
	
