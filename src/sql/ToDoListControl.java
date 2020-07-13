package sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ToDoListControl {

	private int id = 1;

	private Connection getConnection() {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/";
		String db = "webtodolist";
		String driver = "com.mysql.jdbc.Driver";
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url + db, "root", "Avenged6814!");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}

	public void addEntry(String entry) {
		Connection con = getConnection();
		try {
			Statement stmt = con.createStatement();
			String sql = "insert into webtodolist (id, entry) values(" + id++ + ",'" + entry + "');";
			stmt.executeUpdate(sql);
			stmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteEntry(String entry) {
		Connection con = getConnection();
		try {
			Statement stmt = con.createStatement();
			String sql = "delete from webtodolist where entry=" + entry + ";";
			stmt.executeUpdate(sql);
			stmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ResultSet printList() {
		Connection con = getConnection();
		ResultSet rs = null;
		try {
			Statement stmt = con.createStatement();
			String sql = "select entry from webtodolist;";
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
}
