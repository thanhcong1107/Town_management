package Connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

	static final String userName = "root";
	static final String passWord = "thanhcong1107";
	static final String driver = "com.mysql.jdbc.Driver";
	static final String url = "jdbc:mysql://localhost:3306/quanlykhupho";
	static Connection conn = null;

	public static Connection getConnection() {
		try{
			Class.forName(driver);
			conn = DriverManager.getConnection(url, userName, passWord);
		}catch(SQLException | ClassNotFoundException e){
			e.printStackTrace();
		}
		System.err.println("Connect to database");
		return conn;
	}
	
	public static void shutDownConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.err.println("Disconnect to database");
	}
	
	
}

