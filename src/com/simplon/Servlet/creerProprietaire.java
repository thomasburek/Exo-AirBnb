package com.simplon.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.simplon.Bean.Proprietaire;
import com.simplon.DAO.ProprietaireDAO;
import com.simplon.Service.SignInForm;


@WebServlet("/creerProprietaire")
public class creerProprietaire extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/creerProprietaire.jsp").forward(request, response);	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		SignInForm form = new SignInForm();

		Proprietaire proprio = form.creerProprietaire(request);
		
		ProprietaireDAO propriodao = new ProprietaireDAO();
		
		request.setAttribute("form", form);

		request.setAttribute("proprio", propriodao.addProprietaire(proprio));

		/* Récupération de la session depuis la requête */
		HttpSession session = request.getSession();
		session.setAttribute("sessionProprio", proprio);
		this.getServletContext().getRequestDispatcher("/WEB-INF/Index.jsp").forward( request, response );                     

	}

}
