package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCmySQL {

	static final String DB_URL = "jdbc:mysql://localhost/my_db";
	static final String USER = "root";
	static final String PWD = "123456789";

	
	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(DB_URL, USER, PWD);
			st = conn.createStatement();
			ResultSet rs = st.executeQuery("select id, name, value from students");
			PrintResultSet.printResultSet(rs);
			rs.close();
			st.close();
			conn.close();

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (st != null) st.close();
			} catch (SQLException se2) {
			}
			try {
				if (conn != null) conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}
}
