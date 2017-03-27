package com.simplon.DAO;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.simplon.Bean.Logement;

public class LogementDAO extends DAO {
	

	public Logement addLogement(Logement flat) {
		openConnection();
		try {
			sql = "INSERT INTO `logement`(rue,ville,description,montant, proprietaire_id) "
					+ "VALUES ('" + flat.getRue() + "','" + flat.getVille() +"','"+ flat.getDescription() +"','"
					+ flat.getMontant() + "','" + flat.getProprio().getId() + "')";
			st = connexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			st.executeUpdate();
			rs = st.getGeneratedKeys();
			while (rs.next()) {
				flat.setId(rs.getInt(1));
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();
		return flat;
	}
	
	public List<Logement> showList() {
		List<Logement> listeLogement = new ArrayList<>();
		openConnection();
		try {
			sql = " SELECT * FROM `logement` ";
			st = connexion.prepareStatement(sql);
			rs = st.executeQuery();
			while (rs.next()) {
				Logement logement = new Logement();				
				logement.setDescription(rs.getString("description"));
				logement.setId(rs.getInt("Id"));
				logement.setMontant(rs.getDouble("montant"));
				logement.setRue(rs.getString("rue"));
				logement.setVille(rs.getString("ville"));
				
				listeLogement.add(logement);				
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();
		return listeLogement;
	}
	public List<Logement> showList(int proprioId) {
		List<Logement> listeLogement = new ArrayList<>();
		openConnection();
		try {
			sql = " SELECT * FROM `logement` WHERE logement.proprietaire_id LIKE '" + proprioId + "'";
			st = connexion.prepareStatement(sql);
			rs = st.executeQuery();
			while (rs.next()) {
				Logement logement = new Logement();				
				logement.setDescription(rs.getString("description"));
				logement.setId(rs.getInt("Id"));
				logement.setMontant(rs.getDouble("montant"));
				logement.setRue(rs.getString("rue"));
				logement.setVille(rs.getString("ville"));
				listeLogement.add(logement);				
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();		
		return listeLogement;		
	}
}
