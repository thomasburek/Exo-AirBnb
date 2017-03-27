package com.simplon.DAO;

import java.sql.SQLException;
import java.sql.Statement;

import com.simplon.Bean.Proprietaire;

public class ProprietaireDAO extends DAO{

	public Proprietaire addProprietaire(Proprietaire proprio) {
		openConnection();
		try {
			sql = "INSERT INTO `proprietaire`(username,password)"
					+ "VALUES ('" + proprio.getUsername() + "','" + proprio.getPassword()+"')";
			st = connexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			st.executeUpdate();	
			rs = st.getGeneratedKeys();
			while (rs.next()) {
				proprio.setId(rs.getInt(1));
			}						
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		closeConnection();
		
		return proprio;
	}
	
	public Proprietaire findProprio(String username, String password) {
		Proprietaire proprio = new Proprietaire();
		
		openConnection();
		
		sql = "SELECT * FROM `proprietaire` WHERE `username` LIKE '" + username + "' AND `password` LIKE '" + password + "'";
		try {
			st = connexion.prepareStatement(sql);
			rs = st.executeQuery();
			while(rs.next()) {
				proprio.setId(rs.getInt(1));
				proprio.setUsername(username);
				proprio.setPassword(password);				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeConnection();		
		return proprio;		
	}
}
