package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCpostgresql {
	static final String DB_DRIVER = "org.postgresql.Driver";
	static final String DB_URL = "jdbc:postgresql://localhost:5432/";
	static final String USER = "postgres";
	static final String PWD = "12345";

	public static void main(String[] args) {
		Connection conn = null;
		Statement stm = null;

		try {
			Class.forName(DB_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PWD);
			stm = conn.createStatement();
			ResultSet rs = stm.executeQuery("select * from my_db.students");
			PrintResultSet.printResultSet(rs);

			rs.close();
			stm.close();
			conn.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				if (stm != null)
					stm.close();
			} catch (SQLException se2) {
				se2.printStackTrace();
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}
}
