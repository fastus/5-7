package DBConnection;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PrintResultSet {
	public static void printResultSet(ResultSet rs) throws SQLException {
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String value = rs.getString("value");

			System.out.print("ID: " + id);
			System.out.print(" | Name: " + name);
			System.out.println(" | Value: " + value + " |");
		}
	}
}
