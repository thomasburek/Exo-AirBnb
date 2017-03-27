package com.simplon.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simplon.Bean.Proprietaire;
import com.simplon.DAO.LogementDAO;
import com.simplon.DAO.ProprietaireDAO;


@WebServlet("/Accueil")
public class Accueil extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		LogementDAO logementdao = new LogementDAO();		
		request.setAttribute("liste", logementdao.showList());
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/Index.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // recherche
		
		
//		this.getServletContext().getRequestDispatcher("/WEB-INF/Index.jsp").forward( request, response );
	}

}
