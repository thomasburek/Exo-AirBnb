package com.simplon.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
	
	protected String url = "jdbc:mysql://localhost/airBnb";
	protected String login = "root";
	protected String pass = "";
	protected String sql;
	
	protected Connection connexion;
	protected PreparedStatement st;
	protected ResultSet rs;
	
	public void openConnection() {		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connexion = DriverManager.getConnection(url, login, pass);			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void closeConnection() {
		try {
			st.close();
			connexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
