package com.simplon.Service;

import javax.servlet.http.HttpServletRequest;

import com.simplon.Bean.Logement;


public class AddForm {
		
	public  Logement creerLogement(HttpServletRequest request) {
		String rue = request.getParameter("rue");
		String ville = request.getParameter("ville");
		String description = request.getParameter("desc");

		double montant = Double.parseDouble(request.getParameter("montant"));	
		
		Logement logement = new Logement();
		
		
        logement.setRue(rue);
        logement.setVille(ville);
        logement.setDescription(description);
        logement.setMontant(montant);
//        logement.setPhoto( photo );
        
        return logement;
	
	}	    
}

