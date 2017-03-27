package com.simplon.DAO;

import java.sql.SQLException;

import com.simplon.Bean.Dispo;

public class DispoDAO extends DAO {

	public Dispo addDispo(Dispo dispo) {
		
		openConnection();
		sql = "INSERT INTO `dispo`(dateDebut,dateFin,logement_Id) VALUES (?,?,?)";
		try {
			st = connexion.prepareStatement(sql);
			st.setString(1, dispo.getDateDebut());
			st.setString(2, dispo.getDateFin());
			st.setInt(3, dispo.getLogement().getId());
			
			st.executeUpdate();
			rs = st.getGeneratedKeys();
			
			while (rs.next()) {
				dispo.setId(rs.getInt(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		closeConnection();
		
		return dispo;
		
	}
}
