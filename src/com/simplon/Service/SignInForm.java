package com.simplon.Service;

import javax.servlet.http.HttpServletRequest;

import com.simplon.Bean.Proprietaire;

public class SignInForm {

	
	public  Proprietaire creerProprietaire(HttpServletRequest request) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		Proprietaire proprio = new Proprietaire();
		
        proprio.setUsername(username);
        proprio.setPassword(password);

        return proprio;
	
	}
}
