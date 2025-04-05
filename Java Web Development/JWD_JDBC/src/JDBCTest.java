import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// 1. Load Database Driver
		Class.forName("com.mysql.jdbc.Driver");

		// 2. Create a Database Connection
		String url = "jdbc:mysql://localhost:3306/JWD";
		String user = "root";
		String password = "Martin1030";
		Connection con = DriverManager.getConnection(url, user, password);

		// 3 - a Execute SQL Statement
//		Statement statement = con.createStatement();
//		ResultSet resultSet = statement.executeQuery("SELECT * FROM STUDENT");
		// ResultSet resultSet = statement.executeQuery("SELECT COUNT(*) FROM STUDENT");

		// 3 - b Execute SQL Update Statement
		Statement uStatement = con.createStatement();
		int row = uStatement.executeUpdate("DELETE FROM SCORE WHERE STUDENT_ID = 3");
		System.out.println("Affected row: " + row);
		row = uStatement.executeUpdate("DELETE FROM STUDENT WHERE ID = 3");
		System.out.println("Affected row: " + row);

		// 3 - c Execute SQL Prepared statement
//		int id = 2;
//		PreparedStatement pStatement = con.prepareStatement("DELETE FROM SCORE WHERE STUDENT_ID = ?");
//		pStatement.setInt(1, id);
//		pStatement.executeUpdate();
//
//		pStatement = con.prepareStatement("DELETE FROM STUDENT WHERE ID = ?");
//		pStatement.setInt(1, id);
//		pStatement.executeUpdate();

		// 4. Get result
		// while(resultSet.next()) {
		// int id = resultSet.getInt("ID");
		// String name = resultSet.getString("NAME");
		// String gender = resultSet.getString("GENDER");
		// String age = resultSet.getString("AGE");
		// Date date = resultSet.getDate("CREATED_DATE");
		//
		// System.out.println(id + "|" + name + "|" + gender + "|" + age + "|" + date);
		// }

		// resultSet.next();
		// int count = resultSet.getInt(1);
		// System.out.println(count);

//		resultSet.close();
//		statement.close();
		uStatement.close();
//		pStatement.close();
		con.close();

	}

}
