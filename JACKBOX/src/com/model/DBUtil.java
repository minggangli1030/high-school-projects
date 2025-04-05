package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {

	public void signupUser(String username, String password, String email) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/JACKBOX";
		String user = "root";
		String passWord = "Martin1030";
		Connection con = DriverManager.getConnection(url, user, passWord);

		PreparedStatement pStatement = con
				.prepareStatement("INSERT INTO USER(USERNAME, PASSWORD, EMAIL) Values(?,?,?)");
		pStatement.setString(1, username);
		pStatement.setString(2, password);
		pStatement.setString(3, email);
		pStatement.executeUpdate();

		pStatement.close();
		con.close();

	}

	public int loginUser(String username, String password) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/JACKBOX";
		String user = "root";
		String passWord = "Martin1030";
		Connection con = DriverManager.getConnection(url, user, passWord);

		PreparedStatement pStatement = con.prepareStatement("SELECT PASSWORD FROM USER WHERE USERNAME = ?");
		pStatement.setString(1, username);
		ResultSet resultSet = pStatement.executeQuery();

		while (resultSet.next()) {
			if (resultSet.getString("PASSWORD").equals(password)) {
				return 1;
			}
			return 0;
		}

		resultSet.close();
		pStatement.close();
		con.close();
		return -1;

	}

}
